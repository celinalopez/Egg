import java.util.Scanner;

/*
Crear una clase llamada Operacion que tenga como atributos privados el numero1 y
numero2. A continuación, se deben crear los siguientes métodos:
a) Método constructor con todos los atributos pasados por parámetro.
b) Metodo constructor sin los atributos pasados por parámetro.
c) Métodos get y set.
d) Método para crearOperacion(): que le pide al usuario los dos números y los
guarda en los atributos del objeto.
16
e) Método sumar(): calcular la suma de los números y devolver el resultado al main.
f) Método restar(): calcular la resta de los números y devolver el resultado al main
g) Método multiplicar(): primero valida que no se haga una multiplicación por cero,
si fuera a multiplicar por cero, el método devuelve 0 y se le informa al usuario el
error. Si no, se hace la multiplicación y se devuelve el resultado al main
h) Método dividir(): primero valida que no se haga una división por cero, si fuera a
pasar una división por cero, el método devuelve 0 y se le informa al usuario el
error se le informa al usuario. Si no, se hace la división y se devuelve el resultado
al main.
 */
public class Operacion {
    private Scanner leer = new Scanner(System.in).useDelimiter("\n");
    private double numero1, numero2;

    //Constructor vacio
    public Operacion() {
    }
    //Constructor con atributos
    public Operacion(double numero1, double numero2) {
        this.numero1 = numero1;
        this.numero2 = numero2;
    }

    public void setNumero1(double numero1) {
        this.numero1 = numero1;
    }

    public void setNumero2(double numero2) {
        this.numero2 = numero2;
    }

    public double getNumero1() {
        return numero1;
    }

    public double getNumero2() {
        return numero2;
    }

    public void crearOperacion(){
        System.out.println("Ingrese los dos numeros a operar");
        numero1 = leer.nextDouble();
        numero2 = leer.nextDouble();
    }
    public double sumar(){
        return this.numero1+this.numero2;
    }
    public double restar(){
        return this.numero1-this.numero2;
    }
    public double multiplicar(){
        if (numero1 == 0 || numero2==0){
            System.out.println("Error, se multiplicó por cero");
            return 0;

        } else{
            return numero1*numero2;
        }
    }
    public double dividir(){
        if (numero2 == 0){
            System.out.println("Error, se ha querido dividir por cero");
            return 0;
        } else{
            return numero1/numero2;
        }

    }
    public static void main(String[] args) {
        Operacion operacion = new Operacion();
        operacion.crearOperacion();
        System.out.println("Suma: "+ operacion.sumar());
        System.out.println("Resta: "+ operacion.restar());
        System.out.println("Multiplicacion: "+ operacion.multiplicar());
        System.out.println("Divison: "+operacion.dividir());
    }
}
