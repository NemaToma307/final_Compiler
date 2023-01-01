package Gremmers.expr;

import Gremmers.AST;

public class Addition extends AST {
    AST left ;
    AST right ;

    public Addition (AST left , AST right) {
        this.left=left;
        this.right=right;
    }

    @Override
    public String toString() {
        return  left.toString() + "+" + right.toString();
    }


}
