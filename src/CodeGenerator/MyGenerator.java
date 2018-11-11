package CodeGenerator;

import Antlr.MyParser;
import Antlr.MyParserBaseVisitor;
import Modelo.Archivos;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.io.IOException;
import java.util.LinkedList;
import java.util.List;

public class MyGenerator extends MyParserBaseVisitor {


    int contadorInstrucciones       = 0;
    Boolean esFuncion               = false;
    Archivos archivo                = new Archivos();
    LinkedList<Instruccion> storage = new LinkedList<>();


    public void escribirArchivo(){
        try {
            archivo.crearArchivoUno(instrucciones(), "generado.txt");
        }catch (IOException ioe) {
            System.out.println(ioe);
        }
    }

    public String instrucciones(){
        String inst  = "";
        for (Instruccion i : storage) {
            //No viene una instruccion
            if (i.getNumero()!=-1){
                if (i.getParam().equals("")){
                    inst+=String.valueOf(i.getNumero())+" "+i.getNombre()+"\n";
                    continue;
                }
                inst+=String.valueOf(i.getNumero())+" "+i.getNombre()+" "+i.getParam()+"\n";
                continue;
            }
            inst+=i.getNombre()+"\n";
        }
        return inst;
    }



    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    /*Nota:
        Felipe: PUSH, JUMP, COMPARE_OP
        Angelo: BINARY, STORE, LOAD
    */

    /*
    Notas:
    Load:
        Load_Const: coloca el valor de de la constante al tope de la pila.                                 ejem: int a = 0; guarda el 0
        Load_Fast: coloca el valor del contenido de la variable en la pila.                                ejem: int a = 0; guarda el a
        Load_Global: carga en el tope de la pila o el valor de la variable o la referencia a la funcion.   ejem: guarda a ó 0 ó el metódo

    Store:
        Store_Fast:  escribe el contenido del tope de la pila en la variable.

    Binary:
        Binary_Substract: realixa una resta de los operandos.
        Binary_Add: realiza una suma de los operandos.
        Binary_Multiply: realiza una multiplicación de los operandos.
        Binary_Divide: realiza una division entera de operandos.
        Binary_And: realiza un AND lógico.
        Binary_Or: realiza un OR lógico.
        Binary_Módulo: realiza el cálculo del cociente de la division de dos operandos.

     */

    //listo
    @Override
    public Object visitProgramAST(MyParser.ProgramASTContext ctx) {

        for (MyParser.DeclarationContext e: ctx.declaration()) {
            visit(e);
        }

        for(MyParser.MethodDeclContext e: ctx.methodDecl()){
            visit(e);
        }
        storage.add(new Instruccion(contadorInstrucciones,"END"," "));
        contadorInstrucciones++;

        System.out.println(instrucciones());
        this.escribirArchivo();

        return null;

    }

    //listo
    @Override
    public Object visitProgramConstAST(MyParser.ProgramConstASTContext ctx) {
        visit(ctx.constDecl());
        return null;
    }

    //listo
    @Override
    public Object visitProgramVarAST(MyParser.ProgramVarASTContext ctx) {
        visit(ctx.varDecl());
        return null;
    }

    //listo
    @Override
    public Object visitProgramClassAST(MyParser.ProgramClassASTContext ctx) {
        visit(ctx.classDecl());
        return null;
    }

    //listo
    @Override
    public Object visitStatementIgSTAST(MyParser.StatementIgSTASTContext ctx) {


        System.out.println("entro a IgStatement");

        if (esFuncion){
            storage.add(new Instruccion(contadorInstrucciones,"LOAD_GLOBAL",ctx.expr().getText()));
            contadorInstrucciones++;
            esFuncion = false;
            return null;
        }
        storage.add(new Instruccion(contadorInstrucciones,"LOAD_FAST",ctx.expr().getText()));
        contadorInstrucciones++;

        visit(ctx.designator());
        visit(ctx.expr());
        return null;
    }

    //listo
    @Override
    public Object visitTermAST(MyParser.TermASTContext ctx) {
        for (int i=0; i<=ctx.factor().size()-1;i++){
            visit(ctx.factor(i));
        }
        return null;
    }

    //listo
    @Override
    public Object visitConditionAST(MyParser.ConditionASTContext ctx) {

        for (int i=0;i<=ctx.condTerm().size()-1;i++) {
            visit(ctx.condTerm(i));
            storage.add(new Instruccion(contadorInstrucciones,"BINARY_OR"));
            contadorInstrucciones++;
        }
        return null;
    }

