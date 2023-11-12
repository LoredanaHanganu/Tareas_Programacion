/*
Escribe una función que decida si dos números enteros positivos son amigos. (Comprobar que los dos números son
positivos, sino lo son volver a pedir el número hasta que se introduzcan correctamente). Dos números a y b son
números amigos si la suma de los divisores propios (distintos de él mismo) de a es igual a b. Y viceversa
 */
package unidad_4;

import java.util.Scanner;

public class Aplicacion_4_17 {
    public static void main(String[] args) {

        // instancia clase Scanner
        Scanner sc = new Scanner(System.in);

        // iniciar los 2 números
        int numA = 0;
        int numB = 0;

        // pedimos por consola los dos números hasta que se introduzcan 2 números positivos
        do{
            System.out.println("Introduce un número positivo A: ");
            numA = sc.nextInt();
            System.out.println("Introduce un número positivo B: ");
            numB = sc.nextInt();

        }while( numA <= 0 || numB <= 0);

        // utilizando la función de comparación sacamos los resultados por consola
        if (numAmigos(numA, numB)){
            System.out.println("Los núumeros son amigos");
        }else {
            System.out.println("Los números no son amigos");
        }

    }

    // función que suma los divisores de un número
    static int sumaDivisores(int numero) {
        int suma = 0;
        for (int i = 1; i <= numero / 2; i++) {
            if (numero % i == 0) {
                suma += i;
            }
        }
        return suma;
    }

    // función que compara si la suma de los divisores de un número es igual al otro número
    static boolean numAmigos(int numA, int numB) {
        return (sumaDivisores(numA) == numB) && (sumaDivisores(numB) == numA);
    }

}
