package Gremmers.array;

import Gremmers.AST;

public class ArrayInt extends AST {

    public String intt;
    public String id;
    public ArrayVarInt arrayVarInt;

    public void setVar(String intt){
        this.intt = intt;
    }
    public String getVar(){
        return intt;
    }

    public void setId(String id){
        this.id = id;
    }
    public String getId(){
        return id;
    }

    public void setArrayVarInt(ArrayVarInt arrayVarInt){
        this.arrayVarInt = arrayVarInt;
    }
    public ArrayVarInt getArrayVarInt(){
        return arrayVarInt;
    }

    @Override
    public String toString() {
        return "ArrayInt{" +
                "intt='" + intt + '\'' +
                ", id='" + id + '\'' +
                ", arrayVarInt=" + arrayVarInt +
                '}';
    }
}
