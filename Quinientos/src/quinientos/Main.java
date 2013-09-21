/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package quinientos;
import java.io.*;
import java.math.BigInteger;
import java.util.*;
/**
 *
 * @author EQUIPO JOSE
 */
public class Main {
    
      public static BigInteger obtenerFactorial(int n){
        
        if(n<=1){
            return(new BigInteger("1"));
        }else {
            BigInteger fac= new BigInteger(String.valueOf(n));
            return (fac.multiply(obtenerFactorial(n-1)));
        }
        
        
    }
      
      
     public static void main(String[] args) throws  IOException {
         
       
        // BufferedReader br = new BufferedReader (new FileReader(new File("in.txt")));
          BufferedReader br= new BufferedReader (new InputStreamReader(System.in));
          int N;
    
    while( br.ready()){
        
        
         N=Integer.parseInt(br.readLine());
         System.out.println(N+"!");
         System.out.println(obtenerFactorial(N));
      
   
    }
    
     System.exit(0);
       
     }
}
