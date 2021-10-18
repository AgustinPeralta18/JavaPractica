package com.company;

import java.util.Scanner;

public abstract class Datos  {
    protected String nombre;
    protected String apellido;
    protected String estadoCivil;
    protected int dni;
    protected Scanner read;

    public Datos(String nombre, String apellido, String estadoCivil, int dni) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.estadoCivil = estadoCivil;
        this.dni = dni;
        this.read = new Scanner(System.in);
    }

    public abstract void ingresarNombre();

    public void ingresarApellido(){
        System.out.println("Ingrese su apellido");
        this.apellido = read.next();
    }
    public void ingresarEstadoCivil(){
        System.out.println("Ingresar su estado civil");
        this.estadoCivil = read.next();
    }
    public void ingresarDni(){
        System.out.println("Ingresar su dni");
        this.dni = read.nextInt();
    }




}
