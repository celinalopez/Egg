import java.util.Scanner;

/**
 * Implementar un programa que dado dos números enteros determine cuál es el
 * mayor y lo muestre por pantalla.
 */
public class e6 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingresa dos numeros enteros");
        int num1 = leer.nextInt();
        int num2 = leer.nextInt();
        leer.close();
        if (num1 > num2) {
            System.out.println(num1 + " es mayor que " + num2);
        }else if (num1 < num2){
            System.out.println(num2 + " es mayor que " + num1);
        } else {
            System.out.println("Los numeros son iguales");
        }
    }
}
