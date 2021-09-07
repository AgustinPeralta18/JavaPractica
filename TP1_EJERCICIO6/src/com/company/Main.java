package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Estudiante myStudent = new Estudiante("a","b","c",0,0,0);
        Profesores myTeacher = new Profesores("a","b","c",0,"d");
        Personal myAssist = new Personal("a","b","c",0,"d");
        Scanner read = new Scanner(System.in);
        int opcion;

        System.out.println("USTED QUE ES?");
        System.out.println("Estudiante [1]");
        System.out.println("Profesor [2]");
        System.out.println("Personal de servicio [3]");
        opcion = read.nextInt();



        switch (opcion){
            case 1:
                System.out.println("");
                myStudent.nombre = read.next();
                myStudent.apellido = read.next();
                myStudent.dni = read.nextInt();
                myStudent.estadoCivil = read.next();
                myStudent.incorporacion();
                myStudent.despacho();
                break;
            default:
                break;
        }
















        myStudent.incorporacion();








    }
}
