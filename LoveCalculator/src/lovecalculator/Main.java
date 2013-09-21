/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lovecalculator;

import java.io.*;
import java.text.DecimalFormat;
import java.text.NumberFormat;

public class Main {

    public static char a = "a".charAt(0);

    public static int valor(String[] s1) {



        int numero = 0;
        for (int k = 0; k < s1.length; k++) {
            numero += s1[k].charAt(0) - (int) a + 1;   // ojo POSIBLE ERROR EN s1[k].charAt(0)

        }


        String s;
        while (numero >= 10) {
            int suma = 0;
            s = Integer.toString(numero);

            for (int i = 0; i < s.length(); i++) {
                suma += Integer.parseInt(Character.toString(s.charAt(i)));

            }

            numero = suma;
        }

        return numero;


    }

    public static void main(String[] args) throws IOException {
        
        
      
BufferedReader br= new BufferedReader (new FileReader("in.txt"));
  
 
//BufferedReader br= new BufferedReader (new InputStreamReader(System.in));
String nombre1;
String nombre2;

        while (br.ready()){
          
       nombre1 =br.readLine().toLowerCase(); 
       nombre2 =br.readLine().toLowerCase();

        nombre1 = nombre1.replaceAll("[^A-Za-z0-9 ]", "");
        nombre1 = nombre1.replaceAll(" ", "");
         nombre2 = nombre2.replaceAll("[^A-Za-z0-9 ]", "");
        nombre2 = nombre2.replaceAll(" ", "");

        String[] parts1 = nombre1.split("(?!^)");
        String[] parts2 = nombre2.split("(?!^)");

        /*
         char a="a".charAt(0);
         char z="z".charAt(0);
         */

        

        float valor1 = (float) valor(parts1);
        float valor2 = (float) valor(parts2);
        
        float aux ;
        
        if (valor2>valor1){
            aux=valor2;
            valor2=valor1;           
            
            valor1=aux;
        }
        
        double porc = (double)( (valor2 / valor1) * 100);
        
        DecimalFormat df =new DecimalFormat("#.00");
        String string = df.format(porc);
        
        
       string= string.replace(",", ".");
      
       
               
        System.out.println(string + " %"); // Habra algun rpobelma con el Pnto? en la fraccion?

//80.00 % 


    }
    }
}
