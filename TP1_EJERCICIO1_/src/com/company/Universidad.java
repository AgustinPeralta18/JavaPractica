package com.company;

public class Universidad {



    Estudiantes alumnos = new Estudiantes();
    Profesores profesores = new Profesores();
    Empleados empleados = new Empleados();

    public void Alumnos(){
        alumnos.ingresarDatos();
    }

    public void Profesores(){
        profesores.ingresarDatos();
    }

    public void Empleados(){
        empleados.ingresarDatos();
    }



}
