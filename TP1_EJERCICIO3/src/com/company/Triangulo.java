package com.company;
/*
Crear una clase rectángulo, con atributos base y altura. Crear el constructor de
la clase y los métodos necesarios para calcular el área y el perímetro.
Permitir al usuario ingresar la base y altura de tres rectángulos, luego mostrar
en pantalla:
a. El área y perímetro de cada figura.
b. ¿Que rectángulo posee el mayor área?
c. ¿Cual de los rectángulos posee el mayor perímetro.?
 */

import java.util.Scanner;

public class Triangulo {


    private float base;
    private float altura;
    private float resultado;
    private float resultado2;
    private float resultado3;


    Scanner reader = new Scanner(System.in);

    public Triangulo(float base, float altura, float resultado, float resultado2, float resultado3) {
        this.base = base;
        this.altura = altura;
        this.resultado = resultado;
        this.resultado2 = resultado2;
        this.resultado3 = resultado3;
    }

    public void ingresarTriangulo(){

        float base2, base3, altura2, altura3;
        System.out.println("Ingrese el primer triangulo con su base");
        base = reader.nextFloat();
        System.out.println("Ingrese el primer triangulo con su altura");
        altura = reader.nextFloat();
        System.out.println("Ingrese el primer triangulo con su base");
        base2 = reader.nextFloat();
        System.out.println("Ingrese el primer triangulo con su altura");
        altura2 = reader.nextFloat();
        System.out.println("Ingrese el primer triangulo con su base");
        base3 = reader.nextFloat();
        System.out.println("Ingrese el primer triangulo con su altura");
        altura3 = reader.nextFloat();

        resultado = base * altura / 2;
        resultado2 = base2 * altura2 / 2;
        resultado3 = base3 * altura3 / 2;

        System.out.println("El area del primer triangulo es: "+ resultado);
        System.out.println("El area del segundo triangulo es: "+ resultado2);
        System.out.println("El area del tercer triangulo es: "+ resultado3);


    }

    public void comparacion(){


        if (resultado > resultado2 ){
            System.out.println("El primer triangulo tiene mayor area que el segundo triangulo");
            if (resultado > resultado3){
                System.out.println("El primer triangulo tiene mayor area que el tercer triangulo");
                System.out.println("AREA PRIMER TRIANGULO: "+resultado);
            }
        }

        if (resultado2 > resultado ){
            System.out.println("El segundo triangulo tiene mayor area que el primer triangulo");
            if (resultado2 > resultado3){
                System.out.println("El segundo triangulo tiene mayor area que el tercer triangulo");
                System.out.println("AREA SEGUNDO TRIANGULO: "+resultado2);
            }
        }

        if (resultado3 > resultado ){
            System.out.println("El tercer triangulo tiene mayor area que el primer triangulo");
            if (resultado3 > resultado2){
                System.out.println("El tercer triangulo tiene mayor area que el segundo triangulo");
                System.out.println("AREA TERCER TRIANGULO: "+resultado3);
            }
        }
    }


    public void perimetro(){
        float perimetro1, perimetro2, perimetro3;
        float lado1, lado2, lado3;
        float primerLado, segundoLado, tercerLado;
        float lado_primero, lado_segundo, lado_tercero;

        System.out.println("Ingrese los 3 lados del primer triangulo");
        lado1= reader.nextFloat();
        lado2= reader.nextFloat();
        lado3= reader.nextFloat();
        System.out.println("Ingrese los 3 lados del segundo triangulo");
        primerLado= reader.nextFloat();
        segundoLado= reader.nextFloat();
        tercerLado= reader.nextFloat();
        System.out.println("Ingrese los 3 lados del tercer triangulo");
        lado_primero= reader.nextFloat();
        lado_segundo= reader.nextFloat();
        lado_tercero= reader.nextFloat();

        perimetro1 = lado1 + lado2 + lado3;
        perimetro2 = primerLado + segundoLado + tercerLado;
        perimetro3 = lado_primero + lado_segundo + lado_tercero;


        System.out.println("Perimetro primer triangulo: "+perimetro1);
        System.out.println("Perimetro segundo triangulo: "+perimetro2);
        System.out.println("Perimetro tercer triangulo: "+perimetro3);


        if (perimetro1 > perimetro2){
            System.out.println("El primer triangulo tiene mayor perimetro que el segundo triangulo");
            if (perimetro1 > perimetro3){
                System.out.println("El primer triangulo tiene mayor perimetro que el tercer triangulo");
                System.out.println("PERIMETRO PRIMER TRIANGULO: "+perimetro1);
            }
        }

    }
}
