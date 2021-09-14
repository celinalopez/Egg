package EjemplosEgg.Polimorfismo.entidades;

public final class Perro extends Animal{

    private String razaPerro;

    public Perro(Integer patas, boolean cola, Integer anos, Double energia, String razaPerro) {
        super(patas, cola, anos, energia);
        this.razaPerro = razaPerro;
    }

    public String getRazaPerro() {
        return razaPerro;
    }

    public void setRazaPerro(String razaPerro) {
        this.razaPerro = razaPerro;
    }

    public Integer getPatas() {
        return patas;
    }

    public void setPatas(Integer patas) {
        this.patas = patas;
    }

    public boolean isCola() {
        return cola;
    }

    public void setCola(boolean cola) {
        this.cola = cola;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public Double getEnergia() {
        return energia;
    }

    public void setEnergia(Double energia) {
        this.energia = energia;
    }

    public void jugarEnParque(int tiempo){
        for(int i=0; i<tiempo;i++){
            energia -= 10;
        }
        System.out.println("La energia restante es de: "+this.energia);
    }

    @Override
    public void CalcularEdad() {

    }

    @Override
    public void hacerRuido() {
        super.hacerRuido();
        System.out.println("Guau guau");
    }
}
