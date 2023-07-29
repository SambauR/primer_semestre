
package mx.unam.cyp.dowhile;

public class EjemplosArreglos {
    public static void main(String[] args) {
        
        int [] arreglo = new int[5];
        float [] arregloFloats = new float[5];
        boolean [] arregloBoolean = new boolean[5];
        String[]arregloCadena = new String[5];
        
        System.out.println("primer elemento: "
                + arreglo[0]);
        
        System.out.println("primer elemento: "
        + arregloFloats[0]);
        
        System.out.println("primer elemento : "
        + arregloBoolean[0]);
        
        System.out.println("primer elemento: "
        + arregloCadena[0]);
        
         for(int contador = 0; contador < arregloCadena.length; contador ++){
             arregloCadena[contador] = "contador = " + contador;
        }
        
        for(int contador = 0; contador < arregloCadena.length; contador ++){
            System.out.println("arreglo cadena["+ contador
                    +"] = " + arregloCadena[contador]);
        }
        
        for(String item : arregloCadena){
            System.out.println(item);
        }
    }
}
