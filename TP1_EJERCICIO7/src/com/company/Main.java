package com.company;

public class Main {

    public static void main(String[] args) {
        Piso myPiso = new Piso(null,0,false,0,null,0);
        Locales myLocal = new Locales(null,0,false,0,null,0);


        myPiso.calcularPrecio();
        myLocal.calcularPrecio();




    }
}
