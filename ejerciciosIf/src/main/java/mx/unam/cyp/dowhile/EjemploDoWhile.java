package mx.unam.cyp.dowhile;

import javax.swing.JOptionPane;

public class EjemploDoWhile {

    public static void main(String[] args) {

        int numero, numeroAleatorio, vidas = 5;
        String seguirJugando;

        do {
            numeroAleatorio = (int) (Math.random() * 100) + 1;
            vidas = 5;                     
            //validar si aun tiene vidas
            while (vidas > 0) {
                numero = Integer.parseInt(
                    JOptionPane.showInputDialog(null, "Introduce un número del 1 al 100",
                            "Adivina el número", JOptionPane.QUESTION_MESSAGE));
                //comprobación del número
                if (numero == numeroAleatorio) {
                    JOptionPane.showMessageDialog(null, "Correcto! El número era: " + numeroAleatorio,
                            "Adivina el número", JOptionPane.WARNING_MESSAGE);
                    break;
                } 
                if(numero < numeroAleatorio) {
                    JOptionPane.showMessageDialog(null, "Es muy chico, uno más grande",
                            "Adivina el número", JOptionPane.ERROR_MESSAGE);
                    vidas--;
                }else {
                    JOptionPane.showMessageDialog(null, "Ya te pasaste",
                            "Adivina el número", JOptionPane.ERROR_MESSAGE);
                    vidas--;
                }                
            }
            if(vidas == 0){
                JOptionPane.showMessageDialog(null, "Perdiste! El número era: " + numeroAleatorio,
                            "Adivina el número", JOptionPane.WARNING_MESSAGE);
            }
            seguirJugando = JOptionPane.showInputDialog(
                    "Quieres seguir jugando? [si/no]");
                                    
        } while (seguirJugando.equalsIgnoreCase("si"));
        
    }
}
