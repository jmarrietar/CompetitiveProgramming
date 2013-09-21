/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package trianglewave;

import java.io.*;

/**
 *
 * @author EQUIPO JOSE
 */
public class Main {

    public static void wave1(int n) {
 StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
         //  System.out.print(n);
            
    //    System.out.printf("%d",n);
            
          
            sb.append(n);
          
        }
       System.out.println(sb);        


    }

    public static void crearOla(int frecuencia,int amplitud){
          
        for (int k=0;k<frecuencia;k++){
     
      
         for (int i = 0; i <= amplitud; i++) {

         wave1(i);
         //System.out.printf("%s\n", " ");
       //   System.out.printf("%s\n", " ");  // Hace Salto de Linea
         }
    


        for (int j= amplitud-1  ; j > 0; j--) {

            wave1(j);
         //   System.out.printf("%s\n", " ");

        }



    }
        
    }
    

    public static void main(String[] args) throws FileNotFoundException, IOException {

        
        //crearOla(2,3);
        
   BufferedReader br= new BufferedReader(new FileReader(new File("in.txt")));
        
    // BufferedReader br=new BufferedReader (new InputStreamReader( System.in));
     
       
        int N=Integer.parseInt(br.readLine());
        
        while(N-->0){
            String space= br.readLine();
            int amplitud= Integer.parseInt(br.readLine());
            int frecuencia= Integer.parseInt(br.readLine());
            
            crearOla(frecuencia,amplitud);
            
            
        }
        
    }
}
