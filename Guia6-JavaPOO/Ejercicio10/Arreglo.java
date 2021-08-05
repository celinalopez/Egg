package Ejercicio10;
import java.util.Arrays;

/**
 * Realizar un programa en Java donde se creen dos arreglos: el primero será un arreglo
 * A de 50 números reales, y el segundo B, un arreglo de 20 números, también reales. El
 * programa deberá inicializar el arreglo A con números aleatorios y mostrarlo por
 * pantalla. Luego, el arreglo A se debe ordenar de menor a mayor y copiar los primeros
 * 10 números ordenados al arreglo B de 20 elementos, y rellenar los 10 últimos
 * elementos con el valor 0.5. Mostrar los dos arreglos resultantes: el ordenado de 50
 * elementos y el combinado de 20.
 */
public class Arreglo {
    private double[] arregloA = new double[50];
    private double[] arregloB = new double[20];

    //Inicializa el arreglo con numeros aleatorios entre 0-9 con 2 decimales
    public Arreglo() {
        for(int i=0; i<50; i++ ){
            arregloA[i] = Math.floor(Math.random()*1000)/100;
        }
    }

    public Arreglo(double[] arregloA, double[] arregloB) {
        this.arregloA = arregloA;
        this.arregloB = arregloB;

    }

    public double[] getArregloA() {
        return arregloA;
    }

    public void setArregloA(double[] arregloA) {
        this.arregloA = arregloA;
    }

    public double[] getArregloB() {
        return arregloB;
    }

    public void setArregloB(double[] arregloB) {
        this.arregloB = arregloB;
    }

    public static void main(String[] args) {
        Arreglo a1 = new Arreglo();
        System.out.println("Arreglo A: " +"\n"+ Arrays.toString(a1.arregloA));
        //Ordenar arreglo
        Arrays.sort(a1.arregloA);
        System.out.println("*ARREGLO A ORDENADO: \n" + Arrays.toString(a1.arregloA));
        //Llenar arreglo B
        for (int i=0; i<10; i++){
            a1.arregloB[i]=a1.arregloA[i];
            for(int j=10; j<a1.arregloB.length; j++){
                a1.arregloB[j]=0.5;
            }
        }
        System.out.println("*ARREGLO COMBINADO: \n" + Arrays.toString(a1.arregloB));
    }
}
