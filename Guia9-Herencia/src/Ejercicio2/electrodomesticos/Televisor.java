package Ejercicio2.electrodomesticos;
import Ejercicio2.service.Service;

import java.util.Scanner;

public class Televisor extends Service {
    private Double resolucion;
    private boolean tdt;

    public Televisor() {
    }

    public Televisor(String color, Character consumo, Double peso, Double resolucion, boolean tdt) {
        super(color, consumo, peso);
        this.resolucion = resolucion;
        this.tdt = tdt;
    }

    public Double getResolucion() {
        return resolucion;
    }

    public void setResolucion(Double resolucion) {
        this.resolucion = resolucion;
    }

    public boolean isTdt() {
        return tdt;
    }

    public void setTdt(boolean tdt) {
        this.tdt = tdt;
    }

    @Override
    public String toString() {
        return "Televisor{" +
                "precio=" + precio +
                ", color='" + color + '\'' +
                ", consumo=" + consumo +
                ", peso=" + peso +
                ", resolucion=" + resolucion +
                ", tdt=" + tdt +
                '}';
    }
}
