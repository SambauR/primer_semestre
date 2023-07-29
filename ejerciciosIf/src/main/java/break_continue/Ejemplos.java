
package break_continue;

public class Ejemplos {
    public static void main(String[] args) {
      int cuenta = 1;

      while (cuenta <= 10) {
         if (cuenta == 5) {
            break; // termina el ciclo si cuenta es 5
         }
         System.out.printf("%d ", cuenta);
         cuenta++;
      }

      System.out.printf("%nSalio del ciclo en cuenta =  %d %n", cuenta);
}
}