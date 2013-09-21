import java.net.*;
import java.io.*;
import java.util.*;

public class Ejemplo {

public static void main(String[] args) {

String pingResult = "";

//Copiar el contenido de un directorio a otro, /s significa que incluya subdirectorios
//cambiar las rutas de los directorios por unas de ustedes
//recuerden colocar el boble backslash (\\) para que no les saque error
//deben investigar los demás parámetros de los comandos de copiado, eliminado y renombrado de archivos

String comando = "xcopy C:\\carpeta C:\\Users /s";

try {
Runtime r = Runtime.getRuntime();
Process p = r.exec(comando);

BufferedReader in = new BufferedReader(new
InputStreamReader(p.getInputStream()));
String inputLine;
while ((inputLine = in.readLine()) != null) {
System.out.println(inputLine);
pingResult += inputLine;
}
in.close();

} catch (IOException e) {
System.out.println(e);
}

}

}
