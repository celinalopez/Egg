
package Ejercicio9.service;

import Ejercicio9.matematica.Matematica;

public class Service {

    public double devolverMayor(Matematica m1){
        double num1 = m1.getNumero1();
        double num2 = m1.getNumero2();
        return Math.max(num1,num2);
    }
    //calcular la potencia del mayor valor de la clase elevado al menor número.
    public double calcularPotencia(Matematica m1){
        double n1 = m1.getNumero1();
        double n2 = m1.getNumero2();
        return Math.round(Math.pow(devolverMayor(m1), Math.min(n1,n2)));
    }
    //calcular la raíz cuadrada del menor de los dos valores.
    public double calcularRaiz(Matematica m1){
        double n1 = m1.getNumero1();
        double n2 = m1.getNumero2();
        return Math.round(Math.abs(Math.sqrt(Math.min(n1,n2))));
    }
}
