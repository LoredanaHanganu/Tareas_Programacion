/*
Modificar la actividad resuelta 3.14 para que solo muestre las tablas de multiplicar del 1 al 10 de los número pares
*/

package unidad_3;

public class Ejercicio_3_14 {
    public static void main(String[] args) {

//        tabla de los números pares para la multiplicación del 1 a 10
//        for( int tabla = 2; tabla <=10 ; tabla+=2){
//            System.out.println("\n\nTabla del " + tabla);
//            for( int num = 1; num <= 10 ; num++ ){
//                System.out.println(tabla + " x " + num + " = " + tabla*num);
//            }
//        }

//        tabla del 1 a 10 para la multiplicación de los números pares
        for( int tabla = 1; tabla <=10 ; tabla++){
            System.out.println("\n\nTabla del " + tabla);
            for( int num = 2; num <= 10 ; num+=2 ){
                System.out.println(tabla + " x " + num + " = " + tabla*num);
            }
        }

    }
}
