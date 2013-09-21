/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package bafabafa;

/**
 *
 * @author EQUIPO JOSE
 */
import java.io.*;
import java.io.InputStreamReader;

/**
 *
 * @author EQUIPO JOSE
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException, IOException {
        // TODO code application logic here
        
        
       // BufferedReader br= new BufferedReader ( new InputStreamReader(System.in));
  
  BufferedReader br = new BufferedReader(new FileReader("in.txt"));
  int T=Integer.parseInt(br.readLine());
  
 int c =1;
 
  
        while(T-->0){
        
       String[] partes = br.readLine().split("[ ]+");
        
        int N= Integer.parseInt(partes[0]);
        int K= Integer.parseInt(partes[1]);
        int P= Integer.parseInt(partes[2]);
      /*
        if (K>N){
            K=N-K;
        }
       */
        
            while(P-->0){
                
                K++;
                if( K>N){
                    K=1;
                }
                
            }
            
            System.out.println("Case "+c+": "+K);
            c++;
    }
        
    }
}