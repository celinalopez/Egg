/**
 * Realizar un programa que rellene un matriz de 4 x 4 de valores aleatorios y
 * muestre traspuesta. (Matriz que cambia de lugar las filas x columnas)
 */
public class e25 {
    public static void main(String[] args) {
    int [][] matriz = new int[4][4];
    int [][] matrizt = new int[4][4];
    //Rellena la matriz
    for (int n=0; n < matriz.length; n++) {
        for (int m=0; m < matriz[n].length; m++) {
            matriz[n][m] = (int) (Math.random()*10);
        }
    }
    //Hacer su transpuesta
    for (int x = 0; x < matriz.length; x++){
        for (int y = 0; y< matriz[x].length; y++){
            matrizt[x][y] = matriz[y][x];
        }
    }
    //Imprimir matriz
    System.out.println("\n*  Matriz:");
    for (int[] fila: matriz){
        String aux = "";
        for (int elemento: fila){
            aux += "  " + elemento;
        }
        System.out.println(aux);
    }
    //Imprimir matriz transpuesta
    System.out.println("\n*  Matriz Transpuesta:");
    for (int[] fila: matrizt){
        String aux = "";
        for (int elemento: fila){
            aux += "  " + elemento;
        }
        System.out.println(aux);
    }
    }
}
