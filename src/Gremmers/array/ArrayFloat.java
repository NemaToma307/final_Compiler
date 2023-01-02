package Gremmers.array;

import Gremmers.AST;

public class ArrayFloat extends AST {
    public String flot;
    public String id;
    public ArrayVarFloat arrayVarFloat;

    public void setVar(String flot){
        this.flot = flot;
    }
    public String getVar(){
        return flot;
    }

    public void setId(String id){
        this.id = id;
    }
    public String getId(){
        return id;
    }

    public void setArrayVarFloat(ArrayVarFloat arrayVarFloat){
        this.arrayVarFloat = arrayVarFloat;
    }
    public ArrayVarFloat getArrayVarFloat(){
        return arrayVarFloat;
    }
}
