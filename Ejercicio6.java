import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Collections;

public class Ejercicio6 {
    public static void main(String[] args) {
        SecureRandom veces = new SecureRandom();
        SecureRandom relleno = new SecureRandom();
        ArrayList lista = new ArrayList();
        ArrayList listaCopia = new ArrayList();
        lista.add(1);
        lista.add(3);
        lista.add(3);
        lista.add(7);
        int repeticion;
        repeticion = veces.nextInt(5) + 1;   
        System.out.println("La lista se repite: " + repeticion + " veces");
        System.out.println("Lista original: " + lista);
        repetir(lista,repeticion,listaCopia);
        Collections.sort(listaCopia);        
        System.out.println("La litsa replicada "+repeticion+ " veces quedó " +listaCopia);
    }
    public static ArrayList repetir(ArrayList lista, int repeticiones, ArrayList listaCopia) {
        if (repeticiones == 1) {
            listaCopia.addAll(lista);
            return listaCopia;
        } 
        if (repeticiones > 1) {
            listaCopia.addAll(lista);
            return repetir(lista, repeticiones - 1, listaCopia);
        } else {
            return listaCopia;
        }
    }
}
