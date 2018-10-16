package Checker.TypeSymbol;


public abstract class Funcion extends Symbol {

    public int nParams;

    public Funcion(String n, String t, int l,int numParams) {
        super(n,t,l,"Funcion");
        this.nParams = numParams;
    }

    public String getName() { return name; }

    public String getType() { return type; }

    public int getLevel() {  return level; }

    public int getnParams() {
        return nParams;
    }

}
