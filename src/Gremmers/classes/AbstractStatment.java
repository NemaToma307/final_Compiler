package Gremmers.classes;

import Gremmers.AST;

public class AbstractStatment extends AST {
    public String abstr;
    public String clas;

    public  String id;

    public void setAbstr(String abstr){
        this.abstr = abstr;
    }
    public String getAbstr(){
        return abstr;
    }
    public void setClas(String clas){
        this.clas = clas;
    }
    public String getClas(){
        return clas;
    }
    public void setId(String id){
        this.id = id;
    }
    public String getId(){
        return id;
    }

    @Override
    public String toString() {
        return "AbstractStatment{" +
                "abstr='" + abstr + '\'' +
                ", clas='" + clas + '\'' +
                ", id='" + id + '\'' +
                '}';
    }
}
