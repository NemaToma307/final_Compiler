package Gremmers.expr;
import Gremmers.AST;

public class Division extends AST{
    AST left ;
    AST right ;

    public Division (AST left , AST right) {
        this.left=left;
        this.right=right;
    }

    @Override
    public String toString() {
        return  left.toString() + "/" + right.toString();
    }
}
