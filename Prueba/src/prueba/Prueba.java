/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.  *
 */

package prueba;
import java.io.*;
import java.lang.Object;
import java.util.ArrayList;
import java.util.Arrays;




/**
 *
 * @author EQUIPO JOSE 
 */
public class Prueba {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        
          BufferedReader in =new BufferedReader(new InputStreamReader (System.in));
          
          String string;
          
          while((string=in.readLine()) != null){
             
           
        String[]parts= string.split(" ");
        
parts= string.split("1");
parts= string.split("2");
parts= string.split("3");
       
        ArrayList parts2= new ArrayList(Arrays.asList(parts));
        
     ArrayList list1=new ArrayList();
     list1.add("...");
     
     parts2.removeAll(list1);
        System.out.println(parts2.toArray().length);
        
          }
    }
}