    //listo
    @Override
    public Object visitCondTermAST(MyParser.CondTermASTContext ctx) {

        for (int i=0;i<=ctx.condFact().size()-1;i++) {
            visit(ctx.condFact(i));
            storage.add(new Instruccion(contadorInstrucciones,"BINARY_ADD"));
            contadorInstrucciones++;
        }
        return null;
    }

    //listo
    @Override
    public Object visitFactorFAST(MyParser.FactorFASTContext ctx) {
        visit(ctx.designator());
        return null;
    }

    //listo
    @Override
    public Object visitNumIntFAST(MyParser.NumIntFASTContext ctx) {

        storage.add(new Instruccion(contadorInstrucciones,"BINARY_ADD Prueba"));
        contadorInstrucciones++;

        visit(ctx.NUMBER_INTEGER());
        return null;
    }

    //listo
    @Override
    public Object visitNumIntZeroFAST(MyParser.NumIntZeroFASTContext ctx) {
        visit(ctx.NUMBER_INTEGER_ZERO());
        return null;
    }

    //listo
    @Override
    public Object visitNumberFloatFAST(MyParser.NumberFloatFASTContext ctx) {
        visit(ctx.NUMBER_FLOAT());
        return null;
    }

    //listo
    @Override
    public Object visitStringFAST(MyParser.StringFASTContext ctx) {
        visit(ctx.STRING_CONST());
        return null;
    }

    //listo
    @Override
    public Object visitChaeFAST(MyParser.ChaeFASTContext ctx) {
        visit(ctx.CHAR_CONST());
        return null;
    }

    //listo
    @Override
    public Object visitBooleanFAST(MyParser.BooleanFASTContext ctx) {
        visit(ctx.booleanValue());
        return null;
    }

    //listo
    @Override
    public Object visitNewFAST(MyParser.NewFASTContext ctx) {
        visit(ctx.IDENT());
        return null;
    }

    //listo
    @Override
    public Object visitExpresionFAST(MyParser.ExpresionFASTContext ctx) {

        //PAR_IZQ expr PAR_DER

        storage.add(new Instruccion(contadorInstrucciones,"LOAD_GLOBAL",ctx.expr().getText()));
        contadorInstrucciones++;
        visit(ctx.expr());
        return null;

    }

    //listo
    @Override
    public Object visitBooleanTrueFAST(MyParser.BooleanTrueFASTContext ctx) {
        visit(ctx.TRUE());
        return null;
    }

    //listo
    @Override
    public Object visitBooleanFalseFAST(MyParser.BooleanFalseFASTContext ctx) {
        visit(ctx.FALSE());
        return null;
    }

    //listo
    @Override
    public Object visitDesignatorAST(MyParser.DesignatorASTContext ctx) {

        //ctx.IDENT().getSymbol().getText();
        for (int i=0; i<=ctx.designatorExp().size()-1; i++) {
            storage.add(new Instruccion(contadorInstrucciones, "STORE_FAST", ctx.IDENT().getSymbol().getText()));
            contadorInstrucciones++;
        }
        return null;
    }

    //listo
    @Override
    public Object visitDesignatorPuntIdAST(MyParser.DesignatorPuntIdASTContext ctx) {
        visit(ctx.IDENT());
        visit(ctx.PUNT());
        return null;
    }

    //listo
    @Override
    public Object visitDesignatorCorcsAST(MyParser.DesignatorCorcsASTContext ctx) {
        visit(ctx.expr());
        return null;
    }

    //listo
    @Override
    public Object visitRelopIgIgAST(MyParser.RelopIgIgASTContext ctx) {
        visit(ctx.IGIG());
        return  null;
    }

    //listo
    @Override
    public Object visitRelopDifAST(MyParser.RelopDifASTContext ctx) {
        visit(ctx.DIF());
        return  null;
    }

    //listo
    @Override
    public Object visitRelopMayAST(MyParser.RelopMayASTContext ctx) {
        visit(ctx.MAY());
        return  null;
    }

    //listo
    @Override
    public Object visitRelopMatIgAST(MyParser.RelopMatIgASTContext ctx) {
        visit(ctx.MAY_IG());
        return  null;
    }

    //listo
    @Override
    public Object visitRelopMenAST(MyParser.RelopMenASTContext ctx) {
        visit(ctx.MEN());
        return  null;
    }

