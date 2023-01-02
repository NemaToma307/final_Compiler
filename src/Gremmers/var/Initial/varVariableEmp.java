package Gremmers.var.Initial;

import Gremmers.AST;
import Gremmers.expr.Expr;

public class varVariableEmp extends AST {
    public  String type;

    public  String id ;


    public void setVarVaiableType(String type){
        this.type = type;
    }

    public void setVarVaiableId(String id){
        this.id = id;
    }

    public String getVarVaiabletype(){
        return type;
    }
    public String getVarVaiableid(){
        return id;
    }


    @Override
    public String toString() {
        return "varVariableEmp{" +
                "type='" + type + '\'' +
                ", id='" + id + '\'' +
                '}';
    }
}
