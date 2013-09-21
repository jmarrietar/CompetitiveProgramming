/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package extractoremails;



import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExtractorEmails {

    public static void main(String[] args) {
        String entrada = "<p>hola@pedro.com</p><br>\n";
        entrada += "kk@tres.tris///pepe@eso.es";

        Pattern limpiar = Pattern
                .compile("([_A-Za-z0-9-]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,}))");
        Matcher buscar = limpiar.matcher(entrada);
        while (buscar.find())
            System.out.println(buscar.group(1));
    }
}
