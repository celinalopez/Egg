import java.util.Scanner;
/**
 *
 * @author celina
 */
public class HolaMundo {
    
    public static void main(String[] args) {
        
        //variable Scanner con nombre "leer" que lee datos del usuario
        Scanner leer = new Scanner(System.in);
        //variable cadena que lee datos
        String nombre;
        System.out.println("Ingresa tu nombre: ");
        nombre = leer.next();
        System.out.println("Hola mundo! Soy " + nombre);
        
    }
    
}
