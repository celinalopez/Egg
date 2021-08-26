package Ejercicio4.servicios;
import Ejercicio4.comparadores.Comparadores;
import Ejercicio4.pelicula.Pelicula;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Service {

    private final Scanner leer;
    private List<Pelicula> lista_peliculas;

    public Service() {
        this.lista_peliculas = new ArrayList<>();
        this.leer = new Scanner(System.in);
    }

    public Pelicula crearPelicula(){

        System.out.print("Titulo de la pelicula: ");
        String titulo = leer.next();
        System.out.print("Director de la pelicula: ");
        String director = leer.next();
        System.out.println("Duracion de la pelicula en horas");
        int duracion = leer.nextInt();
        return new Pelicula(titulo,director,duracion);
    }

    public void add_lista(Pelicula p){
        lista_peliculas.add(p);
    }

    public void agregarPelicula(){
        boolean value;
        do{
            add_lista(crearPelicula());
            System.out.println("Quiere agregar una pelicula? true/false");
            value = leer.nextBoolean();
        } while (value);
    }

    public void mostrarPeliculas(){
        for (Pelicula p : lista_peliculas){
            System.out.println(p.toString());
        }
    }

    public void mayorHora(){
        System.out.println("*PELICULAS CON DURACION MAYOR A 1 HORA");
        for (Pelicula p : lista_peliculas){
            if (p.getDuracion() > 1){
                System.out.println(p.toString());
            }
        }
    }


    public void ordenarDuracionAsc(){
        System.out.println("*PELICULAS ORDENADAS DE MENOR A MAYOR POR DURACION");
        lista_peliculas.sort(Comparadores.ordenarPorDuracionAsc);
        mostrarPeliculas();
    }

    public void ordenarDuracionDesc(){
        System.out.println("*PELICULAS ORDENADAS DE MAYOR A MENOR POR DURACION");
        lista_peliculas.sort(Comparadores.ordenarPorDuracionDesc);
        mostrarPeliculas();
    }

    public void ordenarTitulo(){
        System.out.println("*PELICULAS ORDENADAS POR TITULO ALFABETICAMENTE");
        lista_peliculas.sort(Comparadores.ordenarPorTitulo);
        mostrarPeliculas();
    }

    public void ordenarDirector(){
        System.out.println("*Peliculas ordenadas por director alfabeticamente");
        lista_peliculas.sort(Comparadores.ordenarPorDirector);
        mostrarPeliculas();
    }

}
