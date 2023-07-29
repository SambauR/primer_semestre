
package break_continue;
public class EjemploContinue {
    public static void main(String[] args) {
        int cuenta = 0;
      while (cuenta <= 10) {
             cuenta++;
         if (cuenta == 5) {
            // omite el resto del código en el ciclo si cuenta es 5
            continue;
         }        
         System.out.printf("%d ", cuenta);
      }
      System.out.printf("%nSe uso continue para omitir imprimir 5%n");
    }   
}
