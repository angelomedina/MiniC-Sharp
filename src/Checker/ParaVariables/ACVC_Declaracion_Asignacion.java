package Checker.ParaVariables;


import Antlr.MyParser;
import Antlr.MyParserBaseVisitor;
import Checker.TypeSymbol.SymbolTable;
import com.sun.org.apache.bcel.internal.generic.RETURN;
import org.antlr.v4.runtime.Token;

import java.util.LinkedList;
import java.util.List;

public class ACVC_Declaracion_Asignacion extends MyParserBaseVisitor {

    //Nota: todos los visitors que balan de declarar cosas se utiliza la tabla -->insertar/verificar alcaces
    //Tabla de simbolos nombre, nivel y tipo: osea agregar un objeto y en esas clases que haya una jerarquia como metodos,clases
    //Cuando verifico metodos: verificar si existe el metodo, los parametros y la cantidad de parametros; antes de hacer una visita contextual hacer otro vist para ver si existe


    //Tabla de simbolos; id(simbol),nivel, tipo de simbolo, tipo de datos

    //simbol.js abstracto
    //  hereda Variable
    //  hereda Constante
    //  hereda Clas

    //expresiones: deben verificar los tipos como estament como for o whiledeben verificar algo pero no retornan nada

    //antes de declarar cosas openScope y despues de delcarar closeScope


    //Nota: en los alcances solo son dos niveles por la logica de del proyecto.
    //open scope se uiliza en la declaracion de un metodo y luego de vistar close scope

    private SymbolTable tableS;
    private int numErrors = 0;
    public LinkedList<String> listaErrores = new LinkedList<String>();
    public List<String> varsName;
    public List<String> varsType;
    public List<String> paramsName;
    public boolean varClases = false;

    public ACVC_Declaracion_Asignacion(){
        this.tableS = new SymbolTable();
        this.numErrors=0;
    }

    public int getNumErrors() {
        return numErrors;
    }

    public boolean hasErrors(){
        if (this.numErrors==0)
            return false;
        else
            return true;
    }

    public String imprimir(){

        return tableS.toString();
    }

    public SymbolTable getTableS() {
        return tableS;
    }

    @Override
    public Object visitProgramAST(MyParser.ProgramASTContext ctx) {

        this.numErrors=0;

        tableS.registrarFuncionesPredefinidas();
        for (MyParser.DeclarationContext e : ctx.declaration())
            visit(e);

        for (MyParser.MethodDeclContext e : ctx.methodDecl())
            visit(e);

        return null;
    }

    @Override
    public Object visitProgramConstAST(MyParser.ProgramConstASTContext ctx) {

        visit(ctx.constDecl());

        return null;
    }

    @Override
    public Object visitProgramVarAST(MyParser.ProgramVarASTContext ctx) {

        visit(ctx.varDecl());

        return null;
    }

    @Override
    public Object visitProgramClassAST(MyParser.ProgramClassASTContext ctx) {

        visit(ctx.classDecl());

        return null;
    }

    @Override
    public Object visitConstDeclAST(MyParser.ConstDeclASTContext ctx) {

        //CONST type IDENT IG (valueTypeConst) PyC

        String error = "";
        String tipo = ctx.type().getText();

        if ((tipo.equals("int")) || (tipo.equals("char"))) {

            int res = tableS.enterVarCons(ctx.IDENT().getText(),tipo,"Constante");

            if (res == 1) {

                this.numErrors++;
                error = "Error Semantico (" + ctx.IDENT().getSymbol().getLine() + ":" + (ctx.IDENT().getSymbol().getCharPositionInLine() + 1) + "): El identificador ya ha sido declarado en el contexto actual!";
                listaErrores.push(error);
            }
        }
        else {

            Token type = (Token) visit(ctx.valueTypeConst());
            this.numErrors++;
            error = "Error Semantico (" + type.getLine() + ":" + (type.getCharPositionInLine() + 1) + "): Tipo de dato incorrecto! ";
            listaErrores.push(error);
        }

        return null;


    }

