package Ejercicio2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

/**
 * Continuando el ejercicio anterior, después de mostrar los perros, al usuario se le
 * pedirá un perro y se recorrerá la lista con un Iterator, se buscará el perro en la lista.
 * Si el perro está en la lista, se eliminará el perro que ingresó el usuario y se mostrará
 * la lista ordenada. Si el perro no se encuentra en la lista, se le informará al usuario
 * y se mostrará la lista ordenada.
 */
public class Main {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        ArrayList<String> perros = new ArrayList<>();
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
        /* Reutiliza la variable value */
        boolean encuentra=false;

        Iterator<String> it = perros.iterator();
        System.out.println("perro que desea borrar de la lista: ");
        value = leer.next();
        while(it.hasNext()){
            if (it.next().equalsIgnoreCase(value)){
                perros.remove(value);
                encuentra = true;
            }
        }
        if (!encuentra){
            System.out.println("El perro no se encuentra en la lista");
        }
        /* Sea verdadero o no siempre se ordena y muestra la lista*/
        Collections.sort(perros);
        System.out.println("Las razas ordenadas son:");
        for(String perro: perros){
            System.out.println(perro);
        }

    }
}
