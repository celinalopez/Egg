package Ejercicio2.service;

import Ejercicio2.electrodomesticos.Televisor;

import java.util.Scanner;

public class ServiceTelevisor extends Televisor {
    Scanner leer = new Scanner(System.in);

    public void crearTelevisor(){
        super.crearElectrodomestico();
        System.out.println("Resolucion de la tv en pulgadas: ");
        setResolucion(leer.nextDouble());
        System.out.println("Posee TDT? true/false");
        setTdt(leer.hasNext());
    }

    @Override
    public void precioFinal() {
        super.precioFinal();
        if (getResolucion() > 40){
            setPrecio(getPrecio() + (getPrecio()*0.3));
        }
        if (isTdt()){
            setPrecio(getPrecio()+500);
        }
    }

}
