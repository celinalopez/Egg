package Ejercicio2.entidades;

public class Revolver {
    private int posicionActual;
    private int posicionAgua;

    public Revolver() {
    }

    public Revolver(int posicionActual, int posicionAgua) {
        this.posicionActual = posicionActual;
        this.posicionAgua = posicionAgua;
    }

    public int getPosicionActual() {
        return posicionActual;
    }

    public void setPosicionActual(int posicionActual) {
        this.posicionActual = posicionActual;
    }

    public int getPosicionAgua() {
        return posicionAgua;
    }

    public void setPosicionAgua(int posicionAgua) {
        this.posicionAgua = posicionAgua;
    }

    public void llenarRevolver(){
        setPosicionActual((int)(Math. random()*6+1));
        setPosicionAgua((int)(Math. random()*6+1));
    }
    public boolean mojar(){
        return posicionActual==posicionAgua;
    }
    public void siguienteChorro(){
        if (getPosicionActual() == 6) {
            setPosicionActual(1);
        } else {
            setPosicionActual(getPosicionActual()+1);
        }
    }

    @Override
    public String toString() {
        return "Revolver{" +
                "posicionActual=" + posicionActual +
                ", posicionAgua=" + posicionAgua +
                '}';
    }
}
