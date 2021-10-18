package com.company;

public class Estudiante extends Datos {
    private int anioIncorporacion;
    private int numDespacho;
    private int curso;


    public Estudiante(String nombre, String apellido, String estadoCivil, int dni, int anioIncorporacion, int numDespacho) {
        super(nombre, apellido, estadoCivil, dni);
        this.anioIncorporacion = anioIncorporacion;
        this.numDespacho = numDespacho;
    }

    public void incorporacion(){
        System.out.println("Ingrese su anio de incorporacion");
        this.anioIncorporacion = read.nextInt();
    }

    public void despacho(){
        System.out.println("Ingrese su numero de despacho");
        this.numDespacho = read.nextInt();
    }

    public void ingresoCurso(){
        System.out.println("Ingrese su curso");
        this.curso = read.nextInt();
    }



}
