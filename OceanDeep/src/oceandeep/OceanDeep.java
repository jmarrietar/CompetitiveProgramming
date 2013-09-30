/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package oceandeep;

/**
 *
 * @author EQUIPO JOSE
 */
public class OceanDeep {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int numero=131071;
        String c="10101010001110       ".trim();
        int decimalValue = Integer.parseInt(c, 2);
        System.out.println(decimalValue );
        System.out.println(c.endsWith("0"));
       
     // La idea seria Hacer un BuffereReader , junto con un striung o un Buffer reader
       // Y comparara a ver si termina con # , si si termina que se salag de ciclo y lea otro 
        
        // sino que siga buscvando y siga pegando,,, algo asi.. 
        
    }
}
