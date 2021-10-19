package com.company;

import java.util.Scanner;

public abstract class Personal {
    protected String nombreYApellido;
    protected String estadoCivil;
    protected long dni;
    protected String seccion;
    protected Scanner read;

    public Personal(String nombreYApellido, String estadoCivil, long dni, String seccion) {
        this.nombreYApellido = nombreYApellido;
        this.estadoCivil = estadoCivil;
        this.dni = dni;
        this.seccion = seccion;
        this.read = new Scanner(System.in);
    }

    public Personal() {
    }

    public abstract void ingresarDatos();








}
