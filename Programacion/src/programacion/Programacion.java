/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package programacion;

import java.math.BigInteger;
import java.util.*;

public class Programacion {

    static class punto implements Comparable<punto> {  // Implementa Comparacion!!!!

        int x;
        int y;

        punto(int x, int y) {
            this.x = x;
            this.y = y;
        }

        public String toString() {
            return "punto{" + "x=" + x + ", y=" + y + '}';


        }

        @Override
        public int compareTo(punto t) {
            return (int)(Math.hypot(x, y)-Math.hypot(t.x, t.y));
            
        }
        
        
        
        
        
        
    }

    public static void main(String[] args) {
        /*
         * TreeSet<Integer> ts= new TreeSet<Integer>(); ts.add(5); ts.add(6);
         * ts.add(5);
         *
         * ts.add(-1);
         *
         */
        /*
         * TreeSet<String> ts= new TreeSet<String>(); ts.add("Juan");
         * ts.add("Maria");
         *
         *
         *
         *
         *
         * for(String e:ts){ // For simplificado System.out.println(e);
         *
         */
        
        
        
        TreeMap <String,Integer> tm = new TreeMap <String,Integer>();
        
          tm.put("Daniel",5); tm.put("Manuel",4); tm.put( "Lucas",3);
          tm.put( "Juan",2);       
         
      
          for(Map.Entry<String,Integer> data:tm.entrySet()){
         
          System.out.println(data.getKey()+ " "+data.getValue() );
          }
    
               
        
      /*
          TreeMap <Integer,String> tm = new TreeMap <Integer,String>();
          tm.put(5, "Daniel"); tm.put(4, "Manuel"); tm.put(3, "Lucas");
          tm.put(2, "Juan");
         
         
      
          for(Map.Entry<Integer,String> data:tm.entrySet()){
         
          System.out.println(data.getKey()+ " "+data.getValue() );
          }
    
        /*
 
          
       
        //If else simplificada
        /*
         * if( x>2){ a=5; } else { a=6; }
         *
         *
         * a=(x>2)? 5 : 6;
         *
         *
         * if(n=2){ return true; } else return false;
         *
         *
         */
        /*
         * BigInteger bi1= new BigInteger("1231415616156166546464648562561");
         * BigInteger bi2= new BigInteger("564964569464646464684979944665");
         *
         *
         * System.out.println(bi1); System.out.println(bi2);
         * System.out.println(bi1.multiply(bi2));
         *
         */
        /*
         * ORDENAR UN ARRAY!
         *
         *
         * int a[]={5,3,6,7,8}; System.out.println(Arrays.toString(a));
         * Arrays.sort(a); System.out.println(Arrays.toString(a));
         *
         */
        //ARRAYLIST= VECTOR PERO MAS RAPIDO!!!
        /*
         *
         * ArrayList<Integer> al = new ArrayList<Integer>(); al.add(5);
         * al.add(4); al.add(-3); al.add(8);
         *
         * Collections.sort(al); for(int x:al){ System.out.println(x); }
         *
         */


           /*
        punto p1 = new punto(5, 6);

        System.out.println(p1);
        //programacion.Programacion$punto@13e8d89 Hash Code!
         punto p2 = new punto(4, 5);

       TreeSet<punto> ts =new TreeSet<punto>();
       ts.add(p2);
       ts.add(p1);
        
       for(punto p:ts){
           
           System.out.println(p);
       }
       
       
       
       */
        
        
        
        

    }
    }
    
