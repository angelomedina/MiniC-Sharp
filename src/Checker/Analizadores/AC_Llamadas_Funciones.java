package Checker.Analizadores;

import Checker.Analizadores.AC_Llamadas_Funciones;
import Antlr.MyParser;
import Antlr.MyParserBaseVisitor;
import Checker.TypeSymbol.*;
import org.antlr.v4.runtime.Token;

import java.util.LinkedList;
import java.util.List;

public class AC_Llamadas_Funciones extends MyParserBaseVisitor {

    private int numErrors;
    public   SymbolTable tableS;
    private String error = "";
    private boolean debeTenerRetorno = false;
    private boolean en_funcion = false;
    private String funcion_actual = "";

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

    @Override
    public Object visitMethodTypeDeclAST(MyParser.MethodTypeDeclASTContext ctx) {

        debeTenerRetorno  = true;
        return null;
    }


    // Method Declaration

    @Override
    public Object visitMethodDeclAST(MyParser.MethodDeclASTContext ctx) {

        en_funcion = true;
        funcion_actual = ctx.IDENT().getText();
       // System.out.println("Ret 1 "+debeTenerRetorno);
        visit(ctx.optionMethodDecl());
     //   System.out.println("Ret 2 "+debeTenerRetorno);
        visit(ctx.block());

//        System.out.println("Retorno despues "+debeTenerRetorno);

        if(debeTenerRetorno){
            numErrors++;
            error = "Error, la funcion "+ funcion_actual+ " debe tener un valor de retorno.";
            listaErrores.push(error);
        }

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

            if(existDesignator.equals("int")){

                if(!existDesignator.equals("int")) {

                    numErrors++;
                    error = "Semantic Error Incompatible types in StatementIgSTAST between "
                            + existDesignator.getName() + " and " + existExpre.getName() ;
                    listaErrores.push(error);

                }
            }
            if(existDesignator.equals("char")){

                if(!existDesignator.equals("char")) {

                    numErrors++;
                    error = "Semantic Error Incompatible types in StatementIgSTAST between "
                            + existDesignator.getName() + " and " + existExpre.getName() ;
                    listaErrores.push(error);

                }
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

    public static boolean isNumeric(String cadena) {

        boolean resultado;

        try {
            Integer.parseInt(cadena);
            resultado = true;
        } catch (NumberFormatException excepcion) {
            resultado = false;
        }

        return resultado;
    }

    public String obtenerNombreElemento(String elemento){

        String nombre = "";
        for(int i = 0; i<elemento.length(); i++){

            if(elemento.charAt(i) == '(' || elemento.charAt(i) == '['){
                return nombre;
            }else{

                nombre+=elemento.charAt(i);
            }

        }

        return nombre;

    }

    @Override
    public Object visitReturnSTAST(MyParser.ReturnSTASTContext ctx) {

        Symbol elementoFuncion = tableS.retrieve(funcion_actual);
        Symbol elemento,elementoAUX;

        //System.out.println("En return "+ctx.expr().getText());
        if(ctx.expr()!= null) {
            visit(ctx.expr());
        }

        if(en_funcion && !elementoFuncion.getType().equals("void")) {

            if (ctx.expr() == null) {
                numErrors++;
                error = "Error se debe retornar un valor.";
                listaErrores.push(error);
            }

            else {

                if (isNumeric(ctx.expr().getText())) { // Si el retorno es un numero

                    if(!elementoFuncion.getType().equals("int")){ // y el tipo de retorno no es un numero
                        numErrors++;
                        error = "Error, el tipo de valor retornado por la funcion no debe ser int";
                        listaErrores.push(error);
                    }


                }

                else if(ctx.expr().getText().equals("true") || ctx.expr().getText().equals("false")) { // Si el retorno es un valor booleano

                    if(!elementoFuncion.getType().equals("bool")){ // y el tipo retorno no es un booleano
                        numErrors++;
                        error = "Error, el tipo de valor retornado por la funcion no debe ser booleano";
                        listaErrores.push(error);
                    }

                }

                else if(ctx.expr().getText().contains("(") || ctx.expr().getText().contains("[")){// Si es la llamada a una funcion o un arreglo

                    String nombreE = obtenerNombreElemento(ctx.expr().getText());

                    if(!nombreE.equals("")){
                        elementoAUX = tableS.retrieve(nombreE);

                        if(elementoAUX != null){
                            if(!elementoAUX.getType().equals(elementoFuncion.getType())){
                                numErrors++;
                                error = "El tipo de retorno del elemento "+elementoAUX.getName()+
                                        " es "+elementoAUX.getType()+" . Sin embargo, deben ser "+elementoFuncion.getType();
                                listaErrores.push(error);
                            }
                        }
                    }
                    else{
                        // FALTA DE VALIDAR EXPRESION COMPLEJA
                    }

                }


                else {
                    elemento = tableS.retrieve(ctx.expr().getText());

                    if (elemento != null) {

                        if (!elementoFuncion.getType().equals(elemento.getType())) {

                            numErrors++;
                            error = "Error, el tipo de valor retornado es " + elemento.getType()
                                    + ", pero debe ser " + elementoFuncion.getType() + " .";
                            listaErrores.push(error);
                        }

                        //System.out.println("Lo que estoy retornando "+ctx.expr().getText());
                        //System.out.println("Lo que debo retornar "+elementoFuncion.getType());
                    }

                    else {
                        numErrors++;
                        error = "Error, el elemento "+ctx.expr().getText()+ " no existe.";
                        listaErrores.push(error);
                    }

                }

            }

        }else { // Si no estoy dentro de una funcion

            numErrors++;
            error = "La funcion no retorna valores";
            listaErrores.push(error);
        }

        funcion_actual = "";
        en_funcion = false;
        debeTenerRetorno = false; // Si encontro el retorno

        return null;
    }

    @Override
    public Object visitReadSTAT(MyParser.ReadSTATContext ctx) {

        visit(ctx.designator());

        return null;
    }

    @Override
    public Object visitWriteSTAST(MyParser.WriteSTASTContext ctx) {


        //visit(ctx.expr());
        //visit(ctx.writeType());

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

                    if (elemento.getIdSimbolo().equals("Funcion")) { // Si es una funcion

                        verificar_elementos((Funcion) elemento, ctx.actPars());

                    }else{
                        if(ctx.actPars() != null){
                            numErrors++;
                            error = "Error el elemento " + ctx.designator().getText()+ " no es una funcion.";
                            listaErrores.push(error);
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

       // System.out.println("EEEEEEEEEEEEEEEEE "+elemento.getName());

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
                error = "Error el numero de parametros recibidos en la funcion "+elemento.getName()+" es incorrecto";
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
                                //System.out.println("Funcion special "+elemento.getName());
                                // Convierto a una funcion especial
                                 funcionSpecial = (FuncionSpecial) elemento;
                                 if(elemento.getName().equals("len")){// Si la funcion es len, verifico si la variable es un arreglo
                                   // System.out.println("->> Elemento "+elem.getIdSimbolo()+ " <<-");

                                     if(elem.getIdSimbolo().equals("Variable")){ // Si no es un arreglo
                                         numErrors++;
                                         error = "Error el elemento "+elem.getName()+" no es un arreglo";
                                         listaErrores.push(error);
                                     }

                                 }
                                 else {
                                     if (!elem.getType().equals(funcionSpecial.getType())) {
                                         numErrors++;
                                         error = "Error el elemento " + parametros_recibidos.get(x) + " debe ser de tipo " + funcionSpecial.getType() + " .";
                                         listaErrores.push(error);
                                     }
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

    public boolean isInteger(String numero){
        try{
            Integer.parseInt(numero);
            return true;
        }catch(NumberFormatException e){
            return false;
        }
    }

    @Override
    public Object visitCondFactAST(MyParser.CondFactASTContext ctx) {

        // 1. Verifico si ambos son id: a<b

        if(isInteger(ctx.expr(0).getText()) != true && isInteger(ctx.expr(1).getText()) != true) {

            Symbol existExpreI    = tableS.retrieve(ctx.expr(0).getText());
            Symbol existExpreII   = tableS.retrieve(ctx.expr(1).getText());

            if(!existExpreI.getType().equals("int") || !existExpreII.getType().equals("int")) {

                numErrors++;
                error = "Semantic Error Incompatible types in CondFactAST between "
                        + existExpreI.getType() + " and " + existExpreII.getType();
                listaErrores.push(error);

            }else{

                visit(ctx.expr(0));
                visit(ctx.relop());
                visit(ctx.expr(1));

                return null;
            }
        }

        // 2. verifico:  a < 10

        if(isInteger(ctx.expr(0).getText()) != true){

            Symbol existExpreI    = tableS.retrieve(ctx.expr(0).getText());

            if(existExpreI != null && isInteger(ctx.expr(1).getText()) == true){

                if(!existExpreI.getType().equals("int")) {
                    numErrors++;
                    error = "Semantic Error Incompatible types in CondFactAST between "
                            + existExpreI.getName() + " and " + ctx.expr(1).getText();
                    listaErrores.push(error);

                }else{

                    visit(ctx.expr(0));
                    visit(ctx.relop());
                    visit(ctx.expr(1));

                    return null;
                }

            }else{

                numErrors++;
                error = "Semantic Error Incompatible types in CondFactAST between "
                        + existExpreI.getName() + " and " + ctx.expr(1).getText();
                listaErrores.push(error);

            }
        }

        // 2. verifico:  10 < a

        if(isInteger(ctx.expr(1).getText()) != true){

            Symbol existExpreI    = tableS.retrieve(ctx.expr(1).getText());

            if(existExpreI != null && isInteger(ctx.expr(0).getText()) == true){

                if(!existExpreI.getType().equals("int")) {
                    numErrors++;
                    error = "Semantic Error Incompatible types in CondFactAST between "
                            + existExpreI.getName() + " and " + ctx.expr(0).getText();
                    listaErrores.push(error);

                }else{

                    visit(ctx.expr(0));
                    visit(ctx.relop());
                    visit(ctx.expr(1));

                    return null;
                }

            }else{

                numErrors++;
                error = "Semantic Error Incompatible types in CondFactAST between "
                        + existExpreI.getName() + " and " + ctx.expr(0).getText();
                listaErrores.push(error);

            }
        }

        visit(ctx.expr(0));
        visit(ctx.relop());
        visit(ctx.expr(1));

        return null;
    }
}