package Extra1.app;

import Extra1.entidades.Perro;
import Extra1.entidades.Persona;
import Extra1.service.Service;

/**
 Ahora se debe realizar unas mejoras al ejercicio de Perro y Persona. Nuestro programa
 va a tener que contar con muchas personas y muchos perros. El programa deberá
 preguntarle a cada persona, que perro según su nombre, quiere adoptar. Dos personas
 no pueden adoptar al mismo perro, si la persona eligió un perro que ya estaba adoptado,
 se le debe informar a la persona.
 Una vez que la Persona elige el Perro se le asigna, al final deberemos mostrar todas las
 personas con sus respectivos perros.
 */
public class Main {
    public static void main(String[] args) {

        Service sv = new Service();

        Persona p1 = new Persona("Silvia","Rodriguez",2354523,53);
        Persona p2 = new Persona("Pablo", "Juarez", 43536234, 30);
        Persona p3 = new Persona("Lionel", "Messi", 455632, 36);
        Perro perro1 = new Perro("Pepo","Caniche",3,"Pequeño", false);
        Perro perro2 = new Perro("Luli", "Pichicho",4,"Grande",false);
        Perro perro3 = new Perro("Voldemort", "Doberman",4,"Grande",false);

        sv.agregarPersona(p1);
        sv.agregarPersona(p2);
        sv.agregarPerro(perro1);
        sv.agregarPerro(perro2);

        //Testing
        sv.servicioAdopcion(p2, perro1); //ok
        sv.servicioAdopcion(p3,perro2); //Error, persona no registrada
        sv.servicioAdopcion(p1,perro3); //Error, perro no registrado
        sv.servicioAdopcion(p1,perro1); //Error, perro ya adoptado

        sv.mostrarPersonas();

    }
}
