/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebas;

/**
 *
 * @author EQUIPO JOSE
 */
public class Pruebas {

   public static boolean ispalindrome(StringBuffer sb) {

        String numero = sb.toString();
        String reverse = sb.reverse().toString();
        if (numero.equals(reverse)) {
            return true;
        }

        return false;
    }
   
    public static void main(String[] args) {
       
       
            // StringBuffer sb = new StringBuffer(String.valueOf(i));
             
         System.out.println((long)Math.sqrt(121) );
        
        
     
        
    }
}
