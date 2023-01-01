package Gremmers.var;

import Gremmers.AST;

public class booleanP extends AST {

    private String TRUE;

    private String FALSE;

    public String getTRUE() {
        return TRUE;
    }

    public void setTRUE(String TRUE) {
        this.TRUE = TRUE;
    }

    public String getFALSE() {
        return FALSE;
    }

    public void setFALSE(String FALSE) {
        this.FALSE = FALSE;
    }

    @Override
    public String toString() {
        return "booleanP{" +
                "TRUE='" + TRUE + '\'' +
                ", FALSE='" + FALSE + '\'' +
                '}';
    }
}
