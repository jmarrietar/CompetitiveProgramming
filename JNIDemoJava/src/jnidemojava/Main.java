/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package jnidemojava;

/**
 *
 * @author EQUIPO JOSE
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         new Main().nativePrint();
  
    }

   private native void nativePrint();
}
