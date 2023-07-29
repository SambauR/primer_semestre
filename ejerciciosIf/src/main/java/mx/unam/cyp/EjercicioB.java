
package mx.unam.cyp;

import javax.swing.JOptionPane;

public class EjercicioB {
    public static void main(String[] args) {
        
        int entero1, entero2;
        
        entero1 = Integer.parseInt(
        JOptionPane.showInputDialog(
        "Introduce un número entero: "));
        
        entero2 = Integer.parseInt(
        JOptionPane.showInputDialog(
        "Introduce otro número entero: "));
        
        
        if(entero1 > entero2)
            System.out.println("El mayor es el entero1 "); 
        
        if(entero2 > entero1)
            System.out.println("El mayor es el entero 2 ");
        
        if(entero2 == entero1)
            System.out.println("Ambos son iguales");
    }
}
