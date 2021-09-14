package EjemplosEgg.Polimorfismo.entidades;

public abstract class Animal {

    protected Integer patas;
    protected boolean cola;
    protected  Integer edad;
    protected Double energia;

    public Animal(Integer patas, boolean cola, Integer anos, Double energia) {
        this.patas = patas;
        this.cola = cola;
        this.edad = anos;
        this.energia = energia;
    }
    public abstract void CalcularEdad();

    public void hacerRuido(){
        System.out.println("**Ruido animal");
    }


}
