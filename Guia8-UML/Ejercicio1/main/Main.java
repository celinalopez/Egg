package Ejercicio1.main;

import Ejercicio1.entidades.Perro;
import Ejercicio1.entidades.Persona;

/**
 * Realizar un programa para que una Persona pueda adoptar un Perro. Vamos a contar de
 * dos clases. Perro, que tendrá como atributos: nombre, raza, edad y tamaño; y la clase
 * Persona con atributos: nombre, apellido, edad, documento y Perro.
 * Ahora deberemos en el main crear dos Personas y dos Perros. Después, vamos a tener
 * que pensar la lógica necesaria para asignarle a cada Persona un Perro y por ultimo,
 * mostrar desde la clase Persona, la información del Perro y de la Persona.
 */
public class Main {
    public static void main(String[] args) {

        Persona p1 = new Persona("Silvia","Rodriguez",2354523,53);
        Persona p2 = new Persona("Pablo", "Juarez", 43536234, 30);

        Perro perro1 = new Perro("Pepo","Caniche",3,"Mediano");
        Perro perro2 = new Perro("Luli", "Pichicho",4,"Grande");

        p1.setPerro(perro2);
        p2.setPerro(perro1);

        System.out.println(p1);
        System.out.println(p2);
    }
}
