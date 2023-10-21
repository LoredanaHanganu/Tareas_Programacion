/*
Modificar la actividad resuelta 3.13 para que en lugar de pedir 6 notas,
le pida al usuario que indique cuantas notas quiere introducir y una vez introducidas
esas notas, muestre la cantidad de alumnos aprobados, condicionados y suspensos
nota == 4 - condicionados
nota >= 5 - aprobados
nota <  4 - suspensos
*/

package unidad_3;

import java.util.Scanner;

public class Ejercicio_3_13 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int aprobados = 0, suspensos=0, condicionados = 0;

        System.out.print("Introduce cúantas notas de alumnos se van a comprobar: ");
        int numNotas = sc.nextInt();

        // la condición para que acabe el for cambia en función del número de notas que decidamos introducir
        for( int i = 1; i <= numNotas; i++){
            System.out.print("Nota del alumno número: " + i + ": ");
            int nota = sc.nextInt();

            if( nota == 4 ){
                condicionados++;
            }else if ( nota >=5 && nota <= 10){
                aprobados++;
            }else if( nota < 4) {
                suspensos++;
            }else{
                System.out.println("Nota introducida no válida");
            }
        }
        System.out.println("Alumnos aprobados: " + aprobados);
        System.out.println("Alumnos condicionados: " + condicionados);
        System.out.println("Alumnos suspensos: " + suspensos);
    }
}
