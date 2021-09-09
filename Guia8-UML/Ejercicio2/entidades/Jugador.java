package Ejercicio2.entidades;

import java.util.Scanner;

public class Jugador {
    private int id;
    private String nombre;
    private boolean mojado;

    Scanner leer = new Scanner(System.in);

    public Jugador() {
        System.out.println("Seleccione numero de jugador entre 1 y 6");
        this.id = leer.nextInt();
        if (this.id >6){
            System.out.println("Ingreso erroneo. Por defecto será jugador numero 6");
            this.id = 6;
        }
        this.nombre = "jugador "+ id;
        System.out.println("nombre del jugador: "+ nombre);
    }

    public Jugador(int id, String nombre, boolean mojado) {
        this.id = id;
        this.nombre = nombre;
        this.mojado = mojado;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean isMojado() {
        return mojado;
    }

    public void setMojado(boolean mojado) {
        this.mojado = mojado;
    }

    public void disparo(Revolver r){
        setMojado(r.mojar());
        r.siguienteChorro();
    }

    @Override
    public String toString() {
        return "Jugador{" +
                "nombre='" + nombre + '\'' +
                '}';
    }
}
