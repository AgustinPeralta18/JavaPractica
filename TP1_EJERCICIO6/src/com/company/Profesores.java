package com.company;

public class Profesores extends Datos{
    private String dptoDeterminado;

    public Profesores(String nombre, String apellido, String estadoCivil, int dni, String dptoDeterminado) {
        super(nombre, apellido, estadoCivil, dni);
        this.dptoDeterminado = dptoDeterminado;
    }

    public void determinado(){
        System.out.println("Ingrese departamento al que pertenece");
        this.dptoDeterminado = read.nextLine();
    }



}
