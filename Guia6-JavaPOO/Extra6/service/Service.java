package Extra6.service;

import Extra6.ahorcado.Ahorcado;

import java.util.Arrays;
import java.util.Scanner;

public class Service {
    Scanner leer = new Scanner(System.in);
    String menu = "SELECCION: \n1.Nueva letra \n2.Ver intentos restantes \n3.Ver letras encontradas";
    /**
     * le pide la palabra al usuario y cantidad de jugadas máxima.
     * Con la palabra del usuario, pone la longitud de la palabra, como la longitud del vector.
     * Después ingresa la palabra en el vector, letra por letra, quedando cada letra de la
     * palabra en un índice del vector. Y también, guarda en cantidad de jugadas máximas,
     * el valor que ingresó el usuario y encontradas en 0.
     **/
    public Ahorcado crearJuego(){
        System.out.println("Ingrese la palabra");
        String palabra = leer.next();
        String [] vectorPalabra = new String[palabra.length()];
        for (int i=0; i<vectorPalabra.length; i++){
            vectorPalabra[i] = palabra.substring(i);
        }
        System.out.println("Ingrese cantidad de jugadas maximas (recomendado 6)");
        int jugadasMax = leer.nextInt();
        return new Ahorcado(vectorPalabra,0,jugadasMax);
    }

    /**
     * muestra la longitud de la palabra que se debe encontrar. Nota:
     *  buscar como se usa el vector.length.
     */
    public int longitudPalabra(Ahorcado a){
        return a.getVectorPalabra().length;
    }
    /**
     * este método recibe una letra dada por el usuario y busca si la
     *   letra ingresada es parte de la palabra o no.
     */
    public boolean buscarLetra(String letra, Ahorcado a){
        return Arrays.asList(a.getVectorPalabra()).contains(letra);
    }
    /**
     * que reciba una letra ingresada por el usuario y muestre
     *  cuantas letras han sido encontradas y cuantas le faltan. Este método además deberá
     *  devolver true si la letra estaba y false si la letra no estaba, ya que, cada vez que se
     *  busque una letra que no esté, se le restará uno a sus oportunidades.
     */
    public void encontradas(String letra, Ahorcado a){
        String [] vector = a.getVectorPalabra();

        for(String i : vector){
            if (i.equals(letra)){
                a.setLetrasEncontradas(a.getLetrasEncontradas()+1) ;
                System.out.println("Bien! la letra está en la palabra");
            } else {
                a.setIntentosMax(a.getIntentosMax()-1);
                System.out.println("La letra no pertenece a la palabra :(");
            }
        }
    }
    public void intentos(Ahorcado a){
        System.out.println("Te quedan "+ a.getIntentosMax() + " intentos");
    }
    public void juego(){
        Ahorcado juego = crearJuego();
        System.out.println("La longitud de la palabra es de: "+ longitudPalabra(juego));
        do{
            System.out.println(menu);
            int value = leer.nextInt();
            switch (value){
                case 1: encontradas(leer.next(),juego);
                    break;
                case 2: intentos(juego);
                    break;
                case 3:
                    System.out.println(juego.getLetrasEncontradas());
                    break;
            }

        } while (juego.getIntentosMax() != 0);

    }

}