    //listo
    @Override
    public Object visitRelopMenIgAST(MyParser.RelopMenIgASTContext ctx) {
        visit(ctx.MEN_IG());
        return  null;
    }

    //listo
    @Override
    public Object visitAddopSumAST(MyParser.AddopSumASTContext ctx) {
        storage.add(new Instruccion(contadorInstrucciones, "BINARY_ADD"));
        contadorInstrucciones++;
        return null;
    }

    //listo
    @Override
    public Object visitAddopRestAST(MyParser.AddopRestASTContext ctx) {
        storage.add(new Instruccion(contadorInstrucciones, "BINARY_SUBSTRACT"));
        contadorInstrucciones++;
        return null;
    }

    //listo
    @Override
    public Object visitMulopMultAST(MyParser.MulopMultASTContext ctx) {
        storage.add(new Instruccion(contadorInstrucciones, "BINARY_MULTIPLY"));
        contadorInstrucciones++;
        return null;
    }

    //listo
    @Override
    public Object visitMulopDivAST(MyParser.MulopDivASTContext ctx) {
        storage.add(new Instruccion(contadorInstrucciones, "BINARY_DIVIDE"));
        contadorInstrucciones++;
        return null;
    }

    //listo
    @Override
    public Object visitMulopPorcAST(MyParser.MulopPorcASTContext ctx) {
        storage.add(new Instruccion(contadorInstrucciones, "BINARY_PORCENTAJE"));
        contadorInstrucciones++;
        return null;
    }

    //listo
    @Override
    public Object visitIfSTAST(MyParser.IfSTASTContext ctx) {

        visit(ctx.condition());
        visit(ctx.statement(0));
        visit(ctx.statement(1));
        return null;
    }

    //listo
    @Override
    public Object visitForSTAST(MyParser.ForSTASTContext ctx) {

        visit(ctx.expr());
        visit(ctx.condition());
        visit(ctx.statement(0));
        visit(ctx.statement(1));

        return null;
    }

    //listo
    @Override
    public Object visitWhileSTAST(MyParser.WhileSTASTContext ctx) {

        visit(ctx.condition());
        visit(ctx.statement());

        return null;
    }

    @Override
    public Object visitConstDeclAST(MyParser.ConstDeclASTContext ctx) {

        String tipo = ctx.type().getText();

        if ((tipo.equals("int")) || (tipo.equals("char"))) {

            if(tipo.equals("int")){
                storage.add(new Instruccion(contadorInstrucciones,"PUSH_GLOBAL_I",ctx.IDENT().getSymbol().getText()));
            }
            else if(tipo.equals("char")){
                storage.add(new Instruccion(contadorInstrucciones,"PUSH_GLOBAL_C",ctx.IDENT().getSymbol().getText()));
            }

            contadorInstrucciones++;

        }

        return null;
    }

    @Override
    public Object visitConstNumberIntDeclAST(MyParser.ConstNumberIntDeclASTContext ctx) {
        storage.add(new Instruccion(contadorInstrucciones,"LOAD_CONST",ctx.NUMBER_INTEGER().getSymbol().getText()));
        contadorInstrucciones++;
        return null;
    }

    @Override
    public Object visitConstNumberIntZDeclAST(MyParser.ConstNumberIntZDeclASTContext ctx) {
        storage.add(new Instruccion(contadorInstrucciones,"LOAD_CONST",ctx.NUMBER_INTEGER_ZERO().getSymbol().getText()));
        contadorInstrucciones++;
        return null;
    }

    @Override
    public Object visitConstCharDeclAST(MyParser.ConstCharDeclASTContext ctx) {
        storage.add(new Instruccion(contadorInstrucciones,"LOAD_CONST",ctx.CHAR_CONST().getSymbol().getText()));
        contadorInstrucciones++;
        return null;
    }

    @Override
    public Object visitVarDeclAST(MyParser.VarDeclASTContext ctx) {

        String tipo = ctx.type().getText();

        if ((tipo.equals("int")) || (tipo.equals("char"))) {

            if(tipo.equals("int")) {
                registrar_variables(ctx.IDENT(),1);
            }
            else if(tipo.equals("char")){
                registrar_variables(ctx.IDENT(),2);
            }

        }


        return null;
    }

