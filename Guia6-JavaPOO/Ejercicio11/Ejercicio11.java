package Ejercicio11;

import java.util.Date;
import java.util.Scanner;

/**
 * Pongamos de lado un momento el concepto de POO, ahora vamos a trabajar solo con
 * la clase Date. En este ejercicio deberemos instanciar en el main, una fecha usando la
 * clase Date, para esto vamos a tener que crear 3 variables, dia, mes y anio que se le
 * pedirán al usuario para poner el constructor del objeto Date. Una vez creada la fecha
 * de tipo Date, deberemos mostrarla y mostrar cuantos años hay entre esa fecha y la
 * fecha actual, que se puede conseguir instanciando un objeto Date con constructor
 * vacío.
 */
public class Ejercicio11 {

    public static void main(String[] args) {
        int dia,mes,anio;
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese dia-mes-año: ");
        dia = leer.nextInt();
        mes = leer.nextInt();
        anio = leer.nextInt();
        Date fecha1 = new Date(anio-1900,mes-1,dia);
        System.out.println("*Fecha ingresada: "+ fecha1);
        Date fechaActual = new Date();
        System.out.println("*Fecha Actual: " + fechaActual);

        System.out.println("Entre ambas fechas hay " + (fechaActual.getYear() - fecha1.getYear()) + " años de diferencia");
    }
}
