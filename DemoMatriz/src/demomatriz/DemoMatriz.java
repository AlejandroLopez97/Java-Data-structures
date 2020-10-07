
package demomatriz;

import java.util.Random;
import java.util.Scanner;


public class DemoMatriz {

    private static int n;
    private static int mat[][];
    private static Scanner sc = new Scanner (System.in);
    
    public static void main(String[] args) {
        int opc;
        
        do{
            opc = menu();
            
            switch (opc){
                case 1: 
                    crearMatriz();
                    break ;
                case 2:
                    mostrarMatriz();
                    break;
                case 3:
                    mostrarDiagonalPrincipal();
                    break;
                case 4:
                    mostrarDiagonalSecundaria();
                    break;
                case 5: 
                    mostrarDiagonalPrincipalInversa();
                    break;
                case 6:
                    mostrarDiagonalSecundariaInversa();
                    break;
                case 7: 
                    mostrarTriangualInferior();
                    break;
                case 8:
                    mostrarTriangularSuperior();
                    break;
            }
        }while (opc != 0);
    }

    private static int menu() {
        System.out.println("==> MENU <==");
        System.out.println("1. Crar matriz ");
        System.out.println("2. Mostrar matriz ");
        System.out.println("3. Mostrar diagonal principal");
        System.out.println("4. Mostrar diagonal secundaria");
        System.out.println("5. Mostrar diagonal principal inversa");
        System.out.println("6. Mostrar diagonal secundaria inversa");
        System.out.println("7. Mostrar triangular inferior ");
        System.out.println("8. Mostrar triangular superior ");
        System.out.println("0. Salir ");
        System.out.print("Digita tu opcion ");
        return sc.nextInt();
    }

    private static void mostrarMatriz() {
        System.out.println("==> MOSTRAR MATRIZ <==");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.printf("%4d", mat[i][j]);
                
            }
            System.out.println();
        }
    }

    private static void crearMatriz() {
        System.out.println("==> CREAR MATRIZ <==");
        System.out.print("De que orden quiere la matriz? ");
        n = sc.nextInt();
        mat = new int [n][n];//instanciamos la matriz 
        Random rd = new Random ();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                mat [i][j] =rd.nextInt(100)+1;
                
            }
            
        }
        
        
    }

    private static void mostrarDiagonalPrincipal() {
        System.out.println("==> DIAGONAL PRINCIPAL <==");
        for (int i = 0; i < n; i++) {
            System.out.printf("%4d",mat[i][i]);
            
        }
        System.out.println();
    }

    private static void mostrarDiagonalSecundaria() {
        System.out.println("==> DIAGONAL SECUNDARIA <==");
        for (int i = 0; i < n; i++) {
            System.out.printf("%4d",mat[i][n-i-1]);
            
        }
        System.out.println();
    }

    private static void mostrarDiagonalPrincipalInversa() {
        System.out.println("==> DIAGONAL PRINCIPAL INVERSA <==");
        for (int i = 0; i < n; i++) {
            System.out.printf("%4d",mat[n-i-1][n-i-1]);
            
        }
        System.out.println();
    }

    private static void mostrarDiagonalSecundariaInversa() {
         System.out.println("==> DIAGONAL SECUNDARIA <==");
        for (int i = 0; i < n; i++) {
            System.out.printf("%4d",mat[n-i-1][i]);
            
        }
        System.out.println();
    }

    private static void mostrarTriangualInferior() {
         System.out.println("==> MOSTRAR TRIANGULAR INFERIOR <==");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.printf("%4d", mat[i][j]);
               
                
            }
            System.out.println();
        }
    }

    private static void mostrarTriangularSuperior() {
         System.out.println("==> MOSTRAR TRIANGULAR SUPERIOR <==");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.printf("%4d", mat[j][i]);
                
            }
            System.out.println();
        }
    }

   
    
}
