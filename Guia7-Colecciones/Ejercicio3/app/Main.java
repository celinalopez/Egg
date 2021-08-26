package Ejercicio3.app;

import Ejercicio3.alumno.Alumno;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Crear una clase llamada Alumno que mantenga información sobre las notas de
 * distintos alumnos. La clase Alumno tendrá como atributos, su nombre y una lista
 * de tipo Integer con sus 3 notas.
 * En el main deberemos tener un bucle que crea un objeto Alumno. Se pide toda la
 * información al usuario y ese Alumno se guarda en una lista de tipo Alumno y se le
 * pregunta al usuario si quiere crear otro Alumno o no.
 * Despues de ese bluce tendremos el siguiente método en la clase Alumno:
 * Metodo notaFinal(): El usuario ingresa el nombre del alumno que quiere calcular
 * su nota final y se lo busca en la lista de Alumnos. Si está en la lista, se llama al
 * método. Dentro del método se usará la lista notas para calcular el promedio final
 * de alumno. Siendo este promedio final, devuelto por el método y mostrado en el
 * main.
 */
public class Main {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        String value;
        ArrayList <Alumno> lista_alumnos = new ArrayList<>();

        do{
            Alumno a = new Alumno();
            System.out.println("Ingrese el nombre");
            a.setNombre(leer.next());
            System.out.println("Ingrese 3 notas");
            a.setLista_notas(leer.nextInt(), leer.nextInt(), leer.nextInt());
            lista_alumnos.add(a);
            System.out.println("Desea ingresar otro alumno? s/n");
            value = leer.next();
        } while (value.equalsIgnoreCase("s"));

        for( Alumno a : lista_alumnos){
            System.out.println(a);
        }
    }
}
