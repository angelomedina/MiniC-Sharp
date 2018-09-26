package Checker;

import org.antlr.v4.runtime.CommonToken;
import org.antlr.v4.runtime.Token;

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
    public void enter(String id, String tipo) {

        if (exists(id,actuaLevel,tipo) == false) {
            table.add(new Symbol(id, tipo, actuaLevel));
        }
        else {
            System.out.println("El identificador ya fue declarado en el nivel actual!!!");
        }

    }

    private boolean exists(String id, int actuaLevel,String tipo) {

        int cont  = 0;
        while (cont < this.table.size() && this.table.get(cont).getLevel() == actuaLevel){
            if(this.table.get(cont).getName().equals(id)){
                System.out.println("El identificador " + id + " ya ha sido declarado!!!");
                return true;
            }
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

        if(!this.table.isEmpty()){

            Symbol element = this.table.get(0);

            while(element != null && element.level == actuaLevel){
                table.pop();

                if(!this.table.isEmpty()){
                    element = this.table.get(0);
                }else{
                    element = null;
                }
            }
            this.actuaLevel--;
        }
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
            result += i.next()+"\n";
        return result;
    }
}
