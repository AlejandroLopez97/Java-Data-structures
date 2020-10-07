
package zuluviajes;

import java.util.Scanner;

public class ZuluViajes {
    //atributos 
private static final  Scanner sc = new Scanner (System.in);
String nomPlan, nomExcu  ;
       float numDia;
       double valorDia;
        
       
       
                
   //metodo principal 
    public static void main(String[] args) {
     
       Plan objPlan  = new Plan();
       Excursion objExcu = new Excursion(); 
       
       
        int opc; 
        
            opc = Menu();
            
            switch(opc ){
            
                case 1: 
                    nuevoPlan();
                    break;
                 
                case 2: 
                    adicionarExcursion();
                    break;
                 
                case 3: 
                    mostrarValorAPagar();
                      break;
                    
                case 0: 
                    break; 
                 
             }
     
    }
    
    
//metodos 
    private static int Menu() {
        
         System.out.println("\n\n   ===> MENU <==== ");
         System.out.println("1. Crear nuevo plan");
         System.out.println("2. Adicionar Excursion");
         System.out.println("3. Mostrar valor a pagar");
         System.out.println("0. Salir");
         System.out.print("Digite su opcion: ");
        return sc.nextInt();
        
    }

    private static void nuevoPlan() {
        System.out.println("\n\n -- Nuevo plan -- ");
        System.out.print("Nombre plan.................: ");
 
        System.out.print("Numero de dias..............: "); 
        
        System.out.print("Valor dia...................: ");
        
        System.out.print("Plan creado correctamente  ");
        
    }

    private static void adicionarExcursion() {
       System.out.println("\n\n -- Adicionar Excursion -- ");
       System.out.print("Nombre excursion.................: ");
       
       System.out.print("Valor excursion..................: ");
       
       System.out.print("Excursion creada correctamente  ");
        
    }

    private static void mostrarValorAPagar() {
        
    }

       
    
}
