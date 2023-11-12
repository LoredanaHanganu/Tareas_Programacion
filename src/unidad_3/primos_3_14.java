/*
Realiza un programa que nos pida un número n, y nos diga  cuántos números hay entre 1 y n que sean primos.
Un número primo es  aquel que solo es divisible por 1 y por él mimso.
 */

package unidad_3;

import java.util.Scanner;

public class primos_3_14 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un número n para averiguar los números primos entre 1 y n: ");
        int n = sc.nextInt();
        int count = 0;

        for ( int i = 1; i <= n; i++ ){

            boolean esPrimo = true;

            for ( int j=2; j < i; j++ ){
                if ( i % j == 0 ){
                    esPrimo = false;
                    break;
                }
            }
            if ( esPrimo ){
                count++;
                System.out.println("El número primo es: " + i);
            }
        }

        System.out.println("Desde el número 1 hasta el número " + n + " hay " + count + " números primos");
    }


}
