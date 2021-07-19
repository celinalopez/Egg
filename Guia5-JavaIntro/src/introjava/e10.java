import java.util.Locale;
import java.util.Scanner;

/**
 * Escriba un programa que pida una frase o palabra y valide si la primera letra de esa
 * frase es una ‘A’. Si la primera letra es una ‘A’, se deberá de imprimir un mensaje por
 * pantalla que diga “CORRECTO”, en caso contrario, se deberá imprimir
 * “INCORRECTO”. Nota: investigar la función Substring y equals() de Java.
 */
public class e10 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ingrese una frase o palabra que empiece con 'A'");
        String frase = leer.next();
        leer.close();
        String letra = frase.toUpperCase().substring(0,1);

        if (letra.equals("A")){
            System.out.println("Correcto");
        } else {
            System.out.println("Incorrecto");
        }
    }
}
