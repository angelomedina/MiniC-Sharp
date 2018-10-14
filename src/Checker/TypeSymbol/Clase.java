package Checker.TypeSymbol;

import java.util.List;

public class Clase extends Symbol {

    // Para guardar los nombres y tipos de las variables dentro de la funcion
    public int nVars;
    public List<String> varsName;
    public List<String> varsType;

    public Clase(String n, String t, int l, List<String> varsName, List<String> varsType) {

        super(n, t, l,"Clase");
        this.varsName = varsName;
        this.varsType = varsType;
        this.nVars = varsName.size();
    }

    public String toString(){

        return "Elemento: "+this.idSimbolo+"\n"+"ID: " + this.name + ", Type:" + this.type + ", level:" + this.level + ", nVars:" + this.nVars +
                "-> Vars Name: " + this.getVarsNameInText() + "-> Vars Type: " + this.getVarsTypeInText();
    }

    public String getVarsNameInText(){
        String varsInFunction = "";

        if(this.varsName != null) {

            for (String p : this.varsName
            ) {

                varsInFunction += p + ",";

            }

        }

        return varsInFunction;
    }

    public String getVarsTypeInText(){
        String varsInFunction = "";

        if(this.varsType != null) {

            for (String p : this.varsType
            ) {

                varsInFunction += p + ",";

            }

        }

        return varsInFunction;
    }

    public String getName() { return name; }

    public String getType() { return type; }

    public int getLevel() {  return level; }

    public int getnVars() {
        return nVars;
    }

    public List<String> getVarsName() {
        return varsName;
    }

    public List<String> getVarsType() {
        return varsType;
    }

    public List<String> getParams() {
        return varsName;
    }
}
