
package mx.unam.ciclos;

public class TrianguloSerie {
    public static void main(String[] args) {
        int columnas = 0;
        int filas = 0;
        
        while(filas < 10){
            columnas = 0;
            //columnas
            while(columnas < 46){
                
                if(columnas <= filas){
                    System.out.print("*");                
                }else{
                    System.out.print(" ");
                }  
                columnas ++;
                
               if(columnas >= 11 && columnas <= 20){
                if(columnas < 20  ){
                    System.out.print("*"); 
                }else{
                    System.out.print(" ");
                }
                } 
               
               if(columnas >= 21 && columnas <= 30){
                   if(columnas -20 <= filas ){
                       System.out.print(" ");
                   }else {
                       System.out.print("*");
                   }
                }   
                if(columnas >= 31 && columnas <= 40)  { 
                 if(10 <filas){
                    System.out.print("*");
                 }
                else{
                    System.out.print(" ");
                }    
               }
            }
            System.out.println("");
            filas ++;
        }
        
    }
}

