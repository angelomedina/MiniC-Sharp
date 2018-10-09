package Checker.ParaFunciones;

import Checker.ParaFunciones.Funcion;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by oviquez on 24/9/2018.
 */
public class FunctionTable {

    private int actuaLevel = 0;
    private LinkedList<Funcion> table = new LinkedList<Funcion>();

    public void registrarFuncionesPredefinidas(){

        List<String>params = new LinkedList<>();
        params.add("char");

        List<String>params2 = new LinkedList<>();
        params2.add("int");

        List<String>params3 = new LinkedList<>();
        params3.add("uni");

        List<String>params4 = new LinkedList<>();
        params4.add("uni");

        List<String>params5 = new LinkedList<>();

        table.add(new Funcion("ord","int",-1,params));
        table.add(new Funcion("chr","char",-1,params2));
        table.add(new Funcion("len","int",-1,params3));
        table.add(new Funcion("read","univ",-1,params4));
        table.add(new Funcion("write","univ",-1,params5));
    }

    /**
     * Agrega un identificador a la Tabla
     */
    public int enter(String id, String tipo, List<String>params) {

        if (exists(id,actuaLevel,tipo) == false) {

                table.add(new Funcion(id,tipo,actuaLevel,params));
                return 0;//means id was succesfully inserted in table
            }

        return 1;
    }

    private boolean exists(String id, int level,String tipo) {

        for (Iterator i = table.descendingIterator(); i.hasNext(); ) {
            Funcion aux = (Funcion) i.next();
           // System.out.println("aux -<> "+aux);
                if (aux.getName().equals(id) && aux.getType().equals(tipo)) {
                    return true; // Nombre igual y tipo igual
                }
                if (aux.getLevel() != level)
                    break;
            }

        return false;
    }


    /**
     * Devuelve un identificador de la tabla. Retorna null
     * cuando el identificador no se encuentra en la tabla
     */
    public Funcion retrieve(String id) {

        for (Iterator i = table.descendingIterator(); i.hasNext(); ){

            Funcion aux = (Funcion) i.next();
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

            for (Funcion i: this.table) {
                String nivel = "";
                for (int j = 0; j < i.level; j++){
                    nivel += "\t";
                }
                System.out.println(nivel + "-> Nombre: " + i.getName() + "-> Nivel: " + i.getLevel() + "-> Tipo: " + i.getType() +"-> nParams: "+i.getnParams() + "-> Params: "+i.getParamsInText());
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
