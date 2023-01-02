package Gremmers.prog;
import Gremmers.AST;

import java.util.ArrayList;

public class Prog extends AST{
    public ArrayList<Element> elements = new ArrayList<>();

    public ArrayList<Element> getElements(){
        return elements;
    }

    public void setElements(ArrayList<Element> elements){
        this.elements = elements;
    }

    @Override
    public String toString() {
        return "Prog{" +
                "elements=" + elements +
                '}';
    }
}
