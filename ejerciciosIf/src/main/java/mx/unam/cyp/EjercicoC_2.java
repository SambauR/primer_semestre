
package mx.unam.cyp;

import javax.swing.JOptionPane;

public class EjercicoC_2 {
    public static void main(String[] args) {
        int hora;
                
        hora = Integer.parseInt(
        JOptionPane.showInputDialog(
        "introduce una hora"));
        
        JOptionPane.showMessageDialog(null,
                "La hora es " + (hora %12));
    }
}
