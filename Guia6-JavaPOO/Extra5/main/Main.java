package Extra5.main;
import java.util.Scanner;

/**
 * Crea una clase en Java donde declares una variable de tipo array de Strings que
 * contenga los doce meses del año, en minúsculas. A continuación declara una variable
 * mesSecreto de tipo String, y hazla igual a un elemento del array (por ejemplo
 * mesSecreto = mes[9]. El programa debe pedir al usuario que adivine el mes secreto.
 * Si el usuario acierta mostrar un mensaje, y si no lo hace, pedir que vuelva a intentar
 * adivinar el mes secreto. Un ejemplo de ejecución del programa podría ser este:
 * Adivine el mes secreto. Introduzca el nombre del mes en minúsculas: febrero
 * No ha acertado. Intente adivinarlo introduciendo otro mes: agosto
 * No ha acertado. Intente adivinarlo introduciendo otro mes: octubre
 * ¡Ha acertado!
 **/

public class Main {
    Scanner leer = new Scanner(System.in);
    private final String[] mes = {"enero","febrero","marzo","abril",
            "mayo","junio","julio","agosto","septiembre","octubre",
            "noviembre","diciembre"};
    private final String mesSecreto = mes[9];

    public void adivinarMes(){
        System.out.println("Adivina el nombre del mes secreto: ");
        String intento = leer.next();
        do {
            System.out.println("Vuelve a intentarlo: ");
            intento = leer.next();
        } while (!intento.equalsIgnoreCase(mesSecreto));
        System.out.println("Acertaste!");
    }
    public static void main(String[] args) {
        Main juego = new Main();
        juego.adivinarMes();
    }
}

