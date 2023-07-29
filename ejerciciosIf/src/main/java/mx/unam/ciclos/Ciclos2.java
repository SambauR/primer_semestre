package mx.unam.ciclos;

public class Ciclos2 {
    public static void main(String[] args) {
        int contador = 3;
        while(contador > 0){
            System.out.println("Hola mundo, contador = " 
                    + contador);
            contador -= 1;
        }
        System.out.println("Aquí terminó el ciclo");
    }
}
