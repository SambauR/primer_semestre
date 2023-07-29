
import java.security.SecureRandom;

public class Ejercicio2 {

    public static void main(String[] args) {
        int matrizNormal[][] = new int[4][4];//{{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}, {13, 14, 15, 16}};
        SecureRandom relleno = new SecureRandom();

        for (int filas = 0; filas < 4; filas++) {
            for (int columnas = 0; columnas < 4; columnas++) {
                matrizNormal[filas][columnas] = relleno.nextInt(10);
            }
        }
        System.out.println("MATRIZ NORMAL");
        for (int filas = 0; filas < 4; filas++) {
            for (int columnas = 0; columnas < 4; columnas++) {
                System.out.print(matrizNormal[filas][columnas] + " ");
            }
            System.out.println("");
        }
        System.out.println("MATRIZ EN ORDEN ESPIRAL");
        for (int i = 0; i <= matrizNormal.length - 1; i++) {
            System.out.print(matrizNormal[0][i] + " ");
        }
        //llenando la última columna
        for (int i = 1; i <= matrizNormal.length - 1; i++) {
            System.out.print(matrizNormal[i][3] + " ");
        }
        //Llenando la última fila
        for (int i = matrizNormal.length - 2; i >= 0; i--) {
            System.out.print(matrizNormal[3][i] + " ");
        }
        //llenando la primer columna
        for (int i = matrizNormal.length - 2; i >= 1; i--) {
            System.out.print(matrizNormal[i][0] + " ");
        }
        for (int i = 1; i <= 2; i++) {
            System.out.print(matrizNormal[1][i] + " ");
        }
        for (int i = 2; i >= 1; i--) {
            System.out.print(matrizNormal[2][i] + " ");
        }

    }
}
