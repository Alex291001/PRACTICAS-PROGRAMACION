package com.angel.calculadora;

import android.widget.TextView;

import androidx.annotation.NonNull;

import java.util.ArrayList;

public class DiscreteMaths {


    //public static ArrayList<Double> numeros = new ArrayList<>();


    public DiscreteMaths() {

    }

    public String operation(TextView tv) {
        ArrayList<String> signos = new ArrayList<>();
        ArrayList<String> numeros = new ArrayList<>();
        ArrayList<String> SumaResta=new ArrayList<>();//para agregar numero
        String num = (String) tv.getText();
        String newNum = "";
        String editNum = "";
        String caracteresNumeros = "";

        for (int i = 0; i < num.length(); i++) {

            char caracter = num.charAt(i);
            if (esNumero(caracter)) {
                caracteresNumeros += caracter;
                if (i==num.length()-1) numeros.add(caracteresNumeros);
            } else {
                if (caracter == 'x' || caracter == '/' || caracter == '+' || caracter == '-')

                    signos.add(String.valueOf(caracter));
                    numeros.add(caracteresNumeros);
                    caracteresNumeros="";
            }



        }





        int i = 0;
        String n=numeros.get(i);
        for (String signo : signos) {
            char UltimoCaracter = num.charAt(num.length() - 1);

            switch (signo) {
                case "x":
                    if (UltimoCaracter == 'x') return "";
                    else {
                        editNum = multiplicacion(n, numeros.get(i + 1));

                    }
                    break;
                case "/":
                    if (UltimoCaracter == '/') return "";

                    else
                        editNum = division(n, numeros.get(i + 1));
                    break;
                case "+":
                    if (UltimoCaracter == '+') return "";
                    else {
                        editNum = suma(n);
                        SumaResta.add(editNum);

                    }
                    break;
                case "-":
                    if (UltimoCaracter == '-') return "";

                    else {
                        editNum = resta(n);
                        SumaResta.add(editNum);
                    }

                    break;

                default:
                    //SumaResta.add(numeros.get(i));
                    editNum=numeros.get(i);
                    SumaResta.add(editNum);
                    break;
            }
            if (UltimoCaracter != 'x' && UltimoCaracter != '/') {

                n=editNum;

            }else {
                SumaResta.add(n);
            }

            i++;

        }

        String SumT="0";
        for(String sumaT: SumaResta){
            SumT= String.valueOf(Integer.parseInt(SumT)+Integer.parseInt(sumaT));

        }






/*
            String numeros="";
        String resultado="";
        int longitud=num.length();
        System.out.println(longitud);

        for (int i=0; i<longitud;i++) {

          char numero=num.charAt(i) ;

            System.out.println(numero);
            System.out.println(num.charAt(i));
        if (esNumero(String.valueOf(numero))){
            numeros+=numero;

            }

            if (numero=='+'){

                char UltimoCaracter=num.charAt(longitud-1);
                if (UltimoCaracter=='+') return "";
                else {
                    String numSig="";
                    for (int j=i+1;j<longitud;j++){
                        if (num.charAt(j)=='+') break;
                        else
                        numSig+=num.charAt(j);

                    }
                    System.out.println(numeros);
                    System.out.println(numSig);
                    System.out.println(resultado);
                    numeros= String.valueOf((Integer.parseInt(numeros) +Integer.parseInt(numSig)));
                    System.out.println(numeros);

                }
            }

        }
        return numeros;*/

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

        return String.valueOf(Integer.parseInt(n1) * 1);
    }

    public String resta(String n1) {


        return String.valueOf(Integer.parseInt(n1) *-1);

    }

    public String multiplicacion(String n1, String n2) {

        return String.valueOf(Integer.parseInt(n1) * Integer.parseInt(n2));
    }

    public String division(String n1, String n2) {


        return String.valueOf(Integer.parseInt(n1) / Integer.parseInt(n2));
    }


}
