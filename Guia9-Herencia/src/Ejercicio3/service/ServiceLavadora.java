package Ejercicio3.service;
import Ejercicio3.electrodomesticos.Lavadora;

import java.util.Scanner;

public class ServiceLavadora extends Lavadora {

    Scanner leer = new Scanner(System.in);

    public void crearLavadora(){
        super.crearElectrodomestico();
        System.out.println("Carga de la lavadora?: ");
        setCarga(leer.nextDouble());
        precioFinal();
    }

    @Override
    public void precioFinal() {
        super.precioFinal();
        if (getCarga() > 10){
            setPrecio(getPrecio()+500);
        }
        System.out.println("El precio final es de " + getPrecio());
    }
}