    @Override
    public Object visitConstNumberIntDeclAST(MyParser.ConstNumberIntDeclASTContext ctx) {
        return ctx.NUMBER_INTEGER().getSymbol();
    }

    @Override
    public Object visitConstNumberIntZDeclAST(MyParser.ConstNumberIntZDeclASTContext ctx) {
        return ctx.NUMBER_INTEGER_ZERO().getSymbol();
    }


    @Override
    public Object visitVarDeclAST(MyParser.VarDeclASTContext ctx) {

        //varDecl: type IDENT ( COMA IDENT )* PyC
        String error = "";
        String tipo = ctx.type().getText();

        //System.out.println("ss "+ctx.IDENT(0));


        for (int i=0; i<ctx.IDENT().size(); i++){

                    int res = tableS.enterVarCons(ctx.IDENT(i).getText(),tipo,"Variable");

                    if (res == 1) {

                        this.numErrors++;
                        error = "Error Semantico (" + ctx.IDENT(i).getSymbol().getLine() + ":" + (ctx.IDENT(i).getSymbol().getCharPositionInLine() + 1) + "): El identificador ya ha sido declarado en el contexto actual!";
                        listaErrores.push(error);
                    }else {
                        if(varClases) { // Indica que son variables de clases
                            varsName.add(ctx.IDENT(i).getSymbol().getText());
                            varsType.add(tipo);
                        }
                    }

                }

                varClases = false;

        return null;


    }

    @Override
    public Object visitClassDeclAST(MyParser.ClassDeclASTContext ctx) {

        String error = "";

        varsName = new LinkedList<>();
        varsType = new LinkedList<>();

        if(ctx.varDecl() != null ){
            tableS.actuaLevel +=1;
            for (MyParser.VarDeclContext e : ctx.varDecl()) {
                varClases = true;
                visit(e);
            }

            tableS.actuaLevel -=1;
           // tableS.closeScope();

            //System.out.println("Tiene "+varsName.size()+" variables.");
        }

        int res = tableS.enterCl(ctx.IDENT().getText(),ctx.CLASS().getText(), varsName, varsType);

        if(res == 1){
            this.numErrors++;
            error = "Error Semantico("+ ctx.IDENT().getSymbol().getLine() + ":" + (ctx.IDENT().getSymbol().getCharPositionInLine() + 1) + "): Ya existe un elemento con ese nombre!";
            listaErrores.push(error);
        }
        /*
        int clasePadre = tableS.enterCl(ctx.CLASS().getText(),ctx.CLASS().getSymbol().getText(),"Clase");

        if (clasePadre == 1) {

            //cuando entra la primera ves la padre y el primer hijo se crean
            //cuando tienen muchos hijos la clase padre se crea nuvamente, pero la clase padre solo se puede delcarar
            //una vez por eso aunque de error de clase padre, no se guarda en la lista pero sus hijos si
            int claseHija = tableS.enterCl(ctx.IDENT().getText(),ctx.IDENT().getSymbol().getText(),"Clase");

            if (claseHija == 1) {

                this.numErrors++;
                error = "Semantic Error Hijo("+ ctx.IDENT().getSymbol().getLine() + ":" + (ctx.IDENT().getSymbol().getCharPositionInLine() + 1) + "): The identifier is already declared in actual context!!!";
                listaErrores.push(error);
            }

        }else{

            int claseHija = tableS.enterCl(ctx.IDENT().getText(),ctx.IDENT().getSymbol().getText(),"Clase");

            if (claseHija == 1) {

                this.numErrors++;
                error = "Semantic Error Hijo("+ ctx.IDENT().getSymbol().getLine() + ":" + (ctx.IDENT().getSymbol().getCharPositionInLine() + 1) + "): The identifier is already declared in actual context!!!";
                listaErrores.push(error);
            }
        }*/

        return null;
    }

    // Declaracion de metodos

