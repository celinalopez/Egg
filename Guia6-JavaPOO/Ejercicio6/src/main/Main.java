package main;
import servicios.ServiceCafetera;

/**
 * Programa Nespresso. Desarrolle una clase cafetera.Cafetera con los atributos
 * capacidadMaxima (la cantidad máxima de café que puede contener la cafetera) y
 * cantidadActual (la cantidad actual de café que hay en la cafetera). Implemente, al
 * menos, los siguientes métodos:
 * • Constructor predeterminado o vacío
 * • Constructor con la capacidad máxima y la cantidad actual
 * • Métodos getters y setters.
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
public class Main{
    public static void main(String[] args) {

        //Crear cafetera vacia
        ServiceCafetera cafetera1 = new ServiceCafetera();
        System.out.println(cafetera1);
        //La llenamos un poco
        cafetera1.agregarCafe();
        System.out.println(cafetera1);
        //La llenamos completamente
        cafetera1.llenarCafetera();
        System.out.println(cafetera1);
        //Servimos taza
        cafetera1.ServirTaza();
        System.out.println(cafetera1);
        //Prueba para servir taza sin stock de cafe
        cafetera1.ServirTaza();
        System.out.println(cafetera1);
        //Vaciar cafetera
        cafetera1.vaciarCafetera();
        System.out.println(cafetera1);

    }
}
