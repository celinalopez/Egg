package EjemplosEgg.mascotapp.servicios;
import EjemplosEgg.mascotapp2.entidadess.Mascota;

import java.util.Scanner;

public class ServicioMascota {
    private Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public Mascota crearMascota(){
        System.out.println("Introducir nombre");
        String nombre = leer.next();
        System.out.println("Introducir apodo");
        String apodo = leer.next();
        System.out.println("Introducir tipo");
        String tipo = leer.next();
        System.out.println("Introducir color");
        String color = leer.next();
        System.out.println("Introducir edad");
        int edad = leer.nextInt();
        System.out.println("Tiene cola?");
        boolean cola = leer.hasNextBoolean();
        System.out.println("Introducir raza");
        String raza = leer.next();
        // mostrar parametros crtl + p
        return new Mascota(nombre,apodo,tipo,color,edad,raza);

    }
}
