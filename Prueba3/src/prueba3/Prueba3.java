/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package prueba3;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author EQUIPO JOSE
 */
public class Prueba3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException, IOException {
        
       BufferedReader br= new BufferedReader (new FileReader("in.txt"));
  
 
//BufferedReader br= new BufferedReader (new InputStreamReader(System.in));
        
        
     int  numero= Integer.parseInt(br.readLine());
     while(numero!=0){
 String s;
        while (numero >= 10) {
            int suma = 0;
            s = Integer.toString(numero);

            for (int i = 0; i < s.length(); i++) {
                suma += Integer.parseInt(Character.toString(s.charAt(i)));

            }

            numero = suma;
        }

        
    System.out.println(numero);
        numero= Integer.parseInt(br.readLine());
        
    }
    }
}
