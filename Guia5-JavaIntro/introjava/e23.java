import java.util.Arrays;
import java.util.Scanner;

/**
 * Realizar un algoritmo que rellene un vector de tamaño N con valores aleatorios y le
 * pida al usuario un numero a buscar en el vector. El programa mostrará donde se
 * encuentra el numero y si se encuentra repetido
 */
public class e23 {
    public static void main(String[] args) {
        int cont =0;
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el tamaño del vector");
        int n = leer.nextInt();
        int[] vector = new int[n];
        for (int i = 0; i < n; i++) {
            vector[i]= (int) (Math.random()*20);
        }
        System.out.println(Arrays.toString(vector));
        System.out.println("Que numero desea buscar?");
        int num = leer.nextInt();
        for (int i = 0; i < vector.length; i++){
            if (vector[i] == num){
                cont++;
                System.out.println("El numero se encuentra en la posicion "+ i);
            }
        }
        System.out.println("Se repite "+ cont+" veces.");
    }
}
