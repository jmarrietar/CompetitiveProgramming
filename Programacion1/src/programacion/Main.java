/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author unalmed
 */
import java.io.*;
import java.util.*;


public class Main {
    
    public static void main(String[] args) throws IOException {
      
       // BufferedReader br = new  BufferedReader(new InputStreamReader(System.in));
        
         BufferedReader br = new  BufferedReader(new FileReader(new File("in.txt")));
       // String line=br.readLine();
        //System.out.println(line);
        
        int N=Integer.parseInt(br.readLine());
        
        /*
        for(int i=0;i<N;i++){        
            
        }
        * */
      int t=1;
        while(N-->0){
            
            int W=Integer.parseInt(br.readLine());
            
            String datos[]=br.readLine().split("[ ]+");
            
            int altos=0;
            int bajos=0;
            for(int i=0;i<W-1;i++){
               
                if(Integer.parseInt(datos[i])<Integer.parseInt(datos[i+1])){
                    altos++;                    
                }
                else if(Integer.parseInt(datos[i])>Integer.parseInt(datos[i+1])){
                
                bajos++;
            }
          }
            System.out.println("Case "+(t++)+  ":"  +" "+ altos+" "+ bajos);
                   
       
    }
    
}
}
