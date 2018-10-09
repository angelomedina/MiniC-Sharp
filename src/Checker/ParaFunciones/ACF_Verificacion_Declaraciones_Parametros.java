package Checker.ParaFunciones;

import Antlr.MyParser;
import Antlr.MyParserBaseVisitor;
import Checker.TypeSymbol.Symbol;
import Checker.TypeSymbol.SymbolTable;
import org.antlr.v4.runtime.Token;

import java.util.LinkedList;
import java.util.List;

public class ACF_Verificacion_Declaraciones_Parametros extends MyParserBaseVisitor {

    private int numErrors;
    private FunctionTable tableF;
    private SymbolTable tableV;

    public LinkedList<String> listaErrores = new LinkedList<String>();

    public FunctionTable getTableF() {
        return tableF;
    }

    public int getNumErrors() {
        return numErrors;
    }

    public ACF_Verificacion_Declaraciones_Parametros(FunctionTable tablaF, SymbolTable tablaV){
        this.tableF = tablaF;
        this.tableV = tablaV;
        this.numErrors=0;
    }

    public String imprimir(){

        return tableF.toString();
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

        tableF.registrarFuncionesPredefinidas();
        this.numErrors = 0;

        for (MyParser.MethodDeclContext e : ctx.methodDecl())
            visit(e);

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
        return super.visitIfSTAST(ctx);
    }

    @Override
    public Object visitForSTAST(MyParser.ForSTASTContext ctx) {
        return super.visitForSTAST(ctx);
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

            visit(e);

        }

        return null;
    }

    @Override
    public Object visitFactorFAST(MyParser.FactorFASTContext ctx) {

       // System.out.println("NIVEL -> "+nivel);
      //  System.out.println("¿ Variable o Funcion ? -> "+
        //        ctx.designator().getText()+" <- Buscar en tablas ");
        //System.out.println("Nombre de la funcion -> "+ctx.designator().getText());

        // Se busca en la tabla variables si no esta se busca en la tabla funciones

        if(tableV.retrieve(ctx.designator().getText()) == null) {

            if (tableF.retrieve(ctx.designator().getText()) != null) {

                System.out.println("Funcion "+ctx.designator().getText() );
                // Si tiene parametros los busco
                if (ctx.actPars() != null) { // Busco parametros

                    //System.out.println("Act "+ctx.actPars().getText());
                    procesar_informacion(ctx.designator().getText(),ctx.actPars().getText());
                  //  visit(ctx.actPars());
                }
                else {
                    // Si no tiene parametros
                    System.out.println("Funcion sin Parametros");
                }

            }

            else {

                System.out.println("Error el elemento "+ctx.designator().getText() +" no existe.");
            }

        }else {
            System.out.println("Variable" );
        }


        //System.out.println("Funcion params -> "+ctx.actPars());
        return null;
    }

    public void procesar_informacion(String id, String paramsF) {

        System.out.println("Procesando informacion");
        System.out.println("ID F -> "+id);
        System.out.println("Params F -> "+paramsF);


    }

    @Override
    public Object visitActParsAST(MyParser.ActParsASTContext ctx) {

        System.out.println("En actpars");

        for (MyParser.ExprContext e : ctx.expr()) {

            visit(e);
          //  Token elemento = (Token) visit(e);
            //params.add(elemento.getText());
             //System.out.println(elemento.getText());
        }

        return null;
    }

    @Override
    public Object visitSpfunctionFAST(MyParser.SpfunctionFASTContext ctx) {
        return super.visitSpfunctionFAST(ctx);
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
}