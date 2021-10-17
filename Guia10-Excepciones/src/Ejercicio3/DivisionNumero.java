package Ejercicio3;
import java.util.InputMismatchException;
import java.util.Scanner;
/**
 * Defina una clase llamada DivisionNumero. En el método main utilice un Scanner
 * para leer dos números en forma de cadena. A continuación, utilice el método
 * parseInt() de la clase Integer, para convertir las cadenas al tipo int y guardarlas en
 * dos variables de tipo int. Por ultimo realizar una división con los dos numeros y
 * mostrar el resultado.
 * Todas estas operaciones puede tirar excepciones a manejar, el ingreso por
 * teclado puede causar una excepción de tipo InputMismatchException, el método
 * Integer.parseInt() si la cadena no puede convertirse a entero, arroja una
 * NumberFormatException y además, al dividir un número por cero surge una
 * ArithmeticException. Manipule todas las posibles excepciones utilizando bloques
 * try/catch para las distintas excepciones
 */
public class DivisionNumero {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");

        try{
            System.out.println("Ingrese 2 numeros");
            String num1 = leer.next();
            String num2 = leer.next();
            int num11 = Integer.parseInt(num1);
            int num22 = Integer.parseInt(num2);
            int div = num11 / num22;
            System.out.println(div);

        }catch (InputMismatchException e){
            System.out.println(e.getMessage());
        }catch (NumberFormatException e){
            System.out.println("La cadena no pudo convertirse a numero");
        }catch (ArithmeticException e){
            System.out.println("No se puede dividir por cero");
        }catch (Exception e){
            System.out.println(e.getMessage());
        }

    }
}
