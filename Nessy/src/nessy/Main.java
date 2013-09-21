/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package nessy;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author EQUIPO JOSE
 */
public class Main {
 
    
    public static void main(String[] args) throws IOException {
          //BufferedReader br= new BufferedReader( new FileReader(new File("in.txt")));
       
          BufferedReader br= new BufferedReader (new InputStreamReader(System.in));
          
         int N=Integer.parseInt(br.readLine());
          while(N-->0){
              
           String datos[] = br.readLine().split("[ ]+");
           int n = Integer.parseInt(datos[0]);
           int m = Integer.parseInt(datos[1]);
              
            int result= ((int)(n/3))*((int)m/3);
            System.out.println(result);
          }
          
    }
}
