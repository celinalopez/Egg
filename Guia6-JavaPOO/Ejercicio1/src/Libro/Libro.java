package Libro;

public class Libro {
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

    @Override
    public String toString() {
        return
                "\n*ISBN: " + isbn +
                "\n*Titulo: " + titulo +
                "\n*Autor: " + autor +
                "\n*Paginas: " + paginas ;
    }
}
