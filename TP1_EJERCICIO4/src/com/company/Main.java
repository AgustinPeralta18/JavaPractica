package com.company;

public class Main {

    public static void main(String[] args) {
        Cuenta myCuenta = new Cuenta();
        Persona myPersona = new Persona(0);

        myCuenta.setSaldoDisponible(5500);
        myCuenta.setNumCuenta(5555);
        myPersona.setCuentaBancaria(1234);
        myPersona.setDni(5645321);

        myPersona.Cuenta1();
        myPersona.Cuenta2();







    }
}
