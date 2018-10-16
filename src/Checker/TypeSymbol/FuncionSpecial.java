package Checker.TypeSymbol;


public class FuncionSpecial extends Funcion {

    String returnType;

    public FuncionSpecial(String n, String t, int l, String returnType) {

        super(n,t,l,1); // Por defecto solo reciben un parametro
        this.returnType = returnType;
    }


    public String toString(){
            //return "NO";
            return "Elemento: "+this.idSimbolo+"\n"+"ID: " + this.name + ", Type:" + this.type + ", level:" + this.level + ", nParams:" + this.nParams +
                    "-> Return: "+this.returnType;


    }

    public String getReturnType() {
        return returnType;
    }
}
