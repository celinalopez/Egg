package Servicio;
import Libro.Libro;
import java.util.Scanner;

public class ServicioLibro {
    private Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public Libro crearLibro(){
        System.out.println("Codigo ISBN del libro");
        int isbn = leer.nextInt();
        System.out.println("Titulo del libro");
        String titulo = leer.next();
        System.out.println("Autor");
        String autor = leer.next();
        System.out.println("Numero de paginas");
        int paginas = leer.nextInt();

        return new Libro(isbn,titulo,autor,paginas);

    }

}
