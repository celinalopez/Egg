package EjemplosEgg.EjemploHotel.entidades;

public final class Hotel5 extends Hotel4 {

    protected boolean casino = true;
    protected boolean restaurant = true;


    public Hotel5(Integer cantidadHabitaciones, Double precio, Double superficie) {
        super(cantidadHabitaciones, precio, superficie);
    }
}
