package Gremmers.array;

import Gremmers.AST;

public class ArrayVar extends AST {
    public String var;
    public String id;
    public ArrayBody arraybody;

    public void setVar(String var){
        this.var = var;
    }
    public String getVar(){
        return var;
    }

    public void setId(String id){
        this.id = id;
    }
    public String getId(){
        return id;
    }

    public void setArraybody(ArrayBody arraybody){
        this.arraybody = arraybody;
    }
    public ArrayBody getArraybody(){
        return arraybody;
    }


    @Override
    public String toString() {
        return "ArrayVar{" +
                "var='" + var + '\'' +
                ", id='" + id + '\'' +
                ", arraybody=" + arraybody +
                '}';
    }
}
