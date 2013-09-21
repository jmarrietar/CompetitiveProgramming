/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tic.tac.toe.tomek;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author EQUIPO JOSE
 */
public class TicTacToeTomek {

    public static void ganador (int n,BufferedWriter bw ,int t) throws IOException{
           if (n == 1) {
           
           // System.out.println("X WON");
            bw.write("Case #" + t+ ": "+ "X won");
	bw.newLine();	
        }

        if (n== 0) {
            
          //System.out.println("O WON");
               bw.write("Case #" + t+ ": "+ "O won");
	bw.newLine();	
        }
        
    }
    
    public static int puntos(char field[][]){
        int puntos=0;
         for (int k = 0; k < 4; k++) {

            for (int j = 0; j < 4; j++) {
                 if (field[j][k] == ".".charAt(0)) {
                        puntos++;
                    }
            }
            }

         return puntos;
    }
    
    public static int checkDiag(char field[][]) {
        char Circulo = "O".charAt(0);
        char equis = "X".charAt(0);
        char te = "T".charAt(0);
        int contarO1 = 0;
        int contarE1 = 0;
        int contarO2 = 0;
        int contarE2 = 0;
        for (int k = 0; k < 4; k++) {

            for (int j = 0; j < 4; j++) {

                if (k == j) {

                    //System.out.println("Entre!!");
                    if (field[j][k] == Circulo || field[j][k] == te) {
                        contarO1++;
                    }

                    if (field[j][k] == equis || field[j][k] == te) {
                        contarE1++;
                    }
                }
                
                 if (k + j==3) {
                      if (field[j][k] == Circulo || field[j][k] == te) {
                        contarO2++;
                    }

                    if (field[j][k] == equis || field[j][k] == te) {
                        contarE2++;
                    }
                 }
                

            }

            if (contarO1 == 4 || contarE1 == 4) {
                break;
            }
 if (contarO2 == 4 || contarE2 == 4) {
                break;
            }



        }

        if (contarE1 == 4) {
            return 1;
           // System.out.println("X WON");
        }

        if (contarO1 == 4) {
            return 0;
            //System.out.println("O WON");
        }
        
        if (contarE2 == 4) {
            return 1; 
            //System.out.println("X WON");
        }

        if (contarO2 == 4) {
            return 0; 
           // System.out.println("O WON");
        }
        
        return 2; // 2 es si No hay Ninguno

    }

    public static int checkCol(char field[][]) {
        char Circulo = "O".charAt(0);
        char equis = "X".charAt(0);
        char te = "T".charAt(0);
        int contarO = 0;
        int contarE = 0;
       
        for (int k = 0; k < 4; k++) {
            contarO = 0;
            contarE = 0;
            for (int j = 0; j < 4; j++) {
                if (field[j][k] == Circulo || field[j][k] == te) {
                    contarO++;
                }

                if (field[j][k] == equis || field[j][k] == te) {
                    contarE++;
                }
                

            }
            if (contarO == 4 || contarE == 4) {
                break;
            }

        }

        if (contarE == 4) {
            
            return 1;
         //   System.out.println("X WON");
        }

        if (contarO == 4) {
            return 0;
           // System.out.println("O WON");
        }


return 2;


    }

    public static int checkFil(char field[][]) {

        char Circulo = "O".charAt(0);
        char equis = "X".charAt(0);
        char te = "T".charAt(0);
        int contarO = 0;
        int contarE = 0;
int  punto=0;
        for (int j = 0; j < 4; j++) {
            contarO = 0;
            contarE = 0;
            for (int k = 0; k < 4; k++) {
                if (field[j][k] == Circulo || field[j][k] == te) {
                    contarO++;
                }

                if (field[j][k] == equis || field[j][k] == te) {
                    contarE++;
                }
                
               
            }

            if (contarO == 4 || contarE == 4) {
                break;
            }
        }

        if (contarE == 4) {
            return 1;
      //      System.out.println("X WON");
        }

        if (contarO == 4) {
            return 0;
           // System.out.println("O WON");
        }
return 2;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("A-large.in"));
      //  BufferedReader br = new BufferedReader( new InputStreamReader(System.in));
        
      
       File file = new File("/users/EQUIPO JOSE/Documents/NetBeansProjects/Tic-Tac-Toe-Tomek/filename.txt");
        
        if (!file.exists()) {
				file.createNewFile();
			}
 
	FileWriter fw = new FileWriter(file.getAbsoluteFile());
	BufferedWriter bw = new BufferedWriter(fw);
        
        
        
 int N = Integer.parseInt(br.readLine());
        int t=1;
        
        
// LEO la Matriz
        
        while (N-->0){
        char[][] field = new char[4][4];

        for (int i = 0; i < 4; i++) {
            field[i] = br.readLine().toCharArray();
        }

 
       
        int numero;
        
        numero=checkFil(field);
        
            ganador(numero,bw,t);
      if ( numero ==2){         
         numero=checkCol(field);
                ganador(numero,bw,t);
      }
 
      if (numero==2){
         numero=checkDiag(field);
          ganador(numero,bw,t);
      }
       
       if (numero==2){
        int puntos=puntos(field);
        
        if ( puntos>0){
               bw.write("Case #" + t+ ": "+ "Game has not completed");
	bw.newLine();	
            //System.out.println("Game has not completed");
        }else {
            bw.write("Case #" + t+ ": "+ "Draw");
	bw.newLine();
             //System.out.println("Draw");
        }
        
       }
         
     String blankLine= br.readLine();    
     t++;
    }
         bw.close();
    }
}
