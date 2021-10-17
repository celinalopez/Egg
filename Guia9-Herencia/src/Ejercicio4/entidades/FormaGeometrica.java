package Ejercicio4.entidades;

import Ejercicio4.interfaces.calculosFormas;

public class FormaGeometrica implements calculosFormas {
    protected Double area;
    protected Double perimetro;

    public FormaGeometrica() {
    }

    public FormaGeometrica(Double area, Double perimetro) {
        this.area = area;
        this.perimetro = perimetro;
    }

    public Double getArea() {
        return area;
    }

    public void setArea(Double area) {
        this.area = area;
    }

    public Double getPerimetro() {
        return perimetro;
    }

    public void setPerimetro(Double perimetro) {
        this.perimetro = perimetro;
    }


    @Override
    public void calculoArea() {
    }

    @Override
    public void calculoPerimetro() {
    }
}
