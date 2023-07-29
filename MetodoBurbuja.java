package com.mycompany.tareanumero5;

import java.security.SecureRandom;
//import java.util.Scanner;

public class MetodoBurbuja {

    public static void main(String[] args) {
        int arreglo[], longitud;
        int aux;
        SecureRandom valoresAleatorios, longArreglo;
        //Scanner lector = new Scanner(System.in);
        valoresAleatorios = new SecureRandom();
        longArreglo = new SecureRandom();

        longitud = longArreglo.nextInt(15) + 1;
        arreglo = new int[longitud];
        System.out.println("La longitud del arreglo será de " + longitud + " elementos");

        System.out.println("Los valores del arreglo se asignan aleatoriamente ");

        for (int contador = 0; contador < arreglo.length; contador++) {
            arreglo[contador] = valoresAleatorios.nextInt(100) + 1;
        }

        System.out.print("El arreglo en desorden es: ");
        for (int contador = 0; contador < arreglo.length; contador++) {
            System.out.print(arreglo[contador] + ", ");
        }

        for (int contador = 0; contador < arreglo.length - 1; contador++) { //saber cuantas veces se realiza 
            for (int contador2 = 0; contador2 < arreglo.length - 1; contador2++) { // intercambia valores
                if (arreglo[contador2] > arreglo[contador2 + 1]) {
                    aux = arreglo[contador2];
                    arreglo[contador2] = arreglo[contador2 + 1];
                    arreglo[contador2 + 1] = aux;
                }
            }
        }
        System.out.print("\nEl arreglo en orden es: ");
        for (int contador = 0; contador < arreglo.length; contador++) {
            System.out.print(arreglo[contador] + ", ");
        }
    }
}
