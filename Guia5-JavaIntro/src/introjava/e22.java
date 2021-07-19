/**
 * Realizar un algoritmo que rellene un vector con los 100 primeros números enteros y
 * los muestre por pantalla en orden descendente.
 */
public class e22 {
    public static void main(String[] args) {
        int[] vector = new int[100];
        System.out.println("Vector ascendente: ");
        for (int i = 0; i < 100; i++) {
            vector[i] = i;
            System.out.print(" "+i);
        }
        System.out.println("\nVector descendente: ");
        for (int j= vector.length-1; j>0; j--){
            System.out.print(" "+ j);
        }
    }
}
