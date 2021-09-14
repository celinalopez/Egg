package Servicios;

import Entidades.Persona;
import java.util.Scanner;

public class PersonaServicio {
Scanner leer = new Scanner(System.in).useDelimiter("\n"); // Para fijar que la lectura de datos es hasta el ENTER
   
    // Métodos
    public void cargarPersona(Persona x){
        // con variable (según problema, conviene una u otra) --> Almaceno el dato
        System.out.println("Ingrese el nombre: ");
        String nombre = leer.next();
        x.setNombre(nombre);
        // sin variable
        System.out.println("Ingrese el apellido: ");
        x.setApellido(leer.next()); // Puedo directamente, enviar como parametro la lectura por teclado
        System.out.println("Ingrese la edad: ");
        x.setEdad(leer.nextInt());      
        
    }
    //--Recordar que recibe como parametro un OBJETO cualquiera del tipo "ClasePersona"----//
    public void modificarApellido(Persona x) {
        System.out.println("Ingrese el apellido para ser reemplazado: ");
        x.setApellido(leer.next());
    }
    
    public void esTuCumpleaños(Persona x){
        x.setEdad(x.getEdad()+1); // Hago una funcion, para SET  que la persona cumplio años, por lo tanto su edad aumenta en 1
    }
    
    public int diasVividos(Persona x){
        return x.getEdad()*365; // Hice un metodo para calcular cuantos dias vivio la persona....
    }
    
}
