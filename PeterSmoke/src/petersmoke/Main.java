/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package petersmoke;

import java.io.*;

/**
 *
 * @author EQUIPO JOSE
 */
public class Main {
    
     public static void main(String[] args) throws FileNotFoundException, IOException {
      //   BufferedReader br =  new BufferedReader (new FileReader("in.txt")); 
       BufferedReader br = new BufferedReader (new InputStreamReader(System.in)); 
         
         while (br.ready()){
            String[] datos = br.readLine().split("[ ]+");  
         int cigarros=Integer.parseInt(datos[0]); 
        int numero=Integer.parseInt(datos[1]);
        
         int colillas=0; 
         int total=0; 
           System.out.println(cigarros+(cigarros-1)/(numero-1));
           /*
         while(cigarros-->0) {
             
            colillas++; 
             
             if (colillas%numero==0){
                 cigarros++;
                
             //    System.out.println("se agrego un ciagrrillo");
             }
              
              total++; 
        //     System.out.println("cigarrillo "+cigarros + " colillas " + colillas + " total "+total );
            
         }
         
         System.out.println(total);
         
       */
    }
     }
}
