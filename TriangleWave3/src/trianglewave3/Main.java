/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package trianglewave3;

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

    public static void main(String[] args) throws IOException {


        StringBuilder Linea1 = new StringBuilder();
        StringBuilder Linea2 = new StringBuilder();
        StringBuilder Linea3 = new StringBuilder();
        StringBuilder Linea4 = new StringBuilder();
        StringBuilder Linea5 = new StringBuilder();
        StringBuilder Linea6 = new StringBuilder();
        StringBuilder Linea7 = new StringBuilder();
        StringBuilder Linea8 = new StringBuilder();
        StringBuilder Linea9 = new StringBuilder();



        Linea1.append("1");
        //  Linea1.append("\n");




        Linea2.append("1");
        Linea2.append("\n");
        Linea2.append("22");
        Linea2.append("\n");
        Linea2.append("1");
        //Linea2.append("\n");


        Linea3.append("1");
        Linea3.append("\n");

        Linea3.append("22");
        Linea3.append("\n");
        Linea3.append("333");
        Linea3.append("\n");
        Linea3.append("22");
        Linea3.append("\n");
        Linea3.append("1");



        Linea4.append("1");
        Linea4.append("\n");

        Linea4.append("22");
        Linea4.append("\n");
        Linea4.append("333");
        Linea4.append("\n");
        Linea4.append("4444");
        Linea4.append("\n");
        Linea4.append("333");
        Linea4.append("\n");
        Linea4.append("22");
        Linea4.append("\n");
        Linea4.append("1");



        Linea5.append("1");
        Linea5.append("\n");

        Linea5.append("22");
        Linea5.append("\n");
        Linea5.append("333");
        Linea5.append("\n");
        Linea5.append("4444");
        Linea5.append("\n");
        Linea5.append("55555");
        Linea5.append("\n");
        Linea5.append("4444");
        Linea5.append("\n");
        Linea5.append("333");
        Linea5.append("\n");
        Linea5.append("22");
        Linea5.append("\n");
        Linea5.append("1");



        Linea6.append("1");
        Linea6.append("\n");

        Linea6.append("22");
        Linea6.append("\n");
        Linea6.append("333");
        Linea6.append("\n");
        Linea6.append("4444");
        Linea6.append("\n");
        Linea6.append("55555");
        Linea6.append("\n");
        Linea6.append("666666");
        Linea6.append("\n");
        Linea6.append("55555");
        Linea6.append("\n");
        Linea6.append("4444");
        Linea6.append("\n");

        Linea6.append("333");
        Linea6.append("\n");
        Linea6.append("22");
        Linea6.append("\n");
        Linea6.append("1");



        Linea7.append("1");
        Linea7.append("\n");

        Linea7.append("22");
        Linea7.append("\n");
        Linea7.append("333");
        Linea7.append("\n");
        Linea7.append("4444");
        Linea7.append("\n");
        Linea7.append("55555");
        Linea7.append("\n");
        Linea7.append("666666");
        Linea7.append("\n");
        Linea7.append("7777777");
        Linea7.append("\n");
        Linea7.append("666666");
        Linea7.append("\n");
        Linea7.append("55555");
        Linea7.append("\n");
        Linea7.append("4444");
        Linea7.append("\n");
        Linea7.append("333");
        Linea7.append("\n");
        Linea7.append("22");
        Linea7.append("\n");
        Linea7.append("1");



        Linea8.append("1");
        Linea8.append("\n");
        Linea8.append("22");
        Linea8.append("\n");
        Linea8.append("333");
        Linea8.append("\n");
        Linea8.append("4444");
        Linea8.append("\n");
        Linea8.append("55555");
        Linea8.append("\n");
        Linea8.append("666666");
        Linea8.append("\n");
        Linea8.append("7777777");
        Linea8.append("\n");
        Linea8.append("88888888");
        Linea8.append("\n");
        Linea8.append("7777777");
        Linea8.append("\n");
        Linea8.append("666666");
        Linea8.append("\n");
        Linea8.append("55555");
        Linea8.append("\n");
        Linea8.append("4444");
        Linea8.append("\n");
        Linea8.append("333");
        Linea8.append("\n");
        Linea8.append("22");
        Linea8.append("\n");
        Linea8.append("1");



        Linea9.append("1");
        Linea9.append("\n");

        Linea9.append("22");
        Linea9.append("\n");
        Linea9.append("333");
        Linea9.append("\n");
        Linea9.append("4444");
        Linea9.append("\n");
        Linea9.append("55555");
        Linea9.append("\n");
        Linea9.append("666666");
        Linea9.append("\n");
        Linea9.append("7777777");
        Linea9.append("\n");
        Linea9.append("88888888");
        Linea9.append("\n");
        Linea9.append("999999999");
        Linea9.append("\n");
        Linea9.append("88888888");
        Linea9.append("\n");
        Linea9.append("7777777");
        Linea9.append("\n");
        Linea9.append("666666");
        Linea9.append("\n");
        Linea9.append("55555");
        Linea9.append("\n");
        Linea9.append("4444");
        Linea9.append("\n");
        Linea9.append("333");
        Linea9.append("\n");
        Linea9.append("22");
        Linea9.append("\n");
        Linea9.append("1");




     // BufferedReader br = new BufferedReader(new FileReader(new File("in.txt")));

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int t = 0;
        String space = br.readLine();
        
      
        while (N-- > 0) {


            int n = Integer.parseInt(br.readLine());
            int frecuencia = Integer.parseInt(br.readLine());

            if (t > 0) {
                 System.out.println("");
            }
            int te = 0;
            for (int i = 0; i < frecuencia; i++) {
                if (te > 0) {
                  System.out.println("");
                }
                if (n == 1) {

                    System.out.println(Linea1);
                }
                if (n == 2) {

                    System.out.println(Linea2);

                }
                if (n == 3) {

                    System.out.println(Linea3);

                }
                if (n == 4) {

                    System.out.println(Linea4);

                }
                if (n == 5) {

                    System.out.println(Linea5);

                }
                if (n == 6) {

                    System.out.println(Linea6);

                }
                if (n == 7) {

                    System.out.println(Linea7);

                }
                if (n == 8) {

                    System.out.println(Linea8);

                }
                if (n == 9) {

                    System.out.println(Linea9);

                }

                te++;
            }


            t++;

//System.out.printf("%s\n", " ");
        }
        

    }
}
