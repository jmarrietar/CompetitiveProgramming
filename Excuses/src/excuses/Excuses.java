/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package excuses;

import java.io.*;
import java.util.ArrayList;
import java.util.*;

public class Excuses {

    public static int NumeroPalabras(ArrayList Lista, String[] palabras) {

        int Nexcuse = 0;

        for (int i = 0; i < Lista.size(); i++) {
            for (int j = 0; j < palabras.length; j++) {

                if (Lista.get(i).equals(palabras[j])) {

                    Nexcuse++;
                }
            }

        }
        return Nexcuse;
    }

    public static void main(String[] args) throws FileNotFoundException, IOException {

   //   BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        
        
        int t1=1;
    BufferedReader br = new BufferedReader(new FileReader(("in.txt")));
        
        while(br.ready()){

        String[] numeros = br.readLine().split("[ ]+");

        //    String g="Can you believe my dog died after eating my canary... AND MY HOMEWORK?";





        ArrayList Lista = new ArrayList();

        int n = Integer.parseInt(numeros[0]);
        int m = Integer.parseInt(numeros[1]);
        
// Se ponen los Nombres en la Lista. 
        
        for (int i = 0; i < n; i++) {
            Lista.add(br.readLine());
        }

        
        int t = 0;

        int mayor = -1;

       LinkedHashMap<String,Integer> hm= new LinkedHashMap<String,Integer>();
        
        for (int i = 0; i < m; i++) {

            String g = br.readLine();
            
            String g2=g;
            g = g.replaceAll("[^a-zA-Z -]", "");
            String[] palabras = g.toLowerCase().split("[ ]+");

            int escusas = NumeroPalabras(Lista, palabras);

            if (escusas > mayor) {
                mayor = escusas;
            }
            
            hm.put(g2, escusas);
            

          
            
        }

       
        Set set=hm.entrySet();
        Iterator i=set.iterator();
        
        System.out.println("Excuse Set #"+ t1 );
        while(i.hasNext()){
            
            Map.Entry e=(Map.Entry)i.next();
            
           if(mayor==e.getValue()){
                
            System.out.println(e.getKey());
            
         }
        }
        
       System.out.println();
        
        
     t1++;

    }
    }
}
