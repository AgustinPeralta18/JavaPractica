package com.company;

import java.util.Scanner;
import java.util.ArrayList;
public class Main {

    public static void main(String[] args) {

        Personal myAssist = new Personal("a","b","c",0,"d");
        ArrayList <Personal> personalServicio = new ArrayList<>();
        Operaciones myOperaciones = new Operaciones();
        Scanner read = new Scanner(System.in);
        int opcion;
        do {


            System.out.println("USTED QUE ES?");
            System.out.println("Estudiante [1]");
            System.out.println("Profesor [2]");
            System.out.println("Personal de servicio [3]");
            System.out.println("Salir [4]");
            opcion = read.nextInt();



            switch (opcion){
                case 1:
                    myOperaciones.student();
                    break;
                case 2:
                    myOperaciones.teacher();
                    break;
                case 3:
                    myAssist.ingreseSeccion();
                    personalServicio.add(myAssist);
                case 4:
                    myOperaciones.mostrarEstudiante();
                    myOperaciones.mostrarTeacher();
                    break;
                case 5:
                    myOperaciones.eliminarAlumno(0,0);
                default:
                    System.out.println("Se equivoco de numero");
                    break;
            }
        }while (opcion != 6);



    }
}
