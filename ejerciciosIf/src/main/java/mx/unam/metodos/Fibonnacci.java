
package mx.unam.metodos;

public class Fibonnacci {
    public static void main(String[] args) {
        System.out.println("El número en esa posición es: "
                +fibo(15) + "\nRecursivo: "+ fiboRec(15));
        
    }
    public static int fibo(int lugar){
        int semilla1 = 0, semilla2 = 1, actual = 0;
        
        if(lugar == 1)
            return semilla1;
        else if(lugar == 2)
            return semilla2;
        else{
            for(int cont = 3; cont <= lugar; cont++){
                actual = semilla1 + semilla2;
                semilla1 = semilla2;
                semilla2 = actual;
            }
            return actual;
        }
    }
    public static int fiboRec(int lugar){
        int semilla1 = 0, semilla2 = 1;
        //case base
        if(lugar == 1){
            return semilla1;
        }else if(lugar == 2){
            return semilla2;
        }//paso recursivo
        else{
            return fiboRec(lugar-1) + fiboRec(lugar-2);
        }
        
    }
}
