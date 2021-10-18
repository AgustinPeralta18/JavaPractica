package com.company;

public class Estudiantes extends Datos {
    private int anioIncorporacion;
    private int numDespacho;
    private int curso;

    public Estudiantes(String nombre, String apellido, String estadoCivil, long dni, int anioIncorporacion, int numDespacho, int curso) {
        super(nombre, apellido, estadoCivil, dni);
        this.anioIncorporacion = anioIncorporacion;
        this.numDespacho = numDespacho;
        this.curso = curso;
    }

    public Estudiantes() {
    }

    @Override
    public void ingresarDatos() {

        System.out.println("Ingrese su nombre");
        nombre = read.nextLine();
        System.out.println("Ingrese su apellido");
        apellido = read.nextLine();
        System.out.println("Ingresar su estado civil");
        estadoCivil = read.nextLine();
        System.out.println("Ingresar su dni");
        dni = read.nextInt();
        read.nextLine();
        System.out.println("Ingrese su anio de incorporacion");
        setAnioIncorporacion(read.nextInt());
        read.nextLine();
        System.out.println("Ingrese su numero de despacho");
        setNumDespacho(read.nextInt());
        read.nextLine();
        System.out.println("Ingrese su curso");
        setCurso(read.nextInt());
        read.nextLine();


    }

    public int getAnioIncorporacion() {
        return anioIncorporacion;
    }

    public int getNumDespacho() {
        return numDespacho;
    }

    public int getCurso() {
        return curso;
    }

    public void setAnioIncorporacion(int anioIncorporacion) {
        this.anioIncorporacion = anioIncorporacion;
    }

    public void setNumDespacho(int numDespacho) {
        this.numDespacho = numDespacho;
    }

    public void setCurso(int curso) {
        this.curso = curso;
    }
}









