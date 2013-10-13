/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package raythroughglasses;

import java.io.*;
import java.math.BigInteger;
import java.util.ArrayList;

/**
 *
 * @author EQUIPO JOSE
 */
public class RayThroughGlasses {
/*
   public static BigInteger FibRecursive (BigInteger n ){
       
       BigInteger Dos = new BigInteger("2");
       BigInteger Uno = new BigInteger("1");
       if (n.equals(BigInteger.ONE)){
           return Dos; 
       }
       if (n.equals(BigInteger.ZERO)) {
           return Uno; 
       }
       return FibRecursive(n.subtract(Dos)).add(FibRecursive(n.subtract(Uno))); 
   }
           
    */
    public static void main(String[] args) throws FileNotFoundException {
       
        ArrayList <BigInteger> Fib = new ArrayList<BigInteger>(); 
        
        Fib.add( new BigInteger("1"));
        Fib.add( new BigInteger("2"));
    
        for (int i =2; i<=1000;i++){
           
           Fib.add(Fib.get(i-1).add(Fib.get(i-2)));
        }
      
        BufferedReader br = new BufferedReader (new FileReader ("in.txt"));
      //  BufferedReader br = new BufferedReader (new InputStreamReader (System.in)); 
        while (br.ready()){
            int N = Integer.parseInt(br.readLine()); 
                System.out.println(Fib.get(N)); 
            
        }
    
        
    }
}
