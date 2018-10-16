package Checker.Analizadores;

import Antlr.MyParserBaseVisitor;
import Checker.TypeSymbol.SymbolTable;

import java.util.LinkedList;

public class AC_Verificacion_Retornos extends MyParserBaseVisitor {

    private SymbolTable tableS;
    private int numErrors = 0;
    public LinkedList<String> listaErrores = new LinkedList<String>();

    public AC_Verificacion_Retornos(){
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



}
