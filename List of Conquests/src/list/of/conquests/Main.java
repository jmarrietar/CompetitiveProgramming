/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package list.of.conquests;

/**
 *
 * @author EQUIPO JOSE
 */
import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        //BufferedReader br = new BufferedReader(new FileReader(new File("in.txt")));

        int N = Integer.parseInt(br.readLine());


        Vector<String> continentes = new Vector<String>();


        while (N-- > 0) {

            String datos[] = br.readLine().split("[ ]");
            continentes.add((datos[0]));


        }

        //Convertir de vector a array pasando todos sus elementos 
        String[] splitWords = continentes.toArray(new String[continentes.size()]);

        //Crear treeMap 
        TreeMap<String, Integer> tm = new TreeMap<String, Integer>();

        // Pasar valores de array a treeMap, en un Orden Alfabetico SIN REPETIR
        for (String word : splitWords) {

            Integer oldCount = tm.get(word);
            if (oldCount == null) {
                oldCount = 0;
            }
            tm.put(word, oldCount + 1);
        }




        for (Map.Entry<String, Integer> data : tm.entrySet()) {

            System.out.println(data.getKey() + " " + data.getValue());
        }
        

        
    }
}
