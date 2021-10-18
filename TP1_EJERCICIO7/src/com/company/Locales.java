package com.company;

import java.util.Scanner;

public class Locales extends Inmuebles {
    private int numVentanas;

    public Locales(String direccion, float metrosCuadrados, boolean segundaMano, int anios, Scanner read, int numVentanas) {
        super(direccion, metrosCuadrados, segundaMano, anios, read);
        this.numVentanas = numVentanas;
    }

    public void calcularPrecio() {
        double precioBase;
        double precioFinal;
        System.out.println("Ingrese precio base");
        precioBase = read.nextInt();
        precioFinal = precioBase;
        if (anios < 15){
            precioFinal -= (precioFinal * 0.01);
        }else{
            precioFinal -= (precioFinal * 0.02);
        }
        if (metrosCuadrados > 50){
            precioFinal += (precioFinal * 0.01);
        }
        if (numVentanas <= 1){
            precioFinal -= (precioFinal * 0.02);
        } else if (numVentanas > 4){
            precioFinal += (precioFinal * 0.02);
        }



    }
}
