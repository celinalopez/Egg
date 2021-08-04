import java.util.Arrays;
import java.util.Scanner;
/**
 * Recorrer un vector de N enteros contabilizando cuántos números son de 1 dígito,
 * cuántos de 2 dígitos, etcétera (hasta 5 dígitos).
 */
public class e24 {
    public static void main(String[] args) {
        int cont1 = 0;
        int cont2 = 0;
        int cont3 = 0;
        int cont4 = 0;
        int cont5 = 0;
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el tamaño del vector");
        int n = leer.nextInt();
        int[] vector = new int[n];
        for (int i = 0; i < n; i++) {
            vector[i]= (int) (Math.random()*99999);
        }
        System.out.println(Arrays.toString(vector));
        for (int i = 0; i < vector.length; i++){
            if (vector[i] / 10 < 1){
                cont1 ++;
            } else if(vector[i]/10 >= 1 && vector[i]/10 < 10){
                cont2 ++;
            } else if(vector[i]/100 >= 1 && vector[i]/100 < 10){
                cont3++;
            } else if(vector[i]/1000 >= 1 && vector[i]/1000 < 10) {
                cont4++;
            } else if(vector[i]/10000 >= 1 && vector[i]/10000 < 10) {
                cont5++;
            }
        }
        System.out.println("Numeros con 1 digito: "+ cont1);
        System.out.println("Numeros con 2 digitos: "+ cont2);
        System.out.println("Numeros con 3 digitos: "+ cont3);
        System.out.println("Numeros con 4 digitos: "+ cont4);
        System.out.println("Numeros con 5 digitos: "+ cont5);
    }
}
