/*
dado el siguiente polinomio de segundo grado:
y=ax(x al cuadrado) +bx + c
crea un programa que pida los coeficientes a, b, c así como el valor de x,
y calcula el valor correspondiente de y.
 */

package unidad_1;

import java.util.Scanner;

public class Polinomio_ValorY {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce el coeficiente a: ");
        int a  = sc.nextInt();

        System.out.print("Introduce el coeficiente b: ");
        int b  = sc.nextInt();

        System.out.print("Introduce el coeficiente c: ");
        int c  = sc.nextInt();

        System.out.print("Introduce un número entero x: ");
        int x  = sc.nextInt();

        int y = a*(x*x) + (b*x) + c;

        System.out.println("El valor de y es: " + y);

        sc.close();
    }
}
