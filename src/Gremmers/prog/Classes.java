package Gremmers.prog;
import Gremmers.AST;
import Gremmers.classes.AbstractStatment;
import Gremmers.classes.ClassStatement;
import Gremmers.classes.ExtendsClass;
import Gremmers.functions.Functions;

public class Classes extends AST{

    public ExtendsClass extendsClass;

    public AbstractStatment abstractStatment;

    public ClassStatement classStatement;


    public void setExtendsClass(ExtendsClass extendsClass){
        this.extendsClass = extendsClass;
    }

    public ExtendsClass getExtendsClass(){
        return extendsClass;
    }

    public void setAbstractStatment(AbstractStatment abstractStatment){
        this.abstractStatment = abstractStatment;
    }

    public AbstractStatment getAbstractStatment(){
        return abstractStatment;
    }

    public void setClassStatement(ClassStatement classStatement){
        this.classStatement = classStatement;
    }

    public ClassStatement getClassStatement(){
        return classStatement;
    }

}
