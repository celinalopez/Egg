import java.util.Scanner;

/**
 * Realizar un programa que pida dos números enteros positivos por teclado y
 * muestre por pantalla el siguiente menú:
 * El usuario deberá elegir una opción y el programa deberá mostrar el resultado por
 * pantalla y luego volver al menú. El programa deberá ejecutarse hasta que se elija la
 * opción 5. Tener en cuenta que, si el usuario selecciona la opción 5, en vez de salir
 * del programa directamente, se debe mostrar el siguiente mensaje de confirmación:
 * ¿Está seguro que desea salir del programa (S/N)? Si el usuario selecciona el
 * carácter ‘S’ se sale del programa, caso contrario se vuelve a mostrar el menú.
 */
public class e15 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int num1,num2;
        int reinicio = 0;
        String opcion;
        String menu = "    MENU \n 1.Sumar \n 2.Restar \n 3.Multiplicar \n 4.Dividir \n 5.Salir \n Elija opcion: ";

        do{
            do{
                System.out.println("Ingrese 2 numeros enteros positivos");
                num1 = leer.nextInt();
                num2 = leer.nextInt();
                if (num1 < 0 || num2 < 0){
                    System.out.println("Numero/s invalido/s vuelva a intentar");
                }
            } while (num1 < 0 || num2 < 0);

            System.out.println(menu);
            int operacion = leer.nextInt();

            if (operacion >= 1 && operacion < 5){
                switch (operacion) {
                    case 1 : System.out.println("Resultado: " + (num1 + num2));
                    case 2 : System.out.println("Reultado: " + (num1 - num2));
                    case 3 : System.out.println("Resultado: " + (num1 * num2));
                    case 4 : System.out.println("Resultado: " + (num1 / num2));
                    default : System.out.println("Numero de operacion invalido");
                }
            } else if (operacion == 5){
                System.out.println(" ¿Está seguro que desea salir del programa (S/N)?");
                opcion = leer.next();
                if (opcion.equalsIgnoreCase("S")){
                    reinicio = 1;
                }
            }
        } while (reinicio == 0);

    }
}