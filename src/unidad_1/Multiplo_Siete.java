/*
Escribe un programa que tome como entrada un número entero e indique qué cantidad hay que
sumarle para que el resultado sea múltiplo de 7. Un ejemplo:
 - A 2 hay que sumarle 5 para que el resultado sea multiplo de 7
 (x+y)/7=resto 0
 */

package unidad_1;

import java.util.Scanner;

public class Multiplo_Siete {

    public static void main(String[] args) {

        // iniciamos una instancia de la clase Scanner
        Scanner sc = new Scanner(System.in);

        // pedimos y recogemos por consola un número entero
        System.out.print("Introduzca un número entero: ");
        int numeroEntero = sc.nextInt();

        // Sacamos el resto de la división
        int resto = numeroEntero % 7;

        // Teniendo en cuenta que un número siempre será multiple de sí mismo restamos al multiple el resto
        // averigiuandfo así el número a sumar.
        int numSumado = 7-resto;

        System.out.println( "El resto de la disvisón es: " + resto );
        System.out.println("El número a sumar para que el número dado sea múltiplo de 7 es: " + numSumado);

    }
}
