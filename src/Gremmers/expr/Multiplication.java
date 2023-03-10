package Gremmers.expr;
import Gremmers.AST;

public class Multiplication extends AST{

    public String num1 ;

    public String m;
    public String num2 ;

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
        return "Multiplication{" +
                "num1='" + num1 + '\'' +
                ", m='" + m + '\'' +
                ", num2='" + num2 + '\'' +
                '}';
    }
}
