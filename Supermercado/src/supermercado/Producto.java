package supermercado;

import java.io.Serializable;

public abstract class Producto implements Serializable 
{
    protected int id;
    protected String descripcion;
    
    public Producto(int id, String descripcion )
    {
        this.id = id;
        this.descripcion = descripcion;
  
    }
    
    public abstract double Valor();
    
      @Override 
    public String toString()
    {
        return String.format("%5d %-20s\n", id, descripcion );
    }
        
}
