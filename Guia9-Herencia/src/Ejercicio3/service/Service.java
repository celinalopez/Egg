package Ejercicio3.service;
import Ejercicio3.electrodomesticos.Electrodomestico;
import Ejercicio3.interfaz.InterfazElectro;

import java.util.Scanner;

public class Service extends Electrodomestico implements InterfazElectro {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public Service() {
    }

    public Service(String color, Character consumo, Double peso) {
        super(color, consumo, peso);
        comprobarConsumoElectrico(consumo);
        comprobarColor(color);
        precioFinal();
    }

    public void crearElectrodomestico() {
        System.out.println("Color del electrodomestico?: ");
        comprobarColor(leer.next());
        System.out.println("Peso del electrodomestico?: ");
        setPeso(leer.nextDouble());
        System.out.println("Consumo del electrodomestico?: ");
        comprobarConsumoElectrico(leer.next().charAt(0));
        System.out.println("El precio base es de $1000");
        /*setPrecio(1000d);*/
    }

    @Override
    public void comprobarConsumoElectrico(char letra) {
        String l = String.valueOf(letra).toUpperCase();
        if (l.equals("A") || l.equals("B") || l.equals("C") || l.equals("D") || l.equals("E")){
            this.consumo = l.charAt(0);
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
        switch (consumo.toString().toUpperCase()){
            case "A": precioFinal += 1000; break;
            case "B": precioFinal += 800; break;
            case "C": precioFinal += 600; break;
            case "D": precioFinal += 500; break;
            case "E": precioFinal += 300; break;
            case "F": precioFinal += 100; break;
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
