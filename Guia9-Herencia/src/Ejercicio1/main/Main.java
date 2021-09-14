package Ejercicio1.main;

import Ejercicio1.animales.Animal;
import Ejercicio1.animales.Caballo;
import Ejercicio1.animales.Gato;
import Ejercicio1.animales.Perro;

/*
Tenemos una clase padre Animal junto con sus 3 clases hijas Perro, Gato, Caballo.
La clase Animal tendrá como atributos el nombre, alimento, edad y raza del
Animal.
Crear un método en la clase Animal a través del cual cada clase hija deberá
mostrar luego un mensaje por pantalla informando de que se alimenta. Generar
una clase Main que realice lo siguiente:
 */
public class Main {
    public static void main(String[] args) {
        Animal perro1 = new Perro("Stich","Carnivoro",15,"Doberman");
        perro1.Alimentarse();
        Animal perro2 = new Perro("Teddy","Croquetas",10,"Chihuahua");
        perro2.Alimentarse();
        Animal gato = new Gato("Pelusa","Galletas",15,"Siames");
        gato.Alimentarse();
        Animal caballo = new Caballo("Spark","Pasto",25,"Fino");
        caballo.Alimentarse();
    }
}
