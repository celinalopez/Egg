package Ejercicio12.persona;
import java.util.Date;

public class Persona {
    private String nombre;
    private Date fechaNac;

    public Persona() {
        fechaNac = new Date(); //Para que no se cree la fecha en null
    }

    public Persona(String nombre, Date fechaNac) {
        this.nombre = nombre;
        this.fechaNac = fechaNac;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Date getFechaNac() {
        return fechaNac;
    }

    public void setFechaNac(Date fechaNac) {
        this.fechaNac = fechaNac;
    }

    @Override
    public String toString() {
        return "Persona{" +
               "nombre='" + nombre + '\'' +
               ", fechaNac=" + fechaNac +
               '}';
    }
}
