package unidad_3;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Ejercicio_3_12 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Introduzca un número en binario: ");
        String binario = sc.next();

        int decimalNum = 0;
        int base = 1;

        // Itera a través de los dígitos del número binario de derecha a izquierda
        for (int i = binario.length() - 1; i >= 0; i--) {
            char digito = binario.charAt(i);
            // sólo si el digito es 1 va sumando la base(1)*2
            if (digito == '1') {
                decimalNum += base;
                System.out.println("decimalNUM:" +decimalNum);
            }
            // multiplicamos la base * 2 y la almacenamos
            base *= 2;
            System.out.println("base:" +base);
        }

        System.out.println("El número en decimal es: " + decimalNum);
    }
}