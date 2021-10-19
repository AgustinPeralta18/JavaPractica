package com.company;

public class Profesores extends Personal {

    public Profesores(String nombreYApellido, String estadoCivil, long dni, String seccion) {
        super(nombreYApellido, estadoCivil, dni, seccion);
    }

    public Profesores() {
    }

    @Override
    public void ingresarDatos() {
        System.out.println("Ingrese nombre y apellido");
        nombreYApellido = read.nextLine();
        System.out.println("Ingrese estado civil");
        estadoCivil = read.nextLine();
        System.out.println("Ingrese dni");
        dni = read.nextInt();
        read.nextLine();
        System.out.println("Ingrese rama a la que pertenece");
        seccion = read.nextLine();
    }
}
