package Gremmers.prog;

import Gremmers.AST;

import java.util.ArrayList;

public class Program extends AST {

//    public List<AST> grams;
      public ArrayList<Element> grams = new ArrayList<>();

//    public  Program(){
//        this.grams = new ArrayList<>();
//    }

//    public void addGrammers( Element g ){
//
//        grams.add(g);
//    }

    public ArrayList<Element> getElements(){
        return grams;
    }

    public void setElements(ArrayList<Element> grams){
        this.grams = grams;
    }

    @Override
    public String toString() {
        return "Program{" +
                "grams=" + grams +
                '}';
    }

    //    @Override
//    public String toString() {
//        StringBuilder stringBuilder = new StringBuilder();
//        for(AST child : this.grams){
//            stringBuilder.append(child);
//            stringBuilder.append("\n");
//        }
//        return stringBuilder.toString();
////        return this.grams.toString();
//    }
}
