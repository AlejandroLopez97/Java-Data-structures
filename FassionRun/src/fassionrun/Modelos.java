
package fassionrun;

import java.util.Scanner;


public class Modelos {

    public Modelos() {
    }
    
    
    private String Numid,Nombre,Apellido;
    private double edad,estatura,Peso;
    
    double promedad,Contedad=0,Acupeso=0,Prompeso,Mayestatura=0,Contmodelos=0,
            Totmodelos=0;
    String Nommay;
    
    public void IngresoDatos  () {
        
      Scanner Lea=new Scanner(System.in);
                
                System.out.println(" ingrese Numero de identificacion "
                        + "De la Modelo ");
                 Numid = Lea.next();
                System.out.println("ingrese Nombre de la Modelo  ");
                 Nombre = Lea.next();
                System.out.println(" ingrese apellido de la Modelo ");
                Apellido = Lea.next();
                System.out.println(" ingrese Edad de la modelo");
                edad = Lea.nextDouble();
                System.out.println(" ingrese estatura De la Modelo ");
                estatura = Lea.nextDouble(); 
                System.out.println(" ingrese peso De la Modelo ");
                Peso = Lea.nextDouble();
                
        
        
    }
    
    public void PromEdad() {
        
        promedad = Contedad / Contmodelos ;
    }
 
    
    public void ContEdad( ) {
        
        Contedad += edad; 
        
    }
    
    public void PromPeso() {
        
        Prompeso =Acupeso / Contmodelos;
    }
    
    public void Acupeso() {
        
        Acupeso += Peso;
    }

   
    
    public void Mayestatura(){
        
        if (Mayestatura < estatura) {
            
            Mayestatura = estatura;
            Nommay = Nombre;
        }
            
        
    }
    
    public void ContModelos() {
        
       Contmodelos= Contmodelos + 1;
    }
    
    public void TotModelos() {
        Totmodelos +=  Contmodelos;
    }
    
    public void Inicializar() {
        
        Contedad = 0;
        Acupeso = 0;
        Mayestatura=0;
        Contmodelos = 0;
    }
    
    public void ImprimirDatModelos(){
        
        
        System.out.println(" El promedio de edad por este evento es:");
        System.out.println( promedad );
        System.out.println(" El promedio de Peso por este evento es:");
        System.out.println( Prompeso );
        System.out.println(" la Modelo mas alta de este evento es:");
        System.out.println( Nommay );
         System.out.println(" la Modelo mas alta de este evento  mide:");
        System.out.println( Mayestatura );
        
        
    }
    
    public void ImprimirTotmodelos(){
        
        System.out.println("La cantidad Total de Modelos es:");
        System.out.println(Totmodelos);
    }

    public String getNumid() {
        return Numid;
    }

    public void setNumid(String Numid) {
        this.Numid = Numid;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

    public double getEdad() {
        return edad;
    }

    public void setEdad(double edad) {
        this.edad = edad;
    }

    public double getEstatura() {
        return estatura;
    }

    public void setEstatura(double estatura) {
        this.estatura = estatura;
    }

    public double getPeso() {
        return Peso;
    }

    public void setPeso(double Peso) {
        this.Peso = Peso;
    }

    public double getPromedad() {
        return promedad;
    }

    public void setPromedad(double promedad) {
        this.promedad = promedad;
    }

    public double getContedad() {
        return Contedad;
    }

    public void setContedad(double Contedad) {
        this.Contedad = Contedad;
    }

    public double getAcupeso() {
        return Acupeso;
    }

    public void setAcupeso(double Acupeso) {
        this.Acupeso = Acupeso;
    }

    public double getPrompeso() {
        return Prompeso;
    }

    public void setPrompeso(double Prompeso) {
        this.Prompeso = Prompeso;
    }

    public double getMayestatura() {
        return Mayestatura;
    }

    public void setMayestatura(double Mayestatura) {
        this.Mayestatura = Mayestatura;
    }

    public double getContmodelos() {
        return Contmodelos;
    }

    public void setContmodelos(double Contmodelos) {
        this.Contmodelos = Contmodelos;
    }

    public double getTotmodelos() {
        return Totmodelos;
    }

    public void setTotmodelos(double Totmodelos) {
        this.Totmodelos = Totmodelos;
    }

    public String getNommay() {
        return Nommay;
    }

    public void setNommay(String Nommay) {
        this.Nommay = Nommay;
    }
    
    
}

