
import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio5 {

    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        String cadena1, cadena2;
        System.out.println("Intoduce una oración : ");
        cadena1 = lector.nextLine();
        System.out.println("Introduce el String a analizar: ");
        cadena2 = lector.next();
        int aux = cadena1.length();
        ArrayList cadena = new ArrayList();
        System.out.println("Las posiciones en la cadena empezando desde 0 son: ");
        System.out.println(posicion(cadena1, cadena2, aux, cadena));

    }

    public static ArrayList posicion(String a, String b, int aux, ArrayList cadena) {
        if (a.length() == 0 || a.length() < b.length()) {
            return cadena;
        }
        if (a.substring(0, b.length()).equals(b)) {
            cadena.add(aux - a.length());
            return posicion(a.substring(1), b, aux, cadena);
        } else {
            return posicion(a.substring(1), b, aux, cadena);
        }
    }

}
