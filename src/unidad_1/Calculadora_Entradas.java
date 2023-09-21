/*
Una empresa que gestiona un parque acuático te solicita una aplicación que les ayude a calcular el importe
que hay que cobrar en la taquilla por la compra de una serie de entradas (cuyo número será introducido
por el usuario). Existen dos tipos de entradas: infantiles, que cuestan 15.50 euros y de adultos que cuestan
20 euros.
En el caso de que el importe total sea igual o superior a 100 euros, se aplicará automáticamente un bono
descuento de 5 euros.
*/


package unidad_1;

import java.util.Scanner;

public class Calculadora_Entradas {

    public static void main(String[] args) {

        // inciamos una estancia de la clase Scanner
        Scanner sc = new Scanner(System.in);

        // Recogemos por consola el número de entradas infantiles
        System.out.print("Introduzca el número de entradas infantiles que desea comprar: ");
        double entradasInfantiles = sc.nextDouble();

        // Recogemos por consola el número de entradas para adultos
        System.out.print("Introduzca el número de entradas para adultos que desea comprar: ");
        double entradasAdultos = sc.nextDouble();

        double precioTotalEntradas = precioTotalEntradas(entradasInfantiles, entradasAdultos);
        double descuento = 5;

        // System.out.println("Precio total de las entradas sin descuento: " + precioTotalEntradas);
        double precioFinal = (precioTotalEntradas >= 100 ) ? precioTotalEntradas - descuento : precioTotalEntradas;
        System.out.println("El precio total de las entradas es: " + precioFinal);
    }

    public static double precioTotalEntradas(double entradasInfantiles, double entradasAdultos) {
        double precioEntradaInfantil = 15.50;
        double precioEntradaAdulto = 20;

        return (entradasInfantiles * precioEntradaInfantil) + (entradasAdultos * precioEntradaAdulto);
    }
}

