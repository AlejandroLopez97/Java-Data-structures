
package zuluviajes;

import java.util.ArrayList;

class Plan {
    //atributos 
    private ArrayList<Excursion> excursiones ;
    private String nombre;
    private int numeroDias;
    private double valorDia;  
    
//constructor 
   Plan(String nombre, int numeroDias, double valorDia) {
        this.nombre = nombre;
        this.numeroDias = numeroDias;
        this.valorDia = valorDia;
    }

   
    //metodos 
    public void AdiconarExcursion() {
        
        for (Excursion excursiones: excursiones){
            
            
        }
        
    }
    
    public double ValorAPagar(){
      
        return valorDia*numeroDias + ;
        
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNumeroDias() {
        return numeroDias;
    }

    public void setNumeroDias(int numeroDias) {
        this.numeroDias = numeroDias;
    }

    public double getValorDia() {
        return valorDia;
    }

    public void setValorDia(double valorDia) {
        this.valorDia = valorDia;
    }
    
}
