/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication57;

import java.io.*;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.*;

/**
 *
 * @author EQUIPO JOSE
 */
public class Main {
    
    public static double pagar (ArrayList<Integer> lista,int N){
        int total = 0;
         double cuota=0;
          double pagar=0; 
          
         for (int i =0; i < N ;i++){
                    total = total+lista.get(i);
                }
        
          cuota= (total/N); 
          
       //  double  pennies = total%N; 
         
//cuota= cuota+ total%N; 
             for (int j =0; j<N;j++){
                    if (lista.get(j)<cuota){
                        pagar= pagar + (cuota -(lista.get(j)) ); 
                    }
                   // System.out.println(pagar);
                }
          //   System.out.println(pagar);
       // return roundDown2(pagar);    //aqui
             
             pagar=pagar;
             
             return pagar;
    }
    
    public static double roundDown2(double d) {
    return (long) (d * 1e2) / 1e2;
}
    
      public static void main(String[] args) throws IOException {
          
       BufferedReader br = new BufferedReader(new FileReader("in.txt"));
    //    BufferedReader br = new BufferedReader (new InputStreamReader (System.in)); 
          
          
   

          int N=Integer.parseInt(br.readLine()); 
         
          while (N!=0){
          ArrayList <Integer> lista = new ArrayList <Integer>(); 
          for (int k=0; k<N ; k++){
             // lista.add(Integer.parseInt(Double.parseDouble(br.readLine())*100));
              
              lista.add((int)Double.parseDouble(br.readLine())*100);
          }
         
  
             double pago=   pagar(lista,N);
  
             System.out.println(pago);
             
  DecimalFormat df = new DecimalFormat ("#.00"); 
    String string= df.format(pago);
System.out.println("$"+string.replace(",", "."));

          
N=Integer.parseInt(br.readLine()); 

      }
      }
}
