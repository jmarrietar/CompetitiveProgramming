/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package homeworkchecker;

import java.io.*;

/**
 *
 * @author EQUIPO JOSE
 */
public class Main {

    public static void main(String[] args) throws IOException {

        //BufferedReader br = new BufferedReader(new FileReader(new File("in.txt")));
          BufferedReader br=new BufferedReader(new InputStreamReader(System.in));



        int buenos = 0;
        int termino1;
        int termino2;
        String signo;
        String resultado;
        
    while (br.ready()){
       
        String original = br.readLine();

        String[] signos = original.split("[0-9]+");


        String numeros[] = original.split("[\\-=~+#]+");
        
   
        
        

         termino1 = Integer.parseInt(numeros[0]);
         termino2 = Integer.parseInt(numeros[1]);
        
        resultado = (numeros[2]);
        signo=signos[1];
    
        

         if (signo.equals("+")) {
         int suma=termino1 + termino2;
         if (String.valueOf(suma).equals( resultado)) {
         buenos++;
         }
         }

         if (signo.equals("-")) {
         int resta =termino1 - termino2;
         if (String.valueOf(resta).equals( resultado)) {
         buenos++;
         }


         }

        

    }
    
   System.out.println(buenos);  
        
    }
}
