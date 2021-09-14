package Ejercicio2.main;
import Ejercicio2.service.ServiceLavadora;
import Ejercicio2.service.ServiceTelevisor;


public class Main {
    public static void main(String[] args) {

        ServiceLavadora l1 = new ServiceLavadora();
        l1.crearLavadora();
        l1.precioFinal();
        System.out.println(l1);

        ServiceTelevisor t1 = new ServiceTelevisor();
        t1.crearTelevisor();
        t1.precioFinal();
        System.out.println(t1);
    }
}
