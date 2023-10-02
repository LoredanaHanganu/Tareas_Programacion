/*
Modifica la tarea "múltiplo de siete" para que, indicando dos números n y m,
diga qué cantidad hay que sumarle a n para que sea múltiplo de m.
 */
package unidad_1;

import java.util.Scanner;

public class Multiplo_N {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce el múltiplo: ");
        int m = sc.nextInt();

        System.out.println("Introduce un número entero para comprobar si es múltiplo de " + m +": ");
        int n = sc.nextInt();

        int resto = n%m;

        int numSuma =  m - resto;

        System.out.println("El número necesario a sumar para que " + n + " sea múltiplo de " + m + " es: " + numSuma);

        sc.close();

    }
}
