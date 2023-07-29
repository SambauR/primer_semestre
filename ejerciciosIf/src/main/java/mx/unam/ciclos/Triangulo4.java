package mx.unam.ciclos;

public class Triangulo4 {
    public static void main(String[] args) {
        int columnas = 0;
        int filas = 10;
        while(filas >= 0){
            columnas = 0;
            //columnas
            while(columnas < 10){
                if(columnas >= filas){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
                
                columnas ++;
            }
            System.out.println("");
            filas --;
        }
    }
            
}
