public class Ejercicio3 {

    public static void main(String[] args) {
        int arregloA[] = {1, 5, 6, 7, 8, 10};
        int arregloB[] = {2, 4, 9};
        int arregloC[] = new int[arregloA.length + arregloB.length];
        int aux = 0;

        System.out.println("Los arreglos originales son: ");
        //mostrando A
        System.out.println("- Arreglo A: ");
        for (int contador = 0; contador < arregloA.length; contador++) {
            System.out.print(arregloA[contador] + ", ");
        }
        //mostrando B
        System.out.println("\n- Arreglo B: ");
        for (int contador = 0; contador < arregloB.length; contador++) {
            System.out.print(arregloB[contador] + ", ");
        }
        //mostrando C 
        System.out.println("\n- Arreglo C: ");
        aux = 0;
        for (int i = 0; i < arregloA.length; i++) {
            arregloC[aux] = arregloA[i];
            aux++;
        }
        for (int i = 0; i < arregloB.length; i++) {
            arregloC[aux] = arregloB[i];
            aux++;
        }
        for (int contador = 0; contador < arregloC.length; contador++) {
            System.out.print(arregloC[contador] + ", ");
        }
        //ordenar arreglo C
        System.out.println("\n- El arreglo C acomodado quedó: ");
        for (int contador = 0; contador < arregloC.length - 1; contador++) {
            for (int contador2 = 0; contador2 < arregloC.length - 1; contador2++) {
                if (arregloC[contador2] > arregloC[contador2 + 1]) {
                    aux = arregloC[contador2];
                    arregloC[contador2] = arregloC[contador2 + 1];
                    arregloC[contador2 + 1] = aux;
                }
            }
        }
        //Monstrando el arreglo C
        for (int contador = 0; contador < arregloC.length; contador++) {
            System.out.print(arregloC[contador] + ", ");
        }
        //Arreglo A nuevo 
        System.out.println("\n- El arreglo A quedó: ");
        aux = 0;
        for (int i = 0; i < arregloA.length; i++) {
            arregloA[i] = arregloC[aux];
            aux++;
        }
        for (int contador = 0; contador < arregloA.length; contador++) {
            System.out.print(arregloA[contador] + ", ");
        }
        //Arreglo B nuevo
        for (int i = 0; i < arregloB.length; i++) {
            arregloB[i] = arregloC[aux];
            aux++;
        }
        System.out.println("\n- El arreglo B quedó: ");
        for (int contador = 0; contador < arregloB.length; contador++) {
            System.out.print(arregloB[contador] + ", ");
        }
    }
}
