package mx.unam.metodos;

public class Factorial {

    public static void main(String[] args) {

       // for (int contador = 1; contador <= 100; contador++) {
            System.out.println(factorial(5));
            System.out.println(facRecursivo(5));
       // }
    }

    public static long factorial(int numero) {
        long factorial = 1;

        for (int contador = 1; contador <= numero; contador++) {
            factorial = contador * factorial;
        }
        return factorial;
    }

    public static long facRecursivo(int numero) {
        //case base
        if(numero == 1)
            return 1;
        //paso recursivo el método no sabe pero se llama a si mismo
        //con una versión más sencilla
        return numero * facRecursivo(numero-1);

    }
}
