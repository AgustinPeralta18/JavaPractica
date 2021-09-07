package com.company;

public class Moto extends Vehiculos {
    private float kmCombustible;

    public Moto(float velocidadMax, float combustible, float cantidadKm, float kmCombustible) {
        super(velocidadMax, combustible, cantidadKm);
        this.kmCombustible = kmCombustible;
    }

    @Override
    public void calcularTiempo() {
        float tiempo;
        tiempo = (cantidadKm / velocidadMax) + (cantidadKm / kmCombustible);
        System.out.println("tiempo en horas: "+tiempo);
    }
}
