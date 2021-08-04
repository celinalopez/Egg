import java.util.Scanner;

/**
 * Escriba un programa en el cual se ingrese un valor límite positivo, y a continuación
 * solicite números al usuario hasta que la suma de los números introducidos supere
 * el límite inicial.
 */
public class e14 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un limite");
        int limite = leer.nextInt();
        int sum = 0;
        do{
            System.out.println("Ingrese numeros para sumar");
            int num = leer.nextInt();
            sum = sum + num;
        } while (sum < limite);
    }
}
