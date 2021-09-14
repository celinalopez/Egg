package Principal;

import Servicios.PersonaServicio;
import Entidades.Persona;

public class ClaseMain {
    public static void main(String[] args) {     
        
        // Objeto de clase PersonaServicio, para acceder a los metodos que dispongo en esa clase
        PersonaServicio nuevo = new PersonaServicio();
        // Objeto de entidad Persona
        Persona nuevaPersona = new Persona();//Lo creee en este caso, con constructor vacio, dejo preparado espacio en memoria        
        nuevo.cargarPersona(nuevaPersona);//Llamo al metodo, donde cargue los datos en mi objeto
        System.out.println(nuevaPersona.toString());//Llamo al metodo para imprimir        
        nuevo.modificarApellido(nuevaPersona);//Llamo al metodo para modificar
        System.out.println(nuevaPersona.toString());//Llamo al metodo para imprimir y ver que se modifico el dato        
        System.out.println("Usted vivio en total :" + nuevo.diasVividos(nuevaPersona) + " dias");//Llamo al metodo para calcular dias que vivio        
        nuevo.esTuCumpleaños(nuevaPersona); // Llamo al metodo que hace que envejezca ...
        System.out.println(nuevaPersona.toString()); //Llamo al metodo para imprimir y ver que se modifico el dato      
      
    }
}
