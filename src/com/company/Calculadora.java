package com.company;

import java.util.Scanner;

public class Calculadora {
    private float resultado;
    private float num1;
    private float num2;

    public Calculadora(float num1, float num2) {
        this.num1 = num1;
        this.num2 = num2;
    }







    public float suma(float num1, float num2){
        resultado = num1 + num2;
        return resultado ;
    }

    public float resta(float num1, float num2){



        resultado = num1 - num2;


        return  resultado;

    }

    public float multiplicacion(float num1, float num2){
        resultado = num1 * num2;
        return resultado;
    }

    public float division(float num1, float num2){
        if (num2 == 0){
            System.out.println("ERROR");
            return 0;
        }
        resultado = num1 / num2;
        return resultado;
    }


}
