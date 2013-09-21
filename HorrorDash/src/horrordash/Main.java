/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package horrordash;

import java.io.*;

/**
 *
 * @author EQUIPO JOSE
 */
public class Main {
    
    public static void main(String[] args) throws IOException {
       // BufferedReader br = new BufferedReader(new FileReader(new File("in.txt")));
        
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        
        int N = Integer.parseInt(br.readLine());
        
        int j=1;
        while(N-->0){
            
            String datos[]=br.readLine().split("[ ]+");
            int mayor=0;
            for(int i =0;i<datos.length;i++){
                if (Integer.parseInt(datos[i])>mayor){
                    
                    mayor=Integer.parseInt(datos[i]);
                }
            }
                System.out.println("Case "+ j+": "+mayor);
            
           j++; 
        }
        
    }
    
}
