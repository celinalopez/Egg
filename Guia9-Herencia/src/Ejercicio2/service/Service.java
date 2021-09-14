package Ejercicio2.service;

import Ejercicio2.electrodomesticos.Electrodomestico;
import Ejercicio2.interfaz.InterfazElectro;

import java.util.Scanner;

public class Service extends Electrodomestico implements InterfazElectro{
    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public Service() {
    }

    public Service(Double precio, String color, Character consumo, Double peso) {
        super(precio, color, consumo, peso);
        comprobarConsumoElectrico(consumo);
        comprobarColor(color);
    }

    public void crearElectrodomestico() {
        System.out.println("Color del electrodomestico?: ");
        setColor(leer.next());
        System.out.println("Peso del electrodomestico?: ");
        setPeso(leer.nextDouble());
        System.out.println("Consumo del electrodomestico?: ");
        setConsumo(leer.next().charAt(0));
        System.out.println("El precio base es de $1000");
        setPrecio(1000d);
    }

    @Override
    public void comprobarConsumoElectrico(char letra) {

        if (letra == 'A' || letra == 'B' || letra == 'C' || letra == 'D'){
            this.consumo = letra;
        }else{
            this.consumo = 'F';
        }
    }

    @Override
    public void comprobarColor(String color) {
        if(color.equalsIgnoreCase("Blanco") ||
                color.equalsIgnoreCase("Negro") ||
                color.equalsIgnoreCase("Rojo") ||
                color.equalsIgnoreCase("Azul") ||
                color.equalsIgnoreCase("Gris")){
            this.color = color;
        }else{
            this.color = "Blanco";
        }
    }


    @Override
    public void precioFinal() {
        Double peso = getPeso();
        Character consumo = getConsumo();
        Double precioFinal = getPrecio();

        if (peso >= 1 && peso <= 19) {
            precioFinal += 100;
        } else if (peso >= 20 && peso <= 49) {
            precioFinal += 500;
        } else if (peso >= 50 && peso <= 79) {
            precioFinal += 800;
        } else if (peso >= 80) {
            precioFinal += 1000;
        }
        switch (consumo){
            case 'A': precioFinal += 1000; break;
            case 'B': precioFinal += 800; break;
            case 'C': precioFinal += 600; break;
            case 'D': precioFinal += 500; break;
            case 'E': precioFinal += 300; break;
            case 'F': precioFinal += 100; break;
        }
        setPrecio(precioFinal);
    }

    public void precioFinal(Electrodomestico e){
        Double peso = e.getPeso();
        Character consumo = e.getConsumo();
        Double precioFinal = e.getPrecio();

        if (peso >= 1 && peso <= 19) {
            precioFinal += 100;
        } else if (peso >= 20 && peso <= 49) {
            precioFinal += 500;
        } else if (peso >= 50 && peso <= 79) {
            precioFinal += 800;
        } else if (peso >= 80) {
            precioFinal += 1000;
        }
        switch (consumo){
            case 'A': precioFinal += 1000; break;
            case 'B': precioFinal += 800; break;
            case 'C': precioFinal += 600; break;
            case 'D': precioFinal += 500; break;
            case 'E': precioFinal += 300; break;
            case 'F': precioFinal += 100; break;
        }
        System.out.println("El precio final es de: " + precioFinal);
    }
}
