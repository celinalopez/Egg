import java.util.Scanner;

/**
 * Crea una aplicación que a través de una función nos convierta una cantidad de
 * euros introducida por teclado a otra moneda, estas pueden ser a dólares, yenes o
 * libras. La función tendrá como parámetros, la cantidad de euros y la moneda a
 * converir que será una cadena, este no devolverá ningún valor y mostrará un
 * mensaje indicando el cambio (void).
 * El cambio de divisas es:
 * * 0.86 libras es un 1 €
 * * 1.28611 $ es un 1 €
 * * 129.852 yenes es un 1 €
 */
public class e21 {
    public static void convertir(double cantidad, String moneda){
        double resultado=0;
        if (moneda.equalsIgnoreCase("libras")){
            resultado = (cantidad * 0.86);
        } else if (moneda.equalsIgnoreCase("dolares")){
            resultado = (cantidad * 1.28611);
        } else if (moneda.equalsIgnoreCase("yenes")){
            resultado = (cantidad * 129.852);
        } else{
            System.out.println("Moneda invalida");
        }
        System.out.println(resultado +" "+ moneda);
    }
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de euros a convertir");
        double cantidad = leer.nextFloat();
        System.out.println("A qué tipo de moneda lo quiere convertir?");
        String moneda = leer.next();

        convertir(cantidad, moneda);
    }

}
