package persistencia;

import entidades.Fabricante;
import java.sql.ResultSet;
import java.util.Scanner;


public class FabricanteDAO extends DAO {
    Scanner scan = new Scanner(System.in);
    ProductoDAO prod = new ProductoDAO();

    public void seleccionarFabricantes() throws Exception {
        try {
            String sql = "SELECT codigo, nombre FROM fabricante";
            ResultSet rs = select(sql);
            while (rs.next()) {
                System.out.println("Codigo: " + rs.getInt("codigo") + "\tNombre: " + rs.getString("nombre"));
            }
        } catch (Exception e) {
            // TODO: handle exception
            throw e;
        }
    }

    public void insertarFabricante(Fabricante fabricante) throws Exception {
        try {
            String sql = "INSERT INTO fabricante (nombre) VALUES ('" + fabricante.getNombre() + "')";
            insertarModificarEliminar(sql);
        } catch (Exception e) {
            // TODO: handle exception
            throw e;
        }
    }

}