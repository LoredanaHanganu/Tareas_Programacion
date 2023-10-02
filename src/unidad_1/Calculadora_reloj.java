/*
Diseña una apliación que solicite al usuario que introduzca una cantidad de segundos.
La aplicación debe mostrar cuantas horas, minutos y segundos hay  en el número de segundos indicado.
 */

package unidad_1;

import java.util.Scanner;

public class Calculadora_reloj {

    public static void main(String[] args) {

        // Iniciamos una instancia de la clase scanner
        Scanner sc = new Scanner(System.in);

        // Pedimos y recogemos por consola el número de segundos a convertir
        System.out.println("Introduce el número de segundo que quieres conevrtir en horas, minutos y segundos: ");
        int segundosTotal = sc.nextInt();

        // dividimos el número de segundos por los segundos que hay en una hora
        int horas = segundosTotal/3600;

        // el RESTO de la división de segundos por segundos que hay en una hora lo usamos para dividirlo por 60 que son los minutos que hay en una hora
        int minutos = segundosTotal%3600/60;

        // el RESTO de la división de segundos por segundos que hay en una hora lo usamos para  volver a sacar el RESTO que se quedaría al hacer la división por minutos
        int segundos = (segundosTotal%3600)%60;

        System.out.println("En "+ segundosTotal + " segundos " + " hay " + horas + " horas " + minutos + " minutos " + " y " + segundos +" segundos ");

        sc.close();

    }
}

