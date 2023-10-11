// Solicita por teclado un número de tipo int al usuario y escribe un programa que muestre true o false,
// dependiendo de si el múmero es positivo

package unidad_2;

import java.util.Scanner;

public class Integer_boleano {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // pedimos y recogemos por consola un número entero
        System.out.print("Introduzca un número entero: ");
        int numInteger = sc.nextInt();

        // el 0 se considera un número neutro, lo he dejadio como false al no ser positivo
        if ( numInteger > 0 ){
            System.out.println("El número es positivo: " + true);
        }else if(numInteger == 0 ){
            System.out.println("El número es neutro: " + false);
        }else{
            System.out.println("El número es negativo: " + false);
        }
    }
}
