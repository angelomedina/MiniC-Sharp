package CodeGenerator;

public class Instruccion {

    int    numero  = -1;
    String nombre  = "";
    String param   = "";

    public Instruccion(int numero, String nombre, String param) {

        this.numero = numero;
        this.nombre = nombre;
        this.param = param;

    }
    public Instruccion(String nombre){
        this.nombre=nombre;
    }

    public Instruccion(int numero, String nombre) {

        this.numero = numero;
        this.nombre = nombre;

    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getParam() {
        return param;
    }

    public void setParam(String param) {
        this.param = param;
    }
}
