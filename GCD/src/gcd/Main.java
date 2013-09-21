/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package gcd;


import java.io.*;
import java.math.BigInteger;

/**
 *
 * @author EQUIPO JOSE
 */
public class Main {
    
    /*
    public static int GCD(int i, int j) {

        int menor = i;
        int mayor = j;

        if (i > j) {
            menor = j;
            mayor = i;
        }
        
        int GCD = 1;
        for (int k = 1; k <=menor; k++) {
            if (mayor % k == 0 && menor % k == 0) {
                GCD = k;
            }
        }
        
      return GCD;
      
    }
   /*
   * 
   */
    
    /*   
    public static int gcdThing(int a,int b){
        BigInteger b1=new BigInteger(""+a);
        BigInteger b2=new BigInteger(""+b);
        
        BigInteger gcd=b1.gcd(b2);
        return gcd.intValue();
    }
    */
    
    public static int egcd(int a, int b) {
    if (a == 0)
        return b;

    while (b != 0) {
        if (a > b)
            a = a - b;
        else
            b = b - a;
    }

    return a;
}
    
    public static void main(String[] args) throws  IOException {
        

     // BufferedReader br = new BufferedReader (new FileReader(new File("in.txt")));
        
        BufferedReader br= new BufferedReader (new InputStreamReader(System.in));
        
        int N = Integer.parseInt(br.readLine());
        
        while(N !=0){
        
            
     int  G=0;

        for(int i=1;i<N;i++){

            for(int j=i+1;j<=N;j++)

                {

                   // G+=GCD(i,j);
                    
                      // G+=gcdThing(i,j);
                    G+=egcd(i,j);
                    }
                }
        System.out.println(G);
        N = Integer.parseInt(br.readLine());
    }
        
    System.exit(0);
    
    }
    
}
