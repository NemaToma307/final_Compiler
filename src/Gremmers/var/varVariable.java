package Gremmers.var;

import Gremmers.AST;

public class varVariable extends AST {

    public  String id ;
    public  String type;
    public  String value ;

    public varVariable(String type , String id , String value ){

        this.type=type;
        this.id=id;
        this.value=value;
    }

    @Override
    public String toString() {
        return  "var variable: " + type +" "+ id +" "+ value ;
    }
}
