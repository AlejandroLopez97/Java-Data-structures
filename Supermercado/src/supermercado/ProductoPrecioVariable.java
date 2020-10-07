package supermercado;
public class ProductoPrecioVariable extends Producto
{
    private String unidadMedida;
    private double precioUnidad;
    private float cantidad;
    
    
    public ProductoPrecioVariable(String unidadMedida, double precioUnidad, float cantidad, int id, String descripcion)
    {
        super (id, descripcion);
        
        this.unidadMedida = unidadMedida;
        this.precioUnidad = precioUnidad;
        this.cantidad = cantidad;
        
    }
    
    @Override
    public double Valor()
    {
        return precioUnidad * cantidad ;
        
    }
    
    @Override
    public String toString()
    {
        return String.format("%25s $%, 10.2f\n", super.toString(), Valor());
    }
    
}
