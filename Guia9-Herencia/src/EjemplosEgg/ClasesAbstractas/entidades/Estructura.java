package EjemplosEgg.ClasesAbstractas.entidades;

public abstract class Estructura {

    protected Double superficieCubierta;
    protected Double superficieTotal;

    public Estructura(Double superficieTotal) {
        this.superficieTotal = superficieTotal;
    }

    public abstract void CalcularSuperficie(double ancho, double largo);

}
