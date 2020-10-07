
package clasematriz;

import javax.swing.JOptionPane;

public class Matriz
{
    //atributos propios de la clase
    private   int MaxF,MaxC,F,C; // dimension de la matriz
    private ClPersona mat[][]; //array bidimensional tipo clase persona
    private ClPersona objper = new ClPersona();
    //constructor vacio
    public  Matriz(){}

    //constructor de la matriz de MaxF*MaxC, recibe dos paramatros, las filas y las columnas
     public  Matriz(int fila,int columna)
      {
        MaxF=fila;
        MaxC=columna;
        mat = new ClPersona[MaxF][MaxC];
        F=-1;
        C=-1;
       }
     public void AsignarFilas(int N){
  	MaxF = N;
  }
	  
  public int ObtenerFilas() {
  	return MaxF;
  }
  
  public void AsignarColumnas(int M){
  	MaxC = M;
  }
	  
  public int ObtenerColumnas() {
  	return MaxC;
  }
  
  public void AsignarMatriz(ClPersona ma[][]){
  	mat= ma;
  }
	  
  public ClPersona[][]  ObtenerMatriz() {
  	return mat;
  }
//ESTE METODO RETORNA UN VERDADERO SI LA MATRIZ ESTA VACIA Y UN FALSO SI LA MATRIZ ESTA LLENA
     public boolean  MatrizVerificar()
    {
         if((F==-1)||(C==-1))
         {// Matriz vacía!!
       return true;
         }
         else
         {// Matriz llena!!
               return false;
          }
     }//fin del método Matriz verificar

        public ClPersona[][] LlenarMatriz()
        {
        if(MatrizVerificar())//si la matriz esta vacia o sea retorna un verdadero, esto equivale a preguntar if(MatrizVerificar()==true)
         {//se llena la matriz
            for(F=0; F<MaxF; F++)
          {
               for(C=0; C<MaxC; C++)
                {
                 mat[F][C]=objper.EntradaDatos();
                }
          }
        }
        else//sino , la matriz esta llena
        {
            JOptionPane.showMessageDialog(null,"LA MATRIZ YA FUE CREADA!!!");
        }
        return mat;
        }//fin de crear matriz
 
     //Este metodo muestra en pantalla la matriz completa
      public String  MostrarMatriz()
      {
          String texto="\n ";//EN ESTE TEXTO ESTARA LA MATRIZ COMO CADENA COMPLETA UNIDA O CONCATENADA
          if (!MatrizVerificar())//si la matriz esta llena o sea retorna un falso, esto equivale a preguntar if(MatrizVerificar()==false)
          {
          for(F=0; F<MaxF; F++)
          {
               for(C=0; C<MaxC; C++)
                {
                    
                  texto=texto+mat[F][C].MostrarDatos();
                }
            //cuando se alcanza el final de la fila se inserta un  retorno de carro o salto de línea
             texto=texto+"\n ";
          }
         }
         else  //sino , la matriz esta vacia
         {
             JOptionPane.showMessageDialog(null,"LA MATRIZ ESTA VACÍA!!!");
        
         }
         return texto;
     }//fin de Mostrar matriz
}//fin de la clase matriz

