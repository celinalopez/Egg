package Ejercicio2.juego;

import Ejercicio2.entidades.Jugador;
import Ejercicio2.entidades.Revolver;
import java.util.ArrayList;
import java.util.Scanner;

public class Juego {

    Scanner leer = new Scanner(System.in);
    private ArrayList<Jugador> jugadores;
    private Revolver revolver;

    public Juego() {
    }

    public Juego(ArrayList<Jugador> jugadores, Revolver revolver) {
        this.jugadores = jugadores;
        this.revolver = revolver;
    }

    public ArrayList<Jugador> getJugadores() {
        return jugadores;
    }

    public void setJugadores(ArrayList<Jugador> jugadores) {
        this.jugadores = jugadores;
    }

    public Revolver getRevolver() {
        return revolver;
    }

    public void setRevolver(Revolver revolver) {
        this.revolver = revolver;
    }

    public void llenarJuego(ArrayList<Jugador>lista_jugadores, Revolver r){
        this.jugadores = lista_jugadores;
        r.llenarRevolver();
    }

    public void ronda(){
        for(int i = 0; i<5; i++){
            revolver.mojar();
            if(revolver.mojar()){
                System.out.println("Fin del juego, " + getJugadores().get(i)+" fue mojado!");
                System.out.println(revolver.toString());
                break;
            }else {
                revolver.siguienteChorro();
            }
        }
    }
}
