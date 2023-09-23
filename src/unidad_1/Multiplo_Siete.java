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

        Scanner sc = new Scanner(System.in);

        System.out.print("Introduzca un número entero: ");
        int numeroEntero = sc.nextInt();

        int resultado = ( numeroEntero % 7 == 0 ) ? 1 : 0 ;


        System.out.println( resultado );

    }
}
