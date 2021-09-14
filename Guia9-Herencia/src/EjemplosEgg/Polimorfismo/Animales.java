package EjemplosEgg.Polimorfismo;

import EjemplosEgg.Polimorfismo.entidades.Gato;
import EjemplosEgg.Polimorfismo.entidades.Perro;

public class Animales {
    public static void main(String[] args) {
        Gato g1 = new Gato(4,true,3,1000d,"Siames");
        Perro p1 = new Perro(4,true,5,1000d,"Beagle");

        g1.CalcularEdad();
        g1.hacerRuido();
        g1.ronronear();

        p1.CalcularEdad();
        p1.hacerRuido();
        p1.jugarEnParque(4);
    }
}
