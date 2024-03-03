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

            if (characterN=='('||characterN=='+'||characterN=='-'||characterN=='/'||characterN=='%') r="";
          //  char res=(i<n.length-1)?n[i+1]:'(';

        }

    }
}
