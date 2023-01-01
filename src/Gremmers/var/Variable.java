package Gremmers.var;
import Gremmers.AST;

public class Variable extends AST{

     public String id ;

    public Variable(String id){
        this.id=id;
    }

    @Override
    public String toString() {
        return id;
    }
}
