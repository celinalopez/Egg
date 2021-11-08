package EjemplosEgg.mascotapp2.entidadess;
import EjemplosEgg.mascotapp2.enumeriaciones.SexoAnimal;
import EjemplosEgg.mascotapp2.interfaces.AccionMascota;
import java.util.Objects;

public final class Mascota <T> implements AccionMascota {
    private String nombre;
    private String apodo;
    private String tipo;
    private String color;
    private Integer edad;
    private T raza;
    private int energia;
    private SexoAnimal sexo;

    // Constructor
    public Mascota(){
        energia = 1000;
    }

    //Constructor
    public Mascota(String nombre, String apodo, String tipo) {
        this.nombre = nombre;
        this.apodo = apodo;
        this.tipo = tipo;
    }

    public Mascota(String nombre, String apodo, String tipo, String color, Integer edad, T raza) {
        this.nombre = nombre;
        this.apodo = apodo;
        this.tipo = tipo;
        this.color = color;
        this.edad = edad;
        this.raza = raza;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApodo() {
        return apodo;
    }

    public void setApodo(String apodo) {
        this.apodo = apodo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public T getRaza() {
        return raza;
    }

    public void setRaza(T raza) {
        this.raza = raza;
    }

    public int getEnergia() {
        return energia;
    }

    public void setEnergia(int energia) {
        this.energia = energia;
    }

    public SexoAnimal getSexo() {
        return sexo;
    }

    public void setSexo(SexoAnimal sexo) {
        this.sexo = sexo;
    }

    /**
     * Funcion destianada a pasear
     * @return energia
     */
    public int pasear(int energiaRestar){
        energia -= energiaRestar;
        return energia;
    }

    /**
     * Funcion destinada a pasear por vueltas
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

    @Override
    public void pasearMascota(int vueltas) {

    }

    @Override
    public void comer(int cantidad) {

    }
}

