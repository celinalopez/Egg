import java.util.Scanner;

/** BUCLES Y SENTENCIAS DE SALTO
 *
 * @author celina
 * Programa que calcula la sumatoria de cada numero par
 * en el rango del numero ingresado
 */
public class Bucles {
    public static void main(String[] args) {
        int num;
        Scanner leer = new Scanner(System.in);

        do {
            System.out.println("Ingrese un numero entero positivo");
            num = leer.nextInt();
            if (num > 1000) {
                System.out.println("Este programa podria tardar, ¿Estas seguro? s/n");
                String confirma = leer.next();
                if (confirma.equals("s")) {
                    break;
                }
            }
        } while (num <= 0 || num > 1000);

        int j, suma;
        // for (inicializacion ; expresion_determinacion ; paso/incremento )
        for (int i=1 ; i <= num ; i ++){

            if (i%2 != 0)
                continue; //salta a la siguiente vuelta
            suma = 0;
            j = 1;
            while(j<=i){
                suma += j;
                j++;
            }
            System.out.println("La suma de los " + i + " numeros naturales es: "+ suma);
        }
    }
}
