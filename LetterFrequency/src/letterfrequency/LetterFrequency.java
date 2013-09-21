/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package letterfrequency;

import java.io.*;
import java.util.Collections;
import java.util.Map;
import java.util.TreeMap;

public class LetterFrequency {

   
    
    public static void main(String[] args) throws FileNotFoundException, IOException {
        
    //BufferedReader br= new BufferedReader (new FileReader (new File("in.txt")));  
    BufferedReader br= new BufferedReader (new InputStreamReader(System.in)); 
  //    String  s ="Computers account for only 5% of the country's commercial electricity consumption.".toLowerCase();
    
    int N = Integer.parseInt(br.readLine());
    
    while (N-->0){
    String s=br.readLine().toLowerCase();
      
      s = s.replaceAll(" ", "");
      s = s.replaceAll("[^A-Za-z ]", "");
      
      String[] parts = s.split("(?!^)");
      
     TreeMap <String,Integer> treeMap = new TreeMap<String,Integer> ();
       
     
    
    
  for (String word :parts){
      
      Integer oldCount = treeMap.get(word);
      
      if (oldCount == null) {
                oldCount = 0;
            }
      
       treeMap.put(word, oldCount + 1);     
      
  }
   
  
                 int mayor=(Collections.max(treeMap.values()));
                 
            /*     
    for (Map.Entry<String,Integer> data : treeMap.entrySet()) {
        
            if (data.getValue()> mayor){
                mayor=data.getValue();           
                
           }
        
        }
    */
    
    for (Map.Entry<String,Integer> data : treeMap.entrySet()) {
       
            if (data.getValue()== mayor){
               System.out.print(data.getKey());
              
                
           }
     
               
        
        }
    
  System.out.println();
 

    }
    }
    
    
}
