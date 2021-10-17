package Ejercicio2;

/**
 * Definir una Clase que contenga algún tipo de dato de tipo array y agregue el
 * código para generar y capturar una excepción ArrayIndexOutOfBoundsException
 * (índice de arreglo fuera de rango).
 */
public class Main {
    public static void main(String[] args) {
        String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
        try{
            System.out.println(cars[5]);
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("indice de arreglo fuera de rango");
            System.out.println(e.getMessage());
        }finally {
            System.out.println("El ultimo indice del array es: " + cars.length);
        }
    }

}

