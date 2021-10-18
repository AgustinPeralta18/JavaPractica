package com.company;

public class Personal extends Datos {
    private String seccion;

    public Personal(String nombre, String apellido, String estadoCivil, int dni, String seccion) {
        super(nombre, apellido, estadoCivil, dni);
        this.seccion = seccion;
    }

    public void ingreseSeccion(){
        System.out.println("Ingrese seccion al cual pertenece");
        this.seccion = read.nextLine();
    }



}
