
package listasimple;
import javax.swing.JOptionPane;
public class ListaSimple {

       public static void main(String[] args) {
        // instanciamos la clase 
           NodosSimple objlis = new NodosSimple();
           objlis.crear();
           JOptionPane.showMessageDialog(null, objlis.imprimirlista());
    }//fin main 
    
}
