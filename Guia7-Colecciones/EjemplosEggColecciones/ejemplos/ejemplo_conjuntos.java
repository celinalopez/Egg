package EjemplosEggColecciones.ejemplos;
import EjemplosEggColecciones.mascotapp.mascota2.Mascota;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

//  Los conjuntos no soportan elementos duplicados

public class ejemplo_conjuntos {
    public static void main(String[] args) {

        Set<String> nombres = new HashSet<>();

        nombres.add("chiquito");
        nombres.add("chiquito");
        nombres.add("chiquito");

        for (String nombre : nombres){
            System.out.println(nombre);
        }

        TreeSet<String> nombres2 = new TreeSet<>();
        nombres2.add("chiquito");
        nombres2.add("chiquito");
        nombres2.add("chiquito");

        for (String nombre : nombres2){
            System.out.println(nombre);
        }

//      En la clase mascota definimos los equals() and HashCode para comparar entre objetos de tipo mascota
        Set<Mascota> mascotas = new HashSet<>();

        mascotas.add(new Mascota("Fer", "chiquito", "perro", "negro", 3, "caniche"));
        mascotas.add(new Mascota("Fer", "chiquito", "perro", "negro", 3, "caniche"));
        mascotas.add(new Mascota("Fer", "chiquito", "perro", "negro", 3, "caniche"));

        //Ahora nos va a devolver solo un fer chiquito
        for (Mascota mascota : mascotas){
            System.out.println(mascota);
        }
    }

}
