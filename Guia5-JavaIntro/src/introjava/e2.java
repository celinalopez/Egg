import java.util.Scanner;

/**
 * Escribir un programa que pida tu nombre, lo guarde en una variable y lo muestre
 * por pantalla.
 */
public class e2 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingresa tu nombre");
        String nombre = leer.next();
        leer.close();
        System.out.println("Hola "+ nombre);
    }
}
