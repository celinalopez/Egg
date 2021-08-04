import java.util.Scanner;

/**
 * Escriba un programa que lea 20 números. Si el número leído es igual a cero se debe
 * salir del bucle y mostrar el mensaje "Se capturó el numero cero". El programa
 * deberá calcular y mostrar el resultado de la suma de los números leídos, pero si el
 * número es negativo no debe sumarse. Nota: recordar el uso de la sentencia break.
 */
public class e16 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int suma = 0;
        int num;
        for (int i = 0; i < 20; ++i) {
            System.out.println("Ingrese numeros");
            num = leer.nextInt();
            if (num > 0) {
                suma = suma + num;
            }
            if (num == 0) {
                System.out.println("Se capturo un 0");
                break;
            }
        }
        System.out.println("La suma de los numeros positivos es: " + suma);
    }
}
