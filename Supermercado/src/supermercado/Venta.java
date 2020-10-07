package supermercado;
import java.util.ArrayList;

public class Venta 
{
    private Cliente cliente; 
    private ArrayList <Producto> productos;
    
    public Venta()
    {
        cliente = new Cliente();
        productos = new ArrayList<>();
        
    }
    
    public void asignarCliente(Cliente cliente)
    {
        this.cliente = cliente;
    }
    
    public void agragarProducto (Producto producto)
    {
        productos.add(producto);
        
    }
    
    public double total()
    {
        double total=0;
        
        for (Producto producto: productos )
        {
            total += producto.Valor(); 
        }
        return total;
    }
    
    @Override
    public String toString()
    {
        String aux = "Cliente:" + cliente.toString();
        aux+= "ID       descripcion   Valor\n";
        aux+= "=====  ============== ============\n";
        for(Producto producto: productos )
        {
            aux+= producto.toString();
            
        }
        aux+="                        ============\n";
        aux+= String.format("%26s $%,10.2f", "", total());
        return aux;
    }
}
