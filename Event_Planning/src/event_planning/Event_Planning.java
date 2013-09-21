/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package event_planning;

import java.io.*;

/**
 *
 * @author EQUIPO JOSE
 */
public class Event_Planning {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {

       // BufferedReader br = new BufferedReader(new FileReader(new File("in.txt")));

           BufferedReader br= new BufferedReader (new InputStreamReader(System.in));

        while (br.ready()) {

            String datos[] = br.readLine().split("[ ]+");
            int p = Integer.parseInt(datos[0]);
            int budget = Integer.parseInt(datos[1]);
            int h = Integer.parseInt(datos[2]);
            int w = Integer.parseInt(datos[3]);

            int CostoMenor = 999999999;
            for (int i = 0; i < h; i++) {
                int x = Integer.parseInt(br.readLine());
                String datos2[] = br.readLine().split("[ ]+");
                for (int j = 0; j < datos2.length; j++) {
                    if (Integer.parseInt(datos2[j]) > p) {
                        
                   
                        if (p * x <= budget) {
                        
                            if (p * x < CostoMenor) {
                                CostoMenor = p * x;
                            }
                        }
                    }

                }
                
            //BORRAR ESTO SOLO PRUEBA 
            }

            if (CostoMenor == 999999999) {
                System.out.println("stay home");
            } else {
                System.out.println(CostoMenor);
            }

        }






    }
}
