/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package break_continue;

/**
 *
 * @author sam
 */
public class pruebaescritorio {
    public static void main(String[] args) {
         int contador1 = 1, contador2 = 1;
      while(contador1 < 10){
         while(contador2 <=13){
            System.out.println("#");
            contador2 +=4;
            break;
         }
         //continue;
         contador1 +=3;
      }
    }
}
