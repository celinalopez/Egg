import java.util.Arrays;
import java.util.Scanner;

/**
 * . Dadas dos matrices cuadradas de números enteros, la matriz M de 10x10 y la matriz
 * P de 3x3, se solicita escribir un programa en el cual se compruebe si la matriz P está
 * contenida dentro de la matriz M. Para ello se debe verificar si entre todas las
 * submatrices de 3x3 que se pueden formar en la matriz M, desplazándose por filas o
 * columnas, existe al menos una que coincida con la matriz P. En ese caso, el
 * programa debe indicar la fila y la columna de la matriz M en la cual empieza el
 * primer elemento de la submatriz P.
 */
public class e28 {
    public static void imprimirMatriz(int[][] matriz){
        for (int[] fila: matriz){
            String aux = "";
            for (int elemento: fila){
                aux += "  " + elemento;
            }
            System.out.println(aux);
        }
    }
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        int[][] matrizM = new int[10][10];
        for (int i = 0; i < matrizM.length; i++) {
            for (int j = 0; j < matrizM[i].length; j++) {
                matrizM[i][j] = (int) (Math.random() * 10);
            }
        }
        System.out.println("----MATRIZ M----");
        imprimirMatriz(matrizM);
        int[][] matrizP = new int[3][3];
        for (int i = 0; i < matrizP.length; i++) {
            for (int j = 0; j < matrizP[i].length; j++) {
                System.out.println("Introduzca el elemento [" + i + "," + j + "] con numeros entre 0 j 9");
                matrizP[i][j] = leer.nextInt();
            }
        }
        System.out.println("----MATRIZ P----");
        imprimirMatriz(matrizP);

        boolean valor = false;
        int [][] subM = new int [3][3];
        int nmatriz =0;

        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < 7; j++) {
                if (!valor) {
                    int x = 0;
                    System.out.println("Submatriz: " + nmatriz);
                    for (int k = i; k < (i + 3); k++) {
                        int y = 0;
                        for (int l = j; l < (j + 3); l++) {
                            subM[x][y] = matrizM[k][l];
                            System.out.print(subM[x][y] + " ");
                            y++;
                        }
                        System.out.println(" ");
                        x++;
                    }
                    if (Arrays.deepEquals(subM, matrizP)) {
                        valor = true;
                        break;
                    }
                    nmatriz++;
                } else {
                    break;
                }
            }
        }

        if (valor) {
            System.out.println(
                    "La matriz P esta contenida en la matriz M: " + nmatriz);
        } else {
            System.out.println("La matriz no esta contenida");
        }
    }
}
