
package mx.unam.claseTemprana;

public class EjemploDeOperadoresLogicos {
    public static void main(String[] args) {
        int examenFinal = 7, trabajoClase = 4;
        
        if(examenFinal >= 6 || trabajoClase >= 6){ //OR
            System.out.printf("Aprobado");
        }
        else{
            System.out.printf("Reprobado");
        }
        if(!(examenFinal >= 6 && trabajoClase >= 6)){ //AND
            System.out.printf("%nAprobado");
        }
        else{
            System.out.printf("%nReprobado");
        }
        if(!false) //NOT
            System.out.println("\nNo entra");
    }
}
