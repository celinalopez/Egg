package main;

import persona.Persona;
import service.Service;

/**
 * Realizar una clase llamada Persona que tenga los siguientes atributos: nombre, edad,
 * sexo ('H' hombre, 'M' mujer, 'O' otro), peso y altura. Si el alumno desea añadir algún
 * otro atributo, puede hacerlo. Los métodos que se implementarán son:
 * • Un constructor por defecto.
 * • Un constructor con todos los atributos como parámetro.
 * • Métodos getters y setters de cada atributo.
 * • Metodo crearPersona(): el método crear persona, le pide los valores de los atributos
 * al usuario y después se le asignan a sus respectivos atributos para llenar el objeto
 * Persona. Además, comprueba que el sexo introducido sea correcto, es decir, H, M o
 * O. Si no es correcto se deberá mostrar un mensaje
 * • Método calcularIMC(): calculara si la persona está en su peso ideal (peso en
 * kg/(altura^2 en mt2)). Si esta fórmula da por resultado un valor menor que 20, la
 * función devuelve un -1. Si la fórmula da por resultado un número entre 20 y 25
 * (incluidos), significa que el peso está por debajo de su peso ideal y la función
 * devuelve un 0. Finalmente, si el resultado de la fórmula es un valor mayor que 25
 * significa que la persona tiene sobrepeso, y la función devuelve un 1. Se recomienda
 * hacer uso de constantes para devolver estos valores.
 * • Método esMayorDeEdad(): indica si la persona es mayor de edad. La función
 * devuelve un booleano.
 * A continuación, en la clase app.main hacer lo siguiente:
 * Crear 4 objetos de tipo Persona con distintos valores, a continuación, llamaremos todos
 * los métodos para cada objeto, deberá comprobar si la persona está en su peso ideal,
 * tiene sobrepeso o está por debajo de su peso ideal e indicar para cada objeto si la
 * persona es mayor de edad.
 * Por último, guardaremos los resultados de los métodos calcularIMC y esMayorDeEdad
 * en distintas variables, para después en el app.main, calcular un porcentaje de esas 4
 * personas cuantas están por debajo de su peso, cuantas en su peso ideal y cuantos, por
 * encima, y también calcularemos un porcentaje de cuantos son mayores de edad y
 * cuantos menores.
 */
public class Main {
    public static void main(String[] args) {

        Persona p1,p2,p3,p4;
        Service service = new Service();

        p1 = service.crearPersona();
        service.calcularIMC(p1);
        service.esMayorDeEdad(p1);

        p2 = service.crearPersona();
        service.calcularIMC(p2);
        service.esMayorDeEdad(p2);

        p3 = service.crearPersona();
        service.calcularIMC(p3);
        service.esMayorDeEdad(p3);

        p4 = service.crearPersona();
        service.calcularIMC(p4);
        service.esMayorDeEdad(p4);

        System.out.println("Cantidad de personas mayores de edad: " + service.mayores);
        System.out.println("Cantidad de personas menores de edad: " + service.menores);
        System.out.println("Cantidad de personas con bajo peso: " + service.imcB);
        System.out.println("Cantidad de personas con peso ideal: " + service.imcI);
        System.out.println("Cantidad de personas con sobrepeso: " + service.imcA);

    }
}
