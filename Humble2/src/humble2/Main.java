/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package humble2;

import java.io.*;
import java.util.*;

public class Main {
    /*
     public static boolean isHumble (long n ){
     while (n%2==0){
     n/=2;
     }
     while (n%3==0){
     n/=3;
     }
     while (n%5==0){
     n/=5;
     }
     while (n%7==0){
     n/=7;
     }
     if (n==1){
     return true; 
     }
     return false; 
     }
    
     * */

    public static void main(String[] args) throws FileNotFoundException, IOException {

        ArrayList<Long> lista = new ArrayList<Long>();
        lista.add((long) 1);

        long menor;

        long[] array = new long[4];
        while (lista.size() < 5842) {
            menor = 1000000000001L;
            int N = lista.size();
            for (int i = 0; i < N; i++) {
                array[0] = (long) lista.get(i) * 2;
                array[1] = (long) lista.get(i) * 3;
                array[2] = (long) lista.get(i) * 5;
                array[3] = (long) lista.get(i) * 7;

                Arrays.sort(array);


                for (int j = 0; j < array.length; j++) {
                    if (array[j] > lista.get(N - 1) && array[j] < menor) {

                        menor = array[j];
                        break;
                    }

                }

            }

            lista.add(menor);

        }

//  BufferedReader br = new BufferedReader(new FileReader ("in.txt")); 
BufferedReader br = new BufferedReader (new InputStreamReader (System.in ));
          
          int numero = Integer.parseInt(br.readLine()); 
          String map[] =  new String [4];
          map[1]="st";
          map[2]="nd";
          map[0]="th";
           map[3]="rd";
          while (numero !=0){
              
          //  System.out.println("The "+numero+map[numero%10]+" humble number is "+lista.get(numero-1) );
          //  System.out.println( (int) numero%10 );
              
              String[] s = String.valueOf(numero).split("");
              
          if ((numero>=10 && numero<20) || (numero%100>10 && numero%100<20)){
                   System.out.println("The " +numero+ map[0] + " humble number is "+lista.get(numero-1)+".");
          } else  if (s[s.length -1].equals("1")){
                      System.out.println("The " +numero+ map[1] + " humble number is "+lista.get(numero-1)+".");
              }else if (s[s.length -1].equals("2")){
                        System.out.println("The " +numero+ map[2] + " humble number is "+lista.get(numero-1)+".");
              }else if (s[s.length -1].equals("3")){
                     System.out.println("The " +numero+ map[3] + " humble number is "+lista.get(numero-1)+".");
              }else {
                   System.out.println("The " +numero+ map[0] + " humble number is "+lista.get(numero-1)+".");
              }
              
        
          numero = Integer.parseInt(br.readLine()); 
              
              
          }
          
          /*
        for (int k = 0; k < lista.size(); k++) {

            System.out.println(lista.get(k)); 
        }
           */

    }
}
