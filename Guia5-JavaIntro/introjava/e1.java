import java.util.Scanner;

/**
 * Escribir un programa que pida dos números enteros por teclado y calcule la suma
 * de los dos. El programa deberá después mostrar el resultado de la suma
 */
public class e1 {
    public static void main(String[] args) {
    int num1, num2;

    Scanner leer = new Scanner(System.in);
    System.out.println("Ingresa 2 numeros enteros para sumar");
    num1 = leer.nextInt();
    num2 = leer.nextInt();
    leer.close();
    System.out.println("El resultado de la suma es: " + (num1+num2));
    }
}
