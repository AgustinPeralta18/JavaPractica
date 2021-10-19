package com.company;

public class Empleados extends Personal {

    public Empleados(String nombreYApellido, String estadoCivil, long dni, String seccion) {
        super(nombreYApellido, estadoCivil, dni, seccion);
    }

    public Empleados() {
    }

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
