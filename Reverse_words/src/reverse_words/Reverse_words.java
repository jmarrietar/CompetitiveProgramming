/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package reverse_words;

import java.io.BufferedReader;
import java.io.*;
import java.util.ArrayList;

/**
 *
 * @author Jose
 */
public class Reverse_words {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException, IOException {
       
    //    BufferedReader br= new BufferedReader (new InputStreamReader(System.in));
        BufferedReader br = new BufferedReader (new FileReader("B-large-practice.in"));
        
        File file = new File("/users/Jose/Documents/NetBeansProjects/Reverse_words/filename.txt");
        
        if (!file.exists()) {
				file.createNewFile();
			}
 
	FileWriter fw = new FileWriter(file.getAbsoluteFile());
	BufferedWriter bw = new BufferedWriter(fw);
                        
                        
        int  N= Integer.parseInt(br.readLine());
        int t=1;
        while(N-->0){
        String[]palabras = br.readLine().split("[ ]+");
        StringBuilder sb= new StringBuilder();
        
       // ArrayList <String> al = new ArrayList<String>();
        
       for(int i=palabras.length-1;i>=0;i--){
          //  System.out.print(palabras[i] +" ");
           sb.append(palabras[i]+" ");
            
       } 
       sb.append("\n");
       
       bw.write("Case #" + t+ ": "+ sb);
	bw.newLine();		
                        
     //  System.out.print("Case #" + t+ ": "+ sb);
     
       t++; 
      }
        bw.close();
        
    }
}
