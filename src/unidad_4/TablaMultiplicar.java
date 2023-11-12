/*
Escribe una función que reciba un número como parámetro y muestre la tabla de multiplicar de ese número
del 1 al 10 pero solo de los números impares . El número que recibe como parámetro se pedirá en el
programa principal.
 */
package unidad_4;

import java.util.Scanner;

public class TablaMultiplicar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce un número para mostrar la tabla de multiplicar: ");
        int num = sc.nextInt();

        // llamar a la función
        multiplicarImpar(num);

    }

    // funcion que recorre con un for los numeros hasta 10 para luego comprobar con un if cuál es impar y multiplicarlo con el número introducido por consola
    static void multiplicarImpar(int num) {
        System.out.println("Tabla de multiplicar - números imapres del número: " +num);
        for( int i = 1; i <= 10; i++){
           int result = num * i;

           if( i % 2 != 0 ){
               System.out.println(num + " X " + i + " = " + result);
           }
        }
    }
}
