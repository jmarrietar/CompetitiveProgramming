/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package wordindex;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;


/**
 *
 * @author EQUIPO JOSE
 */
public class Main {
   

    
    public static void main(String[] args) throws FileNotFoundException, IOException {
       
    String[] letras = {"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"}; 
    
      
    /*No me da el Total de NUMERO DE PALABRAS*/ 
    
  ArrayList<String> list = new ArrayList<String>(); 
    ArrayList<String> list2 = new ArrayList<String>(); 
   Map testTreeMap = new TreeMap();
     TreeSet ts = new TreeSet(); 
 
        int count=0; 
        
        for (int i =0; i<letras.length;i++){
            /*
                         System.out.println(letras[i]); 
                         
                           * */
            
          //  list.add(letras[i]);
            
              //  count++; 
        ts.add(letras[i]);
            for (int j=0; j<letras.length;j++){
                if (i<j){
                    /*
                    System.out.println(letras[i]+letras[j]);
                    count++; 
                    * */
              ts.add(letras[i]+letras[j]);
                }
                 
                
                for (int k=0;k<letras.length;k++){
                    if (i<j && j< k){
                        /*
            
                     System.out.println(letras[i]+letras[j]+letras[k]);
                    
                     *  */
                 //       list.add(letras[i]+letras[j]+letras[k]);
                        //    count++; 
                  ts.add(letras[i]+letras[j]+letras[k]);
                    }
                    for (int l=0;l<letras.length;l++){
                         if (i<j && j< k && k<l){
                             /*
                             System.out.println(letras[i]+letras[j]+letras[k]+letras[l]);
                          
                             * */ 
                       //        list.add(letras[i]+letras[j]+letras[k]+letras[l]);
                             //    count++; 
                     ts.add(letras[i]+letras[j]+letras[k]+letras[l]);
                         }
                         for (int m=0;m<letras.length;m++){
                              if (i<j && j< k && k<l && l<m){
                                  /*
                              System.out.println(letras[i]+letras[j]+letras[k]+letras[l]+letras[m]);
                        
                              * */ 
                            //      list.add(letras[i]+letras[j]+letras[k]+letras[l]+letras[m]);
                                //      count++; 
                     ts.add(letras[i]+letras[j]+letras[k]+letras[l]+letras[m]);
                         }
                        
                        
                    }
                }
                
                
            }
            
        }
        
        
    }
        
      Iterator itr = ts.iterator();
   
   
    while(itr.hasNext()){
    list.add(itr.next().toString());
     
        
    }
    int count2 =1;
  for (int a =1; a<=5 ;a++){
    for (int b=0;b<list.size();b++){
        if (list.get(b).toString().length()==a){
     testTreeMap.put(list.get(b).toString(), count2);
        count2++;
        
    }
    }
       
  }
  
  
  
 // BufferedReader br = new BufferedReader (new FileReader(new File("in.txt"))); 
 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

  while (br.ready()){
      String palabra=br.readLine();
      if (testTreeMap.containsKey(palabra)){
          //System.out.println(testTreeMap.get(br.readLine().toString().trim()));
    
         System.out.println( testTreeMap.get(palabra));
      }else {
          System.out.println("0");
      }
      
  }


                         
}
}
