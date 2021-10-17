package Ejercicio4.service;

import Ejercicio4.entidades.Circulo;

public class ServiceCirculo extends Circulo{

    public ServiceCirculo() {
    }

    public ServiceCirculo(Double radio) {
        super(radio);
        calculoArea();
        calculoPerimetro();
    }

    @Override
    public void calculoArea() {
        setArea((pi * Math.pow(getRadio(),2)));
    }

    @Override
    public void calculoPerimetro() {
        setPerimetro(pi * getDiametro());
    }

}
