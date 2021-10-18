package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Estudiantes myEstudiante = new Estudiantes("a","b","c",3,5,6,7);
        ArrayList<Estudiantes> myStudents = new ArrayList<>();
        Scanner read = new Scanner(System.in);
        int opcion;
        int remover;



        do {
            System.out.println("Alumno[1]");
            System.out.println("Profesor[2]");
            System.out.println("Personal[3]");
            opcion = read.nextInt();
            switch (opcion){
                case 1:
                    System.out.println("Agregar Alumno[1]");
                    System.out.println("Eliminar Alumno[2]");
                    System.out.println("Mostrar Alumnos[3]");
                    opcion = read.nextInt();
                    if (opcion == 1){
                        myEstudiante.ingresarDatos();
                        myStudents.add(new Estudiantes());
                    }
                    if (opcion == 2){
                        System.out.println("Indicar posicion para eliminar");
                        myStudents.remove(myEstudiante);

                    }
                    if (opcion == 3){
                        for (Estudiantes mostrar : myStudents)
                        {
                            System.out.println(mostrar.nombre);
                            System.out.println(mostrar.apellido);
                            System.out.println(mostrar.dni);
                            System.out.println(mostrar.estadoCivil);
                            System.out.println(mostrar.getAnioIncorporacion());
                            System.out.println(mostrar.getCurso());
                            System.out.println(mostrar.getNumDespacho());
                        }
                    }
                    break;
                case 2:

                    break;
                default:
                    break;
            }


        }while(opcion != 4);
















    }
}
