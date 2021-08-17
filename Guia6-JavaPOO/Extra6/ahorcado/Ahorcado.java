package Extra6.ahorcado;

public class Ahorcado {
    private String[] vectorPalabra;
    private int letrasEncontradas, intentosMax;

    public Ahorcado() {
    }

    public Ahorcado(String[] vectorPalabra, int letrasEncontradas, int intentosMax) {
        this.vectorPalabra = vectorPalabra;
        this.letrasEncontradas = letrasEncontradas;
        this.intentosMax = intentosMax;
    }

    public String[] getVectorPalabra() {
        return vectorPalabra;
    }

    public void setVectorPalabra(String[] vectorPalabra) {
        this.vectorPalabra = vectorPalabra;
    }

    public int getLetrasEncontradas() {
        return letrasEncontradas;
    }

    public void setLetrasEncontradas(int letrasEncontradas) {
        this.letrasEncontradas = letrasEncontradas;
    }

    public int getIntentosMax() {
        return intentosMax;
    }

    public void setIntentosMax(int intentosMax) {
        this.intentosMax = intentosMax;
    }
}
