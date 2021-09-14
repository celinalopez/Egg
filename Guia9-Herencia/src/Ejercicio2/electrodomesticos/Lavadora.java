package Ejercicio2.electrodomesticos;
import Ejercicio2.service.Service;

public class Lavadora extends Service {
    private double carga;

    public Lavadora() {
    }

    public Lavadora(String color, Character consumo, Double peso, double carga) {
        super(color, consumo, peso);
        this.carga = carga;
        precioFinal();
    }

    public double getCarga() {
        return carga;
    }

    public void setCarga(double carga) {
        this.carga = carga;
    }

    @Override
    public String toString() {
        return "Lavadora{" +
                "precio=" + precio +
                ", color='" + color + '\'' +
                ", consumo=" + consumo +
                ", peso=" + peso +
                ", carga=" + carga +
                '}';
    }
}
