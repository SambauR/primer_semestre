
package mx.unam.ciclos;

public class Ciclos1 {
    public static void main(String[] args) {
        int contador = 0;
        int brinco = 10;
        while(contador < brinco){
            System.out.println("Hola mundo, contador = " 
                    + contador);
            contador = contador + 1;
        }
        System.out.println("Aquí terminó el ciclo");
    }
}
