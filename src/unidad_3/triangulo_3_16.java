/*
Solicita al usuario un número n y dibuja un triangulo de base y altura n.
 */
package unidad_3;
public class triangulo_3_16 {
    public static void main(String[] args) {
        int n = 4;
        String hueco = "D";
        String estrella ="*";

        for ( int i = 1; i <= n; i++){
            System.out.println();
            for (int j = 1; j <= i; j++){
                if( j == 1 ){
                    System.out.print(hueco);
                    System.out.print(hueco);
                    System.out.print(hueco);
                    System.out.print(estrella);
                } else if ( j == 2 ){
                    System.out.print(hueco);
                    System.out.print(hueco);
                    System.out.print(estrella);
                }


            }
        }
    }

}
