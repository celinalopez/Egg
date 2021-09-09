package EjemplosEgg.mascotapp2.comparadores;
import EjemplosEgg.mascotapp2.entidadess.Mascota;

import java.util.Comparator;

public class Comparadores {

    public static Comparator<Mascota> ordenarPorNombreDesc = new Comparator<Mascota>() {
        @Override
        public int compare(Mascota o1, Mascota o2) {

            return o2.getNombre().compareTo(o1.getNombre());
        }
    };

    public static Comparator<Mascota> ordenarPorEdadDesc = new Comparator<Mascota>() {
        @Override
        public int compare(Mascota o1, Mascota o2) {

            return o2.getEdad().compareTo(o1.getEdad());
        }
    };

}
