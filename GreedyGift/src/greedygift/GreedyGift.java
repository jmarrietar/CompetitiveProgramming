/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package greedygift;

import java.io.*;
import java.util.*;

/**
 *
 * @author EQUIPO JOSE
 */
public class GreedyGift {

   
  public static void recibirRegalo(HashMap mapa,String s, int regalo){
      
       Object saldoAnt = mapa.get(s);
       int saldoAnterior= (Integer)saldoAnt;
        mapa.put(s, saldoAnterior + regalo);        
      
  }
  
  public static void Balance (HashMap mapa,String s, int n,int budget){
    Object saldoAnterior = mapa.get(s);
       
  
            mapa.put(s,  n);    
    
  }
  
  public static void Mostrar(HashMap mapa,String[] array){
      
 
      
      
  }
    
    
    public static void main(String[] args) throws  IOException {
     // BufferedReader br =new BufferedReader(new FileReader(new File("in.txt")));
        

       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

   int t=1;

       while (br.ready()) {
             HashMap<String, Integer> Hash = new HashMap<String, Integer>();
        //hasta aqui 
        int N=Integer.parseInt(br.readLine());
        
        String integrantes[] = br.readLine().split("[ ]+");      
        
     

        //Crearlos apartir de un array 
          int i=0;
        for (String word : integrantes) {
            
            Hash.put(word, 0);
            
        }
      
        while (N-->0){
          String[] datos= br.readLine().split("[ ]+");
             // String[] datos={"amr","150","2","vick","owen"}; // ejemplo particular


      
      int budget= Integer.parseInt( datos[1]);
      int amigos=Integer.parseInt(datos[2]);
      
     
      
     int sobras=0;
      int regalo=0;
      //System.out.println(regalo); // Monto que va a dar 
      
      if(amigos>0){
        sobras=budget%amigos; // cuando es 0 da 0 bien
       regalo=budget-sobras;  //0-
      int regaloxamigo=regalo/amigos;
       
      //Aqui da los regalos. 
  
        for(int j=3;j<datos.length;j++){
            
            recibirRegalo( Hash,datos[j], regaloxamigo);
          
        }
        
      }
      
      //desde aqui cambiado
      if (amigos==0){
          sobras=budget;
      }
      
      
      //hasta aqui
      
      int regalorecibido= Hash.get(datos[0]);
      
       //Aqui dio los regales y se queda Pobre se el suma el residuo 
        Balance(Hash,datos[0],sobras-budget,budget);

        int saldobalanceado=Hash.get(datos[0]);
          Hash.put(datos[0],saldobalanceado+regalorecibido);
            
        //Aqui pierde todo su dinero excepto el modulo
            
            
        }

        // Muestar el hash  AQUI 
       
if(t>1){
    System.out.println();
}
for (int k=0;k<integrantes.length;k++){
 for (Map.Entry<String, Integer> data : Hash.entrySet()) {
        if(data.getKey().equals(integrantes[k])){
            System.out.println(data.getKey() + " " + data.getValue());
        }
        }
    }
   t++;

    }
    }
}
