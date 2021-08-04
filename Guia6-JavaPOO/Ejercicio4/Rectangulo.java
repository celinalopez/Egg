package Ejercicio4;

import java.util.Scanner;

/*
Crear una clase Rectángulo que modele rectángulos por medio de un atributo
privado base y un atributo privado altura. La clase incluirá un método para crear el
rectángulo con los datos del Rectángulo dados por el usuario. También incluirá un
método para calcular la superficie del rectángulo y un método para calcular el
perímetro del rectángulo. Por último, tendremos un método que dibujará el
rectángulo mediante asteriscos usando la base y la altura. Se deberán además definir
los métodos getters, setters y constructores correspondientes.
Formulas: Superficie = base ∗ altura / Perímetro = (base + altura) ∗ 2.
 */
public class Rectangulo {
    private Scanner leer = new Scanner(System.in).useDelimiter("\n");
    private int altura;
    private int base;

    public Rectangulo() {
    }

    public Rectangulo(int altura, int base) {
        this.altura = altura;
        this.base = base;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public int getAltura() {
        return altura;
    }

    public int getBase() {
        return base;
    }

    public void crearRectangulo(){
        System.out.println("Ingrese la base del rectangulo");
        base = leer.nextInt();
        System.out.println("Ingrese la altura del rectangulo");
        altura = leer.nextInt();
    }
    public int superficie(){
        return base*altura;
    }
    public int perimetro(){
        return (base+altura)*2;
    }
    public void dibujar() {
        for (int fil = 0; fil < altura; fil++) {
            for (int col = 0; col < base; col++) {
                if ((fil == 0) || (fil == (altura - 1))) {
                    System.out.print("* ");
                } else {
                    if ((col == 0) || (col == (base - 1))) {
                        System.out.print("* ");
                    } else {
                        System.out.print("  ");
                    }
                }
            }
            System.out.println();
        }
    }


    public static void main(String[] args) {
        Rectangulo rectangulo = new Rectangulo();
        rectangulo.crearRectangulo();
        System.out.println("Superficie: "+ rectangulo.superficie());
        System.out.println("Perimetro: "+ rectangulo.perimetro());
        rectangulo.dibujar();
    }
}

