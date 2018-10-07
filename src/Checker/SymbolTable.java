package Checker;

import Checker.TypeSymbol.Classe;
import Checker.TypeSymbol.Constante;
import Checker.TypeSymbol.Symbol;
import Checker.TypeSymbol.Variable;

import java.util.Iterator;
import java.util.LinkedList;

/**
 * Created by oviquez on 24/9/2018.
 */
public class SymbolTable {

    private int actuaLevel = 0;
    private LinkedList<Symbol> table = new LinkedList<Symbol>();

    /**
     * Agrega un identificador a la Tabla
     */
    public int enter(String id, String tipo,String identificador) {

        if (exists(id,actuaLevel) == false) {

            switch ( identificador ) {
                case "Classe":
                    table.add(new Classe(id, tipo, actuaLevel));
                    return 0;//means id was succesfully inserted in table
                case "Variable":
                    table.add(new Variable(id, tipo, actuaLevel));
                    return 0;//means id was succesfully inserted in table
                case "Constante":
                    table.add(new Constante(id, tipo, actuaLevel));
                    return 0;//means id was succesfully inserted in table
            }
        }

        return 1; //means id exists already in table

    }

    private boolean exists(String id, int level) {

        for (Iterator i = table.descendingIterator(); i.hasNext(); ) {
            Symbol aux = (Symbol) i.next();
            if (aux.getName().equals(id))
                return true;
            if (aux.getLevel() != level)
                break;
        }
        return false;
    }

    /**
     * Devuelve un identificador de la tabla. Retorna null
     * cuando el identificador no se encuentra en la tabla
     */
    public Symbol retrieve(String id) {

        for (Iterator i = table.descendingIterator(); i.hasNext(); ){

            Symbol aux = (Symbol) i.next();
            if (aux.getName().equals(id)){
               return aux;
            }
        }
        return null;
    }

    /**
     * Agrega un nuevo nivel de identificadores a la tabla
     * El más “profundo”
     */
    public void openScope() {

        this.actuaLevel++;
    }

    /**
     * Elimina el más profundo nivel de identificadores de la tabla.
     * Se borran todos los campos de la tabla asociados con el nivel
     */
    public void closeScope() {

        for (int i=table.size()-1; i>=0;i--)
            if (table.get(i).getLevel()==this.actuaLevel)
                table.remove(i);
            else
                break;
        this.actuaLevel--;
    }

    public  void imprimir(){
        System.out.println("-------------- Tabla ---------------");
        if(!this.table.isEmpty()){

            for (Symbol i: this.table) {
                String nivel = "";
                for (int j = 0; j < i.level; j++){
                    nivel += "\t";
                }
                System.out.println(nivel + "-> Nombre: " + i.getName() + "-> Nivel: " + i.getLevel() + "-> Tipo: " + i.getType());
            }
            System.out.println("------------------------------------------");

        }else {

            System.out.println("Tabla vacía");
        }
    }


    @Override
    public String toString() {
        String result="";

        for (Iterator i = table.descendingIterator(); i.hasNext(); )
            result += i.next().toString()+"\n";
        if(table.size() == 0){
            result = "++ tabla vacia ++" +
                    "";
        }
        return result;
    }
}
