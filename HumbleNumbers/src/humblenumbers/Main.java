/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package humblenumbers;

import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author EQUIPO JOSE
 */
public class Main {
    static Integer [] prime_factors ={2,3,5,7};
    
    static boolean isPrime(int n)
    {
        if(n<=1) return false;
        if(n==2) return true;
        if(n%2==0) return false;
        int m = (int)Math.round(Math.sqrt(n));

        for(int i=3; i <= m; i+=2)
            if(n%i==0)
                return false;
        return true;
    }
    
    static boolean isHumble (int n ){
        for (int i =2; i<= n ; i++){         
            if (isPrime(i) && isFactor(n,i) && !contenido(i)){
                return false; 
            }
        }
        return true; 
    }

    static boolean isFactor(int n,int i )
    {
      //return Arrays.asList(prime_factors).contains(n);
        
        return n%i==0;
    }
    
    static boolean contenido (int j ){
        return Arrays.asList(prime_factors).contains(j);
    }
    public static void main(String[] args) {

  
             ArrayList<Integer> lista= new ArrayList<Integer>(); 
            
             for (int j=0;j<2000000000;j++){
                 if (isHumble(j)){
                     lista.add(j);
                 }
             }
        
    }
    
}
