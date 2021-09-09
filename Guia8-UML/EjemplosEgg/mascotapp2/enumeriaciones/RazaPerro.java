package EjemplosEgg.mascotapp2.enumeriaciones;

public enum RazaPerro {
    BEAGLE(1234, "Beagle"),COCKER(1111, "Cocker"),PITBULL(2222,"Pitbull"),DOBERMAN(6666,"Doberman"),CANICHE(444,"Caniche"),CHIHUAHUA(565,"Chihuahua");

    private Integer codigo;
    private String value;

    private RazaPerro(Integer codigo, String value){
        this.codigo = codigo;
        this.value = value;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
