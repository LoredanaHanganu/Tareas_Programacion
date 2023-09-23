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

        // Inciamos una estancia de la clase Scanner
        Scanner sc = new Scanner(System.in);

        // Pedimos y recogemos por consola el número de entradas infantiles
        System.out.print("Introduzca el número de entradas infantiles que desea comprar: ");
        double entradasInfantiles = sc.nextDouble();

        // Pedimos y recogemos por consola el número de entradas para adultos
        System.out.print("Introduzca el número de entradas para adultos que desea comprar: ");
        double entradasAdultos = sc.nextDouble();

        // Calculamos el precio total de las entradas
        double precioTotalEntradas = precioTotalEntradas(entradasInfantiles, entradasAdultos);
        double descuento = 5;

        // System.out.println("Precio total de las entradas sin descuento: " + precioTotalEntradas);

        // Usando un ternario sacamos el precio de las entradas tanto si supera como si no, los 100€
        double precioFinal = (precioTotalEntradas >= 100 ) ? precioTotalEntradas - descuento : precioTotalEntradas;
        System.out.printf("El precio total de las entradas es: " + "%.2f" , precioFinal);

        // Cerramos scanner
        sc.close();
    }

    // Método para calcular el precio de las entradas
    public static double precioTotalEntradas(double entradasInfantiles, double entradasAdultos) {
        double precioEntradaInfantil = 15.50;
        double precioEntradaAdulto = 20;

        return (entradasInfantiles * precioEntradaInfantil) + (entradasAdultos * precioEntradaAdulto);
    }
}

