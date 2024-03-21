package com.angel.calculadora;

import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;

import java.nio.file.LinkOption;
import java.util.ArrayList;

public class DiscreteMaths {


    //public static ArrayList<Double> numeros = new ArrayList<>();


    public DiscreteMaths() {

    }

    public String operation(TextView tv) {
        ArrayList<String> signos = new ArrayList<>();

        ArrayList<String> numeros = new ArrayList<>();
        ArrayList<String> SumaReales=new ArrayList<>();//para agregar numero
        String num = (String) tv.getText();
        String editNum = "0";
        String caracteresNumeros = "";
        int longitud=num.length();

        for (int i = 0; i < num.length(); i++) {

            char caracter = num.charAt(i);
            System.out.println(longitud);
            if (esNumero(caracter)) {
                if (i==0) signos.add("+");
                caracteresNumeros += caracter;
                if (i==num.length()-1) numeros.add(caracteresNumeros);
            } else {
                if (caracter == 'x' || caracter == '/' || caracter == '+' || caracter == '-')
                    signos.add(String.valueOf(caracter));
                     if (i!=0)
                    numeros.add(caracteresNumeros);
                    caracteresNumeros="";
            }





        }





        int i = 0;
        String n="1";
        for (String signo : signos) {
            char UltimoCaracter = num.charAt(num.length() - 1);
            System.out.println(signo);
            switch (signo) {
                case "x":
                    if (UltimoCaracter == 'x') return "";
                    else {
                        editNum = multiplicacion(n, numeros.get(i));

                    }
                    break;
                case "/":
                    if (UltimoCaracter == '/') return "";

                    else
                        editNum = division(n, numeros.get(i));
                    break;
                case "+":
                    if (UltimoCaracter == '+') return "";
                    else {


                        if (i!=0) {
                            SumaReales.add(editNum);
                            n=numeros.get(i);
                        }else n=numeros.get(i);
                        editNum = suma(n);

                    }
                    break;
                case "-":
                    if (UltimoCaracter == '-') return "";

                    else {
                        if (i!=0) {
                            SumaReales.add(editNum);
                            n=numeros.get(i);
                        }else n=numeros.get(i);
                        editNum = resta(n);
                    }

                    break;

                default:

                    break;
            }
            if (esNumero(UltimoCaracter)) {
                if (i==signos.size()-1)
                SumaReales.add(editNum);
                else n=editNum;

            }

            i++;

        }

        String SumT="0";
        for(String sumaT: SumaReales){
            SumT= String.valueOf(Integer.parseInt(SumT)+Integer.parseInt(sumaT));

        }

        return SumT;
    }


    public boolean esNumero(char str) {

        try {
            Integer.parseInt(String.valueOf((str)));
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    public String suma(String n1) {
        System.out.println(n1);
        return String.valueOf(Integer.parseInt(n1) * 1);
    }

    public String resta(String n1) {

        System.out.println(n1);
        return String.valueOf(Integer.parseInt(n1) *-1);

    }

    public String multiplicacion(String n1, String n2) {

        return String.valueOf(Integer.parseInt(n1) * Integer.parseInt(n2));
    }

    public String division(String n1, String n2) {


        return String.valueOf(Integer.parseInt(n1) / Integer.parseInt(n2));
    }


}
