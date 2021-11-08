import servicios.FabricanteService;
import servicios.ProductoService;

public class Main {

    public static void main(String[] args) {

        ProductoService ps = new ProductoService();
        FabricanteService fs = new FabricanteService();

    //A: listar todos los productos
        try{
            ps.crearProducto("HP lite", 200000.0, 2);
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Error del sistema por \n" + e.getMessage());
        }
    }
}
