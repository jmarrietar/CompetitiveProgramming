/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package prueba2;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;

/**
 *
 * @author EQUIPO JOSE
 */
public class Prueba2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Map<String, Integer> occurrences = new HashMap<>();
        String[] splitWords = {"House", "House", "House", "Dog", "Dog", "Dog", "Dog"};
        

   /*Llenar un hasmap 
    * 
        for (String word : splitWords) {
            Integer oldCount = occurrences.get(word);
            if (oldCount == null) {
                oldCount = 0;
            }
            occurrences.put(word, oldCount + 1);
        }
        
 
*/
        
        
      //  System.out.println(occurrences.keySet());
        
        /* Pasar Valores de Hasmap a arrays.
        Object[] valores = occurrences.values().toArray();        
        Object[] nombres = occurrences.keySet().toArray();
        * 
        * /

        /*
         for(int i=0;i<nombres.length;i++){
           
         System.out.print(nombres[i]);
         System.out.print(" ");
         System.out.println(valores[i]);
         }
       
         */
        //TreeMap treeMap= new TreeMap(occurrences); Llenar un Treemap con un Hasmap
        
        /*
      for (Object str : treeMap.values()) {
     System.out.println(str);   
     
}
      
      */
      TreeMap<String, Integer> tm = new TreeMap<>();
      
      for (String word : splitWords) {
          
            Integer oldCount = tm.get(word);
            if (oldCount == null) {
                oldCount = 0;
            }
           tm.put(word, oldCount + 1);
        }
        
      Object[] valores = tm.values().toArray();        
        Object[] nombres = tm.keySet().toArray();
    
        for (int i =0;i<tm.size();i++){
            
             System.out.print(nombres[i]);
             System.out.print(" ");
            System.out.println(valores[i]);
           
        }
       
        
    }
}
