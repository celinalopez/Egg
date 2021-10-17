package Ejercicio4.main;

import Ejercicio4.service.ServiceCirculo;
import Ejercicio4.service.ServiceRectangulo;

/**
 * Se plantea desarrollar un programa que nos permita calcular el área y el perímetro
 * de formas geométricas, en este caso un circulo y un rectángulo. Ya que este
 * calculo se va a repetir en las dos formas geométricas, vamos a crear una Interfaz,
 * llamada calculosFormas que tendrá, los dos métodos para calcular el área, el
 * perímetro y el valor de PI como constante.
 * 13
 * Desarrollar el ejercicio para que las formas implementen los métodos de la
 * interfaz y se calcule el área y el perímetro de los dos. En el main se crearán las
 * formas y se mostrará el resultado final.
 * Área circulo: PI * radio ^ 2 / Perímetro circulo: PI * diámetro.
 * Área rectángulo: base * altura / Perímetro rectángulo: (base + altura) * 2.
 */
public class Main {
    public static void main(String[] args) {

        ServiceCirculo svC = new ServiceCirculo(3d);
        System.out.println(svC);

        ServiceRectangulo svR = new ServiceRectangulo(3d,5d);
        System.out.println(svR);
    }
}
