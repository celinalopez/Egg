package EjemplosEggColecciones.mascotapp.app;

import EjemplosEggColecciones.mascotapp.service.Service;


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

    }

}