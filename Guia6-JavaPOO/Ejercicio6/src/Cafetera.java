import java.util.Scanner;

/**
 * Programa Nespresso. Desarrolle una clase Cafetera con los atributos
 * capacidadMaxima (la cantidad máxima de café que puede contener la cafetera) y
 * cantidadActual (la cantidad actual de café que hay en la cafetera). Implemente, al
 * menos, los siguientes métodos:
 * • Constructor predeterminado o vacío
 * • Constructor con la capacidad máxima y la cantidad actual
 * • Métodos getters y setters.
 * 17
 * • Método llenarCafetera(): hace que la cantidad actual sea igual a la capacidad
 * máxima.
 * • Método servirTaza(int): se pide el tamaño de una taza vacía, el método recibe el
 * tamaño de la taza y simula la acción de servir la taza con la capacidad indicada. Si la
 * cantidad actual de café “no alcanza” para llenar la taza, se sirve lo que quede. El
 * método le informará al usuario si se llenó o no la taza, y de no haberse llenado en
 * cuanto quedó la taza.
 * • Método vaciarCafetera(): pone la cantidad de café actual en cero.
 * • Método agregarCafe(int): se le pide al usuario una cantidad de café, el método lo
 * recibe y se añade a la cafetera la cantidad de café indicada.
 */
public class Cafetera {
    private Scanner leer = new Scanner(System.in).useDelimiter("\n");
    private double capacidadMaxima, cantidadActual;

    public Cafetera() {
    }

    public Cafetera(double capacidadMaxima, double cantidadActual) {
        this.capacidadMaxima = capacidadMaxima;
        this.cantidadActual = cantidadActual;
    }

    public void setCapacidadMaxima(double capacidadMaxima) {
        this.capacidadMaxima = capacidadMaxima;
    }

    public void setCantidadActual(double cantidadActual) {
        this.cantidadActual = cantidadActual;
    }

    public double getCapacidadMaxima() {
        return capacidadMaxima;
    }

    public double getCantidadActual() {
        return cantidadActual;
    }
    public void llenarCafetera(){
        cantidadActual = capacidadMaxima;
    }
    public int servirTaza(){
        System.out.println("Seleccione el tamaño de la taza: G(800ml)-M(500ml)-P(300ml)");
        switch (leer.next()) {
            case "G","800" :
                if (cantidadActual<800){
                    System.out.println("La taza no se lleno por completo, quedó en: "+ cantidadActual);
                    cantidadActual =0;
                }else{
                    cantidadActual -= 800;
                }
                break;
            case "M","500" :
                cantidadActual -= 500;
                break;
            case "P","300" :
                cantidadActual -= 300;
                break;
            default : System.out.println("Ha ingresado un valor incorrecto");
        }
    }
    public void vaciarCafetera(){
        cantidadActual = 0;
    }
    public int agregarCafe(){
        System.out.println("Ingrese la cantidad de cafe: ");
        cantidadActual += leer.nextInt();
    }
}
