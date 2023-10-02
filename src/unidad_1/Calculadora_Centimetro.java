/*
Solicita al usuario 3 distancias:
-la primera medida en milímetros.
-la segunda medida en centímetros.
-la última medida en metros.
Diseña un programa que muestre la suma de las tres logitudes introducidas, medida en centímetros.
 */

package unidad_1;

import java.util.Scanner;

public class Calculadora_Centimetro {

    public static void main(String[] args) {

        Scanner sc  = new Scanner(System.in);

        System.out.println("Introduce los milímetros: ");
        double milimetro = sc.nextDouble();

        System.out.println("Introduce los centímetros: ");
        double centimetro = sc.nextDouble();

        System.out.println("Introduce los metros: ");
        double metro = sc.nextDouble();

        // transformamos milímetros a centímetros
        double miliCenti = milimetro/10;

        // transformamos metros a centímetros
        double metroCenti = metro * 100;

        double suma = miliCenti + centimetro + metroCenti;

        System.out.printf("La suma de las medidas en centímetros es: " + "%.2f", suma);

        sc.close();
    }
}
