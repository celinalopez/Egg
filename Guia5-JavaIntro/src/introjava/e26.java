import java.util.Arrays;
import java.util.Scanner;
/**
 * Realice un programa que compruebe si una matriz dada es anti simétrica. Se dice
 * que una matriz A es anti simétrica cuando ésta es igual a su propia traspuesta, pero
 * cambiada de signo. Es decir, A es anti simétrica si A = -AT
 * . La matriz traspuesta de
 * una matriz A se denota por A
 * T y se obtiene cambiando sus filas por columnas (o
 * viceversa).
 */
public class e26 {
    public static void main(String[] args) {
        System.out.println("Ingrese el orden de la matriz");
        Scanner leer = new Scanner(System.in);
        int n = leer.nextInt();
        int[][] matriz = new int[n][n];
        int[][] matrizt = new int[n][n];
        int[][] matneg = new int[n][n];

        //Llenar matriz
        for (int x = 0; x < matriz.length; x++) {
            for (int y = 0; y < matriz[x].length; y++) {
                System.out.println("Introduzca el elemento [" + x + "," + y + "]");
                matriz[x][y] = leer.nextInt();
            }
        }
        //Crea transpuesta y matriz negativa
        for (int x = 0; x < matriz.length; x++) {
            for (int y = 0; y < matriz[x].length; y++) {
                matrizt[x][y] = matriz[y][x];
                matneg [x][y] = -matrizt[x][y];
            }
        }
        //Mostrar matriz
        System.out.println("\n*  Matriz:");
        for (int[] fila : matriz) {
            String aux = "";
            for (int elemento : fila) {
                aux += "  " + elemento;
            }
            System.out.println(aux);
        }
        //Imprimir matriz transpuesta
        System.out.println("\n*  Matriz Transpuesta:");
        for (int[] fila : matrizt) {
            String aux = "";
            for (int elemento : fila) {
                aux += "  " + elemento;
            }
            System.out.println(aux);
        }
        //Matriz traspuesta negativa
        System.out.println("\n*  Matriz Transpuesta Negativa:");
        for (int[] fila : matneg) {
            String aux = "";
            for (int elemento : fila) {
                aux += "  " + elemento;
            }
            System.out.println(aux);
        }
        //Verificamos que sea igual

        if (Arrays.deepEquals(matriz, matneg)){
            System.out.println("La matriz es antisimetrica");
        } else {
            System.out.println("La matriz NO es antisimetrica");
        }
    }

}
