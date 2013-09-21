/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package thetrip2;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DecimalFormat;
import java.util.Arrays;



public class Main {
    
     public static int pagar (int[] dinero ,int N){
         Arrays.sort(dinero);
      int sum=0; 
         int average=0; 
         int pennies; 
         int total=0; 
         
            for (int i =0; i < N ;i++){
                   sum =sum+dinero[i];
                }
            
                   average=(sum/N); 
          
             
         pennies =sum%N; 
          
          //     System.out.println("pennies" +pennies + "suma"+ sum);
         for (int j=N-1;j>=0;j--){
             if (pennies>0){
           
             if (dinero[j]>average){
                 total=total + (dinero[j]-(average+1)); 
                 pennies--;
                   //    System.out.println("total : " +total);
                     //   System.out.println("1");
             }
             }
             else if (dinero[j]>average){
                  total=(total + (dinero[j]-average)); 
                 
                // System.out.println("total : " +total);
                      
             }
         }
         
           //System.out.println("pennies final " + pennies);
         return total; 
     }    
     
     
      public static void main(String[] args) throws FileNotFoundException, IOException {
     
   BufferedReader br = new BufferedReader(new FileReader("in.txt"));
//   BufferedReader br = new BufferedReader (new InputStreamReader (System.in)); 
                 
                          int N=Integer.parseInt(br.readLine().replaceAll(" ","")); 
                          
     while (N!=0){
         
          int[] dinero = new int [N]; 
       
          for (int i=0; i<N; i++){
              
              
           String [] datos = br.readLine().replaceAll("\\.", " ").split("[ ]+");

        dinero[i]=Integer.parseInt(datos[0])*100 + Integer.parseInt(datos[1]);
               
   
          }
          
          double d =  pagar(dinero,N) /100.0 ; 

     
      if (d>0.1){
            DecimalFormat df = new DecimalFormat ("#.00"); 
                String string= df.format(d);
                System.out.println("$"+string.replace(",", "."));
         
          }else if (d!=0.0){
          
        System.out.println("$"+d);
              
          } else {
               System.out.println("$"+d+"0");
          }
      
        N=Integer.parseInt(br.readLine());
        
    }
     
     
      } 
    
}
