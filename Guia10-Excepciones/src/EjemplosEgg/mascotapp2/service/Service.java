package EjemplosEgg.mascotapp2.service;

import EjemplosEgg.mascotapp2.entidadess.Mascota;

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

        return new Mascota(nombre,apodo,tipo,color,edad,raza);
    }

    public void agregarMascota(Mascota m){
        mascotas.add(m);
    }

    public void mostrarMascotas(){
        System.out.println("Las mascotas en la lista son: ");
        for (Mascota aux: mascotas) {
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

    public void crearMascota(String nombre, String apodo, String tipo, String color, Integer edad, String raza) throws MascotaExcepcion {
        //Valida que los campos no esten vacios
        try{
            if (nombre.isEmpty()){
                throw new MascotaExcepcion("Debe ingresar un nombre");
            }
            if (apodo.isEmpty()){
                throw new MascotaExcepcion("Debe ingresar un apodo");
            }
            if (tipo.isEmpty()){
                throw new MascotaExcepcion("Debe ingresar un tipo");
            }
            if (color.isEmpty()){
                throw new MascotaExcepcion("Debe ingresar un color");
            }
            if (raza.isEmpty()){
                throw new MascotaExcepcion("Debe ingresar una raza");
            }
            if (edad < 0){
                throw new MascotaExcepcion("La edad no puede ser negativa");
            }

            agregarMascota(new Mascota(nombre,apodo,tipo,color,edad,raza));

        }catch (MascotaExcepcion e){
            throw e;
        }catch (Exception e){
            e.printStackTrace();
            throw new MascotaExcepcion("Error de sistema");
        }
    }

    public Mascota buscarMascota(String nombre) throws MascotaExcepcion{

        try{
            if(nombre.isEmpty()){
                throw new MascotaExcepcion("Debe indicar el nombre de la mascota");
            }
            Mascota mascotaEncontrada = null;

            for (Mascota m : mascotas){
                if(m.getNombre().equals(nombre)){
                    mascotaEncontrada = m;
                }
            }
            if(mascotaEncontrada == null){
                throw new MascotaExcepcion("No se encontro una mascota con ese nombre");
            }
            return mascotaEncontrada;
        }catch (MascotaExcepcion e){
            throw e;
        }catch (Exception e){
            e.printStackTrace();
            throw new MascotaExcepcion("Error del sistema");
        }

    }
}
