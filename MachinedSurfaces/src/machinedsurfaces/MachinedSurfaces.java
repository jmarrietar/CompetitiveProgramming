/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package machinedsurfaces;

import java.io.*;

/**
 *
 * @author EQUIPO JOSE
 */
public class MachinedSurfaces {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException, IOException {
      //BufferedReader br = new BufferedReader (new FileReader("in.txt")); 
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                
        int N = Integer.parseInt(br.readLine());
        String s ; 
        int total; 
        int espacios; 
        int minimo; 
   while (N !=0 ){
       total=0;
       minimo=9999999; 
       for (int i =0; i<N;i++){
           s=br.readLine();
           espacios=s.length() - s.replaceAll(" ", "").length();
           if (espacios<minimo){
               minimo=espacios; 
           }
           total=total+espacios; 
       }
       System.out.println(total-(N*minimo));
       N= Integer.parseInt(br.readLine());
       
   }
        
       
        
    }
}
