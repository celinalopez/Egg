import java.util.Scanner;
/**
 * Un cuadrado mágico 3 x 3 es una matriz 3 x 3 formada por números del 1 al 9
 * donde la suma de sus filas, sus columnas y sus diagonales son idénticas. Crear un
 * programa que permita introducir un cuadrado por teclado y determine si este
 * cuadrado es mágico o no. El programa deberá comprobar que los números
 * introducidos son correctos, es decir, están entre el 1 y el 9
 */
public class e27 {
    public static void main(String[] args) {
        int sumf=0;
        int sumc= 0;
        int diagonal1=0;
        int diagonal2=0;

        System.out.println("Ingrese el orden de la matriz");
        Scanner leer = new Scanner(System.in);
        int n = leer.nextInt();
        int[][] matriz = new int[n][n];

        for (int x = 0; x < matriz.length; x++) {
            for (int y = 0; y < matriz[x].length; y++) {
                do{
                    System.out.println("Introduzca el elemento [" + x + "," + y + "] con numeros entre 0 y 9");
                    matriz[x][y] = leer.nextInt();
                }while (matriz[x][y] > 10 || matriz[x][y] <= 0);
            }
        }
        //Imprimir matriz
        System.out.println("\n* MATRIZ");
        for (int[] fila: matriz){
            String aux = " ";
            for (int elemento: fila){
                aux += "  " + elemento;
            }
            System.out.println(aux);
        }
        System.out.println("-------------------------------------------");
        //Suma filas, columnas y diagonal
        for (int i=0; i< matriz[0].length; i++){
            sumf=0;
            sumc=0;
            for (int j=0; j < matriz[0].length; j++){
                sumf += matriz[i][j];
                sumc += matriz[j][i];
                if (i==j){
                    diagonal1 += matriz[i][j];
                }
                if ((i+j) == (matriz.length-1)){
                    diagonal2 += matriz[i][j];
                }
            }
            System.out.println("Suma de la fila " + (i+1) + ": "+ sumf);
            System.out.println("Suma de la columna " + (i+1) + ": "+ sumc);
            System.out.println("-------------------------------------------");
        }
        System.out.println("Suma de la diagonal principal: "+ diagonal1);
        System.out.println("Suma de la diagonal secundaria: "+ diagonal2);
        System.out.println("-------------------------------------------");

        if ((sumc+sumf)==(diagonal1+diagonal2)){
            System.out.println("Es un cuadrado magico");
        }else{
            System.out.println("No es un cuadrado magico");
        }
    }
}
