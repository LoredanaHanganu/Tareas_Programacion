/* Enunciado tarea:
Un economista te ha encargado un programa para realizar cálculos con el IVA.
La aplicación debe solicitar la base imponible y el IVA que se debe aplicar.
Muestra por pantalla el importe correspondiente al IVA y al total.*
*/


package unidad_1;
import java.util.Scanner;

public class Calculadora_Iva {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Introduzca la base imponible: ");
        double baseImponible = sc.nextDouble();

        System.out.print("Introduzca el IVA: ");
        double porcentajeIva = sc.nextDouble();

        double ivaProporcional = baseImponible * porcentajeIva/100;
        double precioTotal = baseImponible + ivaProporcional;

        System.out.println( "El IVA es: " + ivaProporcional);
        System.out.println("El precio total con IVA es: " + precioTotal);

        sc.close();
    }
}


