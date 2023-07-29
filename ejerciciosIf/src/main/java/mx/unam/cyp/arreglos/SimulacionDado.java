package mx.unam.cyp.arreglos;

import java.security.SecureRandom;

public class SimulacionDado {

    public static void main(String[] args) {
        SecureRandom generadorNumeroAleatorio;

        generadorNumeroAleatorio = new SecureRandom();

        int[] ladosDado = new int[7];

        for (int contador = 1; contador <= 6000000; contador++) {
            ladosDado[generadorNumeroAleatorio.nextInt(6) + 1] += 1; 
        }
        
        for(int indice = 1; indice < ladosDado.length; indice ++){
            System.out.println("Lado "+ indice + " = " + 
                    ladosDado[indice]);
        }
        
        long suma = 0;
        for(int indice = 1 ; indice < ladosDado.length; indice ++ ){
        suma += ladosDado[indice];
    }
                System.out.println("Suma: "+ suma);
    }
}
