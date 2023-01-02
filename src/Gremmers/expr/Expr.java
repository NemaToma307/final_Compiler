package Gremmers.expr;

import Gremmers.AST;
import Gremmers.classes.ExtendsClass;

public class Expr extends AST {
    public Multiplication multiplication;
    public Addition addition;
    public Subtraction subtraction;
    public Division division;
    public Identifier identifier;
    public Integer integer;


    public void setMultiplication(Multiplication multiplication){
        this.multiplication = multiplication;
    }

    public Multiplication getMultiplication(){
        return multiplication;
    }

    public void setAddition(Addition addition){
        this.addition = addition;
    }

    public Addition getAddition(){
        return addition;
    }

    public void setSubtraction(Subtraction subtraction){
        this.subtraction = subtraction;
    }

    public Subtraction getSubtraction(){
        return subtraction;
    }

    public void setDivision(Division division){
        this.division = division;
    }

    public Division getDivision(){
        return division;
    }

    public void setIdentifier(Identifier identifier){
        this.identifier = identifier;
    }

    public Identifier getIdentifier(){
        return identifier;
    }

    public void setInteger(Integer integer){
        this.integer = integer;
    }

    public Integer getInteger(){
        return integer;
    }


}
