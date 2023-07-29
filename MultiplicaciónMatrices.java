package com.mycompany.tareanumero5;

//import java.security.SecureRandom;
import java.util.Scanner;

public class MultiplicaciónMatrices {

    public static void main(String[] args) {
        int matrizA[][] = new int[3][3];
        int matrizB[][] = new int[3][3];
        int matrizC[][] = new int[3][3];
        Scanner lector = new Scanner(System.in);
        //SecureRandom relleno = new SecureRandom();

        //para matriz A
        //System.out.println("Los valores para la matriz A y B se generan aleatoriamente."); 
        for (int filas = 0; filas < 3; filas++) {
            for (int columnas = 0; columnas < 3; columnas++) {
                //matrizA[filas][columnas] = relleno.nextInt(5) + 1;
                System.out.println("Introduce los valores de la matriz A = ");
                matrizA[filas][columnas] = lector.nextInt();
            }
        }
        //para matriz B
        for (int filas = 0; filas < 3; filas++) {
            for (int columnas = 0; columnas < 3; columnas++) {
                //matrizB[filas][columnas] = relleno.nextInt(5) + 1;
                System.out.println("Introduce los valores de la matriz B = ");
                matrizB[filas][columnas] = lector.nextInt();
            }
        }
        //multiplicación
        for (int filas = 0; filas < 3; filas++) {
            for (int columnas = 0; columnas < 3; columnas++) {
                matrizC[filas][columnas] = 0;
                for (int contador = 0; contador < 3; contador++) {
                    matrizC[filas][columnas]
                            += (matrizA[filas][contador] * matrizB[contador][columnas]);
                }
            }

        }
        System.out.println("\nLa multiplicación de las matrices es: \n");
        for (int filas = 0; filas < 3; filas++) {
            for (int columnas = 0; columnas < 3; columnas++) {
                System.out.print(matrizC[filas][columnas] + "  ");
            }
            System.out.println("");
        }
    }
}
