package Checker.TypeSymbol;

public  abstract class Symbol {


    public String name;
    public String type;
    public int level;

    public Symbol(String n, String t, int l) {
        this.name = n;
        this.type = t;
        this.level = l;
    }

    public String toString(){
        return "ID: "+this.name+", Type:"+this.type+", level:"+this.level;
    }

    public String getName() { return name; }

    public String getType() { return type; }

    public int getLevel() {  return level; }

}