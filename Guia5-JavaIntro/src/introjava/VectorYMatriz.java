import java.util.Scanner;

/**
 * Multiplicacion de un vector por una matriz
 */
public class VectorYMatriz {
    public static void main(String[] args) {

        int[] vector; //declaracion
        vector = new int[2]; //'new' crea en memoria
        //los dos pasos en una linea:
        int[] producto = new int[3];
        //[][] 2 dimensiones
        int [][] matriz = {{4,8,6},{2,1,7}};

        System.out.println("Ingrese los valores del vector de tamaño "+ vector.length);
        Scanner leer = new Scanner(System.in);

        for (int i = 0; i < vector.length; i++){
            System.out.print("v["+ i + "]=");
            //acceder al valor i del vector
            vector[i] = leer.nextInt();
        }

        //Multiplica por matriz
        int sum;
        //para cada columna de la matriz..
        for (int j=0; j < matriz[0].length; j++){
            sum = 0;
            //recorro el vector y multiplica cada columna
            for (int i=0; i < vector.length; i++){
                sum += vector[i] * matriz[i][j];
            }
            producto[j] = sum;
        }
        String aux = "";

        //Mostrar vector
        System.out.println("* Vector:");
        //Bucle for mejorado: for(tipo elemento : arreglo)
        for (int elemento: vector){
            aux += "  " + elemento;
        }
        System.out.println(aux);

        //Mostrar matriz
        System.out.println("\n* Matriz;");
        //para cada fila de la matriz
        for (int[] fila: matriz){
            aux = "";
            //para cada elemento de la fila
            for (int elemento: fila){
                aux += "  " + elemento;
            }
            System.out.println(aux);
        }

        //Mostrar resultado
        aux = "";
        System.out.println("\n* Vector x Matriz");
        for (int elemento: producto){
            aux += "  " + elemento;
        }
        System.out.println(aux);
    }
}
