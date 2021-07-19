import java.util.Scanner;

/**
 * Escribir un programa que lea un número entero por teclado y muestre por pantalla
 * el doble, el triple y la raíz cuadrada de ese número. Nota: investigar la función
 * Math.sqrt().
 */
public class e5 {
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        System.out.println("Ingresa un numero entero");
        int numero = leer.nextInt();
        leer.close();
        System.out.println("El doble: " + numero*2 + "\nEl triple: " +
                numero*3 + "\nLa raiz: " + Math.sqrt(numero));
    }
}
