package Gremmers.var.Initial;

import Gremmers.AST;
import Gremmers.expr.Expr;

public class varVariable extends AST {

    public  String type;

    public  String id ;
    public  String value ;


    public void setVarVaiableType(String type){
        this.type = type;
    }

    public void setVarVaiableId(String id){
        this.id = id;
    }

    public void setVarVaiableValue(String value){
        this.value = value;
    }


    public String getVarVaiabletype(){
        return type;
    }
    public String getVarVaiableid(){
        return id;
    }
    public String getVarVaiablevalue(){
        return value;
    }

    @Override
    public String toString() {
        return "varVariable{" +
                "type='" + type + '\'' +
                ", id='" + id + '\'' +
                ", value='" + value + '\'' +
                '}';
    }
}
