
package arreglos;
//arreglos vectores 
import java.util.Scanner;

public class Arreglos {//inicio de clase 
// atributos
private static Scanner sc = new Scanner(System.in);
private static int vec[];
private static int n;
    //metodo principal
    public static void main(String[] args) {//inicio ppal
        System.out.print("n? ");
        n = sc.nextInt();
        vec = new int [n];
        llenarArreglo();
        mostrarArreglo();
        String rta, r="s";
        do{
            System.out.print("Digite el numero a buscar : ");
            int num = sc.nextInt();
            int pos = buscarArreglo(num);
            if (pos == -1){
                System.out.println("Numero no encontrado");
            }else {
                System.out.println("Numero encontrado en la psoicion " + pos);
            }
            System.out.print("Desea buscar otro s/n:  ");
            rta = sc.next();
        }while (rta.equalsIgnoreCase("s"));
        
        do{
            System.out.print("ingrese el primer numero a sumar : ");
            int n1 = sc.nextInt();
            int pos1 = buscarArreglo(n1);
            while (pos1 == -1) {
                System.out.print("numero no encontrado digite otro: ");
                n1=sc.nextInt();
                pos1 = buscarArreglo(n1);
            }
             System.out.print("ingrese el segundo numero a sumar : ");
            int n2 = sc.nextInt();
            int pos2 = buscarArreglo(n2);
            while (pos2 == -1) {
                System.out.print("numero no encontrado digite otro: ");
                n2=sc.nextInt();
                pos2 = buscarArreglo(n2);
            }
            int suma = SumarArreglo(n1, n2);
            System.out.println("La suma de los dos numeros es : "+ suma);
            System.out.print("Desea sumar otros numeros s/n :");
            r = sc.next();

        }while(r.equalsIgnoreCase("S"));
        
        System.out.println("\n\n ==> PROMEDIO DEL ARREGLO ");
        float prom = PromedioArreglo();
        System.out.println("El promedio del arreglo es : "+ prom);
        
        int mayor = Mayor();
        int menor = Menor(mayor);
        System.out.println("\n\n ==> MAYOR ");
        System.out.println("----"+mayor+"--");
        System.out.println("\n\n ==> MENOR ");
        System.out.println("----"+menor+"--");
        
        Pares();
        Impares();
        Ordenar();
        Primo();
        Compuestos();
    }// fin ppal 
    
//metodos 
    
    //llenando 
    private static void llenarArreglo() {
        for (int i = 0; i < n; i++) { //inicio para 
            System.out.print("Pos " + i +":");
            vec[i]=sc.nextInt();
        }//fin para 
    }//Fin metodo llenararreglo

    //mostrando el arreglo
    private static void mostrarArreglo() {
        for (int i = 0; i < n; i++) {//inicio para 
            System.out.println("Vec[" + i + "] = " + vec[i]);
        }//fin para
    }// fin metodo 

    //buscando elemento 
    private static int buscarArreglo(int num) {
        
        for (int i = 0; i < n; i++) {//inicio para 
            if (num == vec[i]){//inicio si 
              return i ; 
            }// fin si 
           
        }//fin para
    return  -1 ;
    }//fin metodo 

    //sumando elementos 
    private static int SumarArreglo(int n1, int n2) {
        int suma;
        suma = n1 + n2;
        return suma;
    }//fin metodo 

    //hallando el promedio 
    private static float PromedioArreglo() {
         float acum=0, prom;
         for (int i = 0; i < n; i++) {//inicio para 
             acum += vec[i];
         }//fin para
         prom = acum/n;
         return prom;
    }//fin metodo 

    //mostrando menor 
    private static int Menor(int m) {
       int Men=m;
       for (int i = 0; i < n; i++) {// inicio para 
           if (vec[i]<Men){//inicio si 
           Men = vec[i];
           }// fin si 
       }//fin para 
       return Men;
    }

    //mostrando mayor 
    private static int Mayor() {
       int May=0;
       for (int i = 0; i < n; i++) {//inicio para 
           if (vec[i]>May){//inicio si 
           May = vec[i];
           }//fin si 
       }//fin para
       return May;
    }// fin metodo 

    //mostrando pares 
    private static void Pares() {
        System.out.println("\n\n==> PARES --");
        for (int i = 0; i < n; i++) {
            if (vec[i]%2 == 0){
                
                System.out.print(" " + vec[i] );
            }//fin si
        }//fin para
        
    }//fin metodo

    //mostrando impares 
    private static void Impares() {
        System.out.println("\n\n==> IMPARES --");
        for (int i = 0; i < n; i++) {//inicio para 
            if (vec [i] %2 != 0){//inicio si 
             System.out.print(" " + vec[i] );
        }//fin si 
            
        }//fin para
        
    }//fin metodo

    //ordenando
    private static void Ordenar() {
          for (int i = 0; i < n; i++) {
            int min=i;
            for (int f = i+1; f< n; f++){// inicio para f 
                
                if (vec[f]  < vec[min]){//inicio si
                    min = f ;
                     }//fin si
                if (i!=min){//inicio si 
                    
                   int  aux = vec[i];
                    vec[i] = vec [min];
                    vec[min] = aux;
                    
                }//fin si 
                
            }//fin para f
        }//fin para i
            
        
        
        System.out.println("\n\n==> ARREGLO ORDENADO --");
        for (int i = 0; i < n; i++) {//inicio para 
            System.out.print(" "   + vec[i] );
            
        }//fin para 
        
    }// fin metodo 

    private static void Compuestos() {
         int compuestos [] ;
            compuestos = new int [n];
       int  div;
        System.out.println("\n\n==> COMPUESTOS --");
           
        //calculando y guardando en un nuevo vector 
            for (int j = 0; j < n; j++) {
                   div=2;
                    while (vec[j]%div!=0 ){
                        div++;
                    }//fin mientras
                 if (div>2 && div!= vec [j]){
                          compuestos [j] = vec [j];
                     }//fin si e
                
            }//fin para j
            
            //imprimiendo los primos    
            for (int i = 0; i < n; i++) {
             System.out.println( compuestos [i] );
        }//fin para i
           
       
    }

    //mostrando primos 
    private static void Primo() {
        int primos [] ;
            primos = new int [n];
       int  div;
        System.out.println("\n\n==> PRIMOS --");
           
        //calculando y guardando en un nuevo vector 
            for (int j = 0; j < n; j++) {
                   div=2;
                    while (vec[j]%div!=0 ){
                        div++;
                    }//fin mientras
                 if (div==vec[j] ){
                          primos [j] = vec [j];
                     }//fin si e
                
            }//fin para j
            
            //imprimiendo los primos 
            for (int i = 0; i < n; i++) {
             System.out.println( primos [i] );
        }//fin para i
           
        
    }//fin metodo 
    
    
    
}//fin clase
