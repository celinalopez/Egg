package Ejercicio3.main;

import Ejercicio2.electrodomesticos.Electrodomestico;
import Ejercicio2.electrodomesticos.Lavadora;
import Ejercicio2.electrodomesticos.Televisor;
import Ejercicio2.service.Service;
import Ejercicio2.service.ServiceLavadora;

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

        Lavadora l1 = new Lavadora("rojo",'D',40d,20d);
        Lavadora l2 = new Lavadora("azul",'G',110d,30.5);
        Televisor t1 = new Televisor("blanco",'E',40d,60d,false);
        Televisor t2 = new Televisor("negro",'F',45d,100d,true);

        lista_electrodomesticos.add(l1);
        lista_electrodomesticos.add(l2);
        lista_electrodomesticos.add(t1);
        lista_electrodomesticos.add(t2);


/*        lista_electrodomesticos.add(new Lavadora("rojo",'D',40d,20d));
        lista_electrodomesticos.add(new Lavadora("azul",'G',110d,30.5));
        lista_electrodomesticos.add(new Televisor("blanco",'E',40d,60d,false));
        lista_electrodomesticos.add(new Televisor("negro",'F',45d,100d,true));*/

        System.out.println("*Lista inicial electrodomesticos: ");
        lista_electrodomesticos.forEach(electrodomestico -> System.out.println(electrodomestico.toString()));

        System.out.println("*Electrodomesticos con precio final: ");



    }
}
