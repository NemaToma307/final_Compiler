package Gremmers.expr;

import Gremmers.AST;

public class Addition extends AST {
    public String num1 ;
    public String num2 ;

    public String m;

    public void setNum1(String num1){
        this.num1 = num1;
    }
    public String getNum1(){
        return num1;
    }

    public void setM(String m){
        this.m = m;
    }
    public String getM(){
        return m;
    }

    public void setNum2(String num2){
        this.num2 = num2;
    }
    public String getNum2(){
        return num2;
    }

    @Override
    public String toString() {
        return "Addition{" +
                "num1='" + num1 + '\'' +
                ", num2='" + num2 + '\'' +
                ", m='" + m + '\'' +
                '}';
    }
}
