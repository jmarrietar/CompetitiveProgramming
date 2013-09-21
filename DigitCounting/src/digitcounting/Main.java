/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package digitcounting;

import java.io.BufferedReader;
import java.io.*;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.math.BigInteger;
public class Main {
    
    public static void numeros (int n,int[] ContDigi){
        String n1="";
      for(int i=1;i<= n;i++){
           n1= n1 + Integer.toString(i);
 }
          
      
      for(int i=0;i<n1.length();i++){
          contador(Integer.parseInt(Character.toString(n1.charAt(i))),ContDigi);
          
      }
      
      
    }
    
    
    
    
    public static void contador(int c,int []ContDigi ){
        
        if(0==c){
            ContDigi[0]=ContDigi[0]+1;
        }
        if(1==c){
            ContDigi[1]+=1;
        }
        if(2==c){
            ContDigi[2]+=1;
        }
        if(3==c){
            ContDigi[3]+=1;
        }
        if(4==c){
            ContDigi[4]+=1;
        }
        if(5==c){
            ContDigi[5]+=1;
        }
        if(6==c){
            ContDigi[6]+=1;
        }
        if(7==c){
            ContDigi[7]+=1;
        }
        if(8==c){
            ContDigi[8]+=1;
        }
        if(9==c){
            ContDigi[9]+=1;
        }
    
    }
    
     
    
    
    
    public static void main(String[] args) throws IOException {
       
        
        
//BufferedReader br = new BufferedReader (new FileReader("in.txt"));
  
 
     BufferedReader br= new BufferedReader (new InputStreamReader(System.in));
        
     int    N=Integer.parseInt(br.readLine());
     
     while (N-->0){
          int [] ContDigi={0,0,0,0,0,0,0,0,0,0};
         
          int num=Integer.parseInt(br.readLine());
        numeros(num,ContDigi) ;
         
         System.out.println(ContDigi[0]+" "+ContDigi[1]+" "+ContDigi[2]+" "+ContDigi[3]+" "+ContDigi[4]+" "+ContDigi[5]+" "+ContDigi[6]+" "+ContDigi[7]+" "+ContDigi[8]+" "+ContDigi[9]);
      
        
     }
        

          
        
    }
    
    
    
    
}
