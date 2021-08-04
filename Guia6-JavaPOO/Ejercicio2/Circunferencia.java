package Ejercicio2;

import java.util.Scanner;

/*
Declarar una clase llamada Circunferencia que tenga como atributo privado el radio
de tipo real. A continuación, se deben crear los siguientes métodos:
a) Método constructor que inicialice el radio pasado como parámetro.
b) Métodos get y set para el atributo radio de la clase Circunferencia.
c) Método para crearCircunferencia(): que le pide el radio y lo guarda en el atributo
del objeto.
d) Método area(): para calcular el área de la circunferencia (Area = π ∗ radio!).
e) Método perimetro(): para calcular el perímetro (Perimetro = 2 ∗ π ∗ radio).
 */
public class Circunferencia {
    private Scanner leer = new Scanner(System.in).useDelimiter("\n");
    private double radio;

    //Constructor
    public Circunferencia(double radio){
        this.radio = radio;
    }
    //Constructor vacio
    public Circunferencia(){
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }

    public void crearCircunferencia(){
        System.out.println("Ingrese el radio de la circunferencia");
        setRadio(leer.nextInt());
    }

    public double area(){
        return (Math.PI * radio);
    }

    public double perimetro(){
        return (2 * Math.PI * radio);
    }

    @Override
    public String toString() {
        return "Circunferencia: \n*radio: " + radio +
                "\n*perimetro: " + perimetro() +
                "\n*area: " + area();
    }

    public static void main(String[] args) {

        Circunferencia circunferencia1 = new Circunferencia();
        circunferencia1.crearCircunferencia();
        //Imprimir usando el getter
        System.out.println("Circunferencia: \n*radio: " + circunferencia1.getRadio() +
                "\n*perimetro: " + circunferencia1.perimetro() +
                "\n*area: " + circunferencia1.area());

        Circunferencia circunferencia2 = new Circunferencia(5);
        //Imprimir usando la funcion automatica "ToString" de la clase Circunferencia
        System.out.println(circunferencia2);
    }
}
