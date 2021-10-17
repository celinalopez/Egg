package EjemplosEgg;
import EjemplosEgg.mascotapp2.service.MascotaExcepcion;
import EjemplosEgg.mascotapp2.service.Service;

public class EjemploMascota {
    public static void main(String[] args) {

        Service svv = new Service();
        try{
            svv.crearMascota("queso","pipi","conejo","blanco",2,"leon");
            svv.crearMascota("negrita","","perro ","negro",2,"pichicho");
            //mas funciones no se ejecutan ya que la linea anterior lanza una excepcion

        }catch (
                MascotaExcepcion e){
            System.out.println(e.getMessage());
        }catch (Exception e){
            System.out.println(e.getMessage());
        }

        try{
            svv.crearMascota("capitan","capi","perro","marron",4,"bulldog");
            svv.buscarMascota("amelia");

        }catch (MascotaExcepcion e){
            System.out.println(e.getMessage());
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