    @Override
    public Object visitMethodDeclAST(MyParser.MethodDeclASTContext ctx) {

        String error;
        // System.out.println("En MethodDeclAST");
        Token tipo = (Token) visit(ctx.optionMethodDecl());
        List<String> parametros = new LinkedList<>();
        //System.out.println(ctx.formPars());
        paramsName = new LinkedList<>();

        // Se registran los parametros de la funcion
        if(ctx.formPars() != null){ // Si tiene parametros
            tableS.openScope();
            parametros = (List<String>) visit(ctx.formPars()); // Los obtengo
            tableS.actuaLevel-=1;
        }


        varsName = new LinkedList<>();
        varsType = new LinkedList<>();


        if(ctx.varDecl() != null){ // Si tiene variables


            tableS.openScope();
            for (MyParser.VarDeclContext e : ctx.varDecl()) {
                varClases = true;
                visit(e);
            }

            tableS.actuaLevel -=1;
        }


        //Antes de agregar
        //  System.out.println("F-> "+tipo.getText()+" "+ctx.IDENT().getSymbol().getText());

        int res = tableS.enterFunc(ctx.IDENT().getSymbol().getText(), tipo.getText(),varsName,varsType,paramsName,parametros);

        if(res == 1) {

            this.numErrors++;
            error = "Error Semantico ("
                    + ctx.IDENT().getSymbol().getLine() + ":" + (ctx.IDENT().getSymbol().getCharPositionInLine() + 1)
                    + "): La funcion ya ha sido declarada";
            listaErrores.push(error);
        }

        return null;
    }

    // OptionMethodDecl

    @Override
    public Object visitMethodTypeDeclAST(MyParser.MethodTypeDeclASTContext ctx) {

        return visit(ctx.type());
    }

    @Override
    public Object visitMethodVoidDeclAST(MyParser.MethodVoidDeclASTContext ctx) {
        //  System.out.println("En MethodVoidDeclAST");
        return ctx.VOID().getSymbol();
    }

    // FormPars
    @Override
    public List<String> visitFormParsAST(MyParser.FormParsASTContext ctx) {

        String error;

        //Open scopeSystem.out.println("En formPars");
        List<String> params = new LinkedList<>();

        for (MyParser.TypeContext e : ctx.type()) {
            Token elemento = (Token) visit(e);
            params.add(elemento.getText());
            ///System.out.println(elemento.getText());
        }

        for (int i=0; i<ctx.IDENT().size(); i++){
            paramsName.add(ctx.IDENT(i).getText());
        }

        for (int i = 0; i<paramsName.size(); i++){

            int res = tableS.enterVarCons(paramsName.get(i),params.get(i),"Variable");

            if (res == 1) {

                this.numErrors++;
                error = "Error Semantico (" + ctx.IDENT(i).getSymbol().getLine() + ":" + (ctx.IDENT(i).getSymbol().getCharPositionInLine() + 1) + "): El identificador ya ha sido declarado en el contexto actual!";
                listaErrores.push(error);
            }
        }
        // close scope

        return params;
    }

    //Type
    @Override
    public Object visitTypeAST(MyParser.TypeASTContext ctx) {
        // System.out.println("En Type ");
        return ctx.IDENT().getSymbol();
    }

    ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    //Descripcion metodos de statement(Angelo)

    //statement

    /*
    #statementIgSTAST                               ... en proceso
    #statementMetSTAST
    #statementIncSTAST
    #statementDecSTAST
    #ifSTAST
    #forSTAST
    #whileSTAST
    #breakStAST
    #returnSTAST
    #readSTAT
    #writeSTAST
    #blockSTAST
    #pycSTAST;
    #designatorAST;
    #conditionAST;
    #exprAST;
    #writeTypeNumIntSTAST
     */

    // en proceso
    @Override
    public Object visitWriteSTAST(MyParser.WriteSTASTContext ctx) {

        //CONST type IDENT IG (valueTypeConst) PyC
        //const float   d = 12.5;

        //WRITE PAR_IZQ expr (writeType)? PAR_DER PyC


        //write ( 3*2 );


        return super.visitWriteSTAST(ctx);
    }

    @Override
    public Object visitExprAST(MyParser.ExprASTContext ctx) {

        // term: factor ( mulop factor )*
        // factor:

        //( REST )? term ( addop term )*

        // -
        return super.visitExprAST(ctx);
    }

    /// inicio factor

