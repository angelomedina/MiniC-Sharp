package Checker;

public class Symbol {

    String name;
    String type;
    int    level;

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