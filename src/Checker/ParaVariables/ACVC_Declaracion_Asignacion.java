package Checker.ParaVariables;


import Antlr.MyParser;
import Antlr.MyParserBaseVisitor;
import Checker.TypeSymbol.SymbolTable;
import org.antlr.v4.runtime.Token;

import java.util.LinkedList;

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

    private SymbolTable tableS;
    private int numErrors = 0;
    public LinkedList<String> listaErrores = new LinkedList<String>();


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

        for (MyParser.DeclarationContext e : ctx.declaration())
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

        String error = "";
        String tipo = ctx.type().getText();

        if ((tipo.equals("int")) || (tipo.equals("char"))) {

            int res = tableS.enter(ctx.IDENT().getText(),tipo,"Constante");

            if (res == 1) {

                this.numErrors++;
                error = "Semantic Error (" + ctx.IDENT().getSymbol().getLine() + ":" + (ctx.IDENT().getSymbol().getCharPositionInLine() + 1) + "): The identifier is already declared in actual context!!!";
                listaErrores.push(error);
            }
        }
        else {

            Token type = (Token) visit(ctx.valueTypeConst());
            this.numErrors++;
            error = "Semantic Error (" + type.getLine() + ":" + (type.getCharPositionInLine() + 1) + "): Wrong type denoter!!! WTF";
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


        int i;
        for (i=1; i<ctx.IDENT().size()-1; i++){

                    int res = tableS.enter(ctx.IDENT(i).getText(),tipo,"Variable");

                    if (res == 1) {

                        this.numErrors++;
                        error = "Semantic Error (" + ctx.IDENT(i).getSymbol().getLine() + ":" + (ctx.IDENT(i).getSymbol().getCharPositionInLine() + 1) + "): The identifier is already declared in actual context!!!";
                        listaErrores.push(error);
                    }
                }

        return null;


    }

    @Override
    public Object visitClassDeclAST(MyParser.ClassDeclASTContext ctx) {

        String error = "";

        int clasePadre = tableS.enter(ctx.CLASS().getText(),ctx.CLASS().getSymbol().getText(),"Classe");

        if (clasePadre == 1) {

            //cuando entra la primera ves la padre y el primer hijo se crean
            //cuando tienen muchos hijos la clase padre se crea nuvamente, pero la clase padre solo se puede delcarar
            //una vez por eso aunque de error de clase padre, no se guarda en la lista pero sus hijos si
            int claseHija = tableS.enter(ctx.IDENT().getText(),ctx.IDENT().getSymbol().getText(),"Classe");

            if (claseHija == 1) {

                this.numErrors++;
                error = "Semantic Error Hijo("+ ctx.IDENT().getSymbol().getLine() + ":" + (ctx.IDENT().getSymbol().getCharPositionInLine() + 1) + "): The identifier is already declared in actual context!!!";
                listaErrores.push(error);
            }

        }else{

            int claseHija = tableS.enter(ctx.IDENT().getText(),ctx.IDENT().getSymbol().getText(),"Classe");

            if (claseHija == 1) {

                this.numErrors++;
                error = "Semantic Error Hijo("+ ctx.IDENT().getSymbol().getLine() + ":" + (ctx.IDENT().getSymbol().getCharPositionInLine() + 1) + "): The identifier is already declared in actual context!!!";
                listaErrores.push(error);
            }
        }

        return null;
    }

    @Override
    public Object visitStatementIgSTAST(MyParser.StatementIgSTASTContext ctx) {
        return super.visitStatementIgSTAST(ctx);
    }

    @Override
    public Object visitStatementMetSTAST(MyParser.StatementMetSTASTContext ctx) {
        return super.visitStatementMetSTAST(ctx);
    }

    @Override
    public Object visitStatementIncSTAST(MyParser.StatementIncSTASTContext ctx) {
        return super.visitStatementIncSTAST(ctx);
    }

    @Override
    public Object visitStatementDecSTAST(MyParser.StatementDecSTASTContext ctx) {
        return super.visitStatementDecSTAST(ctx);
    }

    @Override
    public Object visitIfSTAST(MyParser.IfSTASTContext ctx) {
        return super.visitIfSTAST(ctx);
    }

    @Override
    public Object visitForSTAST(MyParser.ForSTASTContext ctx) {
        return super.visitForSTAST(ctx);
    }

    @Override
    public Object visitWhileSTAST(MyParser.WhileSTASTContext ctx) {
        return super.visitWhileSTAST(ctx);
    }

    @Override
    public Object visitBreakStAST(MyParser.BreakStASTContext ctx) {
        return super.visitBreakStAST(ctx);
    }

    @Override
    public Object visitReturnSTAST(MyParser.ReturnSTASTContext ctx) {
        return super.visitReturnSTAST(ctx);
    }

    @Override
    public Object visitReadSTAT(MyParser.ReadSTATContext ctx) {
        return super.visitReadSTAT(ctx);
    }

    @Override
    public Object visitWriteSTAST(MyParser.WriteSTASTContext ctx) {
        return super.visitWriteSTAST(ctx);
    }

    @Override
    public Object visitBlockSTAST(MyParser.BlockSTASTContext ctx) {
        return super.visitBlockSTAST(ctx);
    }

    @Override
    public Object visitPycSTAST(MyParser.PycSTASTContext ctx) {
        return super.visitPycSTAST(ctx);
    }

    @Override
    public Object visitWriteTypeNumIntSTAST(MyParser.WriteTypeNumIntSTASTContext ctx) {
        return super.visitWriteTypeNumIntSTAST(ctx);
    }

    @Override
    public Object visitWriteTypeNumIntZSTAST(MyParser.WriteTypeNumIntZSTASTContext ctx) {
        return super.visitWriteTypeNumIntZSTAST(ctx);
    }

    @Override
    public Object visitWriteTypeNumFloatSTAST(MyParser.WriteTypeNumFloatSTASTContext ctx) {
        return super.visitWriteTypeNumFloatSTAST(ctx);
    }

    @Override
    public Object visitBlockAST(MyParser.BlockASTContext ctx) {
        return super.visitBlockAST(ctx);
    }

    @Override
    public Object visitActParsAST(MyParser.ActParsASTContext ctx) {
        return super.visitActParsAST(ctx);
    }

    @Override
    public Object visitConditionAST(MyParser.ConditionASTContext ctx) {
        return super.visitConditionAST(ctx);
    }

    @Override
    public Object visitCondTermAST(MyParser.CondTermASTContext ctx) {
        return super.visitCondTermAST(ctx);
    }

    @Override
    public Object visitCondFactAST(MyParser.CondFactASTContext ctx) {
        return super.visitCondFactAST(ctx);
    }

    @Override
    public Object visitExprAST(MyParser.ExprASTContext ctx) {
        return super.visitExprAST(ctx);
    }

    @Override
    public Object visitTermAST(MyParser.TermASTContext ctx) {
        return super.visitTermAST(ctx);
    }

    @Override
    public Object visitFactorFAST(MyParser.FactorFASTContext ctx) {
        return super.visitFactorFAST(ctx);
    }

    @Override
    public Object visitSpfunctionFAST(MyParser.SpfunctionFASTContext ctx) {
        return super.visitSpfunctionFAST(ctx);
    }

    @Override
    public Object visitNumIntFAST(MyParser.NumIntFASTContext ctx) {
        return super.visitNumIntFAST(ctx);
    }

    @Override
    public Object visitNumIntZeroFAST(MyParser.NumIntZeroFASTContext ctx) {
        return super.visitNumIntZeroFAST(ctx);
    }

    @Override
    public Object visitNumberFloatFAST(MyParser.NumberFloatFASTContext ctx) {
        return super.visitNumberFloatFAST(ctx);
    }

    @Override
    public Object visitStringFAST(MyParser.StringFASTContext ctx) {
        return super.visitStringFAST(ctx);
    }

    @Override
    public Object visitChaeFAST(MyParser.ChaeFASTContext ctx) {
        return super.visitChaeFAST(ctx);
    }

    @Override
    public Object visitBooleanFAST(MyParser.BooleanFASTContext ctx) {
        return super.visitBooleanFAST(ctx);
    }

    @Override
    public Object visitNewFAST(MyParser.NewFASTContext ctx) {
        return super.visitNewFAST(ctx);
    }

    @Override
    public Object visitExpresionFAST(MyParser.ExpresionFASTContext ctx) {
        return super.visitExpresionFAST(ctx);
    }

    @Override
    public Object visitBooleanTrueFAST(MyParser.BooleanTrueFASTContext ctx) {
        return super.visitBooleanTrueFAST(ctx);
    }

    @Override
    public Object visitBooleanFalseFAST(MyParser.BooleanFalseFASTContext ctx) {
        return super.visitBooleanFalseFAST(ctx);
    }

    @Override
    public Object visitSpfunctionORD(MyParser.SpfunctionORDContext ctx) {
        return super.visitSpfunctionORD(ctx);
    }

    @Override
    public Object visitSpfunctionCHR(MyParser.SpfunctionCHRContext ctx) {
        return super.visitSpfunctionCHR(ctx);
    }

    @Override
    public Object visitSpfunctionLEN(MyParser.SpfunctionLENContext ctx) {
        return super.visitSpfunctionLEN(ctx);
    }

    @Override
    public Object visitDesignatorAST(MyParser.DesignatorASTContext ctx) {
        return super.visitDesignatorAST(ctx);
    }

    @Override
    public Object visitDesignatorPuntIdAST(MyParser.DesignatorPuntIdASTContext ctx) {
        return super.visitDesignatorPuntIdAST(ctx);
    }

    @Override
    public Object visitDesignatorCorcsAST(MyParser.DesignatorCorcsASTContext ctx) {
        return super.visitDesignatorCorcsAST(ctx);
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
        return  ctx.PORC().getSymbol();
    }
}
