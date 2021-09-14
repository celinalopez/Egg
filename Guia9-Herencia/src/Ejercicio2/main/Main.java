package Ejercicio2.main;
import Ejercicio2.service.ServiceLavadora;
import Ejercicio2.service.ServiceTelevisor;


public class Main {
    public static void main(String[] args) {

        ServiceLavadora l1 = new ServiceLavadora();
        l1.crearLavadora();
        System.out.println(l1);
        //color: negro, peso: 20, consumo: A, carga: 30  ---> precioFinal: 3000

        ServiceTelevisor t1 = new ServiceTelevisor();
        t1.crearTelevisor();
        System.out.println(t1);
        //color: blanco, peso: 80, consumo: D, resolucion: 90, tdt: true ---> precioFinal: 3750
    }
}
