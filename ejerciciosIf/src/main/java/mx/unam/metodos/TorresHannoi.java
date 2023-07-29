package mx.unam.metodos;

public class TorresHannoi {

    public static void main(String[] args) {
        System.out.println("   Torres de Hannoi: ");
        hanoiRec(3,'A','B','C');
        
    }

    public static void hanoiRec(int numDisc, char torreA,
            char torreB, char torreC) {
        if(numDisc > 0)//llamada recursiva
        {
        //lamada recursiva
        hanoiRec(numDisc - 1, torreA, torreC, torreB);
        //caso base
        System.out.println("muevo de: "+ torreA+ " to "+torreC);
        //llamada recursiva
        hanoiRec(numDisc - 1, torreB, torreA, torreC);
           
        }
    }
}
