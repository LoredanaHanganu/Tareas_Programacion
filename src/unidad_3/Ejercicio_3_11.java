/*
Ejercicio 3.11
Realiza un programa que convierta un número decimal en su representación binaria. Hay que tener en ceunta que deconocemos cuantas cifras
tiene el número que introduce el usuario.

 */

package unidad_3;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Ejercicio_3_11 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Introduzca un número en base 10: ");
        int decimalNum = sc.nextInt();

        // Creamos 2 variables de tipo String y las iniciamos vacias
        String numBinario= "";
        String binarioReverse= "";


        // logica para sacar cada digito del número binario
        while( decimalNum > 0 ){
            int digitoBinario = decimalNum % 2;

            // rellanmos el string que creamos con cada digito que sacamos en cada loop del while
            numBinario = String.valueOf(digitoBinario) + numBinario;

//          este sería el binario tal como sale
//          System.out.print(digitoBinario);
            decimalNum = decimalNum/2;
        }

//      System.out.println();

        // hacemos un for que recorra el num binario que guardamos en forma de String
        // Iremos reocorriendo hacía bajo el for para sacar cada
        // caracter del String empezando por la posición final
//        for(int i = numBinario.length()-1; i>=0; i-- ){
//            binarioReverse += numBinario.charAt(i);
//        }

        // sacamos por pantalla el número binario en el orden correcto
        System.out.println("Binario correcto: "+numBinario);
    }
}
