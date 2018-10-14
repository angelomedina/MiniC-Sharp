package Checker.TypeSymbol;



import java.util.List;

public class FuncionNormal extends Funcion{

    // Para guardar los nombres de parametros dentro de la funcion
    public List<String> paramsName;
    public List<String> paramsType;

    // Para guardar los nombres y tipos de las variables dentro de la funcion
    public List<String> varsName;
    public List<String> varsType;


    public FuncionNormal(String n, String t, int l,
                         List<String> varsName, List<String> varsType,List<String> paramsName, List<String> paramsType) {
        super(n,t,l,paramsName.size());
        this.paramsName = paramsName;
        this.paramsType = paramsType;
        this.varsName = varsName;
        this.varsType = varsType;
    }


    public String toString(){

        if(!type.equals("void")) {
            //return "NO";
            return "Elemento: "+this.idSimbolo+"\n"+"ID: " + this.name + ", Type:" + this.type + ", level:" + this.level + ", nParams:" + this.nParams + "\n"+
                    "-> Vars Name: " + this.getVarsNameInText() + "-> Vars Type: " + this.getVarsTypeInText()+ " <-\n"+
                    "-> Params Name: " + this.getParamsNameInText() + "-> Params Type: " + this.getParamsTypeInText()+ " <-\n"
                    +"-> Return: "+this.type;
        }

        return "Elemento: "+this.idSimbolo+"\n"+"ID: " + this.name + ", Type:" + this.type + ", level:" + this.level + ", nParams:" + this.nParams  + "\n"+
                "-> Vars Name: " + this.getVarsNameInText() + "-> Vars Type: " + this.getVarsTypeInText()+ " <-\n"+
                "-> Params Name: " + this.getParamsNameInText() + "-> Params Type: " + this.getParamsTypeInText()+ " <-\n";
    }

    public String getParamsNameInText(){
        String paramsInFunction = "";

        if(this.paramsName != null) {

            for (String p : this.paramsName
            ) {

                paramsInFunction += p + ",";

            }

        }

        return paramsInFunction;
    }

    public String getParamsTypeInText(){
        String paramsInFunction = "";

        if(this.paramsType != null) {

            for (String p : this.paramsType
            ) {

                paramsInFunction += p + ",";

            }

        }

        return paramsInFunction;
    }

    public String getVarsNameInText(){
        String paramsInFunction = "";

        if(this.varsName != null) {

            for (String p : this.varsName
            ) {

                paramsInFunction += p + ",";

            }

        }

        return paramsInFunction;
    }

    public String getVarsTypeInText(){
        String paramsInFunction = "";

        if(this.varsType != null) {

            for (String p : this.varsType
            ) {

                paramsInFunction += p + ",";

            }

        }

        return paramsInFunction;
    }

    public List<String> getParamsName() {
        return paramsName;
    }

    public List<String> getParamsType() {
        return paramsType;
    }
}
