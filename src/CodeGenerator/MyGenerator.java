package CodeGenerator;
import Checker.Analizadores.*;
import Antlr.MyParser;
import Antlr.MyParserBaseVisitor;
import Checker.TypeSymbol.Symbol;
import Checker.TypeSymbol.SymbolTable;
import Modelo.Archivos;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.io.IOException;
import java.util.LinkedList;
import java.util.List;


import Vista.*;

import static com.sun.org.apache.xalan.internal.xsltc.compiler.sym.error;

public class MyGenerator extends MyParserBaseVisitor {

    public SymbolTable tableS = Principal.analizador_contextual_vc1.getTableS();
    int contadorInstrucciones       = 0;
    Boolean esFuncion               = false;
    Archivos archivo                = new Archivos();
    LinkedList<Instruccion> storage = new LinkedList<>();

    private String funcion_actual = "";
    private boolean debeTenerRetorno = false;


    public boolean isInteger(String numero){
        try{
            Integer.parseInt(numero);
            return true;
        }catch(NumberFormatException e){
            return false;
        }
    }


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


        Symbol level = tableS.retrieve(ctx.designator().getText());


        if (level.getLevel() == 0){

            visit(ctx.designator());
            visit(ctx.expr());
            /*
            storage.add(new Instruccion(contadorInstrucciones,"LOAD_CONST ",ctx.expr().getText()));
            contadorInstrucciones++;
            */

        }
        if(level.getLevel() == 1){

            visit(ctx.designator());
            visit(ctx.expr());
            /*
            storage.add(new Instruccion(contadorInstrucciones,"LOAD_FAST",ctx.expr().getText()));
            contadorInstrucciones++;
            */
        }

