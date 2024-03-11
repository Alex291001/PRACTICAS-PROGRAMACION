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
        String r,Data=tv.getText().toString();

        /*for (int i = 0; i < n.length; i++) {
            char characterN = n[i];


        }*/
        if (Data=="") return "";
        else  return "("+tv.getText().toString()+")";
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

    public String b5(){
        return "5";
    }
    public String b6(){
        return "6";
    }
    public String bMenos(){
        return "-";
    }

    public String b1(){
        return "1";
    }

    public String b2(){
        return "2";
    }
    public String b3(){
        return "3";
    }

    public String bMas(){
        return "+";
    }
    public String bMasMenos() {
        return "-";
    }

    public String b0(){
        return "0";
    }
    public String bPunto(){
        return ".";
    }




}


