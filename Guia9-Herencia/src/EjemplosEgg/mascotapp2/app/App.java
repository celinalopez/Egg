package EjemplosEgg.mascotapp2.app;

import EjemplosEgg.mascotapp2.entidadess.Mascota;
import EjemplosEgg.mascotapp2.entidadess.Usuario;
import EjemplosEgg.mascotapp2.enumeriaciones.RazaGato;
import EjemplosEgg.mascotapp2.enumeriaciones.RazaPerro;
import EjemplosEgg.mascotapp2.enumeriaciones.SexoHumano;
import EjemplosEgg.mascotapp2.service.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;


public class App {
    public static void main(String[] args) {

        Service sv = new Service();

        sv.fabricaMascota(2);
        sv.mostrarMascotas();

        //Cambia nombre de la primer mascota por pepe
        sv.actualizarMascota(0);
        sv.mostrarMascotas();
        //Actualiza por completo la mascota numero "index"
        sv.actualizarMascota2(1);
        sv.mostrarMascotas();
        //eliminar a la mascota de la posicion 0
        sv.eliminarMascota(0);
        sv.mostrarMascotas();

        sv.eliminarPorNombre("Lola");
        sv.mostrarMascotas();

        sv.actualizarPorNombre("Pepe", "Homero");

        Mascota m1 = new Mascota<RazaPerro>("Pepe", "Pepito", "Perro");
        m1.setRaza(RazaPerro.CANICHE);
        System.out.println(m1);
        Mascota m2 = new Mascota<RazaGato>("Luna", "Mishi", "Gato");
        m2.setRaza(RazaGato.SIAMES);

        Usuario u1 = new Usuario();
        u1.setNombre("Celina");
        u1.setApellido("Lopez");
        u1.setDni(42010909);
        u1.setSexo(SexoHumano.FEMENINO);
        u1.setNacimiento(new Date("02/07/1999"));

        List<Mascota> misMascotas = new ArrayList<>();
        misMascotas.add(m1);
        misMascotas.add(m2);

        u1.setMascotaFavorita(m1);
        u1.setMascotas(misMascotas);

        System.out.println(u1);
    }

}