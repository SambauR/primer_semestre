package mx.unam.metodos;

public class PruebaMetodos {

    public static void main(String[] args) {
        
        System.out.println("El mayor es: "+ mayorDeTres(8,6,9));
        System.out.println("El mayor es: "+ mayorDeTres(98,46,39));
        System.out.println("El mayor es: "+ mayorDeTres(18,18,39));
    }

    public static double mayorDeTres(int numero1, int numero2, int numero3) {
        
        saludo("estoy entrando al método mayorDeTres");
        int mayor = numero1;

        if (numero2 > mayor) {
            mayor = numero2;
        }
        if (numero3 > mayor) {
            mayor = numero3;
        }
        saludo("estoy saliendo al método mayorDeTres");
        return mayor;
    }
    
    public static void saludo(String mensaje){
        System.out.println(mensaje);
    }
}
