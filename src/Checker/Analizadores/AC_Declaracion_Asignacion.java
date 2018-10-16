package Checker.Analizadores;


import Antlr.MyParser;
import Antlr.MyParserBaseVisitor;
import Checker.TypeSymbol.SymbolTable;
import org.antlr.v4.runtime.Token;

import java.util.LinkedList;
import java.util.List;

public class AC_Declaracion_Asignacion extends MyParserBaseVisitor {

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

    public AC_Declaracion_Asignacion(){
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
            tableS.openScope();
            for (MyParser.VarDeclContext e : ctx.varDecl()) {
                varClases = true;
                visit(e);
            }


          //  tableS.closeScope();

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

        tableS.openScope();
        // Se registran los parametros de la funcion
        if(ctx.formPars() != null){ // Si tiene parametros

            //System.out.println("R.Pars "+tableS.actuaLevel);
            parametros = (List<String>) visit(ctx.formPars()); // Los obtengo

        }
        tableS.actuaLevel -=1;

        varsName = new LinkedList<>();
        varsType = new LinkedList<>();


        tableS.openScope();
        if(ctx.varDecl() != null){ // Si tiene variables

            //System.out.println("R.Vars "+tableS.actuaLevel);
            for (MyParser.VarDeclContext e : ctx.varDecl()) {
                varClases = true;
                visit(e);
            }
        }
        tableS.actuaLevel -=1;

//        tableS.imprimir();

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

}
