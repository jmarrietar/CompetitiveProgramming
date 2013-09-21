/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package formula1;

import java.io.*;
import java.util.*;



public class Main {
    
    public static long convertir (int min,int sec,int ms){
        long total=min*60*1000+sec*1000+ms; 
        
        return total; 

}
    
    public static void main(String[] args) throws FileNotFoundException, IOException {
        
        BufferedReader br = new BufferedReader(new FileReader ("in.txt")); 
        //  BufferedReader br = new BufferedReader (new InputStreamReader (System.in)); 
        ArrayList < String> list = new ArrayList<String>(); 
                
         Map<Long,String> map = new TreeMap <Long,String>();  
        while (br.ready()){
                 
       long d=0; 
       
        String[] palabras = br.readLine().split("[ ]+");         
        
        int [] tiempo = new int[4]; 
        tiempo[0]=Integer.parseInt(palabras[2]); 
        tiempo[1]=Integer.parseInt(palabras[4]); 
        tiempo[2]=Integer.parseInt(palabras[6]);
        
        d=convertir(tiempo[0],tiempo[1],tiempo[2]);
    
        map.put(d, palabras[0]);
        
   list.add(palabras[0]);
       
        
    }
        
         for (Map.Entry<Long,String> entry : map.entrySet()){
            System.out.println(entry.getKey()+"/"+entry.getValue());
        }
        
        for (int j =0; j< list.size();j++){
            System.out.println(list.get(j));
        }
    }
    
}
