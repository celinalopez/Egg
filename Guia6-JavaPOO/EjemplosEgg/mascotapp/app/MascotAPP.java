package EjemplosEgg.mascotapp.app;
import EjemplosEgg.mascotapp.entidades.Mascota;
import EjemplosEgg.mascotapp.servicios.ServicioMascota;

public class MascotAPP {
    public static void main(String[] args) {

        // mostrar parametros crtl + p
        Mascota mascota1 = new Mascota("Fernando Chiquito", "Chiqui", "Perro","Tricolor",14,"Beagle");
        //Si queremos cambiarle el nombre
        mascota1.setNombre("Pepe Chiquito");

        System.out.println(mascota1.getNombre());
        //Sin el get nos muestra el espacio de memoria donde esta asignado
        //Al agregar el toString en la clase mascota nos muetra todos los datos
        System.out.println(mascota1);

        mascota1.pasear(100);
        System.out.println(mascota1);
        mascota1.pasear(100,4);
        System.out.println(mascota1);

        /*
          Ahora lo mismo pero usando el metodo Servicio
         */
        ServicioMascota sm = new ServicioMascota();
        Mascota m2 = sm.crearMascota();
        System.out.println(m2.toString());
    }
}
