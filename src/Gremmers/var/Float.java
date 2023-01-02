package Gremmers.var;
import Gremmers.AST;

public class Float extends AST{
    public String FLOAT;

    public void setFLOAT(String FLOAT){
        this.FLOAT=FLOAT;
    }

    public String getFLOAT(){
        return FLOAT;
    }

    @Override
    public String toString() {
        return FLOAT;
    }
}
