package com.angel.calculadora;

import android.widget.Button;
import android.widget.TextView;

public class DataSet {
    Button b;

    public DataSet() {

    }

    public DataSet(Button b) {
        this.b = b;
    }

    public Button getB(Button bc) {


        return b;
    }

    public void setB(Button b) {
        this.b = b;
    }

    public String bC() {

        return "";
    }

    public String bParentesis(TextView tv) {
        String s = tv.getText().toString();
        char[] n = s.toCharArray();
        String r;

        for (int i = 0; i < n.length; i++) {
            char characterN = n[i];


        }
        return "(";
    }

    public String bModulo(){

        return "%";
    }
    public String bDivision(){
        return "/";
    }
    public String b7(){
        return "7";
    }
    public String b8(){
        return "8";
    }
    public String b9(){
        return "9";
    }
    public String bMult(){
        return "x";
    }

    public String b4(){
        return "4";
    }

}


