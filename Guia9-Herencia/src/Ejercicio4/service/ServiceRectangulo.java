package Ejercicio4.service;

import Ejercicio4.entidades.Rectangulo;

public class ServiceRectangulo extends Rectangulo {

    public ServiceRectangulo() {
    }

    public ServiceRectangulo(Double base, Double altura) {
        super(base, altura);
        calculoArea();
        calculoPerimetro();
    }

    @Override
    public void calculoArea() {
        setArea(getBase()*getAltura());
    }

    @Override
    public void calculoPerimetro() {
        setPerimetro((getAltura()*2)+(getBase()*2));
    }

}
