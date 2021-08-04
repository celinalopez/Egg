import java.util.Scanner;

/**
 * Dibujar un cuadrado de N elementos por lado utilizando el carácter “*”.
 */
public class e19 {
    public static void main(String[] args) {
        int n;
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el lado del cuadrado");
        n = leer.nextInt();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {

                if (i == 0 || i == n-1 ) {   // i==0 primera fila o i==n-1 ultima fila
                    System.out.print(" * ");
                }
                if (i > 0 && i < n-1) {

                    if (j == 0 || j == n-1) {   // primera columna o ultima columna
                        System.out.print(" * ");
                    } else {
                        System.out.print("  ");
                    }
                }
            }
            System.out.println(" ");
        }
        leer.close();

    }
}
