package Ejercicio3.alumno;

import java.util.ArrayList;

public class Alumno {
    private String nombre;
    private ArrayList<Integer> lista_notas = new ArrayList<>();

    public Alumno() {
    }

    public Alumno(String nombre, ArrayList<Integer> lista_notas) {
        this.nombre = nombre;
        this.lista_notas = lista_notas;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Integer> getLista_notas() {
        return lista_notas;
    }

    public void setLista_notas(int nota1, int nota2, int nota3) {
        this.lista_notas.add(nota1);
        this.lista_notas.add(nota2);
        this.lista_notas.add(nota3);
    }

    @Override
    public String toString() {
        return "Alumno{" +
                "nombre='" + nombre + '\'' +
                ", lista_notas=" + lista_notas +
                '}';
    }
}
