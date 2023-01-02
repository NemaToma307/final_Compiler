package Gremmers.array;

import Gremmers.AST;
import Gremmers.classes.ExtendsClass;

public class ArrayType extends AST {

    public ArrayVar arrayvar;

     public ArrayInt arrayint ;

     public ArrayString arraystring;

    public ArrayFloat arrayfloat;

    public void setArrayVar(ArrayVar arrayvar){
        this.arrayvar = arrayvar;
    }

    public ArrayVar getArrayVar(){
        return arrayvar;
    }

    public void setArrayInt(ArrayInt arrayvar){
        this.arrayint = arrayint;
    }

    public ArrayInt getArrayInt(){
        return arrayint;
    }

    public void setArrayString(ArrayString arraystring){
        this.arraystring = arraystring;
    }

    public ArrayString getArrayString(){
        return arraystring;
    }

    public void setArrayfloat(ArrayFloat arrayfloat){
        this.arrayfloat = arrayfloat;
    }

    public ArrayFloat getArrayFloat(){
        return arrayfloat;
    }




}
