package Ejercicio3.main;

import Ejercicio3.carta.Carta;
import Ejercicio3.service.Service;

import java.util.ArrayList;

/*
Realizar una baraja de cartas españolas orientada a objetos. Una carta tiene un número
entre 1 y 12 (el 8 y el 9 no los incluimos) y un palo (espadas, bastos, oros y copas). Esta
clase debe contener un método toString() que retorne el número de carta y el palo. La
baraja estará compuesta por un conjunto de cartas, 40 exactamente.
Las operaciones que podrá realizar la baraja son:
• barajar(): cambia de posición todas las cartas aleatoriamente.
• siguienteCarta(): devuelve la siguiente carta que está en la baraja, cuando no
haya más o se haya llegado al final, se indica al usuario que no hay más cartas.
• cartasDisponibles(): indica el número de cartas que aún se puede repartir.
• darCartas(): dado un número de cartas que nos pidan, le devolveremos ese
número de cartas. En caso de que haya menos cartas que las pedidas, no
devolveremos nada, pero debemos indicárselo al usuario.
• cartasMonton(): mostramos aquellas cartas que ya han salido, si no ha salido
ninguna indicárselo al usuario
• mostrarBaraja(): muestra todas las cartas hasta el final. Es decir, si se saca una
carta y luego se llama al método, este no mostrara esa primera carta.
 */
public class Main {
    public static void main(String[] args) {
        Service sv = new Service();
        ArrayList<Carta> mazo1 = sv.crearMazo();

        sv.mostrarBaraja(mazo1);
        sv.cartasDisponibles(mazo1);

        sv.barajar(mazo1);
        sv.mostrarBaraja(mazo1);

        //Mazo vacio prueba
        ArrayList<Carta> mazo2 = new ArrayList<>();
        sv.siguienteCarta(mazo2);

        sv.siguienteCarta(mazo1);
        sv.cartasDisponibles(mazo1);

        sv.darCartas(mazo1);
        sv.cartasDisponibles(mazo1);

        sv.cartasMonton();
        sv.mostrarBaraja(mazo1);

    }
}
