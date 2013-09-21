/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package fajar;

import java.io.*;

/**
 *
 * @author EQUIPO JOSE
 */
public class Fajar {

   public static int getsum(int n) {
   return n == 0 ? 0 : n % 10 + getsum(n/10);
}

    public static void main(String[] args) {
        for (int i=0; i <=2001; i++) {
        if(getsum(i)==2001-i){
            System.out.println("El año es "+ i );
            
        }
        }

    }
}
