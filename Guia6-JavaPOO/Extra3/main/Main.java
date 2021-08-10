package Extra3.main;

import Extra3.raices.Raices;
import Extra3.service.Service;

/*
Vamos a realizar una clase llamada Raices, donde representaremos los valores de una
ecuación de 2o grado. Tendremos los 3 coeficientes como atributos, llamémosles a, b
y c. Hay que insertar estos 3 valores para construir el objeto a través de un método
constructor. Luego, las operaciones que se podrán realizar son las siguientes:
• Método getDiscriminante(): devuelve el valor del discriminante (double). El
discriminante tiene la siguiente formula: (b^2)-4*a*c
• Método tieneRaices(): devuelve un booleano indicando si tiene dos soluciones, para
que esto ocurra, el discriminante debe ser mayor o igual que 0.
• Método tieneRaiz(): devuelve un booleano indicando si tiene una única solución,
para que esto ocurra, el discriminante debe ser igual que 0.
• Método obtenerRaices(): llama a tieneRaíces() y si devolvió́ true, imprime las 2
posibles soluciones.
• Método obtenerRaiz(): llama a tieneRaiz() y si devolvió́ true imprime una única raíz.
Es en el caso en que se tenga una única solución posible.
• Método calcular(): esté método llamará tieneRaices() y a tieneRaíz(), y mostrará por
pantalla las posibles soluciones que tiene nuestra ecuación con los métodos
obtenerRaices() o obtenerRaiz(), según lo que devuelvan nuestros métodos y en
caso de no existir solución, se mostrará un mensaje.
 */
public class Main {
    public static void main(String[] args) {
        //Creamos una funcion de segundo grado (ax^2 + bx + c) con 2 raices reales
        Raices funcion1 = new Raices(2,3,1);
        //Ejecutamos los metodos para esa funcion
        Service sv = new Service();
        System.out.println("---Funcion 1---");
        sv.calcular(funcion1);
        //Funcion de raiz unica
        Raices funcion2 = new Raices(1,2,1);
        System.out.println("---Funcion 2---");
        sv.calcular(funcion2);
        //Funcion sin raices reales
        Raices funcion3 = new Raices(1,1,1);
        System.out.println("---Funcion 3---");
        sv.calcular(funcion3);


    }
}
