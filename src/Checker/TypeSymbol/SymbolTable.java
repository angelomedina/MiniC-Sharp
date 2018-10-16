package Checker.TypeSymbol;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by oviquez on 24/9/2018.
 */
public class SymbolTable {

    public int actuaLevel = 0;
    public LinkedList<Symbol> table = new LinkedList<Symbol>();

    /**
     * Funcion para registrar variables, y constantes
     */
    public int enterVarCons(String id, String tipo,String identificador) {

        if (exists(id,actuaLevel) == false) {

            switch ( identificador ) {

                case "Variable":
                    table.add(new Variable(id, tipo, actuaLevel,identificador));
                    return 0;//means id was succesfully inserted in table
                case "Arreglo":
                    table.add(new Variable(id, tipo, actuaLevel,identificador));
                    return 0;//means id was succesfully inserted in table
                case "Constante":
                    table.add(new Constante(id, tipo, actuaLevel));
                    return 0;//means id was succesfully inserted in table
            }
        }

        return 1; //means id exists already in table

    }


    /**
     * Funcion para registrar funciones
     */

    public int enterFunc(String id, String tipo,List<String>varsName, List<String> varsType, List<String>paramsName, List<String> paramsType) {

        if (exists(id,actuaLevel) == false) {

            table.add(new FuncionNormal(id,tipo,actuaLevel,varsName,varsType,paramsName,paramsType));
            return 0;//means id was succesfully inserted in table
        }

        return 1;
    }

    /**
     * Funcion para registrar clases
     */
    public int enterCl(String id, String tipo, List<String>paramsName, List<String> paramsType) {

        if (exists(id,actuaLevel) == false) {

            table.add(new Clase(id, tipo, actuaLevel,paramsName,paramsType));
            return 0;//means id was succesfully inserted in table
        }

        return 1; //means id exists already in table

    }


    public void registrarFuncionesPredefinidas(){

        table.add(new FuncionSpecial("ord","char",-1,"int"));
        table.add(new FuncionSpecial("chr","int",-1,"char"));
        table.add(new FuncionSpecial("len","Arreglo",-1,"int"));
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

                if(i.getIdSimbolo().equals("Constante") || i.getIdSimbolo().equals("Variable")) {
                    System.out.println(nivel + "-> Nombre: " + i.getName() + "-> Nivel: " + i.getLevel() + "-> Tipo: " + i.getType());
                }
                else if(i.getIdSimbolo().equals("Funcion")){
                    ((Funcion) i ).toString();
                }
                else if(i.getIdSimbolo().equals("Clase")){
                    ((Clase) i ).toString();
                }
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

            result += "\n"+i.next().toString()+"\n";
        if(table.size() == 0){
            result = "++ tabla vacia ++" +
                    "";
        }
        return result;
    }
}
