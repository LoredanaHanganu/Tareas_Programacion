// Escribe un programa que pida al usuario dos números enteros y muestre: true, si ambos número son distintos entre
// sí o alguno de ellos es cero; y false en caso contrario.
package unidad_2;

import java.util.Scanner;

public class Comparar_nums {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // pedimos y recogemos por consola  dos números enteros
        System.out.print("Introduzca un número entero: ");
        int numUno= sc.nextInt();

        System.out.print("Introduzca un número entero: ");
        int numDos = sc.nextInt();

        // 'numDos == 0' es en este código redundante -  ya que si 'numUno != numDos' evalaua false y numUno es 0 entonces numDos es 0 también
        if( numUno != numDos || numUno == 0 ){
            System.out.println("Los números son distintos entre sí o alguno es cero: " + true);
        }else{
            System.out.println(" Los números son iguales entre sí, ninguno es cero: "+false);
        }

    }
}
