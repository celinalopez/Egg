package Ejercicio4.juego;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Juego {

    Scanner leer = new Scanner(System.in);
    public void juegoAdivinar() {
        int numeroSecreto = (int) (Math.random() * 500 + 1);
        int contador = 0;
        int numeroInput = 0;
        do {
            try {
                System.out.println("Adivine el numero: ");
                numeroInput = leer.nextInt();
                if (numeroInput != numeroSecreto) {
                    contador++;
                    if (numeroInput > numeroSecreto) {
                        System.out.println("El numero secreto es menor a " + numeroInput);
                    } else {
                        System.out.println("El numero secreto es mayor a " + numeroInput);
                    }
                }
            } catch (InputMismatchException e) {
                System.out.println("Error, debe ingresar un numero entero. " + e.getMessage());
                contador++;
                leer.next();
            } catch (Exception e) {
                System.out.println("Error del sistema. " + e.getMessage());
                contador++;
                leer.next();
            }
        } while (numeroSecreto != numeroInput);
        System.out.println("Lo adivinaste! \nUsaste " + contador + " intentos");
    }
}
