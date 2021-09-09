package EjemplosEggColecciones.ejemplos;

import EjemplosEgg.mascotapp2.entidadess.Mascota;
import EjemplosEggColecciones.mascotapp.comparadores.Comparadores;

import java.util.ArrayList;
import java.util.Collections;

public class ejemplo_comparator {
    public static void main(String[] args) {
        //Asi se define una matriz
        ArrayList<ArrayList<String>>matriz = new ArrayList<>();

        ArrayList<Mascota> mascotas = new ArrayList<>();

        mascotas.add(new Mascota("Pepe","Chiqui","Perro","Blanco",3,"Caniche"));
        mascotas.add(new Mascota("Homero", "Nino", "Gato", "Negro", 6, "Persa"));

        //ordena en descendente
        Collections.sort(mascotas, Comparadores.ordenarPorNombreDesc);
        //desordena
        Collections.shuffle(mascotas);
        for (Mascota mascota : mascotas){
            System.out.println(mascota);
        }
    }
}