    private void registrar_variables(List<TerminalNode> ident, int tipoVar) {

        for(int j = 0; j<ident.size(); j++){

            if(esFuncion && tipoVar == 1){ // Si estoy en una funcion, y es una variable entera (int)
                System.out.println("Entero local ");
                // La registro como local
                storage.add(new Instruccion(contadorInstrucciones,"PUSH_LOCAL_I",ident.get(j).getSymbol().getText()));
            }
            else if(esFuncion && tipoVar == 2) { // Si estoy en una funcion, y es una variable char (char)
                System.out.println("Char local ");
                // La registro como local
                storage.add(new Instruccion(contadorInstrucciones,"PUSH_LOCAL_C",ident.get(j).getSymbol().getText()));
            }
            else if(!esFuncion && tipoVar == 1){ // Si no estoy en una funcion, y es una variable entera (int)
                // La registro como global
                System.out.println("Entero global");
                storage.add(new Instruccion(contadorInstrucciones,"PUSH_GLOBAL_I",ident.get(j).getSymbol().getText()));
            }
            else if(!esFuncion && tipoVar == 2) { // Si no estoy en una funcion, y es una variable char (char)
                // La registro como global
                System.out.println("Char global ");
                storage.add(new Instruccion(contadorInstrucciones,"PUSH_GLOBAL_C",ident.get(j).getSymbol().getText()));
            }

            contadorInstrucciones++;

        }

    }

    @Override
    public Object visitClassDeclAST(MyParser.ClassDeclASTContext ctx) {

        for (MyParser.VarDeclContext e: ctx.varDecl()) {
            visit(e);
        }
        return null;

    }

    @Override
    public Object visitMethodDeclAST(MyParser.MethodDeclASTContext ctx) {

        esFuncion = true;

        //si tiene parametros
        if(ctx.formPars() != null){

            for (MyParser.VarDeclContext e: ctx.varDecl()) {
                visit(e);
            }
        }
        //no tiene parametros
        else{

            for (MyParser.VarDeclContext e: ctx.varDecl()) {
                visit(e);
            }
        }
        esFuncion = false;
        return null;
    }

    @Override
    public Object visitMethodTypeDeclAST(MyParser.MethodTypeDeclASTContext ctx) {

        visit(ctx.type());
        return null;

    }

    @Override
    public Object visitMethodVoidDeclAST(MyParser.MethodVoidDeclASTContext ctx) {

        visit(ctx.VOID());
        return null;
    }

    @Override
    public Object visitFormParsAST(MyParser.FormParsASTContext ctx) {

        System.out.println("Registrando parametros ");
        String tipo = "";

        for(int i = 0;i<ctx.type().size(); i++){ // Recorro los tipos de los parametros

            tipo = ctx.type(i).getText();

            if ((tipo.equals("int")) || (tipo.equals("char"))) {

                if(tipo.equals("int")) {


                    System.out.println("Par Entero local ");
                    // La registro como local
                    storage.add(new Instruccion(contadorInstrucciones,"PUSH_LOCAL_I",ctx.IDENT().get(i).getSymbol().getText()));

                }
                else if(tipo.equals("char")){
                    System.out.println("Par Char local ");
                    // La registro como local
                    storage.add(new Instruccion(contadorInstrucciones,"PUSH_LOCAL_C",ctx.IDENT().get(i).getSymbol().getText()));
                }

                contadorInstrucciones++;

            }
        }

        return null;
    }

    @Override
    public Object visitTypeAST(MyParser.TypeASTContext ctx) {
        return ctx.IDENT().getSymbol();
    }



    @Override
    public Object visitStatementMetSTAST(MyParser.StatementMetSTASTContext ctx) {
        return super.visitStatementMetSTAST(ctx);
    }

    @Override
    public Object visitStatementIncSTAST(MyParser.StatementIncSTASTContext ctx) {

        visit(ctx.designator());
        return null;
    }

    @Override
    public Object visitStatementDecSTAST(MyParser.StatementDecSTASTContext ctx) {

        visit(ctx.designator());
        return null;
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
        visit(ctx.block());
        return null;
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
    public Object visitCondFactAST(MyParser.CondFactASTContext ctx) {
        return super.visitCondFactAST(ctx);
    }

    @Override
    public Object visitExprAST(MyParser.ExprASTContext ctx) {

        for (int i=0;i<=ctx.term().size()-1;i++) {
            visit(ctx.term(i));
            storage.add(new Instruccion(contadorInstrucciones,"Load_Global"));
            contadorInstrucciones++;
        }
        return null;
    }
}
