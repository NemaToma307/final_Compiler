package Gremmers.array;

import Gremmers.AST;

public class ArrayString extends AST {
    public String string;
    public String id;
    public ArrayVarString arrayVarString;

    public void setVar(String string){
        this.string = string;
    }
    public String getVar(){
        return string;
    }

    public void setId(String id){
        this.id = id;
    }
    public String getId(){
        return id;
    }

    public void setArrayVarString(ArrayVarString arrayVarString){
        this.arrayVarString = arrayVarString;
    }
    public ArrayVarString getArrayVarString(){
        return arrayVarString;
    }

    @Override
    public String toString() {
        return "ArrayString{" +
                "string='" + string + '\'' +
                ", id='" + id + '\'' +
                ", arrayVarString=" + arrayVarString +
                '}';
    }
}
