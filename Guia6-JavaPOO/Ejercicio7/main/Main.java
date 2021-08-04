package Ejercicio7.main;

import Ejercicio7.persona.Persona;
import Ejercicio7.service.Service;

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