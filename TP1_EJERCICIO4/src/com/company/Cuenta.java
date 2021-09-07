package com.company;

import java.util.Scanner;

public class Cuenta {
    private int numCuenta;
    private double saldoDisponible;

    //Constructores pingas
    public Cuenta() {

    }

    public Cuenta(int numCuenta, double saldoDisponible) {
        this.numCuenta = numCuenta;
        this.saldoDisponible = saldoDisponible;
    }

    public int getNumCuenta() {
        return numCuenta;
    }

    public double getSaldoDisponible() {
        return saldoDisponible;
    }

    public void setNumCuenta(int numCuenta) {
        this.numCuenta = numCuenta;
    }

    public void setSaldoDisponible(double saldoDisponible) {
        this.saldoDisponible = saldoDisponible;
    }

}
