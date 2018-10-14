package Checker.TypeSymbol;

public  abstract class Symbol {

    // Identificadores de Simbolos
    // Variable
    // Constante
    // Clase
    // Metodo


    public String name;
    public String type;
    public int level;
    public String idSimbolo;

    public Symbol(String n, String t, int l,String idSimbolo) {
        this.name = n;
        this.type = t;
        this.level = l;
        this.idSimbolo = idSimbolo;
    }

    public String toString(){

        return "Elemento: "+this.idSimbolo+"\n"+"ID: "+this.name+", Type:"+this.type+", level:"+this.level;
    }

    public String getName() { return name; }

    public String getType() { return type; }

    public int getLevel() {  return level; }

    public String getIdSimbolo() {
        return idSimbolo;
    }
}