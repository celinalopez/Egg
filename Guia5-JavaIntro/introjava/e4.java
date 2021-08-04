import java.util.Scanner;
/**
 * Dada una cantidad de grados centígrados se debe mostrar su equivalente en
 * grados Fahrenheit. La fórmula correspondiente es: F = 32 + (9 * C / 5).
 */
public class e4 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingresa los grados centigrados a convertir");
        float grados = leer.nextFloat();
        leer.close();
        System.out.println((32+(grados*9/5)) + " grados Fahrenheit");
    }
}
