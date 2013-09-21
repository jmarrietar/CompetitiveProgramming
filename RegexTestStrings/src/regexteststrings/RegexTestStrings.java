/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package regexteststrings;

/**
 *
 * @author EQUIPO JOSE
 */

import java.io.*;
import java.util.Scanner;


 class RegexTestStrings {
    
    
         
    
  //public static  String EXAMPLE_TEST = "Look it care1fully.";

  public static void main(String[] args) throws IOException {
      
     // BufferedReader in =new BufferedReader(new InputStreamReader (System.in));
          Scanner in = new Scanner(System.in);

         // String EXAMPLE_TEST;
         
           while(in.hasNext()){
               String EXAMPLE_TEST = in.nextLine();

 
           
  EXAMPLE_TEST=EXAMPLE_TEST.replaceAll("\\d", " ");
     EXAMPLE_TEST=EXAMPLE_TEST.replaceAll("\\W", "\\ ");
     
   String[] splitString = (EXAMPLE_TEST.split("\\S+"));
    
  
   
    System.out.println(splitString.length);// Should be 14

    for (String string : splitString) {
      System.out.println(string);

           }
 
    }
    // Replace all whitespace with tabs
   // System.out.println(EXAMPLE_TEST.replaceAll("\\W", "\\ "));
  }
}


  
