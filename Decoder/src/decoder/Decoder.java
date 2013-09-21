/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package decoder;
import java.io.DataInputStream;

import java.io.IOException;



/**
 *
 * @author EQUIPO JOSE
 */
public class Decoder {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
      DataInputStream in =new DataInputStream(System.in);
      
     
      int C;
      while((C=in.read()) !=-1){
          
  
          if(C==10){
              System.out.println();
              continue;
          }
         
         
        
          System.out.print((char)(C-7));
          
      }
             
        
    }
}
