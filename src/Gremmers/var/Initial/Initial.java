package Gremmers.var.Initial;

import Gremmers.AST;
import Gremmers.array.ArrayType;

public class Initial extends AST {
    public varVariable varvariable;
    public varVariableExpr varvariableexpr;
    public varVariableEmp varvariableemp;

    public ArrayType arrayType;

    public void setVarvariable(varVariable varvariable){
        this.varvariable = varvariable;
    }
    public varVariable getVarvariable(){
        return varvariable;
    }
    public void setVarvariableexpr(varVariableExpr varvariableexpr){
        this.varvariableexpr = varvariableexpr;
    }
    public varVariableExpr getVarvariableexpr(){
        return varvariableexpr;
    }
    public void setVarvariableemp(varVariableEmp varvariableemp){
        this.varvariableemp = varvariableemp;
    }
    public varVariableEmp getVarvariableemp(){
        return varvariableemp;
    }

    public void setArrayType(ArrayType arrayType){
        this.arrayType = arrayType;
    }
    public ArrayType getArrayType(){
        return arrayType;
    }
}
