
package mx.unam.cyp;

import javax.swing.JOptionPane;

public class EjercicioA {
    
    public static void main(String[] args) {
        
        int calificacion;
        
        JOptionPane.showMessageDialog(null,
                "Introduce tu califiación: ");
        calificacion = Integer.parseInt(JOptionPane.showInputDialog(
                "Introduce tu califiación: "));
        
        if (calificacion > 5)
            System.out.println("Estas aprobado !!!"); 
        
        if (calificacion <= 5)
            System.out.println("Estas frito !!!");
    }
}
