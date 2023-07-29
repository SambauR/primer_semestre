
package mx.unam.claseTemprana;

import javax.swing.JOptionPane;

public class EjercicioB {
    public static void main(String[] args) {
        int numero;
        String salida = " ";
        
        numero = Integer.parseInt(
        JOptionPane.showInputDialog(
        "Introduce un número: "));
        
        salida = (numero % 3 == 0 && numero > 0) ? "El número es múltiplo" :
                "El número no es múltiplo";
        JOptionPane.showMessageDialog(null, salida);
        
    }
}
