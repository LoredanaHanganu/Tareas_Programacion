package unidad_3;
import java.util.Scanner;
public class actividad320 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double cantidad_total = 0;


        System.out.println("Registra una cantidad de dinero: ");
        double dinero = sc.nextDouble();
        cantidad_total = dinero;

        while (dinero > 0){
            System.out.println("Registra una cantidad de dinero: ");
            dinero = sc.nextDouble();
            cantidad_total += dinero;
        }

//        double dinero  = 0;
//        do{
//            System.out.println("Registra una cantidad de dinero: ");
//            dinero = sc.nextDouble();
//            cantidad_total += dinero;
//        }while(dinero > 0 );
//
//        System.out.println("La cantidad total de dinero que tienes es de: " + cantidad_total);
    }
}