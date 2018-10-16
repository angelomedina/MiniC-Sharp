package Checker.Analizadores;

import Antlr.MyParser;
import Antlr.MyParserBaseVisitor;
import Checker.TypeSymbol.*;
import org.antlr.v4.runtime.Token;

import java.util.LinkedList;
import java.util.List;

public class AC_Llamadas_Funciones extends MyParserBaseVisitor {

    private int numErrors;
    private SymbolTable tableS;
    private String error = "";
    private boolean buscandoRetorno = false;

    public LinkedList<String> listaErrores = new LinkedList<String>();

    public int getNumErrors() {
        return numErrors;
    }

    public AC_Llamadas_Funciones(SymbolTable tablaS){
        this.tableS = tablaS;
        this.numErrors=0;
    }

    public String imprimir(){

        return tableS.toString();
    }


    public boolean hasErrors(){
        if (this.numErrors==0)
            return false;
        else
            return true;
    }

    // Program AST

    @Override
    public Object visitProgramAST(MyParser.ProgramASTContext ctx) {

        this.numErrors = 0;

        for (MyParser.MethodDeclContext e : ctx.methodDecl()){
         visit(e);
        }
        //  this.tableF.closeScope();

        return null;
    }


    // Method Declaration

    @Override
    public Object visitMethodDeclAST(MyParser.MethodDeclASTContext ctx) {

        visit(ctx.block());

        return null;
    }

    // Block

    @Override
    public Object visitBlockAST(MyParser.BlockASTContext ctx) {

        for (MyParser.StatementContext e: ctx.statement()) {
            visit(e);
        }

        return null;
    }

    // statementIgSTAST



    @Override
    public Object visitStatementIgSTAST(MyParser.StatementIgSTASTContext ctx) {


        Symbol existDesignator = tableS.retrieve(ctx.designator().getText());
        Symbol existExpre      = tableS.retrieve(ctx.expr().getText());

        if( existExpre != null && existDesignator != null) {

            if(!existDesignator.equals(existExpre)){
                numErrors++;
                error = "Semantic Error Incompatible types in StatementIgSTAST between "
                        + existDesignator.getName() + " and " + existExpre.getName() ;
                listaErrores.push(error);
            }
        }

        visit(ctx.designator());
        visit(ctx.expr());

        return null;
    }

