package Gremmers.expr;
import Gremmers.AST;

public class Subtraction extends AST{
    AST left ;
    AST right ;

    public Subtraction (AST left , AST right) {
        this.left=left;
        this.right=right;
    }

    @Override
    public String toString() {
        return  left.toString() + "-" + right.toString();
    }

}
