package Ejercicio3.main;

import Ejercicio3.electrodomesticos.Electrodomestico;
import Ejercicio3.electrodomesticos.Lavadora;
import Ejercicio3.electrodomesticos.Televisor;


import java.util.ArrayList;


/**
 * Siguiendo el ejercicio anterior, en el main vamos a crear un ArrayList de
 * Electrodomésticos para guardar 4 electrodomésticos, ya sean lavadoras o
 * televisores, con valores ya asignados.
 * Luego, recorrer este array y ejecutar el método precioFinal() en cada
 * electrodoméstico. Se deberá también mostrar el precio de cada tipo de objeto,
 * es decir, el precio de todos los televisores y el de las lavadoras. Una vez hecho
 * eso, también deberemos mostrar, la suma del precio de todos los
 * Electrodomésticos. Por ejemplo, si tenemos una lavadora con un precio de 2000
 * y un televisor de 5000, el resultado final será de 7000 (2000+5000) para
 * electrodomésticos, 2000 para lavadora y 5000 para televisor.
 */
public class Main {
    public static void main(String[] args) {
        ArrayList<Electrodomestico> lista_electrodomesticos = new ArrayList<>();

        lista_electrodomesticos.add(new Lavadora("rojo",'D',40d,20d));
        lista_electrodomesticos.add(new Lavadora("azul",'G',110d,30.5));
        lista_electrodomesticos.add(new Televisor("blanco",'E',40d,60d,false));
        lista_electrodomesticos.add(new Televisor("negro",'F',45d,100d,true));

        System.out.println("*Lista electrodomesticos: ");
        lista_electrodomesticos.forEach(electrodomestico -> System.out.println(electrodomestico.toString()));

        System.out.println("*Electrodomestico con su precio");
        for (Electrodomestico e : lista_electrodomesticos){
            System.out.println(e.getClass().getSimpleName() + ": " + e.getPrecio());
        }

        Double suma_lavadoras = 0d;
        Double suma_televisores = 0d;

        for (Electrodomestico e : lista_electrodomesticos){
            if (e.getClass().equals(Lavadora.class)){
                suma_lavadoras += e.getPrecio();
            }
            if (e.getClass().equals(Televisor.class)){
                suma_televisores += e.getPrecio();
            }
        }
        double suma_total = suma_lavadoras+ suma_televisores;
        System.out.println("Suma precios lavadoras: " + suma_lavadoras);
        System.out.println("Suma precios televisores: " + suma_televisores);
        System.out.println("Suma precios total: " + suma_total);


    }
}
