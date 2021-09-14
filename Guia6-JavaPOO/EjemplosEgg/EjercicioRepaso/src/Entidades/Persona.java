package Entidades;

public class Persona {
    private String nombre;
    private String apellido;
    private int edad;
    
    // Constructor vacío
    public Persona() {
    }
    
    // Constructor para crear el objeto con todos atributos
    public Persona(String nombre, String apellido, int edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
    }
    
    // Getter y setter
    public String getNombre() {
        return nombre;
    }
    public String getApellido() {
        return apellido;
    }
    public int getEdad() {
        return edad;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    // toString
    @Override // Mi metodo toString para imprimir de forma rapida, puedo modificar su "estetica" 
    public String toString() {
        return "Datos de la Persona:" + "\n Nombre: " + nombre + ","
                + "\n Apellido: " + apellido + ","
                + "\n Edad: " + edad + '.';
    }    
}
