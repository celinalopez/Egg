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
        radio=0;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }

    public void crearCircunferencia(){
        System.out.println("Ingrese el radio de la circunferencia");
        radio = leer.nextDouble();
    }

    public double area(double radio){
        return (Math.PI * radio);
    }

    public double perimetro(double radio){
        return (2 * Math.PI * radio);
    }

    public static void main(String[] args) {

        Circunferencia circunferencia = new Circunferencia();
        circunferencia.crearCircunferencia();
        System.out.println("Area: "+ circunferencia.area(circunferencia.radio));
        System.out.println("Perimetro: "+ circunferencia.perimetro(circunferencia.radio));

    }
}
