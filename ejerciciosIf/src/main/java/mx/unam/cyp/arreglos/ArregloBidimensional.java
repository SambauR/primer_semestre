package mx.unam.cyp.arreglos;

import java.security.SecureRandom;

public class ArregloBidimensional {

    public static void main(String[] args) {
        SecureRandom generadorNumeroAleatorio;
        generadorNumeroAleatorio = new SecureRandom();
        int k[][] = new int[2][3];

        for (int fila = 0; fila < 2; fila++) {
            for (int columna = 0; columna < 3; columna++) {
                k[fila][columna] = generadorNumeroAleatorio.nextInt(101);
            }
        }
        for (int fila = 0; fila < 2; fila++) {
            for (int columna = 0; columna < 3; columna++) {
                System.out.println("K[" + fila + "]["
                        + columna + "] = " + k[fila][columna]);
            }
        }
    }
}
