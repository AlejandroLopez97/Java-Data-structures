
package clasematriz;

import javax.swing.JOptionPane;

public class ClPersona {
	// Atributos
  private String nombres;
  private String ident;
  private int edad;
  private double salario;
	  
  // Constructores
  public ClPersona() {}
	  
  public ClPersona(String nom, String id, int e, double sbm) 
  {
  	nombres = nom;
        ident=id;
  	edad=e;
  	salario = sbm;
  }
  
  	
  // Metodos Publicos
  public void AsignarNombres(String nom){
  	nombres = nom;
  }
	  
  public String ObtenerNombres() {
  	return nombres;
  }
	  
  public void AsignarIdentificacion(String id) {
  	ident = id;
  }
	  
  public String ObtenerIdentificacion() {
  	return ident;
  }
	  
  public void AsignarEdad(int ed) {
  	edad = ed;
  }
	  
  public int ObtenerEdad() {
  	return edad;
  }

  public void AsignarSalario(double sbm) {
  	salario = sbm;
  }
	  
  public double ObtenerSalario() {
  	return salario;
  }
  // Metodos Publicos
  public ClPersona EntradaDatos()
  {
      String nom,id;int e;double sbm;
      AsignarNombres(nom=JOptionPane.showInputDialog("Digite Nombre:"));
      AsignarIdentificacion(id=JOptionPane.showInputDialog("Digite Identificación:"));
      AsignarEdad(e=Integer.parseInt(JOptionPane.showInputDialog("Digite edad:")));
      AsignarSalario(sbm=Double.parseDouble(JOptionPane.showInputDialog("Digite salario basico mensual:")));
      ClPersona obj=new ClPersona(nom,id,e,sbm);
      return obj;
  }//fin de entrada de datos*/
  
  public String MostrarDatos()
  {
      String text="\n\nNombre: " +this.nombres+"\nIdentificaciòn: " +this.ident+"\nEdad: "+this.edad+"Salario: "+this.salario;
      return text;
      
  }//fin de entrada de datos
}//fin clase persona
