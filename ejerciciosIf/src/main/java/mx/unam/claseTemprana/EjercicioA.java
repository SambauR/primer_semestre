
package mx.unam.claseTemprana;

import javax.swing.JOptionPane;

public class EjercicioA {
    public static void main(String[] args) {
        int numero;
        String salida = " ";
        
        numero = Integer.parseInt(
        JOptionPane.showInputDialog(
        "Introduce un número: "));
        
        salida = (numero % 2 == 0) ? "El número es par" : "El número es impar";
        JOptionPane.showMessageDialog(null, salida);
    }
}
