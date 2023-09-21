package unidad_1;

public class Calculadora_Iva {
    public static void main(String[] args) {

        int baseImponible = 10;
        double iva = 0.21;

        double ivaProporcional = baseImponible * iva;
        double precioTotal = baseImponible + ivaProporcional;

        System.out.println( "El IVA es: " + ivaProporcional);
        System.out.println("El precio total es: " + precioTotal);


    }
}
