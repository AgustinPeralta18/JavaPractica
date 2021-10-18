package com.company;

import java.util.Scanner;

public class Piso extends Inmuebles {
    private int numPiso;

    public Piso(String direccion, float metrosCuadrados, boolean segundaMano, int anios, Scanner read, int numPiso) {
        super(direccion, metrosCuadrados, segundaMano, anios, read);
        this.numPiso = numPiso;
    }



    @Override
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
        if (numPiso >= 3){
            precioFinal += (precioFinal * 0.03);
        }



    }
}
