
package tp1_ejercicio1;


import java.util.Scanner;

public class TP1_EJERCICIO1 {

    /*
Ejercicio 1:
Realizar un programa que, dados dos números, realice las operaciones
de suma, resta, multiplicación y división.
a. Agregar al desarrollo anterior condiciones para que no hayan
errores al realizar divisiones y que no de resultados negativos la
resta.
b. Importar la clase Scanner y solicitar al usuario ingresar los valores
con los cuales realizar las operaciones.
c. Realizar un menú para que el usuario seleccione la operación a
realizar.
d. Crear subprogramas para cada una de las operaciones deberán
ser funciones.
e. Crear un procedimiento para mostrar el menú.
f. Permitir al usuario ingresar su nombre y mostrarlo al finalizar el
programa.
     */
    public static void main(String[] args) {
        float num1= 0, num2 = 0, resultado = 0;
        int opcion;
        Calculadora myCalculadora = new Calculadora(num1, num2, resultado);
        Scanner reader = new Scanner(System.in);
        System.out.println("BIENVENIDO");
        System.out.println("Ingrese una opcion");
        System.out.println("SUMA [1]");
        System.out.println("RESTA [2]");
        System.out.println("MULTIPLICACION [3]");
        System.out.println("DIVISION [4]");
        opcion = reader.nextInt();

        System.out.println("Ingrese el primer numero");
        num1 = reader.nextFloat();
        System.out.println("Ingrese el segundo numero");
        num2 = reader.nextFloat();


        switch (opcion){
            case 1:
                myCalculadora.suma();
                break;
            case 2:
                myCalculadora.resta(num1,num2);
                break;
            case 3:
                myCalculadora.multiplicacion(num1,num2);
                break;
            case 4:
                myCalculadora.division(num1,num2);
                break;
            default:
                break;

        }
    }
}
