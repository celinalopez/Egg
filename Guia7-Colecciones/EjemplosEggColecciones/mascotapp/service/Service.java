package EjemplosEggColecciones.mascotapp.service;

import EjemplosEggColecciones.mascotapp.mascota2.Mascota;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Service {
    private Scanner leer;
    private List<Mascota> mascotas;


    public Service() {
        this.leer = new Scanner(System.in).useDelimiter("\n");
        this.mascotas = new ArrayList<>();
    }

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

        System.out.println("Introducir raza");
        String raza = leer.next();

        return  new Mascota(nombre,apodo,tipo,color,edad,raza);
    }

    public void agregarMascota(Mascota m){
        mascotas.add(m);
    }

    public void mostrarMascotas(){
        System.out.println("Las mascotas en la lista son: ");
        for ( Mascota aux: mascotas) {
            System.out.println(aux.toString());
        }
        System.out.println("Cantidad: " + mascotas.size());
    }

    public void fabricaMascota(int cantidad){
        for (int i = 0; i < cantidad; i++) {
            //Mascota mascotaCreada = crearMascota()
            //agregarMascota(mascotaCreada)
            agregarMascota(crearMascota());
        }

    }

    public void actualizarMascota(int index){
        if (index >= mascotas.size()-1){
            Mascota m = mascotas.get(index);
            m.setNombre("Pepe");
        } else System.out.println("El indice es erroreo");

    }
    //Otra forma, actualiza toda la mascota
    public void actualizarMascota2(int index){
        if (index >= mascotas.size()){
            Mascota m = crearMascota();
            mascotas.set(index,m);
        } else System.out.println("El indice es erroreo");
    }

    public void eliminarMascota(int index){
        if (index >= mascotas.size()){
            mascotas.remove(index);
        } else System.out.println("El indice es erroneo");
    }

    public void eliminarPorNombre(String nombre){
        for (int i = 0; i < mascotas.size(); i++) {
            Mascota m = mascotas.get(i);
            if(m.equals(nombre)){
                mascotas.remove(i);
            }
        }
    }

    public void actualizarPorNombre(String nombre, String nuevoNombre){
        for (int i = 0; i < mascotas.size(); i++) {
            Mascota m = mascotas.get(i);
            if (m.getNombre().equals(nombre)){
                m.setNombre(nuevoNombre);
            }
        }
    }

}
