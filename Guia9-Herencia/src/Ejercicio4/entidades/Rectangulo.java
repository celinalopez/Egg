package Ejercicio4.entidades;

public class Rectangulo extends FormaGeometrica{
    private Double base;
    private Double altura;

    public Rectangulo() {
    }

    public Rectangulo(Double base, Double altura) {
        this.base = base;
        this.altura = altura;
    }

    public Rectangulo(Double area, Double perimetro, Double base, Double altura) {
        super(area, perimetro);
        this.base = base;
        this.altura = altura;
    }

    public Double getBase() {
        return base;
    }

    public void setBase(Double base) {
        this.base = base;
    }

    public Double getAltura() {
        return altura;
    }

    public void setAltura(Double altura) {
        this.altura = altura;
    }

    @Override
    public String toString() {
        return "Rectangulo{" +
                "area=" + area +
                ", perimetro=" + perimetro +
                ", base=" + base +
                ", altura=" + altura +
                '}';
    }
}
