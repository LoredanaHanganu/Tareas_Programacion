/* Enunciado tarea:
Un economista te ha encargado un programa para realizar cálculos con el IVA.
La aplicación debe solicitar la base imponible y el IVA que se debe aplicar.
Muestra por pantalla el importe correspondiente al IVA y al total.*
*/


package unidad_1;
import java.util.Scanner;

public class Calculadora_Iva {
    public static void main(String[] args) {

        // Iniciamos una instancia de la clase scanner
        Scanner sc = new Scanner(System.in);

        // Pedimos y recogemos por consola los datos introducidos por el usuario
        System.out.print("Introduzca la base imponible: ");
        double baseImponible = sc.nextDouble();

        System.out.print("Introduzca el IVA: ");
        double porcentajeIva = sc.nextDouble();

        // Caluculamos el Iva proporcional y el precio total con el Iva incluido
        double ivaProporcional = baseImponible * porcentajeIva/100;
        double precioTotal = baseImponible + ivaProporcional;

        // sacamos por consola los datos
        System.out.println( "El IVA es: " + ivaProporcional);
        System.out.println("El precio total con IVA es: " + precioTotal);

        // cerramos scanner
        sc.close();
    }
}


