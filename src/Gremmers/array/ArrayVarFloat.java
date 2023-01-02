package Gremmers.array;

import Gremmers.AST;

import java.util.ArrayList;

public class ArrayVarFloat extends AST {
  public ArrayList<String> floats = new ArrayList<>();

    public void addChild(String element) {
        this.floats.add(element);
    }

    @Override
    public String toString() {
        return "ArrayVarFloat{" +
                "floats=" + floats +
                '}';
    }
}
