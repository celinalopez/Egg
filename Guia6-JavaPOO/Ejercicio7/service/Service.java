/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Ejercicio7.service;

import Ejercicio7.persona.Persona;

import java.util.Scanner;

public class Service {
    private final Scanner leer = new Scanner(System.in).useDelimiter("\n");
    private final int imcIdeal = 0;
    private final int imcAlto = 1;
    private final int imcBajo = -1;
    public int imcI=0;
    public int imcB=0;
    public int imcA=0;
    public int mayores=0;
    public int menores=0;

    public Persona crearPersona() {
        System.out.println("Nombre: ");
        String nombre = leer.next();
        System.out.println("Edad: ");
        int edad = leer.nextInt();

        System.out.println("Sexo: H-M-O ");
        char sexo = Character.toUpperCase(leer.next().charAt(0));

        while (sexo != 'H' && sexo != 'M' && sexo != 'O') {
            System.out.println("Vuelva a intentar. Sexo: H-M-O");
            sexo = Character.toUpperCase(leer.next().charAt(0));
        }

        System.out.println("Peso: ");
        double peso = leer.nextDouble();
        System.out.println("Altura: ");
        double altura = leer.nextDouble();

        return new Persona(nombre, edad, sexo, peso, altura);
    }

    public int calcularIMC(Persona p) {
        double peso = p.getPeso();
        double altura = p.getAltura()/100;
        double imc = (peso / Math.pow(altura, 2));
        if (imc < 20) {
            imcB +=1;
            System.out.println(p.getNombre()+" está por debajo de su peso ideal");
            return imcBajo;
        } else if (imc > 20 && imc < 25) {
            imcI +=1;
            System.out.println(p.getNombre()+" está en su peso ideal :)");
            return imcIdeal;
        } else imcA +=1;
        System.out.println(p.getNombre()+" está por encima de su peso ideal");
        return imcAlto;
    }

    public boolean esMayorDeEdad(Persona p) {
        if (p.getEdad() >= 18){
            mayores += 1;
            System.out.println(p.getNombre()+" es mayor de edad");
            return true;
        }else{
            System.out.println(p.getNombre()+" es menor de edad");
            menores+=1;
            return false;
        }
    }

}