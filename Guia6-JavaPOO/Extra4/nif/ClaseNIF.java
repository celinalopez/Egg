package Extra4.nif;

public class ClaseNIF {
    private int dni;
    private String letra;

    public ClaseNIF() {
    }

    public ClaseNIF(int dni, String letra) {
        this.dni = dni;
        this.letra = letra;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public String getLetra() {
        return letra;
    }

    public void setLetra(String letra) {
        this.letra = letra;
    }
}
