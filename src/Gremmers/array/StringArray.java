package Gremmers.array;

import Gremmers.AST;

import java.util.ArrayList;

public class StringArray extends AST {
    ArrayList<String> strings;

    public StringArray(){
        this.strings = new ArrayList<>();
    }

    public void addChild(String text){
        this.strings.add(text);
    }

    @Override
    public String toString(){
        return "stringArray { " + strings + "}";
    }
}
