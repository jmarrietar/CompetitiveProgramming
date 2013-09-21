/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package errorcorrection;

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
    

    
    public static void main(String[] args) throws FileNotFoundException, IOException {
       
  //  BufferedReader br = new BufferedReader(new FileReader(new File("in.txt")));
      BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        
        int N = Integer.parseInt(br.readLine()); 
        while (N!=0){
                   char[][] field = new char[N][N];
                    int [] vector1= new int[N];
                     int [] vector2= new int[N];
                       int count; 
                       int posicioni=-1;
                       int posicionj=-1;
                       int imparesj=0; 
                       int imparesi=0; 
        for (int i = 0; i < N; ++i) {
            field[i] = br.readLine().replace(" ", "").toCharArray();
        }
        
        
    
        for (int k=0;k<N;k++){
            count =0;
            for (int M =0;M<N;M++){
                count=count+ Integer.parseInt(String.valueOf(field[k][M]));
            }
            vector1[k]=count;
            if (count%2 !=0){
                imparesi++;
            }
        }
        
         for (int M=0;M<N;M++){
            count =0;
            for (int k =0;k<N;k++){
                count=count+ Integer.parseInt(String.valueOf(field[k][M]));
            }
            vector2[M]=count;
             if (count%2 !=0){
                imparesj++;
            }
        }
        
         
         for (int i =0; i<N;i++){
             
             if (vector1[i]%2 !=0){
                 posicioni=i;
                   break;
             }
           
         }
         
          
         for (int j =0; j<N;j++){
              if (vector2[j]%2 !=0){
                 posicionj=j;
                 break;
             }
         }
         
         if (posicioni==-1 && posicionj==-1){
             System.out.println("OK");
         }else if (posicioni!=-1 && posicionj!=-1 && imparesj==1 && imparesi==1){
              System.out.println("Change bit "+"("+(posicioni+1)+","+(posicionj+1)+")");
         }else {
                     System.out.println("Corrupt");
         }
         
         N= Integer.parseInt(br.readLine());
        }
      
}
}
