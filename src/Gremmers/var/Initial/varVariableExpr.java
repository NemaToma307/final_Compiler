package Gremmers.var.Initial;

import Gremmers.AST;
import Gremmers.expr.Expr;

public class varVariableExpr extends AST {
    public  String type;

    public  String id ;

    public Expr expr;

    public void setVarVaiableType(String type){
        this.type = type;
    }

    public void setVarVaiableId(String id){
        this.id = id;
    }


    public void setVarVaiableExpr(Expr expr){
        this.expr = expr;
    }

    public String getVarVaiabletype(){
        return type;
    }
    public String getVarVaiableid(){
        return id;
    }


    public Expr getVarVaiableExpr(){
        return expr;
    }

    @Override
    public String toString() {
        return "varVariableExpr{" +
                "type='" + type + '\'' +
                ", id='" + id + '\'' +
                ", expr=" + expr +
                '}';
    }
}
