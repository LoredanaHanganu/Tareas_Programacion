/*
Crea un programa que pida la base y la altura de un triangulo y muestre su área.
Área triangulo = (base * altura) / 2
 */
package unidad_1;

import java.util.Scanner;

public class Area_Triangulo {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce la base del triangulo: ");
        double baseTriangulo = sc.nextDouble();

        System.out.println("Introduce la altura del triangulo: ");
        double alturaTriangulo = sc.nextDouble();

        double areaTriangulo = (baseTriangulo * alturaTriangulo)/2;

        System.out.println("El area del triangulo es: " + areaTriangulo);

    }
}
