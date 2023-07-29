
package mx.unam.cyp;

import javax.swing.JOptionPane;

public class EjercicioC {
    public static void main(String[] args) {
        
        int hora;
        
        hora = Integer.parseInt(
        JOptionPane.showInputDialog(
        "Introduce la hora: "));
        
        if (hora > 12)
            System.out.println("La hora es: "+ (hora - 12));
        
        if (hora <= 12)
            System.out.println("La hora es: "+ hora);
        
    }
}
