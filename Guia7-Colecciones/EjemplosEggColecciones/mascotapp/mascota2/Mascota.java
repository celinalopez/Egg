package EjemplosEggColecciones.mascotapp.mascota2;

import java.util.Objects;

public class Mascota {
    private String nombre;
    private String apodo;
    //Conejo, Gato, Perro, Ave
    private String tipo;
    private String color;
    private Integer edad;
    private String raza;

    private int energia;
    // Constructor
    //cada vez que nazca una mascota empieza con mil
    public Mascota(){
        energia = 1000;
    }
    //Constructor
    public Mascota(String nombre, String apodo, String tipo, String color, int edad, String raza) {
        this.nombre = nombre;
        this.apodo = apodo;
        this.tipo = tipo;
        this.color = color;
        this.edad = edad;
        this.raza = raza;
        this.energia = 1000;

    }
    //Setter
    public void setNombre(String nombre){
        if (nombre.length()>0){
            this.nombre = nombre;
        }
    }

    public void setApodo(String apodo) {
        this.apodo = apodo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }


    public void setRaza(String raza) {
        this.raza = raza;
    }
    //Getter

    public String getNombre(){
        return nombre;
    }

    public String getApodo() {
        return apodo;
    }

    public String getTipo() {
        return tipo;
    }

    public String getColor() {
        return color;
    }

    public Integer getEdad() {
        return edad;
    }

    public String getRaza() {
        return raza;
    }

    /**
     * Funcion destianada a pasear
     * @param energiaRestar
     * @return energia
     */
    public int pasear(int energiaRestar){
        energia -= energiaRestar;
        return energia;
    }

    /**
     * Funcion destinada a pasear por vueltas
     * @param energiaRestar
     * @param vueltas
     * @return energia
     */
    public int pasear(int energiaRestar, int vueltas){
        for (int i=0;i<vueltas;i++){
            energia -= energiaRestar;
        }
        return energia;
    }

    // alt insert equals() and hashcode
    //queremos que devuelva false, que no sean iguales
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Mascota)) return false;
        Mascota mascota = (Mascota) o;
        return energia == mascota.energia && Objects.equals(getNombre(), mascota.getNombre()) && Objects.equals(getApodo(), mascota.getApodo()) && Objects.equals(getTipo(), mascota.getTipo()) && Objects.equals(getColor(), mascota.getColor()) && Objects.equals(getEdad(), mascota.getEdad()) && Objects.equals(getRaza(), mascota.getRaza());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getNombre(), getApodo(), getTipo(), getColor(), getEdad(), getRaza(), energia);
    }

    // alt + insert "to string" hace una funcion que devuelve un mensaje
    @Override
    public String toString() {
        return "Mascota{" +
                "nombre='" + nombre + '\'' +
                ", apodo='" + apodo + '\'' +
                ", tipo='" + tipo + '\'' +
                ", color='" + color + '\'' +
                ", edad=" + edad +
                ", raza='" + raza + '\'' +
                ", energia=" + energia +
                '}';
    }
}

