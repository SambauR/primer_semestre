import java.util.Scanner;
public class Ejercicio7 {
    public static void main(String[] args) {
        int numeroDeVeces = 0;
        char letra;
        String palabra;
        Scanner lector = new Scanner(System.in);
        System.out.println("Introduce la palabra: ");
        palabra = lector.nextLine();
        System.out.println("Introduce la letra que quieres contar: ");
        letra = lector.next().charAt(0);
        numeroDeVeces = aparicion(palabra, letra);
        System.out.println("La letra " + "\"" + letra + "\"" + " aparece: " + aparicion(palabra, letra) + " veces");
        System.out.println("La letra " + "\"" + letra + "\"" + " aparece: " + aparicionRec(palabra, letra) + " veces");
    }
    public static int aparicion(String palabra, char letra) {
        int contador = 0;
        char actual;
        for (int lugar = 0; lugar < palabra.length(); lugar++) {
            actual = palabra.charAt(lugar);
            if (actual == letra) {
                contador++;
            }
        }
        return contador;
    }
    public static int aparicionRec(String palabra, char letra) {
        if (palabra == null || palabra.length() == 0) {
            return 0;
        }
        if (palabra.charAt(0) == letra) {
            return 1 + aparicionRec(palabra.substring(1), letra);
        } else {
            return aparicionRec(palabra.substring(1), letra);
        }
    }
}
