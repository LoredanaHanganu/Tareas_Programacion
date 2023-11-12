/*
Crea un programa que pida un número entero positivo  pedido por teclado
(controlar que la entrada sea correcta) y se lo pase a una función que
devuelva cuantas cifras tiene dicho número.
 */
package unidad_4;

import java.util.Scanner;

public class ContarCifras {
    public static void main(String[] args) {

        Scanner sc  = new Scanner(System.in);
        int num = 0;

        // pedimos al usuario que introduzca un número enetero positivo
        do{
            System.out.print("Introduce un número entero: ");
            num = sc.nextInt();
        }while( num <= 0 );

        // llammos la función
        contarCifrasNum(num);
    }

    // función que cuenta los digitos del número
    static void contarCifrasNum( int num ){
        // pasamos el número a String y sacamos la longitud del mismo
        String digitos  = Integer.toString(num);
        System.out.println("El número " + num + " tiene " + digitos.length() +" cifras.");
    }
}
