package Ejercicio12.service;
import Ejercicio12.persona.Persona;

import java.util.Date;
import java.util.Scanner;

public class Service {
    private final Scanner leer = new Scanner(System.in);

    public Persona crearPersona(){
        System.out.println("Ingrese su nombre: ");
        String nombre = leer.next();
        Date fecha = new Date();
        System.out.println("*FECHA DE NACIMIENTO \n" +
                           "Ingrese dia (2 digitos): \n" +
                           "Ingrese mes (2 digitos): \n" +
                           "Ingrese año (4 digitos): ");
        fecha.setDate(leer.nextInt());
        fecha.setMonth(leer.nextInt()-1);
        fecha.setYear(leer.nextInt()-1900);
        return new Persona(nombre,fecha);
    }
    public int calcularEdad(Persona p){
        Date hoy = new Date();
        return (hoy.getYear() - p.getFechaNac().getYear());
    }
    public boolean menorQue(int edad, Persona p){
        Date fechaHoy = new Date();
        int anio = fechaHoy.getYear() - edad;
        return p.getFechaNac().getYear() > anio;
    }
}
