import java.util.Scanner;

/**
 * Crear un programa que dado un numero determine si es par o impar.
 */
public class e7 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un numero");
        int num = leer.nextInt();
        leer.close();
        if (num == 0){
            System.out.println("0 no es un numero par ni impar");
        } else if (num % 2 == 1){
            System.out.println(num + " es impar");
        } else {
            System.out.println(num + " es par");
        }
    }
}
