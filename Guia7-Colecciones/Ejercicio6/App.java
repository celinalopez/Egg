package Ejercicio6;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Se necesita una aplicación para una tienda en la cual queremos almacenar los
 * distintos productos que venderemos y el precio que tendrán. Además, se necesita
 * que la aplicación cuente con las funciones básicas.
 * Estas las realizaremos en el main. Como, introducir un elemento, modificar su
 * precio, eliminar un producto y mostrar los productos que tenemos con su precio
 * (Utilizar Hashmap). El HashMap tendrá de llave el nombre del producto y de valor
 * el precio. Realizar un menú para lograr todas las acciones previamente
 * mencionadas.
 */
public class App {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        HashMap<String,Double> productos = new HashMap<>();
        int value;
        do {
            System.out.println("SELECCIONE \n1.Agregar producto \n2.Modificar precio " +
                    "\n3.Eliminar producto \n4.Mostrar productos \n5.Salir \n");
            value = leer.nextInt();
            switch (value){
                case 1:
                    do {
                        System.out.println("-----------INGRESO DE PRODUCTOS------------");
                        System.out.println("Ingrese el nombre del producto: ");
                        String nombre = leer.next();
                        System.out.println("Ingrese el precio del producto: ");
                        Double precio = leer.nextDouble();
                        productos.put(nombre,precio);
                        System.out.println("Desea agregar otro producto? si/no");
                    }while (leer.next().equalsIgnoreCase("si"));
                    break;
                case 2:
                        do{
                            System.out.println("-----------MODIFICAR PRECIO------------");
                            System.out.println("Nombre del producto a cambiar el precio: ");
                            String key = leer.next();
                            if (productos.containsKey(key)){
                                System.out.println("Nuevo precio de "+key+": ");
                                Double newValue = leer.nextDouble();
                                productos.replace(key, newValue);
                            }else System.out.println("No se encuentra el producto en la lista");
                            System.out.println("Desea cambiar el precio de otro producto? si/no");
                        }while (leer.next().equalsIgnoreCase("si"));
                        break;
                case 3:
                        do{
                            System.out.println("-----------ELIMINAR PRODUCTO------------");
                            System.out.println("Nombre del producto eliminar: ");
                            String key = leer.next();
                            if(productos.containsKey(key)){
                                productos.remove(key);
                            }else System.out.println("No se encuentra el producto en la lista");
                            System.out.println("Desea eliminar otro producto? si/no");
                        }while (leer.next().equalsIgnoreCase("si"));
                        break;
                case 4:
                        System.out.println("-----------LISTA PRODUCTOS------------");
                        for (Map.Entry<String,Double> entry : productos.entrySet()) {
                            System.out.println("Nombre=" + entry.getKey() + ", Precio=" + entry.getValue());
                        }
                        break;
            }
        }while (value != 5);
    }
}
