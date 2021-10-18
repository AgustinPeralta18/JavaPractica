package com.company;

import java.util.Scanner;

public abstract class Inmuebles  {
    protected String direccion;
    protected float metrosCuadrados;
    protected boolean segundaMano;
    protected int anios;
    protected Scanner read;

    public Inmuebles(String direccion, float metrosCuadrados, boolean segundaMano, int anios, Scanner read) {
        this.direccion = direccion;
        this.metrosCuadrados = metrosCuadrados;
        this.segundaMano = segundaMano;
        this.anios = anios;
        this.read = read;
    }

    public abstract void calcularPrecio();




}
