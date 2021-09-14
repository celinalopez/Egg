package EjemplosEgg.EjemploHotel.entidades;

public class Hotel2 extends Hotel1 {
    protected boolean cajaSeguridad = true;

    public Hotel2(Integer cantidadHabitaciones, Double precio, Double superficie) {
        super(cantidadHabitaciones, precio, superficie);
    }
}
