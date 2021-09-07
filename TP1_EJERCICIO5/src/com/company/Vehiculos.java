package com.company;

import java.util.Scanner;

public abstract class Vehiculos {
    protected float velocidadMax;
    protected float combustible;
    protected float cantidadKm;
    protected Scanner read;


    public Vehiculos(float velocidadMax, float combustible, float cantidadKm) {
        this.velocidadMax = velocidadMax;
        this.combustible = combustible;
        this.cantidadKm = cantidadKm;
        this.read = new Scanner(System.in);
    }

    public void ingresarKm(){
        System.out.println("Ingrese cantidad de km");
        this.cantidadKm = read.nextInt();
    }

    public abstract void calcularTiempo();



}
