/*
Un biólogo está realizando un estudio de distintas especies de invertebrados y necesita una aplicación que
le ayude a contabilizar el número de patas que tienen en total todos los animales capturados durante una
jornada de trabajo. Para ello, te ha solicitado que escribas una aplicación a la que hay que proporcionar:

El número de hormigas capturadas ( 6 patas )
El número de arañas capturadas ( 8 patas )
El número de cochinillas capturadas ( 14 patas )
La aplicación debe mostrar el número total de patas.
*/

package unidad_1;

import java.util.Scanner;

public class Calculadora_Patas {

    public static void main(String[] args) {

        // Inciamos una estancia de la clase Scanner
        Scanner sc = new Scanner(System.in);

        // Pedimos y recogemos por consola el número de hormigas
        System.out.print("Introduzca el número de hormigas capturadas: ");
        double hormigas = sc.nextDouble();
        double patasHormigas = hormigas * 6;

        // Pedimos y recogemos por consola el número de arañas
        System.out.print("Introduzca el número de arañas capturadas: ");
        double aranyas = sc.nextDouble();
        double patasAranyas = aranyas * 8;

        // Pedimos y recogemos por consola el número de cochinillas
        System.out.print("Introduzca el número de cochinillas capturadas: ");
        double cochinillas = sc.nextDouble();
        double patasCochinillas = cochinillas * 14;

        // Calculamos el número total de patas
        double patasInvertebratos = patasHormigas + patasAranyas + patasCochinillas;

        // Mostramos por consola el número de patas
        System.out.println("El número total de patas es: " + patasInvertebratos);

        // Cerramos scanner
        sc.close();

    }
}


