package com.company;

import java.util.Scanner;

public abstract class Datos {
    protected String nombre;
    protected String apellido;
    protected String estadoCivil;
    protected long dni;
    protected Scanner read;


    public Datos(String nombre, String apellido, String estadoCivil, long dni) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.estadoCivil = estadoCivil;
        this.dni = dni;
        this.read = new Scanner(System.in);
    }

    public Datos() {
    }

    public abstract void ingresarDatos();





}
