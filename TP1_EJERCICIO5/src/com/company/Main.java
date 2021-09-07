package com.company;

public class Main {

    public static void main(String[] args) {
        Auto myAuto = new Auto(0,0,0,600);
        Moto myMoto = new Moto(0,0,0,700);
        Tren myTren = new Tren(0,0,0,0);

        myAuto.velocidadMax = 220;
        myMoto.velocidadMax = 110;
        myTren.velocidadMax = 80;
        myAuto.ingresarKm();
        myAuto.calcularTiempo();
        myMoto.ingresarKm();
        myMoto.calcularTiempo();
        myTren.ingresarKm();
        myTren.calcularTiempo();



    }
}
