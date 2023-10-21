/*
Escribe un programa que solicite al usuario las distintas cantidades de dinero de las que dispone.
Por ejemplo: la cantidad de dinero que tiene en el banco, en una caja fuerte, en un cajón y en los
bolsillos... La aplicación mostrará la suma total de dinero de la que dispone el usuario. La manera
de especificar que no se desea introducir más cantidades es mediante el cero.
 */
package unidad_3;

import java.util.Scanner;

public class Ejercicio_3_20 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double dineroTotal = 0;

        do{

            System.out.println("Introduce el dinero que tienes en el banco: ");
            double dineroIntroducido = sc.nextDouble();
            dineroTotal += dineroIntroducido;

            if (dineroIntroducido == 0) {
                break; // Salir del bucle si el usuario ingresa 0
            }

            System.out.println("Introduce el dinero que tienes en la cartera: ");
            dineroIntroducido = sc.nextDouble();

            dineroTotal += dineroIntroducido;
            if (dineroIntroducido == 0) {
                break; // Salir del bucle si el usuario ingresa 0
            }

            System.out.println("Introduce el dinero que tienes en los bolsillos: ");
            dineroIntroducido = sc.nextDouble();

            dineroTotal += dineroIntroducido;
            if (dineroIntroducido == 0) {
                break; // Salir del bucle si el usuario ingresa 0
            }

        }while( true);
        System.out.println("La cantidad total de dinero que tienes es: " + dineroTotal);
    }
}
