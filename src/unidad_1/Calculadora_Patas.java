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

        Scanner sc = new Scanner(System.in);

        System.out.print("Introduzca el número de hormigas capturadas: ");
        double hormigas = sc.nextDouble();
        double patasHormigas = hormigas * 6;

        System.out.print("Introduzca el número de arañas capturadas: ");
        double arañas = sc.nextDouble();
        double patasArañas = arañas * 8;

        System.out.print("Introduzca el número de cochinillas capturadas: ");
        double cochinillas = sc.nextDouble();
        double patasCochinillas = cochinillas * 14;

        double patasInvertebratos = patasHormigas + patasArañas + patasCochinillas;

        System.out.println("El número total de patas es: " + patasInvertebratos);

    }
}


