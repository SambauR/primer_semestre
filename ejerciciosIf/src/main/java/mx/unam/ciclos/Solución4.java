package mx.unam.ciclos;
public class Solución4 {
    public static void main(String[] args) {
        int columnas = 0;
        int filas = 0;
        
        while (filas < 10) {
         columnas = 0; //reseteo contador de lineas
         //linea
         while (columnas < 10) {
            if (columnas <= filas) {
               System.out.print("*");
               
            } else {
               System.out.print(" ");
            }
            columnas ++;
         }
            System.out.print("   ");
             columnas = 10;//segundo triangulo
         while (columnas > 0){    
            if(columnas <= filas){
                System.out.print(" ");
            } else {
               System.out.print("*");
            }  
            columnas --;
         }
            System.out.print("   ");
            columnas = 0;
         while(columnas <= 10){
             if(columnas > filas){
                 System.out.print("*");
             } else {
                 System.out.print(" ");
             }    
             columnas ++;
         }
            System.out.print("   ");
            columnas = 10;
         while(columnas >= 0){
             if (columnas > filas){
                 System.out.print(" ");
             } else{
                 System.out.print("*");
             }
             columnas --;
         }     
         System.out.println(" ");
         filas ++;
      }
    }
}
