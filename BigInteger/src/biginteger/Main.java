/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package biginteger;
import java.io.BufferedReader;
import java.io.*;
import java.math.BigInteger;
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
    
    public static int suma (BigInteger n){
        
        BigInteger sum=new BigInteger("0");
        
        while (n.compareTo(new BigInteger("0"))>0 ){
            
            /*    Como Normalmente se hace 
            int p= n%10;
            sum=sum +p;
            n=n/10;
           */
            
            // Haciendolo con BigNumbers
            BigInteger p=(n.mod(new BigInteger("10")));
           
         sum= sum.add(p);
           n= n.divide(new BigInteger("10"));
         
            
        }
        
int a = sum.intValue();
        return a;
    }
    
    
    public static void main(String[] args) throws FileNotFoundException, IOException {
        
//System.out.println(obtenerFactorial(100));       
 // System.out.println(suma(obtenerFactorial(100)));
        
    // BufferedReader br = new BufferedReader (new FileReader(new File("in.txt")));
   
    BufferedReader br= new BufferedReader (new InputStreamReader(System.in));
     
   
    int N;
    
    while( br.ready()){
        
         N=Integer.parseInt(br.readLine());
         
       System.out.println(suma(obtenerFactorial(N)));
        
   
    }
    
     System.exit(0);
       
    }
}
