package mx.unam.metodos;

public class InvertirCadena {

    public static void main(String[] args) {
        String cadena = "hola";
        System.out.println("La cadena es: " + cadena);
        System.out.println("La cadena invertida es: " + invertirCadena(cadena));
        System.out.println("La cadena invertida es: " + invertirCadenaR(cadena));

    }

    public static String invertirCadena(String cadena) {
        String salida = "";

        for (int indice = cadena.length() - 1; indice >= 0; indice--) {
            salida += cadena.charAt(indice);
        }

        return salida;
    }

    public static String invertirCadenaR(String cadena) {
        String salida = "";
        

        //caso base
        if (cadena.length() == 0) {
            return cadena;
        }  
        else {//llamada recursiva
            salida = invertirCadenaR(cadena.substring(1)) + cadena.charAt(0);
        }
        return salida;
    }
}
