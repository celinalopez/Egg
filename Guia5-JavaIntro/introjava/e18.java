/**
 * Necesitamos mostrar un contador con 3 dígitos (X-X-X), que muestre los números
 * del 0-0-0 al 9-9-9, con la particularidad que cada vez que aparezca un 3 lo sustituya
 * por una E. Nota: investigar función equals() y como convertir números a String.
 */
public class e18 {
    public static void main(String[] args) {
        String cadena;
        int unidad = 0;
        int decena = 0;
        int centena = 0;
        String unid;
        String dec;
        String cent;
        boolean seguir = true;

        while (seguir) {
            if (unidad == 3) {
                unid = "E";
            } else {
                unid = String.valueOf(unidad);
            }
            if (decena == 3) {
                dec = "E";
            } else {
                dec = String.valueOf(decena);
            }
            if (centena == 3) {
                cent = "E";
            } else {
                cent = String.valueOf(centena);
            }
            cadena = cent + " - " + dec + " - " + unid;
            unidad += 1;
            if (unidad == 10) {
                unidad = 0;
                decena += 1;
            }
            if (decena == 10) {
                decena = 0;
                centena += 1;
            }
            if (centena == 9 && decena == 9 && unidad == 9) {
                seguir = false;
            }
            System.out.println(cadena);
        }

    }
}
