
package mx.unam.cyp.arreglos;
public class SumaMatrices {
    public static void main(String[] args) {
        int [][]matrizA = {{1,2,3},{4,5,7}};
        int [][]matrizB = {{2,5,8},{3,7,9}};
        int [][]matrizC = new int[2][3];
        
        for (int fila = 0; fila < 2; fila++) {
            for (int columna = 0; columna < 3; columna++) {
                matrizC[fila][columna] = 
                        matrizA[fila][columna]+
                        matrizB[fila][columna];
            }
        }
        for (int fila = 0; fila < 2; fila++) {
            for (int columna = 0; columna < 3; columna++) {
                System.out.print(matrizC[fila][columna]+ "  ");
            }
             System.out.println("");
        }
    }
}
