package entidades;

public class Fabricante {

    String nombre;
    int codigo;

    public Fabricante() {
    }

    public Fabricante(String nombre, int codigo) {
        this.nombre = nombre;
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public Fabricante codigo(int codigo) {
        setCodigo(codigo);
        return this;
    }

    public Fabricante nombre(String nombre) {
        setNombre(nombre);
        return this;
    }

    @Override
    public String toString() {
        return "{" + " codigo='" + getCodigo() + "'" + ", nombre='" + getNombre() + "'" + "}";
    }

}
