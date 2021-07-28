package servicios;
import java.util.Scanner;
import cafetera.Cafetera;

public class ServiceCafetera {

    private Scanner leer = new Scanner(System.in).useDelimiter("\n");
    Cafetera cafetera = new Cafetera(1000,0);
    double cantidadActual = cafetera.getCantidadActual();

    public void llenarCafetera(){
        System.out.println("LLENANDO CAFETERA AL MAXIMO...");
        cantidadActual = cafetera.getCapacidadMaxima();
    }

    public void ServirTaza(){

        System.out.println("Seleccione el tamaño de la taza: G(800ml)-M(500ml)-P(300ml)");
        switch (leer.next().toUpperCase()) {
            case "G":
                if (cantidadActual<800){
                    System.out.println("La taza no se llenó por completo, quedó en: "+ cantidadActual);
                    cafetera.setCantidadActual(0);
                }else{
                    cantidadActual-=800;
                }
                break;
            case "M":
                if (cantidadActual<500){
                    System.out.println("La taza no se llenó por completo, quedó en: "+ cantidadActual);
                    cantidadActual=0;
                }else{
                    cantidadActual-=500;
                }
                break;
            case "P":
                if (cantidadActual<300){
                    System.out.println("La taza no se llenó por completo, quedó en: "+ cantidadActual);
                    cantidadActual=0;
                }else{
                    cantidadActual-=300;
                }
                break;
            default : System.out.println("Ha ingresado un valor incorrecto");
        }
    }
    public void vaciarCafetera(){
        System.out.println("VACIAR CAFETERA");
        cantidadActual=0;
    }
    public void agregarCafe(){
        System.out.println("Ingrese la cantidad de cafe que quiere agregar: ");
        cantidadActual += leer.nextInt();
    }
    @Override
    public String toString() {
        return "cantidad de cafe actual: " + cantidadActual +
                "ml";
    }
}