    @Override
    public Object visitSpfunctionFAST(MyParser.SpfunctionFASTContext ctx) {

        //special_function (PAR_IZQ (actPars) PAR_DER)

        return super.visitSpfunctionFAST(ctx);
    }


    // fin factor




    //-----  CON DUDAS

    @Override //preguntar: que hago con el new
    public Object visitNewFAST(MyParser.NewFASTContext ctx) {

        //NEW designator
        visit(ctx.designator());
        return super.visitNewFAST(ctx);
    }

    @Override  //preguntar: condiciones estan en la lista y son de tipo igual
    public Object visitStatementIgSTAST(MyParser.StatementIgSTASTContext ctx) {

        //designator ( IG expr) PyC
        // a = b ;
        visit(ctx.designator());

        return null;
    }

    @Override //preguntar: si es solo visitar
    public Object visitIfSTAST(MyParser.IfSTASTContext ctx) {

        //IF PAR_IZQ condition PAR_DER statement ( ELSE statement )?
        //if ( a = b){} else{}

        visit(ctx.condition());

        return  null;
    }

    @Override //preguntar: si  ident() tiene que hacer algo
    public Object visitDesignatorAST(MyParser.DesignatorASTContext ctx) {

        //IDENT (designatorExp)*
        for (MyParser.DesignatorExpContext e: ctx.designatorExp())
            visit(e);
        return null;
    }

    @Override //preguntar: si es solo visitar
    public Object visitDesignatorCorcsAST(MyParser.DesignatorCorcsASTContext ctx) {

        // CORC_IZQ expr CORC_DER

        visit(ctx.expr());

        return null;
    }

    @Override //preguntar: si se vistan ambos
    public Object visitDesignatorPuntIdAST(MyParser.DesignatorPuntIdASTContext ctx) {
        // PUNT IDENT
        return super.visitDesignatorPuntIdAST(ctx);
    }

    @Override //preguntar: si s vistan ambos
    public Object visitWriteTypeNumIntSTAST(MyParser.WriteTypeNumIntSTASTContext ctx) {

        //COMA NUMBER_INTEGER
        return ctx.NUMBER_INTEGER().getSymbol();
    }



    //----LISTOS


    @Override
    public Object visitActParsAST(MyParser.ActParsASTContext ctx) {

        //expr ( COMA expr )*
        for (MyParser.ExprContext e : ctx.expr())
            visit(e);

        return null;
    }

    @Override
    public Object visitSpfunctionORD(MyParser.SpfunctionORDContext ctx) {
        return ctx.ORD().getSymbol();
    }

    @Override
    public Object visitSpfunctionCHR(MyParser.SpfunctionCHRContext ctx) {
        return ctx.CHR();
    }

    @Override
    public Object visitSpfunctionLEN(MyParser.SpfunctionLENContext ctx) {
        return ctx.LEN().getSymbol();
    }

    @Override
    public Object visitNumIntFAST(MyParser.NumIntFASTContext ctx) {
        return ctx.NUMBER_INTEGER().getSymbol();
    }

    @Override
    public Object visitNumIntZeroFAST(MyParser.NumIntZeroFASTContext ctx) {
        return ctx.NUMBER_INTEGER_ZERO().getSymbol();
    }

    @Override
    public Object visitNumberFloatFAST(MyParser.NumberFloatFASTContext ctx) {
        return ctx.NUMBER_FLOAT().getSymbol();
    }

    @Override
    public Object visitStringFAST(MyParser.StringFASTContext ctx) {
        return ctx.STRING_CONST().getSymbol();
    }

    @Override
    public Object visitChaeFAST(MyParser.ChaeFASTContext ctx) {

        //CHAR_CONST
        return ctx.CHAR_CONST().getSymbol();
    }

    @Override
    public Object visitExpresionFAST(MyParser.ExpresionFASTContext ctx) {

        //PAR_IZQ expr PAR_DER
        visit(ctx.expr());

        return null;
    }

    @Override
    public Object visitBooleanTrueFAST(MyParser.BooleanTrueFASTContext ctx) {
        return ctx.TRUE().getSymbol();
    }

