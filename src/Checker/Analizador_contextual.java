package Checker;


import Antlr.MyParser;
import Antlr.MyParserBaseVisitor;
import org.antlr.v4.runtime.Token;

import java.util.LinkedList;

public class Analizador_contextual extends MyParserBaseVisitor {

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

    private SymbolTable       tableS;
    private int               numErrors = 0;
    public LinkedList<String> listaErrores = new LinkedList<String>();




    public Analizador_contextual(){
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


    @Override
    public Object visitProgramAST(MyParser.ProgramASTContext ctx) {

        this.numErrors=0;

        for (MyParser.DeclarationContext e : ctx.declaration())
            visit(e);

        for (MyParser.MethodDeclContext e : ctx.methodDecl())
            visit(e);

        return null;
    }

    @Override
    public Object visitProgramConstAST(MyParser.ProgramConstASTContext ctx) {

        tableS.openScope();
        visit(ctx.constDecl());

        return null;
    }

    @Override
    public Object visitProgramVarAST(MyParser.ProgramVarASTContext ctx) {

        tableS.openScope();
        visit(ctx.varDecl());

        return null;
    }

    @Override
    public Object visitProgramClassAST(MyParser.ProgramClassASTContext ctx) {

        tableS.openScope();
        visit(ctx.classDecl());

        return null;
    }

    @Override
    public Object visitConstDeclAST(MyParser.ConstDeclASTContext ctx) {

        String error = "";
        String tipo = ctx.type().getText();

        if ((tipo.equals("int")) || (tipo.equals("char")) || (tipo.equals("bool")) || (tipo.equals("string")) || (tipo.equals("float"))) {

            int res = tableS.enter(ctx.IDENT().getText(),ctx.IDENT().getSymbol().getText(),"Constante");

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
        return super.visitConstNumberIntDeclAST(ctx);
    }

    @Override
    public Object visitConstNumberIntZDeclAST(MyParser.ConstNumberIntZDeclASTContext ctx) {
        return super.visitConstNumberIntZDeclAST(ctx);
    }

    @Override
    public Object visitConstNumberFloDeclAST(MyParser.ConstNumberFloDeclASTContext ctx) {
        return super.visitConstNumberFloDeclAST(ctx);
    }

    @Override
    public Object visitConstCharDeclAST(MyParser.ConstCharDeclASTContext ctx) {
        return super.visitConstCharDeclAST(ctx);
    }

    @Override
    public Object visitConstStringDeclAST(MyParser.ConstStringDeclASTContext ctx) {
        return super.visitConstStringDeclAST(ctx);
    }

    @Override
    public Object visitVarDeclAST(MyParser.VarDeclASTContext ctx) {
        return super.visitVarDeclAST(ctx);
    }

    @Override
    public Object visitClassDeclAST(MyParser.ClassDeclASTContext ctx) {
        return super.visitClassDeclAST(ctx);
    }

    @Override
    public Object visitMethodDeclAST(MyParser.MethodDeclASTContext ctx) {
        return super.visitMethodDeclAST(ctx);
    }

    @Override
    public Object visitMethodTypeDeclAST(MyParser.MethodTypeDeclASTContext ctx) {
        return super.visitMethodTypeDeclAST(ctx);
    }

    @Override
    public Object visitMethodVoidDeclAST(MyParser.MethodVoidDeclASTContext ctx) {
        return super.visitMethodVoidDeclAST(ctx);
    }

    @Override
    public Object visitFormParsAST(MyParser.FormParsASTContext ctx) {
        return super.visitFormParsAST(ctx);
    }

    @Override
    public Object visitTypeAST(MyParser.TypeASTContext ctx) {
        return super.visitTypeAST(ctx);
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
        return super.visitRelopIgIgAST(ctx);
    }

    @Override
    public Object visitRelopDifAST(MyParser.RelopDifASTContext ctx) {
        return super.visitRelopDifAST(ctx);
    }

    @Override
    public Object visitRelopMayAST(MyParser.RelopMayASTContext ctx) {
        return super.visitRelopMayAST(ctx);
    }

    @Override
    public Object visitRelopMatIgAST(MyParser.RelopMatIgASTContext ctx) {
        return super.visitRelopMatIgAST(ctx);
    }

    @Override
    public Object visitRelopMenAST(MyParser.RelopMenASTContext ctx) {
        return super.visitRelopMenAST(ctx);
    }

    @Override
    public Object visitRelopMenIgAST(MyParser.RelopMenIgASTContext ctx) {
        return super.visitRelopMenIgAST(ctx);
    }

    @Override
    public Object visitAddopSumAST(MyParser.AddopSumASTContext ctx) {
        return super.visitAddopSumAST(ctx);
    }

    @Override
    public Object visitAddopRestAST(MyParser.AddopRestASTContext ctx) {
        return super.visitAddopRestAST(ctx);
    }

    @Override
    public Object visitMulopMultAST(MyParser.MulopMultASTContext ctx) {
        return super.visitMulopMultAST(ctx);
    }

    @Override
    public Object visitMulopDivAST(MyParser.MulopDivASTContext ctx) {
        return super.visitMulopDivAST(ctx);
    }

    @Override
    public Object visitMulopPorcAST(MyParser.MulopPorcASTContext ctx) {
        return super.visitMulopPorcAST(ctx);
    }
}
