import java.util.Scanner;
/**
 *
 * @author celina
 */
public class Condicional {

    public static void main(String[] args) {
        //se define la variable de tipo entera
        int opinion;
        
        Scanner leer = new Scanner(System.in);
        System.out.println("Clasifica la peli del 1 al 5 estrellas");
        
        //para que lea un entero, es como int(input
        opinion = leer.nextInt();
        
        if (opinion >= 1 && opinion <= 5) {
            // condicional multiple "segun"
            switch (opinion) {
                case 1:
                case 2:
                    System.out.println("Nos sentimos apenados");
                    break;
                case 3:
                    System.out.println("Has clasificado la peli como 'buena'");
                    break;
                case 4:
                    System.out.println("Has clasificado la peli como 'muy buena'");
                    break;
                case 5:
                    System.out.println("Has clasificado la peli como 'excelente'");
                    break;
                // el equivalente a "de otro modo" es default: ...
            }
        } else if (opinion < 0) {
            System.out.println("Opinion negativa");
        } else if (opinion == 0) {
            System.out.println("el valor " + opinion + " no es valido");
        } else {
            System.out.println("El valor es mayor a 5");
        }
        System.out.println("Hasta la proxima!");
    }
    
}
