package Gremmers.prog;
import Gremmers.AST;
import Gremmers.functions.Functions;

public class Body extends AST{
    private Classes classes;
    private Functions functions;


    public void setClasses(Classes classes){
        this.classes = classes;
    }

    public Classes getClasses(){
        return classes;
    }

    public void setFunctions(Functions functions){
        this.functions = functions;
    }

    public Functions getFunctions(){
        return functions;
    }

}
