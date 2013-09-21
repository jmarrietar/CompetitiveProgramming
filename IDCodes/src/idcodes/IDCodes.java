/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package idcodes;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author EQUIPO JOSE
 */
public class IDCodes {

   public static void swap ( char [] c, int i, int j) {
char t = c[i];
c[i] = c[j];
c[j] = t;
}
public static boolean nextPermutation ( char [] c) {
int n = c. length ;
int k = -1;
for ( int i = n - 2; i >= 0; --i)
if (c[i] < c[i + 1]) {
k = i;
break ;
}
if (k == -1)
return false ;
int l = 0;
for ( int i = n - 1; i >= 0; --i)
if (c[k] < c[i]) {
l = i;
break ;
}
swap (c, k, l);
for ( int i = k + 1; i < (n + k + 1) / 2; ++i)
swap (c, i, n + k - i);
return true ;
}
    
    
    
    
    
    public static void main(String[] args) throws IOException {
            //   BufferedReader br = new BufferedReader(new FileReader(new File("in.txt")));
       BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        /*
        char[] caract;
         char[] caract2 = new char[] {'a','b','a','a','c','b'};
          char[] caract3 = new char[] {'c','b','b','a','a'};
             caract="Jose".toCharArray();
        nextPermutation( caract);
        System.out.println(caract);
        
        System.out.println(nextPermutation( caract2));
        System.out.println(caract2);
        System.out.println(nextPermutation( caract3));
        System.out.println(caract3);
        * */
               
               String palabra = br.readLine(); 
          char[] caract=palabra.toCharArray();
          
        while (!palabra.equals("#")){
            caract=palabra.toCharArray();
            if (nextPermutation( caract)){
              
                 System.out.println(caract);
            }else {
                 System.out.println("No Successor");
            }
            
            palabra = br.readLine(); 
        }
    }
}
