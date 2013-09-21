/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package trianglewave2;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/**
 *
 * @author EQUIPO JOSE
 */
public class TriangleWave2 {
/*
    public static Integer[] crearOla(int n) {
        ArrayList<Integer> foo = new ArrayList<Integer>();
        for (int i = 1; i <= n; i++) {

            for (int j = 0; j < i; j++) {
                foo.add(i);
            }

        }
        Integer[] bar = foo.toArray(new Integer[0]);
        return bar;

    }
    * */

    public static void mostrarOla(int[] numeros) {


        int n = 1;


        for (int i = 0; i < numeros.length; i++) {

            if (i == (n * (n + 1) / 2)) {

                n++;
                System.out.printf("%s\n", " ");
            }
            System.out.printf("%d", numeros[i]);

        }

        System.out.printf("%s\n", " ");

        int m = n - 1;

        for (int j = numeros.length - 1 - numeros[numeros.length - 1]; j >= 0; j--) {


            System.out.printf("%d", numeros[j]);
            if (j == (m * (m - 1) / 2)) {

                m--;
                System.out.printf("%s\n", " ");
            }





        }

    }

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new FileReader(new File("in.txt")));

      //  BufferedReader br=new BufferedReader (new InputStreamReader( System.in));


/*
        Integer[] ola1 = crearOla(1);
        Integer[] ola2 = crearOla(2);
        Integer[] ola3 = crearOla(3);
        Integer[] ola4 = crearOla(4);
        Integer[] ola5 = crearOla(5);
        Integer[] ola6 = crearOla(6);
        Integer[] ola7 = crearOla(7);
        Integer[] ola8 = crearOla(8);
        Integer[] ola9 = crearOla(9);
*/
        
        
        int [] ola1 = {1};
        int[] ola2 = {1,2,2};
        int[] ola3 = {1,2,2,3,3,3};
        int[] ola4 = {1,2,2,3,3,3,4,4,4,4};
        int[] ola5 = {1,2,2,3,3,3,4,4,4,4,5,5,5,5,5};
        int[] ola6 = {1,2,2,3,3,3,4,4,4,4,5,5,5,5,5,6,6,6,6,6,6};
        int[] ola7 = {1,2,2,3,3,3,4,4,4,4,5,5,5,5,5,6,6,6,6,6,6,7,7,7,7,7,7,7};
        int[] ola8 = {1,2,2,3,3,3,4,4,4,4,5,5,5,5,5,6,6,6,6,6,6,7,7,7,7,7,7,7,8,8,8,8,8,8,8,8};
        int [] ola9 = {1,2,2,3,3,3,4,4,4,4,5,5,5,5,5,6,6,6,6,6,6,7,7,7,7,7,7,7,8,8,8,8,8,8,8,8,9,9,9,9,9,9,9,9,9};
        

        int N = Integer.parseInt(br.readLine());
        int t=0;

        while (N-- > 0) {
            String space = br.readLine();
            int n = Integer.parseInt(br.readLine());
            int frecuencia = Integer.parseInt(br.readLine());



           
            
            for (int i=0;i<frecuencia;i++){
                 System.out.printf("%s\n", " ");
            if (n == 1) {

                mostrarOla(ola1);

            }
               if (n == 2) {

                mostrarOla(ola2);

            }
                  if (n == 3) {

                mostrarOla(ola3);

            }
                     if (n == 4) {

                mostrarOla(ola4);

            }
                        if (n == 5) {

                mostrarOla(ola5);

            }
                           if (n== 6) {

                mostrarOla(ola6);

            }
                              if (n== 7) {

                mostrarOla(ola7);

            }
                                 if (n == 8) {

                mostrarOla(ola8);

            }
                                    if (n == 9) {

                mostrarOla(ola9);

            }
                                    

        }


        }



    }
}
