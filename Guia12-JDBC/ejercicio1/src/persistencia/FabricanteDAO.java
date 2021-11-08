package persistencia;

import entidades.Fabricante;
import servicios.FabricanteService;

import java.util.ArrayList;
import java.util.Collection;

public class FabricanteDAO extends DAO {

    private final FabricanteService fabricanteService;

    public FabricanteDAO() {
        this.fabricanteService = new FabricanteService();
    }

    //G
    public void insertarFabricante(Fabricante fabricante) throws Exception{
        try{
            if (fabricante == null){
                throw new Exception("Debe indicar el fabricante");
            }
            String sql = "INSERT INTO fabricante (nombre, codigo) "
                    + "VALUES ( '" + fabricante.getNombre() + "' , '" + fabricante.getCodigo()+ " );";

            System.out.println(sql);
            insertarModificarEliminar(sql);

        } catch (Exception e) {
            throw e;
        } finally {
            desconectarBase();
        }
    }

    public void modificarFabricante(Fabricante fabricante) throws Exception {
        try {
            if (fabricante == null) {
                throw new Exception("Debe indicar el fabricante que desea modificar");
            }

            String sql = "UPDATE fabricante SET "
                    + "codigo = '" + fabricante.getCodigo() + "' WHERE nombre = '" + fabricante.getNombre() + "'";

            insertarModificarEliminar(sql);
        } catch (Exception e) {
            throw e;
        } finally {
            desconectarBase();
        }
    }

    public void eliminarFabricante(String nombre) throws Exception {
        try {

            String sql = "DELETE FROM fabricante WHERE nombre = '" + nombre + "'";

            insertarModificarEliminar(sql);
        } catch (Exception e) {
            throw e;
        } finally {
            desconectarBase();
        }
    }

    public Fabricante buscarFabricantePorNombre(String nombre) throws Exception {
        try {

            String sql = "SELECT * FROM fabricante "
                    + " WHERE nombre = '" + nombre + "'";

            consultarBase(sql);

            Fabricante fabricante = null;
            while (resultado.next()) {
                fabricante = new Fabricante();
                fabricante.setCodigo(resultado.getInt(1));
                fabricante.setNombre(resultado.getString(2));
            }
            desconectarBase();
            return fabricante;
        } catch (Exception e) {
            desconectarBase();
            throw e;
        }
    }

    public Fabricante buscarFabricantePorCod(Integer codigo) throws Exception {
        try {

            String sql = "SELECT * FROM fabricante "
                    + " WHERE codigo = '" + codigo + "'";

            consultarBase(sql);

            Fabricante fabricante = null;
            while (resultado.next()) {
                fabricante = new Fabricante();
                fabricante.setCodigo(resultado.getInt(1));
                fabricante.setNombre(resultado.getString(2));
            }
            desconectarBase();
            return fabricante;
        } catch (Exception e) {
            desconectarBase();
            throw e;
        }
    }

    public Collection<Fabricante> listarFabricantes() throws Exception {
        try {
            String sql = "SELECT codigo, nombre FROM fabricante ";

            consultarBase(sql);

          Fabricante fabricante = null;
            Collection<Fabricante> fabricantes = new ArrayList();
            while (resultado.next()) {
                fabricante = new Fabricante();
                fabricante.setCodigo(resultado.getInt(1));
                fabricante.setNombre(resultado.getString(2));
                fabricantes.add(fabricante);
            }
            desconectarBase();
            return fabricantes;
        } catch (Exception e) {
            e.printStackTrace();
            desconectarBase();
            throw new Exception("Error de sistema");
        }
    }
}
