package Checker.ParaFunciones;

import Antlr.MyParser;
import Antlr.MyParserBaseVisitor;
import org.antlr.v4.runtime.Token;

import java.util.LinkedList;
import java.util.List;

public class ACF_Lectura_Previa extends MyParserBaseVisitor {

    private int numErrors;
    private FunctionTable tableF;
    public LinkedList<String> listaErrores = new LinkedList<String>();

    public FunctionTable getTableF() {
        return tableF;
    }

    public int getNumErrors() {
        return numErrors;
    }

    public ACF_Lectura_Previa(){
        this.tableF = new FunctionTable();
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


    // MethodDecl

    @Override
    public Object visitMethodDeclAST(MyParser.MethodDeclASTContext ctx) {

        String error;
       // System.out.println("En MethodDeclAST");
        Token tipo = (Token) visit(ctx.optionMethodDecl());
        List<String> parametros = new LinkedList<>();
        //System.out.println(ctx.formPars());

        if(ctx.formPars() != null){ // Si tiene parametros

            parametros = (List<String>) visit(ctx.formPars()); // Los obtengo

        }


        //Antes de agregar
      //  System.out.println("F-> "+tipo.getText()+" "+ctx.IDENT().getSymbol().getText());

        int res = tableF.enter(ctx.IDENT().getSymbol().getText(), tipo.getText(),parametros);

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

       //System.out.println("En formPars");
        List<String> params = new LinkedList<>();

        for (MyParser.TypeContext e : ctx.type()) {
            Token elemento = (Token) visit(e);
            params.add(elemento.getText());
           // System.out.println(elemento.getText());
        }

        return params;
    }

    //Type
    @Override
    public Object visitTypeAST(MyParser.TypeASTContext ctx) {
       // System.out.println("En Type ");
        return ctx.IDENT().getSymbol();
    }

}
