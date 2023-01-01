package Gremmers.var;

import Gremmers.AST;

public class Double extends AST {
    private String dou;

//    public Double(String dou){
//        this.dou=dou;
//    }
    public void setDouble(String dou){
        this.dou=dou;
    }
    @Override
    public String toString() {
        return dou;
    }
}
