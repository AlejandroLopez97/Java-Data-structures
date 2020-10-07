package supermercado;

public  class ProductoPrecioFijo extends Producto
{
    private double precio;
    
    public ProductoPrecioFijo(double precio, int id, String descripcion)
    {
        super(id, descripcion);
        this.precio = precio;
        
    }
    
    @Override
    public double Valor()
    {
        return precio;
    }
    
    @Override
    public String toString()
    {
        return String.format("%25s $%, 10.2f\n", super.toString(), Valor());
    }

}
