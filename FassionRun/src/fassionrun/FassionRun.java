
package fassionrun;

import java.util.Scanner;

public class FassionRun {

    
    public static void main(String[] args) {
        
     Scanner Lea = new Scanner(System.in);
     
     Eventos ObjEven;
     ObjEven = new Eventos();
     Modelos ObjMod;
     ObjMod = new Modelos();
     String sw="s";
     int N,i;
     
     System.out.println("Cuantos Eventos Hay?");
     N = Lea.nextInt();
     
     for (i=0;i<=N-1;i=i+1){
         ObjEven.IngresoDatos();
         ObjEven.Contsillas();
         do {
              ObjMod.IngresoDatos();
             ObjMod.ContEdad();
             ObjMod.ContModelos();
             ObjMod.Acupeso();
             ObjMod.PromPeso();
             ObjMod.PromEdad();
             ObjMod.Mayestatura();
             ObjMod.TotModelos();
             System.out.println("Desea Ingresar mas modelos? .... s/n");
             sw = Lea.next();
              
             switch ( sw){
                 case "s":
                     sw="s";
                     break;
                     
                             
                 case "n":
                     sw="n";
                     break;
                     
                 default: 
                     System.out.println("opcion no valida.Vuelva a digitar:"
                             + " s/n");
                     sw= Lea.next();
             }
         }
         while (sw.equals("s")) ;
             
            
             
             
         
         
         sw="s";
         ObjMod.ImprimirDatModelos();
         ObjMod.Inicializar();
         
         
     }
     
     ObjEven.ImprimirContisill();
     ObjMod.ImprimirTotmodelos();
        
    }
    
}
