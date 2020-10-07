
package zuluviajes;

import java.io.Serializable;

class Excursion implements Serializable {
    //atributos 
     private final String nombre;
    private double Valor;
    
//constructor 
    Excursion(String nombre, double Valor) {
        this.nombre = nombre;
        this.Valor = Valor;
    }

 

//metodos 
    public double getValor() {
        return Valor;
    }

    public void setValor(double Valor) {
        this.Valor = Valor;
    }
}
