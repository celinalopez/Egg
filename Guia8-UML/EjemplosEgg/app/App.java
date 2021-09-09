package EjemplosEgg.app;

import EjemplosEgg.mascotapp2.enumeriaciones.RazaPerro;
import EjemplosEgg.mascotapp2.enumeriaciones.SexoHumano;
import EjemplosEgg.mascotapp2.entidadess.Usuario;

public class App {

    public static void main(String[] args) {

        for(RazaPerro aux : RazaPerro.values()){
            System.out.println(aux);
        }

        String razaInput = "BEAGLE";
        for(RazaPerro aux : RazaPerro.values()){
            if(aux.toString().equalsIgnoreCase(razaInput)){
                System.out.println("Son iguales");
            }
        }

        for(RazaPerro aux : RazaPerro.values()){
            System.out.println(aux.ordinal());
        }

        Usuario u = new Usuario();
        u.setSexo(SexoHumano.MASCULINO);
        System.out.println(u.getSexo());

    }
}