        esFuncion = false;
        return null;


    }

    //listo
    @Override
    public Object visitTermAST(MyParser.TermASTContext ctx) {

        for (int i=0; i<=ctx.factor().size()-1;i++){

            visit(ctx.factor(i));

            Symbol expre    = tableS.retrieve(ctx.factor(i).getText());

            // es ID o funcion
            if( expre != null ){


                storage.add(new Instruccion(contadorInstrucciones,"LOAD_GLOBAL",expre.getName()));
                contadorInstrucciones++;


                for (int j=0; j<=ctx.mulop().size()-1;j++){
                    visit(ctx.mulop(j));
                }


            }else{


                storage.add(new Instruccion(contadorInstrucciones,"STORE_FAST",ctx.factor(i).getText()));
                contadorInstrucciones++;


                for (int j=0; j<=ctx.mulop().size()-1;j++){
                    visit(ctx.mulop(j));
                }
            }
        }
        return null;
    }

    //listo
    @Override
    public Object visitConditionAST(MyParser.ConditionASTContext ctx) {

        for (int i=0;i<=ctx.condTerm().size()-1;i++) {

            visit(ctx.condTerm(i));

            if(ctx.OR(i) != null){
                visit(ctx.OR(i));

            }

            /*
            storage.add(new Instruccion(contadorInstrucciones,"BINARY_OR"));
            contadorInstrucciones++;
            */
        }
        return null;
    }

    //listo
    @Override
    public Object visitCondTermAST(MyParser.CondTermASTContext ctx) {

        for (int i=0;i<=ctx.condFact().size()-1;i++) {
            visit(ctx.condFact(i));

            if(ctx.AND(i) != null){
                visit(ctx.AND(i));
            }

            /*
            storage.add(new Instruccion(contadorInstrucciones,"BINARY_ADD"));
            contadorInstrucciones++;
            */
        }
        return null;
    }

    //listo
    public Object visitFactorFAST(MyParser.FactorFASTContext ctx) {

        int numero_parametros = 0;

        //System.out.println("Llamando una funcion ? 2 "+ctx.designator().getText());
        visit(ctx.designator());

        if(ctx.actPars() !=  null){ // Si tiene parametros, es una funcion

            //System.out.println("ASIGNACION -> Cantidad de parametros "+ctx.actPars().getChildCount());
            numero_parametros = ctx.actPars().getChildCount();
            visit(ctx.actPars());

            storage.add(new Instruccion(contadorInstrucciones,"LOAD_GLOBAL ",ctx.designator().getText()+"()"));
            contadorInstrucciones++;

            storage.add(new Instruccion(contadorInstrucciones,"CALL_FUNCTION "+numero_parametros));
            contadorInstrucciones++;
            //System.out.println("Es asignacion de una funcion a una variable");
        }

        //storage.add(new Instruccion(contadorInstrucciones,"CALL_FUNCTION "+numero_parametros));

        //visit(ctx.designator());
        return null;
    }

    //listo
    @Override
    public Object visitNumIntFAST(MyParser.NumIntFASTContext ctx) {

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

        for (int i=0; i<=ctx.designatorExp().size()-1; i++) {
            visit(ctx.designatorExp(i));
            /*
            storage.add(new Instruccion(contadorInstrucciones, "STORE_FAST", ctx.IDENT().getText()));
            contadorInstrucciones++;
            */
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
        //  System.out.println("Simbolo igualdad");
        //visit(ctx.IGIG());
        return  ctx.IGIG().getSymbol().getText();
    }

    //listo
    @Override
    public String visitRelopDifAST(MyParser.RelopDifASTContext ctx) {
        //System.out.println("Simbolo diferencia");
        //visit(ctx.DIF());
        return  ctx.DIF().getSymbol().getText();
    }

    //listo
    @Override
    public String visitRelopMayAST(MyParser.RelopMayASTContext ctx) {
        //System.out.println("Simbolo mayor");
        //visit(ctx.MAY());
        return  ctx.MAY().getSymbol().getText();
    }

    //listo
    @Override
    public String visitRelopMatIgAST(MyParser.RelopMatIgASTContext ctx) {
        // System.out.println("Simbolo mayor igual");
        // visit(ctx.MAY_IG());
        return ctx.MAY_IG().getSymbol().getText();
    }

    //listo
    @Override
    public String visitRelopMenAST(MyParser.RelopMenASTContext ctx) {
        //System.out.println("Simbolo menor");
        //visit(ctx.MEN());
        return  ctx.MEN().getSymbol().getText();
    }

    //listo
    @Override
    public String visitRelopMenIgAST(MyParser.RelopMenIgASTContext ctx) {
        // System.out.println("Simbolo menor igual "+ctx.MEN_IG().getSymbol().getText());
        //visit(ctx.MEN_IG());
        return  ctx.MEN_IG().getSymbol().getText();
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
        Instruccion inst1 = new Instruccion(contadorInstrucciones,"JUMP_IF_FALSE");
        storage.add(inst1);
        contadorInstrucciones++;
        visit(ctx.statement(0));

        Instruccion inst = new Instruccion(contadorInstrucciones,"JUMP_ABSOLUTE");
        storage.add(inst);
        contadorInstrucciones++;
        inst1.setParam(String.valueOf(contadorInstrucciones));
        visit(ctx.statement(1));
        inst.setParam(String.valueOf(contadorInstrucciones));
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

        int jmpAbs = contadorInstrucciones;
        visit(ctx.condition());
        Instruccion inst1 = new Instruccion(contadorInstrucciones,"JUMP_IF_FALSE");
        storage.add(inst1);
        contadorInstrucciones++;
        visit(ctx.statement());
        storage.add(new Instruccion(contadorInstrucciones,"JUMP_ABSOLUTE",String.valueOf(jmpAbs)));
        contadorInstrucciones++;
        inst1.setParam(String.valueOf(contadorInstrucciones));

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
                // La registro como local
                storage.add(new Instruccion(contadorInstrucciones,"PUSH_LOCAL_I",ident.get(j).getSymbol().getText()));
            }
            else if(esFuncion && tipoVar == 2) { // Si estoy en una funcion, y es una variable char (char)
                // La registro como local
                storage.add(new Instruccion(contadorInstrucciones,"PUSH_LOCAL_C",ident.get(j).getSymbol().getText()));
            }
            else if(!esFuncion && tipoVar == 1){ // Si no estoy en una funcion, y es una variable entera (int)
                // La registro como global
                storage.add(new Instruccion(contadorInstrucciones,"PUSH_GLOBAL_I",ident.get(j).getSymbol().getText()));
            }
            else if(!esFuncion && tipoVar == 2) { // Si no estoy en una funcion, y es una variable char (char)
                // La registro como global
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

        storage.add(new Instruccion(contadorInstrucciones,"DEF "+ctx.IDENT().getSymbol().getText()));

        if(ctx.formPars() != null){ // Si la funcion tiene parametros los visito
            visit(ctx.formPars());
        }


        for (MyParser.VarDeclContext e: ctx.varDecl()) {
            visit(e);
        }

        visit(ctx.block());

        esFuncion = false;


        return null;
    }


    @Override
    public Object visitReturnSTAST(MyParser.ReturnSTASTContext ctx) {

        Symbol elementoFuncion = tableS.retrieve(funcion_actual);

        if(ctx.expr()!= null) {
            visit(ctx.expr());
        }


        if(elementoFuncion.getType().equals("void")) {


            storage.add(new Instruccion(contadorInstrucciones,"RETURN"));
            contadorInstrucciones++;


        }else {

            storage.add(new Instruccion(contadorInstrucciones,"LOAD_FAST ",ctx.expr().getText()));
            contadorInstrucciones++;

            storage.add(new Instruccion(contadorInstrucciones,"RETURN_VALUE"));
            contadorInstrucciones++;

        }

        funcion_actual   = "";
        esFuncion        = false;
        debeTenerRetorno = false;

        return null;
    }


    @Override
    public Object visitMethodTypeDeclAST(MyParser.MethodTypeDeclASTContext ctx) {

        debeTenerRetorno  = true;
        return null;

    }

    @Override
    public Object visitMethodVoidDeclAST(MyParser.MethodVoidDeclASTContext ctx) {

        visit(ctx.VOID());
        return null;
    }

    @Override
    public Object visitFormParsAST(MyParser.FormParsASTContext ctx) {

        String tipo = "";

        for(int i = 0;i<ctx.type().size(); i++){ // Recorro los tipos de los parametros

            tipo = ctx.type(i).getText();

            if ((tipo.equals("int")) || (tipo.equals("char"))) {

                if(tipo.equals("int")) {


                    // La registro como local
                    storage.add(new Instruccion(contadorInstrucciones,"PUSH_LOCAL_I",ctx.IDENT().get(i).getSymbol().getText()));

                }
                else if(tipo.equals("char")){
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
        //System.out.println("Llamando una funcion ? 1 "+ctx.designator().getText());

        int numero_parametros = 0;

        visit(ctx.designator());


        if(ctx.actPars() !=  null){ // Si tiene parametros
            //  System.out.println("LLAMADA DIRECTA -> Cantidad de parametros "+ctx.actPars().getChildCount());
            numero_parametros = ctx.actPars().getChildCount();
            visit(ctx.actPars());
        }

        storage.add(new Instruccion(contadorInstrucciones,"LOAD_GLOBAL ",ctx.designator().getText()+"()"));
        contadorInstrucciones++;

        storage.add(new Instruccion(contadorInstrucciones,"CALL_FUNCTION "+numero_parametros));
        contadorInstrucciones++;

        return null;
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
        for(MyParser.StatementContext e : ctx.statement() ){
            visit(e);
        }

        return null;
    }

    @Override
    public Object visitActParsAST(MyParser.ActParsASTContext ctx) {
        return super.visitActParsAST(ctx);
    }


    @Override
    public Object visitCondFactAST(MyParser.CondFactASTContext ctx) {

        visit(ctx.expr(0));
        //System.out.println("SIMBOLO DE COMPARACION "+visit(ctx.relop()));
        String simbolo = (String) visit(ctx.relop());
        contadorInstrucciones++;
        storage.add(new Instruccion(contadorInstrucciones,"COMPARE_OP",simbolo));
        contadorInstrucciones++;
        visit(ctx.expr(1));

        return null;
    }

    @Override
    public Object visitExprAST(MyParser.ExprASTContext ctx) {

        for (int i=0;i<=ctx.term().size()-1;i++) {
            visit(ctx.term(i));

            if( ctx.addop(i) != null){
                visit(ctx.addop(i));
            }
        }
        return null;
    }
}
