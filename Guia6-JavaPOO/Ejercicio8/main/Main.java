package Ejercicio8.main;

import Ejercicio8.cadena.Cadena;
import Ejercicio8.service.Service;

import java.util.Scanner;

/**
 * Realizar una clase llamada Cadena que tenga como atributos una frase (de tipo de
 * String) y su longitud. En el main se creará el objeto y se le pedirá al usuario que ingrese
 * una frase que puede ser una palabra o varias palabras separadas por un espacio en
 * blanco y a través de los métodos set, se guardará la frase y la longitud de manera
 * automática según la longitud de la frase ingresada. Deberá además implementar los
 * siguientes métodos:
 * • Método mostrarVocales(), deberá contabilizar la cantidad de vocales que tiene la
 * frase ingresada.
 * • Método invertirFrase(), deberá invertir la frase ingresada y mostrar la frase invertida
 * por pantalla. Por ejemplo: Entrada: "casa blanca", Salida: "acnalb asac".
 * • Método vecesRepetido(String letra), deberá recibir por parámetro un carácter
 * ingresado por el usuario y contabilizar cuántas veces se repite el carácter en la
 * frase, por ejemplo:
 * Entrada: frase = "casa blanca". Salida: El carácter 'a' se repite 4 veces.
 * • Método compararLongitud(String frase), deberá comparar la longitud de la frase
 * que compone la clase con otra nueva frase ingresada por el usuario.
 * • Método unirFrases(String frase), deberá unir la frase contenida en la clase Cadena
 * con una nueva frase ingresada por el usuario y mostrar la frase resultante.
 * • Método reemplazar(String letra), deberá reemplazar todas las letras “a” que se
 * encuentren en la frase, por algún otro carácter seleccionado por el usuario y
 * mostrar la frase resultante.
 * • Método contiene(String letra), deberá comprobar si la frase contiene una letra que
 * ingresa el usuario y devuelve verdadero si la contiene y falso si no.
 */
public class Main {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        Cadena c1 = new Cadena();
        Service sv = new Service();
        System.out.println("Ingrese una frase de una o mas palabras");
        //Al settear la frase se guarda automaticamente su longitud en el setter de Cadena
        c1.setFrase(leer.next());
        System.out.println(c1.getLongitud());
        // contar vocales
        System.out.println(sv.mostrarVocales(c1));
        //invertir frase
        System.out.println(sv.invertirFrase(c1));
        //caracter repetido
        System.out.println("Ingrese un caracter");
        sv.vecesRepetido(leer.next(),c1);
        //comparar longitudes de dos frases
        System.out.println("Ingrese una frase para comparar longitudes");
        sv.compararLongitud(leer.next(), c1);
        //Unir dos frases
        System.out.println("Ingrese una nueva frase para concatenar");
        System.out.println(sv.unirFrases(leer.next(),c1));
        //Reemplazar las "a" por nuevo caracter
        System.out.println("Ingrese un nuevo caracter para reemplazar a las 'a'");
        System.out.println(sv.reemplazar(leer.next(),c1));
        //Contiene letra VoF
        System.out.println("Ingrese una letra para verificar si la frase la contiene");
        System.out.println(sv.contiene(leer.next(), c1));

    }
}
