package Ejercicio5;
import java.util.*;

/**
 * Se requiere un programa que lea y guarde países, y para evitar que se ingresen
 * repetidos usaremos un conjunto. El programa pedirá un país en un bucle, se
 * guardará el país en el conjunto y después se le preguntará al usuario si quiere
 * guardar otro país o si quiere salir, si decide salir, se mostrará todos los países
 * guardados en el conjunto.
 * Después deberemos mostrar el conjunto ordenado alfabéticamente para esto
 * recordar como se ordena un conjunto.
 * Y por ultimo, al usuario se le pedirá un país y se recorrerá el conjunto con un
 * Iterator, se buscará el país en el conjunto y si está en el conjunto se eliminará el
 * país que ingresó el usuario y se mostrará el conjunto. Si el país no se encuentra
 * en el conjunto se le informará al usuario
 */
public class Main {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        boolean value;
        HashSet<String> paises = new HashSet<>();

        do{
            System.out.println("Ingrese un pais: ");
            paises.add(leer.next());
            System.out.println("Desea ingresar otro pais? true/false");
            value = leer.nextBoolean();
        }while (value);

        System.out.println("PAISES INGRESADOS \n");
        for(String p : paises){
            System.out.println(p);
        }

        //Para ordenar un hashset hay que convertirlo en una lista
        ArrayList<String> lista = new ArrayList<>(paises);
        Collections.sort(lista);
        System.out.println("PAISES ORDENADOS ALFABETICAMENTE: \n");
        for(String p : paises){
            System.out.println(p);
        }
        //Eliminar un pais
        Iterator<String> it = paises.iterator();
        System.out.println("Pais que desea eliminar: ");
        String pais_deleted = leer.next();

        if (paises.contains(pais_deleted)){
            while (it.hasNext()){
                if (it.next().equalsIgnoreCase(pais_deleted)){
                    it.remove();
                }
            }
            for(String p : paises){
                System.out.println(p);
            }
        } else System.out.println("No se encuentra el pais que quiere eliminar");


    }
}
