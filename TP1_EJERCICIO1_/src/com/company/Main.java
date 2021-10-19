package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Universidad facultad = new Universidad();
        ArrayList<Universidad> registro = new ArrayList<>();
        Scanner read = new Scanner(System.in);
        int opcion;
        int remover;



        do {
            System.out.println("Alumno[1]");
            System.out.println("Profesor[2]");
            System.out.println("Personal[3]");
            System.out.println("Mostrar Registros[4]");
            opcion = read.nextInt();
            switch (opcion){
                case 1:
                    System.out.println("Agregar Alumno[1]");
                    System.out.println("Eliminar Alumno[2]");
                    opcion = read.nextInt();
                    if (opcion == 1){
                        facultad.Alumnos();
                        registro.add(new Universidad());
                    }
                    if (opcion == 2){
                        System.out.println("Indicar posicion para eliminar");
                        registro.remove(new Universidad());

                    }

                    break;
                case 2:
                    System.out.println("Agregar Profesores[1]");
                    System.out.println("Eliminar Profesores[2]");
                    opcion = read.nextInt();
                    if (opcion == 1){
                        facultad.Profesores();
                        registro.add(new Universidad());
                    }
                    if (opcion == 2){
                        System.out.println("Indicar posicion para eliminar");
                        registro.remove(new Universidad());

                    }
                    break;
                case 3:
                    System.out.println("Agregar Empleados[1]");
                    System.out.println("Eliminar Empleados[2]");
                    opcion = read.nextInt();
                    if (opcion == 1){
                        facultad.Empleados();
                        registro.add(new Universidad());
                    }
                    if (opcion == 2){
                        System.out.println("Indicar posicion para eliminar");
                        registro.remove(new Universidad());
                    }
                case 4:
                    for (Universidad mostrar : registro) {
                        mostrar.Alumnos();
                        mostrar.Profesores();
                        mostrar.Empleados();
                    }
                default:
                    break;
            }


        }while(opcion != 4);
















    }
}
