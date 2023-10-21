/*
Diseña un programa que pida al usuario un número positivo y lo muestre guarismo por guarismo.
Por ejemplo, para el número 123, debe mostrar primero el 3, a continuación el 2 y por último el 1
*/

package unidad_3;

import java.util.Scanner;

public class Ejercicio_3_3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce un número para mostrarlo guarismo por guarismo: ");
        int num = sc.nextInt();


        while ( num != 0 ){
            // el resto al hacer la división lo guardamos como la primera posición de numInverso
            int numInverso = num % 10;

            // al dividir el número por 10 en cada bucle quitamos el ultimo digito
            num = num/10;
//            System.out.println(numInverso); // si se  quiere como número uno detras de otro en columna
            System.out.print(numInverso + " ");  // si se quiere como el numero a la inversa en una línea
        }
    }
}
