
import java.security.SecureRandom;
import java.util.Scanner;

public class Ejercicio1 {

    public static void main(String[] args) {
        int matrizA[][] = new int[5][5];
        int aux;
        Scanner lector = new Scanner(System.in);
        SecureRandom valores = new SecureRandom();
        //lenar la matrizA
        for (int filas = 0; filas < 5; filas++) {
            for (int columnas = 0; columnas < 5; columnas++) {
//                System.out.println("Ingresa el valor para: Matriz [" + filas + "]"
//                        + "[" + columnas + "]: ");
                matrizA[filas][columnas] = valores.nextInt(9)+1;
            }
        }
        System.out.println("\nLa matriz original es: ");
        for (int filas = 0; filas < 5; filas++) {
            for (int columnas = 0; columnas < 5; columnas++) {
                System.out.print(matrizA[filas][columnas] + " ");
            }
            System.out.println("");
        }
        //transponer matrizA
        for (int filas = 0; filas < 5; filas++) {
            for (int columnas = 0; columnas < filas; columnas++) {
                aux = matrizA[filas][columnas];
                matrizA[filas][columnas] = matrizA[columnas][filas];
                matrizA[columnas][filas] = aux;
            }
        }
        System.out.println("La matriz transpuesta es: ");
        for (int filas = 0; filas < 5; filas++) {
            for (int columnas = 0; columnas < 5; columnas++) {
                System.out.print(matrizA[filas][columnas] + " ");
            }
            System.out.println("");
        }
    }
}
