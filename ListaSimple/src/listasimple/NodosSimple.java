
package listasimple;

import javax.swing.JOptionPane;

public class NodosSimple {
    
    //atributos privados y propios 
    private Object dato;
    private NodosSimple cabeza, siguiente, fin, q;
    
    //constructores 
    public NodosSimple(){
        cabeza = null;
        fin = null;
    }
    public NodosSimple(Object d){
        dato = d;
        siguiente = null;
    }
    public NodosSimple(Object d, NodosSimple enlace){
        dato = d;
        siguiente = enlace;
    }
    public boolean verificarlista(){
        if (cabeza == null){
            
            JOptionPane.showMessageDialog(null, "Lista vacia");
            return true;
            
        }else {
            
            return false;
        }
    }//fin verificar lista 
    
    /*este metodo recibe un dato y siempre nos crea
    el nodo como cabeza */
    
    public void Inicio (Object d) {
    
    cabeza = new NodosSimple(d,cabeza);
     }//fin inicio
    
    public void crear (){
        
        int resp;
        Object d;
        resp = JOptionPane.showConfirmDialog(null,"¿Datos para la lista?",
                "INGRESANDO DATOS",JOptionPane.YES_NO_OPTION);
        
        while (resp == JOptionPane.YES_OPTION){
            
            d = JOptionPane.showInputDialog("Digite dato para la lista:  ");
            
            Inicio(d);
            
        resp = JOptionPane.showConfirmDialog(null,"¿Mas datos para la lista?",
                "INGRESANDO DATOS",JOptionPane.YES_NO_OPTION);
        
        }//fin mientras 
        
    }//fin de crear 
    
    public String imprimirlista(){
    
        String cadena = "\n";
        if (verificarlista() == false){
            
            q = cabeza;
            while (q != null){
                
                cadena = cadena + "[ "+q.dato+" ]";
                q = q.siguiente;// adelantamos listas 
            }// fin mientras 
        }// fin si 
        return cadena;
        
    }//fin imprimir  
   
}// fin clase NodosSimple
