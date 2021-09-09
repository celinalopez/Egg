package EjemplosEgg.mascotapp2.entidadess;
import EjemplosEgg.mascotapp2.enumeriaciones.SexoHumano;

import java.util.Date;
import java.util.List;

public class Usuario {

    public String nombre;
    public String apellido;
    public int dni;
    public Date nacimiento;
    public String pais;
    public SexoHumano sexo;
    //un usuario se vincula a muchas mascotas
    private List<Mascota> mascotas;

    private Mascota mascotaFavorita;

    //Generar codigo automatico alt insert
    public Usuario() {
    }

    public Usuario(String nombre, String apellido, int dni, Date nacimiento, String pais, SexoHumano sexo) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.nacimiento = nacimiento;
        this.pais = pais;
        this.sexo = sexo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public Date getNacimiento() {
        return nacimiento;
    }

    public void setNacimiento(Date nacimiento) {
        this.nacimiento = nacimiento;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public SexoHumano getSexo() {
        return sexo;
    }

    public void setSexo(SexoHumano sexo) {
        this.sexo = sexo;
    }

    public List<Mascota> getMascotas() {
        return mascotas;
    }

    public void setMascotas(List<Mascota> mascotas) {
        this.mascotas = mascotas;
    }

    public Mascota getMascotaFavorita() {
        return mascotaFavorita;
    }

    public void setMascotaFavorita(Mascota mascotaFavorita) {
        this.mascotaFavorita = mascotaFavorita;
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", dni=" + dni +
                ", nacimiento=" + nacimiento +
                ", pais='" + pais + '\'' +
                ", sexo=" + sexo +
                "\nmascotas=" + mascotas +
                "\nmascotaFavorita=" + mascotaFavorita +
                '}';
    }
}
