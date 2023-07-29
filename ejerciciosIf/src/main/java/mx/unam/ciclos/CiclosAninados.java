
package mx.unam.ciclos;

public class CiclosAninados {
    public static void main(String[] args) {
        int contador = 0;
        int contador2= 0;
        
        while(contador2 < 3){
              contador = 0; //reseteo contador de líneas
        //genera una linea
            while(contador < 3){
                System.out.print("*");
                contador ++;
            }
            System.out.println(" ");
            contador2 ++;
        }
    }
    
}
