package persistencia;

import entidades.Fabricante;
import entidades.Producto;
import servicios.FabricanteService;
import servicios.ProductoService;

import java.util.ArrayList;
import java.util.Collection;

public class ProductoDAO extends DAO{

    private final FabricanteService fabricanteService;

    public ProductoDAO() {
        this.fabricanteService = new FabricanteService();
    }

    public void insertarProducto(Producto producto) throws Exception {
        try {
            if (producto == null) {
                throw new Exception("Debe indicar el producto");
            }
            String sql = "INSERT INTO producto (nombre, precio, codigo_fabricante) "
                    + "VALUES ( '" + producto.getNombre() + "' , '" + producto.getPrecio() + "' ," + producto.getCodigoFabricante() + " );";

            System.out.println(sql);
            insertarModificarEliminar(sql);
        } catch (Exception e) {
            throw e;
        } finally {
            desconectarBase();
        }
    }
    public void modificarProducto(Producto producto) throws Exception {
        try {
            if (producto == null) {
                throw new Exception("Debe indicar el producto que desea modificar");
            }
            String sql = "UPDATE producto SET "
                    + " nombre = '" + producto.getNombre() + "' , precio = '" + producto.getPrecio() + "' , codigo_fabricante = " + producto.getCodigoFabricante()
                    + " WHERE id = '" + producto.getCodigo() + "'";
            insertarModificarEliminar(sql);
        } catch (Exception e) {
            throw e;
        } finally {
            desconectarBase();
        }
    }

    public void eliminarProducto(int codigo) throws Exception {
        try {
            String sql = "DELETE FROM producto WHERE codigo = " + codigo + "";
            insertarModificarEliminar(sql);
        } catch (Exception e) {
            throw e;
        } finally {
            desconectarBase();
        }
    }

    public Producto buscarProductoPorCod(int codigo) throws Exception {
        try {
            String sql = "SELECT * FROM producto WHERE codigo = " + codigo + "";
            consultarBase(sql);
            Producto producto = null;
            while (resultado.next()) {
                producto = new Producto();
                producto.setCodigo(resultado.getInt(1));
                producto.setNombre(resultado.getString(2));
                producto.setPrecio(resultado.getDouble(3));
                producto.setCodigoFabricante(resultado.getInt(4));
                /*Integer codFabricante = resultado.getInt(4);
                Fabricante fabricante = fabricanteService.buscarFabricantePorCod(codFabricante);
                producto.setFabricante(fabricante);*/
            }
            desconectarBase();
            return producto;
        } catch (Exception e) {
            desconectarBase();
            throw e;
        }
    }

    public Collection<Producto> listarProductos() throws Exception {
        try {
            String sql = "SELECT * FROM producto ";
            consultarBase(sql);
            Producto producto = null;
            Collection<Producto> productos = new ArrayList();
            while (resultado.next()) {
                producto = new Producto();
                producto.setCodigo(resultado.getInt(1));
                producto.setNombre(resultado.getString(2));
                producto.setPrecio(resultado.getDouble(3));
                producto.setCodigo(resultado.getInt(4));
                /*Integer codFabricante = resultado.getInt(4);
                Fabricante fabricante = fabricanteService.buscarFabricantePorCod(codFabricante);
                producto.setFabricante(fabricante);*/
                productos.add(producto);
            }
            desconectarBase();
            return productos;
        } catch (Exception e) {
            e.printStackTrace();
            desconectarBase();
            throw e;
        }
    }

    public Collection<Producto> buscarProductoPorTipo(String nombre) throws Exception {
        try {
            String sql = "SELECT * FROM producto WHERE nombre like '%" + nombre + "%'" + "";
            consultarBase(sql);
            Producto producto = null;
            Collection<Producto> productos = new ArrayList();
            while (resultado.next()) {
                producto = new Producto();
                producto.setCodigo(resultado.getInt(1));
                producto.setNombre(resultado.getString(2));
                producto.setPrecio(resultado.getDouble(3));
                producto.setCodigoFabricante(resultado.getInt(4));
                productos.add(producto);
            }
            desconectarBase();
            return productos;
        } catch (Exception e) {
            e.printStackTrace();
            desconectarBase();
            throw e;
        }
    }

    public Producto buscarMasBarato() throws Exception {
        try {
            String sql = "SELECT *, MIN(precio) as 'producto mas barato' FROM producto"+"";
            consultarBase(sql);
            Producto producto = null;
            while (resultado.next()) {
                producto = new Producto();
                producto.setCodigo(resultado.getInt(1));
                producto.setNombre(resultado.getString(2));
                producto.setPrecio(resultado.getDouble(3));
                producto.setCodigoFabricante(resultado.getInt(4));
                /*Integer codFabricante = resultado.getInt(4);
                Fabricante fabricante = fabricanteService.buscarFabricantePorCod(codFabricante);
                producto.setFabricante(fabricante);*/
            }
            desconectarBase();
            return producto;
        } catch (Exception e) {
            desconectarBase();
            throw e;
        }
    }

}
