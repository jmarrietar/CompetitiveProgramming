/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package agesort;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.StringTokenizer;

/**
 *
 * @author EQUIPO JOSE
 */
public class Main {
    
    public static void main(String[] args) throws FileNotFoundException, IOException {
 BufferedReader br= new BufferedReader ( new InputStreamReader(System.in));
  
   // BufferedReader br = new BufferedReader(new FileReader("in.txt"));
        
          int N = Integer.parseInt(br.readLine());
          
        String str =br.readLine();
        
        while ( N !=0){
            
		StringTokenizer st = new StringTokenizer(str);
                ArrayList<Integer> list = new ArrayList<Integer>();
                StringBuffer sb = new StringBuffer("");
		
		while (st.hasMoreElements()) {
		list.add(Integer.parseInt((String)st.nextElement()));
		}
                
               Integer [] bar = list.toArray(new Integer[0]);
                
               Arrays.sort(bar);
               
               for (int i=0;i<N;i++){
        //System.out.print(numero+" "); // invokes Car.toString()
                   if(i>0){
                          sb.append(" ");       
                   }
                   
                     sb.append(bar[i]);
                 
}
                         System.out.println(sb);
                         
                 N = Integer.parseInt(br.readLine());
          
        str =br.readLine();           
                         
        }            
    }
    
}
