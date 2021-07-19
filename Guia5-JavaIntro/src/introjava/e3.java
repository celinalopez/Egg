import java.util.Scanner;

/**
 * Escribir un programa que pida una frase y la muestre toda en mayúsculas y
 * después toda en minúsculas. Nota: investigar la función toUpperCase() y
 * toLowerCase() en Java.
 */
public class e3 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingresa una frase");
        String frase = leer.nextLine();
        leer.close();
        System.out.println("Frase en mayusculas: "+ frase.toUpperCase());
        System.out.println("Frase en minusculas: "+ frase.toLowerCase());
    }
}
