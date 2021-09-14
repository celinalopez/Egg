package Ejercicio2.electrodomesticos;

public class Electrodomestico {
    protected Double precio;
    protected String color;
    protected Character consumo;
    protected Double peso;

    public Electrodomestico() {
        this.precio = 1000d;
    }

    public Electrodomestico(String color, Character consumo, Double peso) {
        this.precio = 1000d;
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
