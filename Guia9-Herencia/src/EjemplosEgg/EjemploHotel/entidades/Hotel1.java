package EjemplosEgg.EjemploHotel.entidades;

public class Hotel1 extends Hotel{

    protected Double precio;
    protected Double superficie;
    protected boolean baño = true;
    protected boolean ascensor = true;
    protected boolean calefaccion = true;

    public Hotel1(Integer cantidadHabitaciones, Double precio, Double superficie) {
        super(cantidadHabitaciones);
        this.precio = precio;
        this.superficie = superficie;
    }
}
