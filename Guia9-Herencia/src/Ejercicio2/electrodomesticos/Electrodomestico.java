package Ejercicio2.electrodomesticos;


import java.util.Scanner;

public class Electrodomestico {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    protected Double precio;
    protected String color;
    protected Character consumo;
    protected Double peso;

    public Electrodomestico() {
    }

    public Electrodomestico(Double precio, String color, Character consumo, Double peso) {
        this.precio = precio;
        this.peso = peso;
        this.consumo = consumo;
        this.color = color;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Character getConsumo() {
        return consumo;
    }

    public void setConsumo(Character consumo) {
        this.consumo = consumo;
    }

    public Double getPeso() {
        return peso;
    }

    public void setPeso(Double peso) {
        this.peso = peso;
    }


    @Override
    public String toString() {
        return "Electrodomestico{" +
                "precio=" + precio +
                ", color='" + color + '\'' +
                ", consumo=" + consumo +
                ", peso=" + peso +
                '}';
    }
}
