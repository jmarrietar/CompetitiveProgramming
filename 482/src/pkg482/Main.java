/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg482;

import java.io.*;

/**
 *
 * @author EQUIPO JOSE
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException, IOException {
      
     //   BufferedReader br = new BufferedReader (new FileReader("in.txt")); 
       BufferedReader br = new BufferedReader (new InputStreamReader(System.in)); 
        
        int N = Integer.parseInt(br.readLine()); 
        int salto =0; 
      while(N-->0){
        if (salto>0){
            System.out.println();
        }
    
        br.readLine(); 
                String posiciones[]= br.readLine().split("[ ]+"); 
                String valores [] = br.readLine().split("[ ]+"); 
                
                
              String[]  Asalida= new String[posiciones.length];  
                for (int i = 0; i <posiciones.length; i++){
                     
                    int K = Integer.parseInt(posiciones[i])-1; 
                    Asalida[K]=valores[i]; 
                }
     
                for (int j = 0 ; j<posiciones.length; j++){
                    System.out.println(Asalida[j]);
                }
        salto++; 
      }
    }
}
