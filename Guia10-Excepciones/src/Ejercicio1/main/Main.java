package Ejercicio1.main;
import Ejercicio1.persona.Persona;
import Ejercicio1.service.Service;
/**
 * Inicializar un objeto de la clase Persona ejercicio 7 de la guía POO, a null y tratar
 * de invocar el método esMayorDeEdad() a través de ese objeto. Luego, englobe el
 * código con una cláusula try-catch para probar la nueva excepción que debe ser
 * controlada.
 */

public class Main {
    public static void main(String[] args) {
        Service sv = new Service();

        try{
            Persona p1 = null;
            sv.crearPersona(p1);
        }catch (NullPointerException e){
            System.out.println("objeto nulo");
        }finally {
            Persona p1 = new Persona("",0,'X',0d,0d);
        }
    }
}