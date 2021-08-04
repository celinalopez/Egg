package Ejercicio1;

import java.util.Scanner;
/*
Crear una clase llamada Libro que contenga los siguientes atributos: ISBN, Título,
Autor, Número de páginas, y un constructor con todos los atributos pasados por
parámetro y un constructor vacío. Crear un método para cargar un libro pidiendo los
datos al usuario y luego informar mediante otro método el número de ISBN, el título,
el autor del libro y el numero de páginas.
 */

public class Libro {
    private Scanner leer = new Scanner(System.in);
    private int isbn;
    private String titulo;
    private String autor;
    private int paginas;

    //Constructor, automatico -> alt+insert constructor
    public Libro(int isbn, String titulo, String autor, int paginas) {
        this.isbn = isbn;
        this.titulo = titulo;
        this.autor = autor;
        this.paginas = paginas;
    }
    //Constructor vacio
    public Libro() {
    }
    //Setter
    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setPaginas(int paginas) {
        this.paginas = paginas;
    }

    //Getter
    public int getIsbn() {
        return isbn;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public int getPaginas() {
        return paginas;
    }

    //Metodos
    public void crearLibro(){
        System.out.println("Ingrese ISBC, Titulo, Autor y paginas del libro: ");
        setIsbn(leer.nextInt());
        setTitulo(leer.next());
        setAutor(leer.next());
        setPaginas(leer.nextInt());
    }
    //Main
    public static void main(String[] args) {
        Libro libro1 = new Libro(1234, "Harry Potter", "J.K Rowlin", 680);

        Libro libro2 = new Libro();
        libro2.crearLibro(); //Nos va a pedir llenar los datos del libro

        //Imprimime usando cada getter
        System.out.println("\n*ISBN: " + libro1.getIsbn() +
                "\n*Titulo: " + libro1.getTitulo() +
                "\n*Autor: " + libro1.getAutor() +
                "\n*Paginas: " + libro1.getPaginas());
        System.out.println("\n*ISBN: " + libro2.getIsbn() +
                "\n*Titulo: " + libro2.getTitulo() +
                "\n*Autor: " + libro2.getAutor() +
                "\n*Paginas: " + libro2.getPaginas());
    }
}
