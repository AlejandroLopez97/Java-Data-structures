
package fassionrun;

import java.util.Scanner;


public class Eventos {
    
    private String Nomevento,Lugarevento,Fechaevento,Horaevento;
    private int Nsillas;

    public Eventos() {
    }
    
    public void IngresoDatos() {
        
         Scanner Lea=new Scanner(System.in);
                
                System.out.println(" ingrese Nombre de evento");
                 Nomevento = Lea.next();
                System.out.println("ingrese Lugar del evento  ");
                 Lugarevento = Lea.next();
                System.out.println(" ingrese Fecha del Evento");
                Fechaevento = Lea.next();
                System.out.println(" ingrese Hora del evento");
                Horaevento = Lea.next();
                System.out.println(" ingrese Numero de acientos");
                Nsillas = Lea.nextInt(); 
                
        
    }

    public String getNomevento() {
        return Nomevento;
    }

    public void setNomevento(String Nomevento) {
        this.Nomevento = Nomevento;
    }

    public String getLugarevento() {
        return Lugarevento;
    }

    public void setLugarevento(String Lugarevento) {
        this.Lugarevento = Lugarevento;
    }

    public String getFechaevento() {
        return Fechaevento;
    }

    public void setFechaevento(String Fechaevento) {
        this.Fechaevento = Fechaevento;
    }

    public String getHoraevento() {
        return Horaevento;
    }

    public void setHoraevento(String Horaevento) {
        this.Horaevento = Horaevento;
    }

    public int getNsillas() {
        return Nsillas;
    }

    public void setNsillas(int Nsillas) {
        this.Nsillas = Nsillas;
    }

    public int getContsillas() {
        return Contsillas;
    }

    public void setContsillas(int Contsillas) {
        this.Contsillas = Contsillas;
    }
    
    int Contsillas=0;
    
    public void Contsillas() {
        
        Contsillas += Nsillas;
    }
    
    public void ImprimirContisill() {
        
        System.out.println("La cantidad Total de Sillas es de:" + Contsillas);
    }
    
    
}
