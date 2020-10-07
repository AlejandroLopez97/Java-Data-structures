/*Crea una matriz tipo registro de clase persona, la imprime toda y muestra el promedio de edad, y el nombre del que obtiene el mayor salario, 
 la clase persona tiene:
   nombres, del empleado;
   ident, cedula o identificacion del empleado;
   edad, edad en años del empleado;
   salario, salario basico mensual;
   y toda la información va contenida en cada posicion de fila y columna de la matriz
	  */

package clasematriz;

import javax.swing.JOptionPane;

public class ClaseMatriz
{
  static int i,j,N,M;
  ClPersona matriz[][];
  static Matriz objmat=new Matriz();
  public static void main(String[] args)
      {
        N=Integer.parseInt(JOptionPane.showInputDialog(null,"Digite numero de filas:"));
        M=Integer.parseInt(JOptionPane.showInputDialog(null,"Digite numero de columnas:"));
        String texto;        
//objeto de la matriz
        objmat=new Matriz(N,M);
        //colocamos datos en la matriz
        objmat.LlenarMatriz();
       //instanciar la clase del principal
        ClaseMatriz objppal=new ClaseMatriz();
        
        int op = 0;
        while (op<7){
            op = Integer.parseInt
        (JOptionPane.showInputDialog("MENU"
        + "\n1.Salario mayor"
        + "\n2.Promedio edad"
        + "\n3.Edad mayor"
        + "\n4.Total nomina"
        + "\n5.Nombres de la diagonal" 
        + "\n6.Organizar filas ascendentemente" 
        + "\n7.Terminar"));
            
    switch(op){
                case 1:
                   texto = objppal.salarioMay();
                   JOptionPane.showMessageDialog
                   (null,"obtiene el mayor salario" + texto);
                    break;
                case 2:
                    JOptionPane.showMessageDialog
                   (null,"el promedio de edades es: " +
                    objppal.PromediarEdad());
                    break;
                case 3:
                     JOptionPane.showMessageDialog
                   (null,"el mayor de edades es: " +
                    objppal.edadMay());
                    break;
                case 4:
                    JOptionPane.showMessageDialog
                   (null,"el total de nomina es : " +
                    objppal.totalNom());
                    break;
                case 5:
                    
                    
                              
            }//fin caso
        }// fin mientras 
        
      }//FIN DEL METODO main
      
      public double PromediarEdad()
{
    double AcumEd=0,prom;
    matriz=objmat.ObtenerMatriz();
    for(i=0; i<objmat.ObtenerFilas(); i++)
          {
               for(j=0; j<objmat.ObtenerColumnas(); j++)
                {
                     AcumEd=AcumEd+matriz[i][j].ObtenerEdad();
                }//fin para j
          }//fin para i
    prom=AcumEd/(objmat.ObtenerFilas()*objmat.ObtenerColumnas()); 
    return prom;
}//fin de promediar edad 
      
      public String salarioMay()
{
    
    String nommay="";
    matriz=objmat.ObtenerMatriz();
    double may=matriz[0][0].ObtenerSalario();
    for(i=0; i<objmat.ObtenerFilas(); i++)
          {
               for(j=0; j<objmat.ObtenerColumnas(); j++)
                {
                     if(matriz[i][j].ObtenerSalario()>may)
                     {
                         may=matriz[i][j].ObtenerSalario();
                         nommay=matriz[i][j].ObtenerNombres();
                     }
                }//fin para f
          }//fin para c
     
    return nommay;
}//fin de mayor salario 
      public String edadMay()
{
    
    String nommay="";
    matriz=objmat.ObtenerMatriz();
    double may=matriz[0][0].ObtenerEdad();
    for(i=0; i<objmat.ObtenerFilas(); i++)
          {
               for(j=0; j<objmat.ObtenerColumnas(); j++)
                {
                     if(matriz[i][j].ObtenerEdad()>may)
                     {
                         may=matriz[i][j].ObtenerEdad();
                         nommay=matriz[i][j].ObtenerNombres();
                     }
                }//fin para f
          }//fin para i
     
    return nommay;
}//fin de mayor salario 

    private double totalNom() {
        matriz=objmat.ObtenerMatriz();
        double total=0;
        for (int k = 0; k < objmat.ObtenerFilas(); k++) {
            
            for (int l = 0; l < objmat.ObtenerColumnas(); l++) {
                total+= matriz [k][l].ObtenerSalario();
            }//fin para l
        }//fin para k
      return total;
     }
    
}//fin clase principal o claseproyecto

