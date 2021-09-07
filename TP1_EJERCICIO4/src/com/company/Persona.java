package com.company;

import java.util.Scanner;

public class Persona {
    private int cuentaBancaria;
    private int dni;
    //Constructores
    public Persona(int cuentaBancaria) {
        this.cuentaBancaria = cuentaBancaria;
    }
    Cuenta cuenta = new Cuenta();
    Scanner read = new Scanner(System.in);
    //***************************************************
    //*************************Getters y setter *************************************
    public int getCuentaBancaria() {
        return cuentaBancaria;
    }

    public void setCuentaBancaria(int cuentaBancaria) {
        this.cuentaBancaria = cuentaBancaria;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }
    //*********************************************************************************

    public void Cuenta1(){


        int opcion;
        System.out.println("CUENTA SUPERVILLE");
        System.out.println("DNI:"+this.getDni());
        System.out.println("NUMERO DE CUENTA:"+cuenta.getNumCuenta());
        System.out.println("SALDO DISPONIBLE"+getCuentaBancaria());
        System.out.println(cuenta.getSaldoDisponible());
        System.out.println("Consultar deudas[1]");
        System.out.println("Pagar deudas[2]");
        System.out.println("Hacer Transferencia [3]");
        opcion = read.nextInt();

        switch (opcion){
            case 1:
                System.out.println("USTED REGISTRA DEUDA");
                System.out.println("ALQUILERES REFUGIADOS $2500");
                System.out.println("DEBE ABONARLO CON LA CUENTA DEL BANCO GALICIA");
                break;
            case 2:
                System.out.println("QUIERE INGRESAR A LA CUENTA DE BANCO GALICIA?");
                System.out.println("SI [1] NO [2]");
                opcion = read.nextInt();
                if (opcion == 1){
                    Cuenta2();
                }
                break;
            case 3:
                break;
            default:
                break;
        }




    }

    public void Cuenta2(){
        int opcion;

        boolean deuda = true;
        System.out.println("CUENTA GALICIA");
        System.out.println("SALDO DISPONIBLE: "+getCuentaBancaria());
        System.out.println(cuenta.getSaldoDisponible());
        System.out.println("Consultar deudas[1]");
        System.out.println("Pagar deudas[2]");
        opcion = read.nextInt();

        switch (opcion){
            case 1:
                System.out.println("USTED REGISTRA DEUDA");
                System.out.println("ALQUILERES REFUGIADOS $2500");
                break;
            case 2:
                System.out.println("Pagar deuda? SI[1] NO [2]");
                opcion = read.nextInt();
                if (opcion == 1){
                    if (cuenta.getSaldoDisponible() > 1200){
                        cuenta.setSaldoDisponible(4300);
                        System.out.println("USTED YA NO REGISTRA DEUDA");

                    } else if (cuenta.getSaldoDisponible() < 1200){
                        System.out.println("USTED NO TIENE EL SUFICIENTE SALDO PARA PAGAR");

                    }
                }
                break;
            default:
                break;
        }
        /*
        if (deuda == true){
            System.out.println("La persona es morosa");
        } else if (deuda == false) {
            System.out.println("No es morosa");
        }
        /*/
    }


}
