/*
Pide dos números al usuario a y b. Deberá mostararse  true si ambos números
son iguales y false en caso contrario.
 */

 package unidad_1;

import java.util.Scanner;

public class Boleano {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce el número A para comparar: ");
        double numA = sc.nextDouble();

        System.out.print("Introduce el número B para comparar: ");
        double numB = sc.nextDouble();

        System.out.println("¿Los números proporcionados son iguales? " + " Respuesta: "+(numA == numB));


    }
}
