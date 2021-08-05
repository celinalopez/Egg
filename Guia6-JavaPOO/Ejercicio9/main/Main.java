package Ejercicio9.main;
import Ejercicio9.matematica.Matematica;
import Ejercicio9.service.Service;

/**
 * Realizar una clase llamada Matemática que tenga como atributos dos números reales
 * con los cuales se realizarán diferentes operaciones matemáticas. La clase deber tener
 * un constructor vacío, parametrizado y get y set. En el main se creara el objeto y se
 * usará el Math.random para generar los dos números y se guardaran en el objeto con
 * su respectivos set. Deberá además implementar los siguientes métodos:
 * • Método devolverMayor() para retornar cuál de los dos atributos tiene el mayor
 * valor
 * • Método calcularPotencia() para calcular la potencia del mayor valor de la clase
 * elevado al menor número. Previamente se deben redondear ambos valores.
 * • Método calculaRaiz(), para calcular la raíz cuadrada del menor de los dos valores.
 * Antes de calcular la raíz cuadrada se debe obtener el valor absoluto del número.
 */
public class Main {
    public static void main(String[] args) {
        Matematica mate = new Matematica(Math.random()*101,Math.random()*101);
        Service sv = new Service();
        System.out.println("numero 1: " + mate.getNumero1() + "\nnumero 2: "+ mate.getNumero2());
        System.out.println("*numero mayor: " + sv.devolverMayor(mate));
        System.out.println("*mayor potenciado al menor: " + sv.calcularPotencia(mate));
        System.out.println("*raiz del menor: " + sv.calcularRaiz(mate));

    }
}
