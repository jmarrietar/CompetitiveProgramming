/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package factorialfrecuencies;

import java.io.BufferedReader;
import java.io.*;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.math.BigInteger;

/**
 *
 * @author EQUIPO JOSE
 */
public class Main {

    public static BigInteger obtenerFactorial(int n) {

        if (n <= 1) {
            return (new BigInteger("1"));
        } else {
            BigInteger fac = new BigInteger(String.valueOf(n));
            return (fac.multiply(obtenerFactorial(n - 1)));
        }

    }


   
    public static void contador(int n,int []ContDigi ){
        
        if(0==n){
            ContDigi[0]=ContDigi[0]+1;
        }
        if(1==n){
            ContDigi[1]+=1;
        }
        if(2==n){
            ContDigi[2]+=1;
        }
        if(3==n){
            ContDigi[3]+=1;
        }
        if(4==n){
            ContDigi[4]+=1;
        }
        if(5==n){
            ContDigi[5]+=1;
        }
        if(6==n){
            ContDigi[6]+=1;
        }
        if(7==n){
            ContDigi[7]+=1;
        }
        if(8==n){
            ContDigi[8]+=1;
        }
        if(9==n){
            ContDigi[9]+=1;
        }
        
        
    }
    
    
        public static void Descomponedor(BigInteger n,int []ContDigi){
        
        while (n.compareTo(new BigInteger("0"))>0 ){
            
            /*    Como Normalmente se hace 
            int p= n%10;
            sum=sum +p;
            n=n/10;
           */
            
            // Haciendolo con BigNumbers
            BigInteger p=(n.mod(new BigInteger("10")));
            
           contador(p.intValue(),ContDigi);
        
           n= n.divide(new BigInteger("10"));
         
            
        }
        
         
        
    }
    
    
    
    public static void main(String[] args) throws  IOException {
        
      
         // BufferedReader br = new BufferedReader (new FileReader(new File("in.txt")));
          BufferedReader br= new BufferedReader (new InputStreamReader(System.in));
          
          int N=Integer.parseInt(br.readLine());
          
           while(N !=0){
          
   int [] ContDigi={0,0,0,0,0,0,0,0,0,0};
   
        Descomponedor(obtenerFactorial(N),ContDigi);
   
       System.out.println(N+"! " +"--" );
       System.out.println("(0) "+ContDigi[0]+" (1) "+ ContDigi[1]+" (2) "+ ContDigi[2]+" (3) "+ ContDigi[3]+ " (4) "+ ContDigi[4]);
       System.out.println("(5) "+ContDigi[5]+" (6) "+ ContDigi[6]+" (7) "+ ContDigi[7]+" (8) "+ ContDigi[8]+ " (9) "+ ContDigi[9]);
         
         
         
         N = Integer.parseInt(br.readLine());
           }
           
           System.exit(0);
    }
}