    @Override
    public Object visitBooleanFalseFAST(MyParser.BooleanFalseFASTContext ctx) {
        return ctx.FALSE().getSymbol();
    }

    @Override
    public Object visitWriteTypeNumIntZSTAST(MyParser.WriteTypeNumIntZSTASTContext ctx) {
        return ctx.NUMBER_INTEGER_ZERO().getSymbol();
    }

    @Override
    public Object visitWriteTypeNumFloatSTAST(MyParser.WriteTypeNumFloatSTASTContext ctx) {
        return ctx.NUMBER_FLOAT();
    }

    @Override
    public Object visitBreakStAST(MyParser.BreakStASTContext ctx) {
        return super.visitBreakStAST(ctx);
    }

    @Override
    public Object visitBlockAST(MyParser.BlockASTContext ctx) {

        //LLA_IZQ ( statement )* LLA_DER
        for (MyParser.StatementContext e: ctx.statement())
            visit(e);
        return null;
    }

    @Override
    public Object visitBlockSTAST(MyParser.BlockSTASTContext ctx) {

        //LLA_IZQ ( statement )* LLA_DER
        for (MyParser.StatementContext e : ctx.statement())
            visit(e);
        return null;

    }

    @Override
    public Object visitPycSTAST(MyParser.PycSTASTContext ctx) {
        return ctx.PyC().getSymbol();
    }

    @Override
    public Object visitConditionAST(MyParser.ConditionASTContext ctx) {

        //condition: condTerm ( OR condTerm )*
        for (MyParser.CondTermContext e : ctx.condTerm())
            visit(e);
        return null;
    }

    @Override
    public Object visitTermAST(MyParser.TermASTContext ctx) {

        //term: factor ( mulop factor )*
        for (MyParser.FactorContext e : ctx.factor())
            visit(e);
        return null;
    }

    @Override
    public Object visitCondTermAST(MyParser.CondTermASTContext ctx) {

        //condFact ( AND condFact)*
        for (MyParser.CondFactContext e : ctx.condFact())
            visit(e);
        return null;
    }

    @Override
    public Object visitCondFactAST(MyParser.CondFactASTContext ctx) {

        //expr relop expr
        return super.visitCondFactAST(ctx);
    }

    @Override
    public Object visitConstCharDeclAST(MyParser.ConstCharDeclASTContext ctx) {
        return ctx.CHAR_CONST().getSymbol();
    }

    @Override
    public Object visitRelopIgIgAST(MyParser.RelopIgIgASTContext ctx) {
        return ctx.IGIG().getSymbol();
    }

    @Override
    public Object visitRelopDifAST(MyParser.RelopDifASTContext ctx) {
        return ctx.DIF().getSymbol();
    }

    @Override
    public Object visitRelopMayAST(MyParser.RelopMayASTContext ctx) {
        return ctx.MAY().getSymbol();
    }

    @Override
    public Object visitRelopMatIgAST(MyParser.RelopMatIgASTContext ctx) {
        return ctx.MAY_IG().getSymbol();
    }

    @Override
    public Object visitRelopMenAST(MyParser.RelopMenASTContext ctx) {
        return ctx.MEN().getSymbol();
    }

    @Override
    public Object visitRelopMenIgAST(MyParser.RelopMenIgASTContext ctx) {
        return ctx.MEN_IG().getSymbol();
    }

    @Override
    public Object visitAddopSumAST(MyParser.AddopSumASTContext ctx) {
        return ctx.SUM().getSymbol();
    }

    @Override
    public Object visitAddopRestAST(MyParser.AddopRestASTContext ctx) {
        return ctx.REST().getSymbol();
    }

    @Override
    public Object visitMulopMultAST(MyParser.MulopMultASTContext ctx) {
        return ctx.MULT().getSymbol();
    }

    @Override
    public Object visitMulopDivAST(MyParser.MulopDivASTContext ctx) {
        return ctx.DIV().getSymbol();
    }

    @Override
    public Object visitMulopPorcAST(MyParser.MulopPorcASTContext ctx) {
        return ctx.PORC().getSymbol();
    }
}
