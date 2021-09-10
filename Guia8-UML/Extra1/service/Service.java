package Extra1.service;
import Extra1.entidades.Perro;
import Extra1.entidades.Persona;
import java.util.ArrayList;
import java.util.List;

public class Service {
    private List<Persona> lista_personas = new ArrayList<>();
    private List<Perro> lista_perros = new ArrayList<>();

    public Service() {
    }

    public Service(List<Persona> lista_personas, List<Perro> lista_perros) {
        this.lista_personas = lista_personas;
        this.lista_perros = lista_perros;
    }

    public void agregarPersona(Persona p){
        lista_personas.add(p);
    }
    public void agregarPerro(Perro perro){
        lista_perros.add(perro);
    }

    public void servicioAdopcion(Persona persona, Perro perro) {
        if (lista_personas.contains(persona)) {
            if (lista_perros.contains(perro)) {
                if (!perro.getAdoptado()) {
                    perro.setAdoptado(true);
                    persona.setPerro(perro);
                    System.out.println("Felicidades, acabas de adoptar un perrito");
                } else System.out.println("Lo sentimos, este perrito ya fue adoptado");
            } else System.out.println("No se encontró un perro con ese nombre");
        } else System.out.println("No estas registrado");
    }

    public void mostrarPersonas(){
        System.out.println("LISTA DE PERSONAS: \n"+lista_personas);
    }
}
