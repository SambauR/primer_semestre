package mx.unam.ciclos;

public class Cuadrado {
    public static void main(String[] args) {
        int filas = 0;
        int columnas = 0;
        
        while(filas < 10){
            columnas = 0;
            //columnas
            while(columnas < filas){
                System.out.print("*");
                columnas ++;
            }
            System.out.println("");
            filas ++;
        }
    }
    
}
