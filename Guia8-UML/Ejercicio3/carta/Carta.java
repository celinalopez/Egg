package Ejercicio3.carta;

import Ejercicio3.enumeraciones.Palo;

public class Carta {
    private int numero;
    private Palo palo;

    public Carta() {
    }

    public Carta(int numero, Palo palo) {
        for(int i=0; i<12;i++){
            this.numero = numero;
        }
        this.palo = palo;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public Palo getPalo() {
        return palo;
    }

    public void setPalo(Palo palo) {
        this.palo = palo;
    }

    @Override
    public String toString() {
        return "Carta{" +
                "numero=" + numero +
                ", palo=" + palo +
                '}';
    }
}
