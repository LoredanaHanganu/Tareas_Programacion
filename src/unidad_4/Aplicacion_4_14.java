/*
Escribe una función a la que se pase como parámetros de entrada una cantidad de días, horas y minutos
(que se pedirán en el programa principal). La función calculará y devolverá el número de segundos que
existen en los datos de entrada. El programa principal mostrará por pantalla los datos devueltos por
la función
 */
package unidad_4;

import java.util.Scanner;

public class Aplicacion_4_14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce los días a transformar en segundos: ");
        int dias = sc.nextInt();
        System.out.println("Introduce las horas a transformar en segundos: ");
        int horas = sc.nextInt();
        System.out.println("Introduce los minutos a transformar en segundos: ");
        int min = sc.nextInt();

        int totalSegundos = calculadoraSegundos(dias, horas, min);
        System.out.println("El total de segundos es: " + totalSegundos);
    }
    static int calculadoraSegundos( int dias,  int horas,  int min){
        int segDia = 24 * 60 * 60;
        int segHora = 60 * 60;
        int segMin = 60;
        return (dias * segDia) + (horas * segHora) + (min * segMin);
    }
}
