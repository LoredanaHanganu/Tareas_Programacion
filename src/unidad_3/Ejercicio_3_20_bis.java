/*
Escribe un programa que solicite al usuario las distintas cantidades de dinero de las que dispone.
Por ejemplo: la cantidad de dinero que tiene en el banco, en una caja fuerte, en un cajón y en los
bolsillos... La aplicación mostrará la suma total de dinero de la que dispone el usuario. La manera
de especificar que no se desea introducir más cantidades es mediante el cero.
 */

package unidad_3;

import java.util.Scanner;

public class Ejercicio_3_20_bis {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double dineroTotal = 0;
        String[] fuentesDinero = {"bolsillo", "cartera", "banco", "cajon", "caja fuerte" };

        for ( String fuente: fuentesDinero) {
            do{
                System.out.print("Introduce el dinero que tienes en " + fuente + " (o introduce 0 para terminar): ");
                double dinero = sc.nextDouble();

                if(dinero == 0){
                    break;
                }

                dineroTotal += dinero;

            } while ( true );
        }

        System.out.println("Total dinero: " + dineroTotal );
    }
}
