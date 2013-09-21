/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package minesweeper;

import java.io.*;

public class Main {

    public static boolean inside(int i, int j, int n, int m) {
        return i >= 0 && j >= 00 && i < n && j < m;

    }

    public static void convertidor(char matrix[][], int n, int m) {

        int[] dj = {-1, -1, -1, 0, 0, 1, 1, 1};
        int[] di = {-1, 0, 1, -1, 1, -1, 0, 1};

        int[][] matrix2 = new int[n][m];



        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {

                if (matrix[i][j] == "*".charAt(0)) {

                    matrix2[i][j] = (int) "*".charAt(0);
                } else {

                    // comparar direcciones 
                    for (int k = 0; k < 8; ++k) {

                        int ni = i + di[k];
                        int nj = j + dj[k];
                        if (inside(ni, nj, n, m)) {
                            if (matrix[ni][nj] == "*".charAt(0)) {
                                matrix2[i][j] += 1;
                            }
                        }
                    }

                }
            }
        }


        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {

                if (matrix2[i][j] == 42) {
                    System.out.print((char) matrix2[i][j]);
                } else {

                    System.out.print(matrix2[i][j]);
                }
            }
            System.out.println();
        }




    }

    public static void main(String[] args) throws IOException {

       //BufferedReader br = new BufferedReader(new FileReader(new File("in.txt")));
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));



 // De aqui        
        int t=1;
           while(true){

        String datos[] = br.readLine().split("[ ]+");

        int n = Integer.parseInt(datos[0]);
        int m = Integer.parseInt(datos[1]);

             if (n==0 & m==0){break;}

        char[][] field = new char[n][m];

        // Esta funcion esta Bien! 

        for (int i = 0; i < n; ++i) {
            field[i] = br.readLine().toCharArray();
        }
        
            
             if (t>1){
                  System.out.println();
             }
        System.out.println("Field"+" "+"#"+t+":");
               
        convertidor(field, n, m);
        t++;
    
           }
        
   //Hasta aqui es Nuevo
    
        

    }
    
}
