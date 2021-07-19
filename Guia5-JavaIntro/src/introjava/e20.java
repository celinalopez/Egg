import java.util.Scanner;

/**
 * Realizar un programa que lea 4 números (comprendidos entre 1 y 20) e imprima el
 * número ingresado seguido de tantos asteriscos como indique su valor.
 */
public class e20 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        for (int i=0; i <4 ; i++){
            System.out.println("\nIngrese 4 numeros");
            int num = leer.nextInt();
            System.out.print(num+" ");
            for (int j=0; j < num ; j++){
                System.out.print("*");
            }
        }
    }
}
