/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package triangle;

import java.io.*;
import java.math.BigInteger;
/**
 *
 * @author EQUIPO JOSE
 */
public class Main {
    
    public static boolean valid (long a,  long b, long c){
        if (a+b>c && b+c>a && a+c>b){
            
            return true;
        }else {return false;}
              
    }
    
    
    public static void main(String[] args) throws  IOException {
       // BufferedReader br=new BufferedReader(new FileReader(new File("in.txt")));
        BufferedReader br=new BufferedReader (new InputStreamReader(System.in));
        
        int N =Integer.parseInt(br.readLine());
        String tipo;
        int j=1;
        while(N-->0){
         
            String datos[]=br.readLine().split("[ ]+");
   
           long  a=Integer.parseInt(datos[0]);
        long b= Integer.parseInt(datos[1]);
     long c =Integer.parseInt(datos[2]);
   
            
           
            
            if(valid(a,b,c)==true){
                if(a==b && b==c && c==a){
                    
                     tipo="Equilateral";
                }
                else if(a==b || a==c || b==c){
                    
                    tipo="Isosceles";
                }
                else {tipo="Scalene";}
                
                
                
            }else {tipo="Invalid";}
            
            
            
         System.out.println("Case "+j+": "+tipo);   
         j++;               
        }                
    }    
}
