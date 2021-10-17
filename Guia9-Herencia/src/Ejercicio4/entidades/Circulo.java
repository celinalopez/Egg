package Ejercicio4.entidades;

public class Circulo extends FormaGeometrica{
    private Double radio;
    private Double diametro;

    public Circulo() {
    }

    public Circulo(Double radio) {
        this.radio = radio;
        this.diametro = radio*2;
    }

    public Circulo(Double area, Double perimetro, Double radio) {
        super(area, perimetro);
        this.radio = radio;
        this.diametro = radio*2;
    }

    public Double getRadio() {
        return radio;
    }

    public void setRadio(Double radio) {
        this.radio = radio;
    }

    public Double getDiametro() {
        return diametro;
    }

    public void setDiametro(Double diametro) {
        this.diametro = diametro;
    }

    @Override
    public String toString() {
        return "Circulo{" +
                "radio=" + radio +
                ", diametro=" + diametro +
                ", area=" + area +
                ", perimetro=" + perimetro +
                '}';
    }
}
