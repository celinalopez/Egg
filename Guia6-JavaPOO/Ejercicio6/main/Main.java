package Ejercicio6.main;
import Ejercicio6.service.Service;

public class Main{
    public static void main(String[] args) {

        //Crear cafetera vacia
        Service cafetera1 = new Service();
        System.out.println(cafetera1);
        //La llenamos un poco
        cafetera1.agregarCafe();
        System.out.println(cafetera1);
        //La llenamos completamente
        cafetera1.llenarCafetera();
        System.out.println(cafetera1);
        //Servimos taza
        cafetera1.ServirTaza();
        System.out.println(cafetera1);
        //Prueba para servir taza sin stock de cafe
        cafetera1.ServirTaza();
        System.out.println(cafetera1);
        //Vaciar cafetera
        cafetera1.vaciarCafetera();
        System.out.println(cafetera1);

    }
}
