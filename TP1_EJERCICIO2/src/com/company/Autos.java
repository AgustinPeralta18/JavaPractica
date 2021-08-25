package com.company;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.Scanner;
/*
Ingresando una cantidad de kilómetros, realizar la comparación entre dos au-
tos, suponiendo que el auto1 gasta “x” litros de combustible por kilómetro, y po-
see como kilometraje inicial 95.000 km y que el auto2 gasta “z” litros de com-
bustible por kilómetro, y posee como kilometraje inicial 80.000km. Donde “x” y
“z” son valores enteros ingresados por el usuario
 */

public class Autos {
        private double x;
        private double z;
        private double km;

        Scanner reader = new Scanner(System.in);
    //Constructor con valores
    public Autos(double x, double z, double km) {
        this.x = x;
        this.z = z;
        this.km = km;
    }
    //Constructor vacio
    public Autos() {

    }
    //Metodo 1
    public void ingreso(){


        System.out.println("Ingrese la cantidad de combustible que gasta el primerAuto por km");
        x = reader.nextInt();
        System.out.println("Ingrese la cantidad de combustible que gasta el segundoAuto por km");
        z = reader.nextInt();

        System.out.println("El auto 1 gasta: "+x);
        System.out.println("El auto 2 gasta: "+z);

    }

    //Metodo 2
    public void acelerar(double aux,double aux2){

        double km1;
        double km2;
        System.out.println("Ingrese los km");
        km = reader.nextDouble();
        aux = x * km;
        aux2 = z * km;
        System.out.println("Litros gastados en el primer auto: "+ aux);
        System.out.println("Litros gastados en el segundo auto: "+ aux2);

        km1 = km + 95000;
        km2 = km + 80000;

        System.out.println("KM acumulados del primer auto: "+ km1);
        System.out.println("KM acumulados del segundo auto: "+ km2);

    }

    public void comparacion(){
        if (x < z){
            System.out.println("El primer auto es mejor a la hora de consumir menos:"+ x);
        }
        else if (z < x){
            System.out.println("El segundo auto es mejor a la hora de consumir menos: "+ z);
        }
    }













}
