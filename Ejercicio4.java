
public class Ejercicio4 {
   public static void main(String[] args) {
      System.out.println("El número de ejercicios entregados es de: " + ejerciciosE(5));
      System.out.println("La media de los ejercicios entregados por el Alumno es de: " + mediaEjercicios(5));
      System.out.println("El número de alumnos que entregaron todo fue de: " + numeroAlumnosEntregaronTodo());
      System.out.println("Los estudiantes que presentaron este ejercicio fueron: " + estudiantesEntregaron(5));
      System.out.println("La calidicación promedio de los estudiantes que etregaron esta actividad fue de: " + mediaEstudiantesEjercicio(5));
      System.out.println("La calificación más alta obtenida por el estudiante fue de: " + notaMasAlta(5));
      System.out.println("La calificación más baja obtenida por el estudiante fue de: " + notaMasBaja(5));
   }
   public static int ejerciciosE(int numero) {
      int matriz[][] = new int[10][10];
      int alumno = 0; 
      int ejercicio = 0;
      int contador = 0;

      for (alumno = 0; ejercicio <= 9; alumno++) {
         for (ejercicio = 0; ejercicio <= 9; ejercicio++) {
            matriz[alumno][ejercicio] = (int) (Math.random() * 10 - 1);
         }
      }
      for (ejercicio = 0; ejercicio <= 9; ejercicio++) {

         if (matriz[numero][ejercicio] != - 1) {
            contador = contador + 1;
         }
      }

      return contador;
   }

   public static float mediaEjercicios(int numero) {
      int matriz[][] = new int[10][10];
      int estudiante = 0;
      int actividad = 0;
      int calificacion = 0;
      float media;

      for (estudiante = 0; estudiante <= 9; estudiante++) {
         for (actividad = 0; actividad <= 9; actividad++) {
            matriz[estudiante][actividad] = (int) (Math.random() * 10 - 1);
         }
      }

      for (actividad = 0; actividad <= 9; actividad++) {

         if (matriz[numero][actividad] != -1) {
            calificacion = calificacion + matriz[numero][actividad];
         } else {
            System.out.printf("No entrego todos los ejercicios, su promedio es 0%n");
            break;
         }
      }

      media = (float) (calificacion / 10.0);

      return media;
   }

   public static int numeroAlumnosEntregaronTodo() {
      int matriz[][] = new int[10][10];
      int estudiante = 0;
      int actividad = 0;
      int resultado = 0;
      int calificacion = 0;
      int contador = 0;
      int contador2 = 0;
      float media = 0;

      for (estudiante = 0; estudiante <= 9; estudiante++) {
         for (actividad = 0; actividad <= 9; actividad++) {
            matriz[estudiante][actividad] = (int) (Math.random() * 10 - 1);
         }
      }

      for (estudiante = 0; estudiante <= 9; estudiante++) {
         for (actividad = 0; actividad <= 9; actividad++) {
            if (matriz[estudiante][actividad] != -1) {
               calificacion = calificacion + matriz[estudiante][actividad];
            } else {
               continue;
            }
         }
         media = (float) (calificacion / 10.0);
         if (media >= 3.5) {
            contador2 = contador2 + 1;
         }
         contador = contador + 1;
      }
      return contador2;
   }

   public static int estudiantesEntregaron(int numero) {
      int matriz[][] = new int[10][10];
      int estudiante = 0;
      int actividad = 0;
      int contador = 0;

      for (estudiante = 0; estudiante <= 9; estudiante++) {
         for (actividad = 0; actividad <= 9; actividad++) {
            matriz[estudiante][actividad] = (int) (Math.random() * 10 - 1);
         }
      }

      for (estudiante = 0; estudiante <= 9; estudiante++) {
         if (matriz[estudiante][numero] != -1) {
            contador = contador + 1;
         }
      }

      return contador;
   }

   public static float mediaEstudiantesEjercicio(int numero) {
      int matriz[][] = new int[10][10];
      int estudiante = 0;
      int actividad = 0;
      int calificacion = 0;
      int contador = 0;
      float media = 0;

      for (estudiante = 0; estudiante <= 9; estudiante++) {
         for (actividad = 0; actividad <= 9; actividad++) {
            matriz[estudiante][actividad] = (int) (Math.random() * 10 - 1);
         }
      }

      for (estudiante = 0; estudiante <= 9; estudiante++) {
         if (matriz[estudiante][numero] != -1) {
            calificacion = calificacion + matriz[estudiante][numero];
            contador = contador + 1;
         }

      }

      media = calificacion / contador;

      return media;
   }
public static float notaMasAlta(int numero) {
      int matriz[][] = new int[10][10];
      int estudiante = 0;
      int actividad = 0;
      int nota = 0;
      int calMasAlta = Integer.MIN_VALUE;

      for (estudiante = 0; estudiante <= 9; estudiante++) {
         for (actividad = 0; actividad <= 9; actividad++) {
            matriz[estudiante][actividad] = (int) (Math.random() * 10 - 1);
         }
      }

      for (estudiante = 0; estudiante <= 9; estudiante++) {
         if (matriz[estudiante][numero] > calMasAlta) {
            calMasAlta = matriz[estudiante][numero];
         }
      }
      return calMasAlta;
   }

   public static float notaMasBaja(int numero) {
      int matriz[][] = new int[10][10];
      int estudiante = 0;
      int actividad = 0;
      int calMasBaja = Integer.MAX_VALUE;

      for (estudiante = 0; estudiante <= 9; estudiante++) {
         for (actividad = 0; actividad <= 9; actividad++) {
            matriz[estudiante][actividad] = (int) (Math.random() * 10 - 1);
         }
      }

      for (estudiante = 0; estudiante <= 1; estudiante++) {
         if (matriz[estudiante][numero] < calMasBaja) {
            calMasBaja = matriz[estudiante][numero];
         }
      }

      return calMasBaja;
   }
}