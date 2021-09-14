package EjemplosEgg.ClasesAbstractas.entidades;

public final class Edificio extends Estructura{

    private Integer pisos;

    public Edificio(Integer pisos, Double superficieTotal) {
        super(superficieTotal);
        this.pisos = pisos;
    }

    public Integer getPisos() {
        return pisos;
    }

    public void setPisos(Integer pisos) {
        this.pisos = pisos;
    }


    public Double getSuperficieCubierta() {
        return superficieCubierta;
    }

    public void setSuperficieCubierta(Double superficieCubierta) {
        this.superficieCubierta = superficieCubierta;
    }

    public Double getSuperficieTotal() {
        return superficieTotal;
    }

    public void setSuperficieTotal(Double superficieTotal) {
        this.superficieTotal = superficieTotal;
    }

    @Override
    public void CalcularSuperficie(double ancho, double largo) {
        this.superficieCubierta = ancho * largo * this.pisos;
    }

}
