/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package ventana;
import java.awt.*;
import javax.swing.*;
/**
 *
 * @author EQUIPO JOSE
 */
public class Ventana extends JFrame{
    
  Container contenedor;


    public Ventana(String titulo){
      super(titulo);
      //Button b=new Button("Aceptar");
      Button IA1=new Button("sur");
      Button IA2=new Button("Nrte");
      Button IA3 =new Button("oriental");
      TextField text=new TextField();
      
      contenedor=this.getContentPane();
      //contenedor.add(b);
      contenedor.setLayout(new BorderLayout());
      
      contenedor.add(IA2,BorderLayout.SOUTH);
      contenedor.add(IA3,BorderLayout.NORTH);
      setSize(250,400);
      setVisible(true);
      setDefaultCloseOperation(EXIT_ON_CLOSE);
      
      
    }
        public static void main(String[] args) {
         new Ventana("ventana");
    }
    
}
