package supermercado;
public class Cliente
{
    private int id;
    private String nombres;
    
    public Cliente ()
    {
    }
    public Cliente (int id, String nombres)
    {
      this.id = id; 
      this.nombres = nombres;
      
    }
    @Override 
    
    public String toString()
    {
     if (id==0)
     {
         return "Sin Client/n";
     }
     return String.format("%d %s/n", id, nombres );
    }
    
    
}
