import java.util.Scanner;

/**
 * Considera que estás desarrollando una web para una empresa que fabrica motores
 * (suponemos que se trata del tipo de motor de una bomba para mover fluidos).
 * Definir una variable tipoMotor y permitir que el usuario ingrese un valor entre 1 y 4.
 * El programa debe mostrar lo siguiente:
 * o Si el tipo de motor es 1, mostrar un mensaje indicando “La bomba es una
 * bomba de agua”.
 * o Si el tipo de motor es 2, mostrar un mensaje indicando “La bomba es una
 * bomba de gasolina”.
 * o Si el tipo de motor es 3, mostrar un mensaje indicando “La bomba es una
 * bomba de hormigón”.
 * o Si el tipo de motor es 4, mostrar un mensaje indicando “La bomba es una
 * bomba de pasta alimenticia”.
 * o Si no se cumple ninguno de los valores anteriores mostrar el mensaje “No
 * existe un valor válido para tipo de bomba”
 */
public class e11 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Que tipo de motor busca?");
        int num = leer.nextInt();
        if (num >= 1 && num <= 4) {
            switch (num) {
                case 1:
                    System.out.println("La bomba es una bomba de agua");
                    break;
                case 2:
                    System.out.println("La bomba es una bomba de gasolina");
                    break;
                case 3:
                    System.out.println("La bomba es una bomba de hormigon");
                    break;
                case 4:
                    System.out.println("La bomba es una bomba de pasta alimenticia");
                    break;
            }
        } else {
            System.out.println("No existe un valor valido para tipo de bomba");
        }
    }
}
