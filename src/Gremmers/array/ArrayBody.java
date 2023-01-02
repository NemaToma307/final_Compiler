package Gremmers.array;

import Gremmers.AST;

public class ArrayBody extends AST {
    public ArrayVarInt arrayVarInt;
    public ArrayVarFloat arrayVarFloat;
    public ArrayVarString arrayVarString;

    public void setArrayVarInt(ArrayVarInt arrayVarInt){
        this.arrayVarInt = arrayVarInt;
    }
    public ArrayVarInt getArrayVarInt(){
        return arrayVarInt;
    }
    public void setArrayVarFloat(ArrayVarFloat arrayVarFloat){
        this.arrayVarFloat = arrayVarFloat;
    }
    public ArrayVarFloat getArrayVarFloat(){
        return arrayVarFloat;
    }
    public void setArrayVarString(ArrayVarString arrayVarString){
        this.arrayVarString = arrayVarString;
    }
    public ArrayVarString getArrayVarString(){
        return arrayVarString;
    }

    @Override
    public String toString() {
        return "ArrayBody{" +
                "arrayVarInt=" + arrayVarInt +
                ", arrayVarFloat=" + arrayVarFloat +
                ", arrayVarString=" + arrayVarString +
                '}';
    }
}
