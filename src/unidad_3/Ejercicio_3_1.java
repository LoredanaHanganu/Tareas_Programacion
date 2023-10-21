/*
Diseña una aplicación que muestre la edad máxima y mínima de un grupo de alumnos.
El usuario introducirá las edades y terminará cuando se escriba un -1
 */
package unidad_3;

import java.util.Scanner;

public class Ejercicio_3_1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner( System.in );
        int edad, maxEdad = 0, minEdad = 0;
        boolean inicializaValores = true;

        while( true ) {
            System.out.print("Introduce la edad de cada alumno, para terminar el programa introduce -1: ");
            edad = sc.nextInt();

            if ( edad == -1 ) break;  // Salir del bucle si se ingresa -1

            // guardamos el primer valor introducido por teclado en los valores que vamos a comparar
            if ( inicializaValores ) {
                maxEdad = edad;
                minEdad = edad;
                inicializaValores = false;
            }

            // guardamos el mayor valor en maxEdad y el menor en minEdad
            if ( edad > maxEdad ) maxEdad = edad;
            else if ( edad < minEdad ) minEdad = edad;
        };

        // sacamos los valores por consola
        System.out.println("La edad máxima de los alumnos es: " + maxEdad );
        System.out.println("La edad mínima de los alumnos es: " + minEdad );
    }
}
