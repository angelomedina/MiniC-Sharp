package Checker.ParaFunciones;



import java.util.List;

public class Funcion {

    public int nParams;
    public String name;
    public String type;
    public int level;
    public List<String> params;

    public Funcion(String n, String t, int l,List<String> params) {
        this.name = n;
        this.type = t;
        this.level = l;
        this.params = params;
        this.nParams = params.size();
    }


    public String toString(){
        if(!type.equals("void") || !type.equals("write") || !type.equals("read")) {
            //return "NO";
            return "ID: " + this.name + ", Type:" + this.type + ", level:" + this.level + ", nParams:" + this.nParams +
                    "-> Params: " + this.getParamsInText()+"-> Return: "+this.type;
        }

        return "ID: " + this.name + ", Type:" + this.type + ", level:" + this.level + ", nParams:" + this.nParams +
                "-> Params: " + this.getParamsInText();
    }

    public String getParamsInText(){
        String paramsInFunction = "";

        for (String p:this.params
        ) {

            paramsInFunction += p+",";

        }

        return paramsInFunction;
    }

    public String getName() { return name; }

    public String getType() { return type; }

    public int getLevel() {  return level; }

    public int getnParams() {
        return nParams;
    }

    public List<String> getParams() {
        return params;
    }
}
