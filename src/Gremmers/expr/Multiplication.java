package Gremmers.expr;
import Gremmers.AST;

public class Multiplication extends AST{

    AST left ;
    AST right ;

    public Multiplication (AST left , AST right) {

        this.left=left;
        this.right=right;

    }

    @Override
    public String toString() {

        return  left.toString() + "*" + right.toString();
    }
}
