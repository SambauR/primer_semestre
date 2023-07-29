
package mx.unam.cyp2;

public class EjercicioA {
    public static void main(String[] args) {
        
        if( args != null){
            if( args[1] != null){
                System.out.printf("VALOR: %s", args[1]);
            }
            else{
                System.out.printf("No existe valor");  
            }
        }
        else{
            System.out.printf("No se le pasaron parámetros");
        }
    }
}
