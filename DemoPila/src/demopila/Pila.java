
package demopila;

public class Pila {
    private int n;
    private int tope;
    private Object pila [];

    public Pila(int n) {
        this.n = n;
        tope = 0;
        pila = new Object [n];
    }
    
    private boolean estaVacia(){
        return tope == 0;
    }
    
    private boolean estaLlena(){
        return tope == n;
    }
    
    public boolean apilar(Object dato){
        if (estaLlena()) {
            return false ;
        }
        pila [tope] = dato;
        tope++;
        return true;
    }
    
    public Object desapilar(){
        if (estaVacia()){
            return null;
        }
        tope--;
        return pila [tope];
        
    }
}
