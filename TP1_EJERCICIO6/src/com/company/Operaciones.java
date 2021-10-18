package com.company;

import java.util.ArrayList;

public class Operaciones {

    Estudiante myStudent = new Estudiante("a","b","c",0,0,0);
    Profesores myTeacher = new Profesores("a","b","c",0,"d");
    ArrayList <Estudiante> estudiantes = new ArrayList<>();
    ArrayList <Profesores> profesores = new ArrayList<>();



    public void student (){
        myStudent.ingresarNombre();
        myStudent.ingresarApellido();
        myStudent.ingresarDni();
        myStudent.ingresarEstadoCivil();
        myStudent.incorporacion();
        myStudent.despacho();
        myStudent.ingresoCurso();
        estudiantes.add(myStudent);
    }

    public void teacher(){
        myTeacher.ingresarNombre();
        myTeacher.ingresarApellido();
        myTeacher.ingresarDni();
        myTeacher.ingresarEstadoCivil();
        myTeacher.determinado();
        profesores.add(myTeacher);
    }

    public void mostrarEstudiante(){
        for (Estudiante estudiante : estudiantes) {
            System.out.println(estudiante.nombre);
            System.out.println(estudiante.apellido);
            System.out.println(estudiante.dni);
            System.out.println(estudiante.estadoCivil);
        }
    }

    public void mostrarTeacher(){
        for (Profesores profesor : profesores) {
            System.out.println(profesor.nombre);
            System.out.println(profesor.apellido);
            System.out.println(profesor.dni);
            System.out.println(profesor.estadoCivil);
        }
    }

    public boolean eliminarAlumno(int posicionArray, int tamanio){
        if (posicionArray >= 0 && posicionArray <= (tamanio-1))
        {
            System.out.println("Registro alumno eliminado");
            return true;
        }
        else {
            System.out.println("Registro vacio");
            return false;
        }

    }


}
