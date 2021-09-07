package com.company;

public class Tren extends Vehiculos{
    private float kmCombustible;

    public Tren(float velocidadMax, float combustible, float cantidadKm, float kmCombustible) {
        super(velocidadMax, combustible, cantidadKm);
        this.kmCombustible = kmCombustible;
    }

    @Override
    public void calcularTiempo() {
        float tiempo;
        tiempo = (cantidadKm / velocidadMax);
        System.out.println("tiempo en tren: "+tiempo);
    }
}
