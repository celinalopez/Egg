package EjemplosEgg.ClasesAbstractas.entidades;

public class CasaCampo extends Estructura {

    private boolean casaArbol;

    public CasaCampo(boolean casaArbol, Double superficieTotal) {
        super(superficieTotal);
        this.casaArbol = casaArbol;
    }

    public boolean isCasaArbol() {
        return casaArbol;
    }

    public void setCasaArbol(boolean casaArbol) {
        this.casaArbol = casaArbol;
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
        this.superficieCubierta = ancho * largo;
    }
}
