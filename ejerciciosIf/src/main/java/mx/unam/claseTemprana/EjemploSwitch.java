package mx.unam.claseTemprana;

import javax.swing.JOptionPane;

public class EjemploSwitch {

    public static void main(String[] args) {
        int numero, operando1, operando2;

        numero = Integer.parseInt(
                JOptionPane.showInputDialog(
                        "Escoge una opción: \n "
                        + "\n1. SUMA"
                        + "\n2. RESTA"
                        + "\n3. MULTIPLICACIÓN"));

        switch (numero) {
            case 1:
                System.out.println("suma!!!");
                break;
            case 2:
                System.out.println("resta!!!");
                break;
            case 3:
                System.out.println("multiplicación!!!");
                break;
            case 4:
                System.out.println("sin opción!!!");
                break;
            default:
                System.out.println("default!!!");
        }
    }
}
