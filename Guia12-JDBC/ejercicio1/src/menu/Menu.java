package menu;

import servicios.FabricanteService;
import servicios.ProductoService;
import java.util.Scanner;


public class Menu {

    static Scanner scan = new Scanner(System.in);
    static ProductoService prod = new ProductoService();
    static FabricanteService fab = new FabricanteService();

    public void menu() {
        int operacion = 0;
        while (operacion != 9) {
            System.out.println("\tMenu");
            System.out.println("1. Listar el nombre de todos los productos");
            System.out.println("2. Listar el nombre y precio de todos los productos");
            System.out.println("3. Listar los productos cuyo precio este entre 120 y 202");
            System.out.println("4. Listar todos los portatiles");
            System.out.println("5. Listar el nombre y precio del producto mas barato");
            System.out.println("6. Crear nuevo producto");
            System.out.println("7. Crear nuevo fabricante");
            System.out.println("8. Editar producto");
            System.out.println("9. Salir\n");
            operacion = scan.nextInt();
            if (operacion == 1) {
                prod.seleccionarTodo();
            }
            if (operacion == 2) {
                prod.seleccionarNombrePrecio();
            }
            if (operacion == 3) {
                prod.seleccionarRangoPrecio();
            }
            if (operacion == 4) {
                prod.seleccionarPortatiles();
            }
            if (operacion == 5) {
                prod.seleccionarProductoBarato();
            }
            if (operacion == 6) {
                prod.insertarProducto();
            }
            if (operacion == 7) {
                fab.insertarFabricante();
            }
            if (operacion == 8) {
                prod.modificarProducto();
            }
            if (operacion == 9) {
                break;
            }
        }
    }
}

