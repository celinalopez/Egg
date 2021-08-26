package Ejercicio1;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Diseñar un programa que lea y guarde razas de perros en un ArrayList de tipo
 * String. El programa pedirá una raza de perro en un bucle, el mismo se guardará
 * en la lista y después se le preguntará al usuario si quiere guardar otro perro o si
 * quiere salir. Si decide salir, se mostrará todos los perros guardados en el ArrayList.
 */
public class Main {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        ArrayList <String> perros = new ArrayList<>();
        String value;

        do {
            System.out.println("Ingrese una raza de perro: ");
            perros.add(leer.next());
            System.out.println("Quiere guardar otro perro? s/n");
            value = leer.next();
        } while (value.equalsIgnoreCase("s"));

        System.out.println("Las razas ingresadas son:");
        for(String perro: perros){
            System.out.println(perro);
        }
    }
}
