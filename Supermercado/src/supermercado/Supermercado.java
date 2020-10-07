
package supermercado;
import java.util.Scanner;
public class Supermercado 
{

    private static Venta venta = new Venta();
    private static Scanner sc = new Scanner(System.in);
    
    public static void main(String[] args) 
    {
        int opc;
        
        do
        {
            opc = menu();
            switch(opc)
            {
                case 1:
                    asignarCliente();
                    break;
                    
                case 2:
                    agregarProducto();
                    break;
                    
                case 3:
                    pagarEIniciarNuevaCuenta();
                    break;
                    
            }
        } while (opc != 0);
     
    }
    
    private static int menu()
    {
        System.out.println("\n\n*** MENU PRINCIPAL ***");
        System.out.println("1. Asignar Cliente ");
        System.out.println("2. Agregar Producto ");
        System.out.println("3. Pagar e iniciar nueva cuenta ");
        System.out.println("0. Salir ");
        System.out.print("Su opcion es:  ");   
        
        return sc.nextInt();
        
    }
    
    
    private static void asignarCliente()
    {
        System.out.println("\n\nASIGNAR CLIENTE =>");
        System.out.print("ID........................: ");
        int id = sc.nextInt();
        System.out.print("Nombres...................: ");
        String nombres = sc.next();
        Cliente cliente = new Cliente(id, nombres );
        venta.asignarCliente(cliente);
          
    }
    
    private static void agregarProducto()
    {
        System.out.println("\n\nAGREGAR PRODUCTO =>");
        System.out.print("ID........................: ");
        int id = sc.nextInt();
        System.out.print("Descripcion...............: ");
        String descripcion = sc.next();
        System.out.print("Tipo, 1: fijo, 2: variable: ");
        int tipo = sc.nextInt();
        
        if(tipo==1)
        {
            System.out.print("precio.....................: ");
          double precio = sc.nextDouble();
          ProductoPrecioFijo producto = new ProductoPrecioFijo(precio, id, descripcion);
          venta.agragarProducto (producto);
        }
        else{
            System.out.print("Unidad de medida...............: ");
            String unidad = sc.next();
            System.out.print("Precio x Unidad de medida......: "); 
            double precio = sc.nextDouble();
            System.out.print("Cantidad.......................: "); 
            float cantidad = sc.nextFloat();
            ProductoPrecioVariable producto = new ProductoPrecioVariable(unidad, precio, cantidad, id, descripcion);
            venta.agragarProducto (producto);       
        }
               
    }
    
   private static void pagarEIniciarNuevaCuenta()
   {
         System.out.println("\n\nTOTAL =>");
         System.out.print("El toltal a pagar es...............:$%,.2f\n"+venta.total());
         System.out.print("Confirma el pago <S>i, <N>o?.: "); 
         String respuesta = sc.next();
         if (respuesta.equalsIgnoreCase("s"))
         {
            System.out.println("\n\n RECIBO => ");
            System.out.println(venta);
            venta = new Venta();
            
         }  
       
   }
    
}
