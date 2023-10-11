//Escribe un programa que calcule el dinero recaudado en un concierto. La aplicación solicitará el aforo máximo del local,
// el precio por entrada (suponemos que todas las entradas tienen el mismo precio) y el número de entradas vendidas.
// Hay que tener en cuenta que si el número de entradas vendidas no supera el 20% del aforo del local, se cancela el concierto.
// Si el número de entradas vendidas no supera el 50% del aforo del local, se realiza una rebaja del 25% del precio de la entrada
package unidad_2;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Entradas_Concierto {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce el aforo máximo del local: ");
        int aforo = sc.nextInt();

        System.out.println("Introduce el precio de la entrada: ");
        double precio = sc.nextDouble();

        System.out.println("Introduce el número de entradas vendidas: ");
        int numEntradas = sc.nextInt();

        // calculamos el porcentaje de entradas vendidas sobre el aforo del local
        double porcentajeEntradasVendidas =  ((double) numEntradas/aforo)*100;

        //System.out.println(porcentajeEntradasVendidas);

        // if - calcula el dinero recuadado en base al aforo ocupado
       if( porcentajeEntradasVendidas <= 20.00 ){
           System.out.println("El concierto se ha cancelado ya que el porcentaje de entradas vendidas es: " + porcentajeEntradasVendidas );
       }else if( porcentajeEntradasVendidas <=50.00 ){
           double recaudaRebajaEntrada = precio - (precio *25 /100);
           double recaudadoRebaja = recaudaRebajaEntrada*numEntradas;
           System.out.printf("El total recaudado en el concierto es: " + "%.2f", recaudadoRebaja );
       }else {
           double recaudado = precio*numEntradas;
           System.out.printf("El total recaudado en el concierto es: " + "%.2f", recaudado);
       }


    }
}