    @Override
    public Object visitStatementMetSTAST(MyParser.StatementMetSTASTContext ctx) {
        Symbol elemento = tableS.retrieve(ctx.designator().getText());
        if (elemento != null) {

            if(elemento.getIdSimbolo().equals("Funcion") ){ // Si es una funcion

                verificar_elementos((Funcion)elemento,ctx.actPars());

            }

        }

        else {

            numErrors++;
            error = "Error el elemento "+ctx.designator().getText() +" no existe.";
            listaErrores.push(error);
        }

        // }


        //System.out.println("Funcion params -> "+ctx.actPars());
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
    public Object visitDesignatorAST(MyParser.DesignatorASTContext ctx) {

        for (MyParser.DesignatorExpContext e: ctx.designatorExp()) {

            visit(e);

        }
        return null;
    }

    @Override
    public Object visitDesignatorCorcsAST(MyParser.DesignatorCorcsASTContext ctx) {

        visit(ctx.expr());

        return null;
    }

    @Override
    public Object visitIfSTAST(MyParser.IfSTASTContext ctx) {

        visit(ctx.condition());
        visit(ctx.statement(0));
        visit(ctx.statement(1));

        return null;
    }

    @Override
    public Object visitForSTAST(MyParser.ForSTASTContext ctx) {

        visit(ctx.expr());
        visit(ctx.condition());
        visit(ctx.statement(0));
        visit(ctx.statement(1));

        return null;
    }

    @Override
    public Object visitWhileSTAST(MyParser.WhileSTASTContext ctx) {
        visit(ctx.condition());
        visit(ctx.statement());
        return null;
    }

    @Override
    public Object visitReturnSTAST(MyParser.ReturnSTASTContext ctx) {


        System.out.println("En return "+ctx.expr().getText());
        buscandoRetorno = true;
        visit(ctx.expr());

        return null;
    }

    @Override
    public Object visitReadSTAT(MyParser.ReadSTATContext ctx) {

        visit(ctx.designator());

        return null;
    }

    @Override
    public Object visitWriteSTAST(MyParser.WriteSTASTContext ctx) {

        visit(ctx.expr());
        visit(ctx.writeType());

        return null;
    }

    @Override
    public Object visitBlockSTAST(MyParser.BlockSTASTContext ctx) {
        return super.visitBlockSTAST(ctx);
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
    public Object visitExprAST(MyParser.ExprASTContext ctx) {

        //System.out.println("En expr");
        for (MyParser.TermContext e: ctx.term()) {

            visit(e);

        }

        return null;
    }

    @Override
    public Object visitTermAST(MyParser.TermASTContext ctx) {

      //  System.out.println("En temr");
        for (MyParser.FactorContext e: ctx.factor()) {

            //System.out.println("Visitando factors");
            visit(e);

        }

        return null;
    }

    @Override
    public Object visitFactorFAST(MyParser.FactorFASTContext ctx) {

            Symbol elemento = tableS.retrieve(ctx.designator().getText());
            if (elemento != null) {

            //    System.out.println("Elemento "+elemento.getName()+" encontrado.");
              //  System.out.println("Tipo "+elemento.getIdSimbolo());

                if(buscandoRetorno){

                }

                else {

                    if (elemento.getIdSimbolo().equals("Funcion")) { // Si es una funcion

                        verificar_elementos((Funcion) elemento, ctx.actPars());

                    }

                }

            }

            else {

                numErrors++;
                error = "Error el elemento "+ctx.designator().getText() +" no existe.";
                listaErrores.push(error);
            }

       // }


        //System.out.println("Funcion params -> "+ctx.actPars());
        return null;
    }

    public boolean esFuncion(String elemento){

        if(elemento.contains("(") || elemento.contains(")")){
            System.out.println("FALSE");
            return false;
        }

        System.out.println("TRUE");
        return true;
    }

    private void verificar_elementos(Funcion elemento, MyParser.ActParsContext actPars) {

        List<String> parametros_recibidos = new LinkedList<>();
        FuncionSpecial funcionSpecial = null;
        FuncionNormal funcionNormal = null;

        // Verifico la cantidad de parametros

        if((actPars == null && elemento.getnParams() > 0)){ // Si la llamada no tiene parametros, pero la funcion recibe.
            numErrors++;
            error = "Error el numero de parametros recibidos es incorrecto";
            listaErrores.push(error);
        }

        if(actPars != null){

            for (int d = 0; d<actPars.getChildCount();d++) {
                if(!actPars.getChild(d).getText().equals(",")) {
                    parametros_recibidos.add(actPars.getChild(d).getText());
                    //System.out.println("H "+ctx.actPars().getChild(d).getText());
                }
            }

            if(parametros_recibidos.size() != elemento.getnParams()){
                numErrors++;
                error = "Error el numero de parametros recibidos es incorrecto";
                listaErrores.push(error);
            }
            else {

                //System.out.println("NA "+tableS.actuaLevel);
                    for (int x = 0; x < parametros_recibidos.size(); x++) {

                        Symbol elem = tableS.retrieve(parametros_recibidos.get(x));

                        if (elem == null) {

                            //System.out.println("PR - " + parametros_recibidos.get(x));
                           // if (esFuncion(parametros_recibidos.get(x))) {
                                numErrors++;
                                error = "Error el elemento " + parametros_recibidos.get(x) + " no existe.";
                                listaErrores.push(error);
                                break;
                            //}
                             /*else {
                                System.out.println("Funcion como parametro FALTA");
                            }*/
                        } else {

                            if(elemento.getName().equals("len") || elemento.getName().equals("ord") || elemento.getName().equals("chr")){

                                // Convierto a una funcion especial
                                 funcionSpecial = (FuncionSpecial) elemento;

                                 System.out.println(elem.getType() + " : "+funcionSpecial.getType());
                                if (!elem.getType().equals(funcionSpecial.getType())) {
                                    numErrors++;
                                    error = "Error el elemento " + parametros_recibidos.get(x) + " debe ser de tipo " + funcionSpecial.getType()+" .";
                                    listaErrores.push(error);
                                }
                            }

                            else {
                                // Convierto la funcion a una funcion normal
                                 funcionNormal = (FuncionNormal) elemento;

                                if (!elem.getType().equals(funcionNormal.getParamsType().get(x))) {
                                    numErrors++;
                                    error = "Error el elemento " + parametros_recibidos.get(x) + " debe ser de tipo " + funcionNormal.getParamsType().get(x);
                                    listaErrores.push(error);
                                }
                            }


                        }


                }
            }
        }
    }

   // public boolean alcance (){

    //}
    @Override
    public Object visitExpresionFAST(MyParser.ExpresionFASTContext ctx) {

        visit(ctx.expr());
        return null;
    }

    @Override
    public Object visitActParsAST(MyParser.ActParsASTContext ctx) {

        //System.out.println("En actpars");

        for (MyParser.ExprContext e : ctx.expr()) {

            Token elemento = (Token) visit(e);
            //params.add(elemento.getText());
             System.out.println(elemento.getText());
        }

        return null;
    }

    @Override
    public Object visitConditionAST(MyParser.ConditionASTContext ctx) {

        for (MyParser.CondTermContext e: ctx.condTerm()) {

            visit(e);
        }

        return null;
    }

    @Override
    public Object visitCondTermAST(MyParser.CondTermASTContext ctx) {

        for (MyParser.CondFactContext e: ctx.condFact()) {

            visit(e);
        }

        return null;
    }

    @Override
    public Object visitCondFactAST(MyParser.CondFactASTContext ctx) {

        visit(ctx.expr(0));
        visit(ctx.relop());
        visit(ctx.expr(1));

        return null;
    }
}