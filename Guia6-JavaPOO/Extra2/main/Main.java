package Extra2.main;

import Extra2.puntos.Puntos;
import Extra2.service.Service;

/*
Definir una clase llamada Puntos que contendrá las coordenadas de dos puntos, sus
atributos serán, x1, y1, x2, y2, siendo cada x e y un punto. Generar un objeto puntos
usando un método crearPuntos() que le pide al usuario los dos números y los ingresa
en los atributos del objeto. Después, a través de otro método calcular y devolver la
distancia que existe entre los dos puntos que existen en la clase Puntos.
 */
public class Main {
    public static void main(String[] args) {
        Service sv = new Service();
        System.out.println("----DISTANCIA ENTRE 2 PUNTOS----");
        Puntos puntos = sv.crearPuntos();
        System.out.println("Disntancia: " + sv.calcularDistancia(puntos));
    }
}
