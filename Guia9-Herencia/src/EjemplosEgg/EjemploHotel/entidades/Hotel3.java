package EjemplosEgg.EjemploHotel.entidades;

public class Hotel3 extends Hotel2 {

    protected boolean aireAcondicionado = true;
    protected boolean bar = true;

    public Hotel3(Integer cantidadHabitaciones, Double precio, Double superficie) {
        super(cantidadHabitaciones, precio, superficie);
    }
}
