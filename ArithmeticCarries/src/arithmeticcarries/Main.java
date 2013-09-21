/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package arithmeticcarries;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/**
 *
 * @author Alfonso
 */
public class Main {
    
    
     public static void main(String[] args) throws FileNotFoundException, IOException {
 
               
//  BufferedReader br= new BufferedReader (new FileReader("in.txt"));
  
 
BufferedReader br= new BufferedReader (new InputStreamReader(System.in));


        // String[] numeros1={"5","5","5"};
    
         String[] completo = br.readLine().split("[ ]+");
         
         
        String nombre1=completo[0];
        String nombre2=completo[1];
          
        
                              
          while (!nombre1.equals("0") || !nombre2.equals("0")){
        String[] numeros1 = nombre1.split("(?!^)");
        String[] numeros2 = nombre2.split("(?!^)");
     
                       
                              
          //termINAR LAS FORMAS DE INVERTIR EL MENOR EN LONGITUD
        
         
         if(numeros1.length>numeros2.length){
             
         String [] aux=numeros1.clone();
         
         numeros1=numeros2.clone();
         
         numeros2=aux.clone();
         
         }
        
         
         
         StringBuilder str = new StringBuilder();
         
         //llenar de ceros
      for(int b=0;b<numeros2.length-numeros1.length;b++){
          str.append("0");
      }
         
         for (int j=0;j<numeros1.length;j++){
         str.append(numeros1[j]);
         }
         
       
         
         
        // for(int a=0;a<=numeros2.length-numeros1.length;a++){
              // str.insert(0, "0"); 
           // str.insert(1, "0");
         
               // System.out.println(str.length());
               
         //}
        
  
         
    String[]numeros= new String[numeros2.length];
    
    
    for(int l=0;l<str.length();l++){
        numeros[l]=String.valueOf(str.charAt(l));
    }
         
    /*

         for(int h=0;h<numeros.length;h++){
             System.out.println(numeros[h]);
         }

    */
    
    
       boolean  carrie = false;
         int carries=0; 
         //Mirar cual de los dos es el menor y ese sirve para el for
         for (int i=numeros2.length-1;i>=0;i--){
             
         int    primer=Integer.parseInt(numeros[i]);
         int    segundo=Integer.parseInt(numeros2[i]); 
         
             //De aqui 
         
       //  System.out.println("Primer "+primer+"segundo "+segundo);
         if (carrie==false){
             
         
             if( primer+segundo>=10 ){
                 carries++;
               
                 carrie=true;
             }  
         } else {
             
            if( primer+segundo+1>=10 ){
                 carries++;
               
                 carrie=true;
             }else{ carrie=false;}
            
            
             
         }
          
             
             
         }
         
             
       
         /*
         System.out.println(carries);
         for(int k=0;k<str.length();k++){
             System.out.println(str.charAt(k)); 
         }
        */
         
         
  
         if(carries==0){
              System.out.println("No carry operation.");
         }
         
               
         else if (carries==1){
             System.out.println("1 carry operation.");
         } else{
        
         System.out.println(carries+ " carry operations.");
         
        
      }
          completo = br.readLine().split("[ ]+");
    nombre1=completo[0];
       nombre2=completo[1];
        
     }
     }
        
    }