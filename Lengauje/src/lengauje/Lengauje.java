/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lengauje;

import java.io.*;
import java.util.Map;
import java.util.TreeMap;

/**
 *
 * @author EQUIPO JOSE
 */
public class Lengauje {

    
    
    
    
    public static void main(String[] args) throws IOException {
        
        
//BufferedReader br= new BufferedReader (new FileReader(new File("in.txt")));
  BufferedReader br = new BufferedReader ( new InputStreamReader(System.in));
        
        TreeMap <String,String> tm = new TreeMap <String,String>();
        
         tm.put("HELLO","ENGLISH" );
         tm.put("HOLA", "SPANISH");
         tm.put("HALLO","GERMAN");
         tm.put("BONJOUR","FRENCH");
         tm.put("CIAO","ITALIAN");
         tm.put("ZDRAVSTVUJTE","RUSSIAN");
         
         String s =br.readLine() ;
         boolean encontrado;
         
         int t=1;
     while  (!s.equals("#")){   
         
       encontrado=false;
         
          for (Map.Entry<String,String> data : tm.entrySet()) {
              if(data.getKey().equals(s)){
                  System.out.println("Case "+t+": " +data.getValue());
                  encontrado=true;
              }
          }
          
          if(encontrado==false){
              System.out.println("Case "+t+": " + "UNKNOWN");
          }
          
        s=br.readLine();
            t++;
     }
        
    }
}
