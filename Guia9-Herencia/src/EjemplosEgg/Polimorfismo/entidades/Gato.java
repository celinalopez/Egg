package EjemplosEgg.Polimorfismo.entidades;

public final class Gato extends Animal{

    private String razaGato;

    public Gato(Integer patas, boolean cola, Integer anos, Double energia, String razaGato) {
        super(patas, cola, anos, energia);
        this.razaGato = razaGato;
    }

    public String getRazaGato() {
        return razaGato;
    }

    public void setRazaGato(String razaGato) {
        this.razaGato = razaGato;
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

    //----------------------------------------------------------------

    public void ronronear(){
        System.out.println("prrrrrrrrrrr");
    }

    @Override
    public void CalcularEdad() {
        System.out.println("La edad gatuna es de: "+ this.edad * 8);
    }

    @Override
    public void hacerRuido() {
        super.hacerRuido();
        System.out.println("Miau");
    }
}
