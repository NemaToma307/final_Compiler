package Gremmers.array;

import Gremmers.AST;

import java.util.ArrayList;

public class FloatArray extends AST {
    ArrayList<String> floats;

    public FloatArray() {
        this.floats = new ArrayList<>();
    }

    public void addChild(String element) {
        this.floats.add(element);
    }

    @Override
    public String toString(){
        return "FloatArray { " + floats + "}";
    }
}
