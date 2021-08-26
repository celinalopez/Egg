package Ejercicio4.comparadores;

import Ejercicio4.pelicula.Pelicula;
import java.util.Comparator;

public class Comparadores {
    public static Comparator<Pelicula> ordenarPorTitulo = new Comparator<Pelicula>() {
        @Override
        public int compare(Pelicula o1, Pelicula o2) {
            return o1.getTitulo().compareTo(o2.getTitulo());
        }
    };

    public static Comparator<Pelicula> ordenarPorDirector = new Comparator<Pelicula>() {
        @Override
        public int compare(Pelicula o1, Pelicula o2) {

            return o1.getDirector().compareTo(o2.getDirector());
        }
    };

    public static Comparator<Pelicula> ordenarPorDuracionAsc = new Comparator<Pelicula>() {
        @Override
        public int compare(Pelicula o1, Pelicula o2) {
            return o1.getDuracion().compareTo(o2.getDuracion());
        }
    };

    public static Comparator<Pelicula> ordenarPorDuracionDesc = new Comparator<Pelicula>() {
        @Override
        public int compare(Pelicula o1, Pelicula o2) {
            return o2.getDuracion().compareTo(o1.getDuracion());
        }
    };

}
