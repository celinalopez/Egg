package Extra1.main;

import Extra1.cancion.Cancion;

/*
Desarrollar una clase Cancion con los siguientes atributos: titulo y autor. Se deberá́
definir además dos constructores: uno vacío que inicializa el titulo y el autor a cadenas
vacías y otro que reciba como parámetros el titulo y el autor de la canción. Se deberán
además definir los métodos getters y setters correspondientes.
 */
public class Main {
    public static void main(String[] args) {
        Cancion c1 = new Cancion("Torero", "Chayanne");
        System.out.println(c1);
        Cancion c2 = new Cancion();
        c2.setAutor("Harry Styles");
        c2.setTitulo("Golden");
        System.out.println(c2);
    }
}
