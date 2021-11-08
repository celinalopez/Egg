package servicios;

import entidades.Producto;
import persistencia.ProductoDAO;

import java.util.Collection;

public class ProductoService {

    private final ProductoDAO dao;

    public ProductoService() {
        this.dao = new ProductoDAO();
    }

    // A
    public void listarNombre() throws Exception {

        try {

            //Listamos los productos
            Collection<Producto> productos = listarProductos();

            //Imprimimos los productos
            if (productos.isEmpty()) {
                throw new Exception("No existen productos para imprimir");
            } else {
                for (Producto u : productos) {
                    System.out.println(u.getNombre());
                }
            }
        } catch (Exception e) {
            throw e;
        }

    }

    //B
    public void listarNombrePrecio() throws Exception {

        try {

            //Listamos los productos
            Collection<Producto> productos = listarProductos();

            //Imprimimos los productos
            if (productos.isEmpty()) {
                throw new Exception("No existen productos para imprimir");
            } else {
                for (Producto u : productos) {
                    System.out.println("nombre: " + u.getNombre() + " precio: " + u.getPrecio());
                }
            }
        } catch (Exception e) {
            throw e;
        }
    }

    //C
    public void listarPrecio() throws Exception {

        try {

            //Listamos los productos
            Collection<Producto> productos = listarProductos();

            //Imprimimos los productos
            if (productos.isEmpty()) {
                throw new Exception("No existen productos para imprimir");
            } else {
                for (Producto u : productos) {
                    if (u.getPrecio() >= 120 && u.getPrecio() <= 202)
                        System.out.println("nombre: " + u.getNombre() + " precio: " + u.getPrecio());
                }
            }
        } catch (Exception e) {
            throw e;
        }

    }

    //D
    public void listarPortatiles() throws Exception {
        try {
            //Listamos los productos
            Collection<Producto> productos = dao.buscarProductoPorTipo("Portátil");

            //Imprimimos los productos
            if (productos.isEmpty()) {
                throw new Exception("No existen productos para imprimir");
            } else {
                for (Producto u : productos) {
                    System.out.println(u.toString());
                }
            }
        } catch (Exception e) {
            throw e;
        }
    }

    //E
    public void mostrarMasBarato() throws Exception{
        try {
            //Listamos los productos
            Producto producto = dao.buscarMasBarato();

            //Imprimimos los productos
            if (producto == null) {
                throw new Exception("No existen productos para imprimir");
            } else {
                System.out.println("nombre: " + producto.getNombre() + " precio: " + producto.getPrecio());
            }
        } catch (Exception e) {
            throw e;
        }
    }

    //F
    public void crearProducto(String nombre, Double precio, int cod_fabricante) throws Exception {

        try {
            //Validamos
            if (nombre == null || nombre.trim().isEmpty()) {
                throw new Exception("Debe indicar el nombre");
            }

            if (precio == null) {
                throw new Exception("Debe indicar el precio");
            }

            //Creamos el producto
            Producto producto = new Producto();
            producto.setNombre(nombre);
            producto.setPrecio(precio);
            producto.setCodigoFabricante(cod_fabricante);

            dao.insertarProducto(producto);

        } catch (Exception e) {
            throw e;
        }
    }

    //H
    public void modificarCodigoProducto(int codigo, String nombre, Double precio, int cod_fabricante) throws Exception {

        try {

            //Validamos
            if (codigo > 0) {
                throw new Exception("Debe indicar el codigo");
            }

            if (nombre == null || nombre.trim().isEmpty()) {
                throw new Exception("Debe indicar el nombre");
            }

            if (precio == null) {
                throw new Exception("Debe indicar la precio");
            }

            if (cod_fabricante < 0) {
                throw new Exception("Debe indicar el codigo de fabricante");
            }

            //Buscamos
            Producto producto = buscarProductoPorCodigo(codigo);

            dao.modificarProducto(producto);
        } catch (Exception e) {
            throw e;
        }
    }

    public void eliminarProducto(int codigo) throws Exception {

        try {

            //Validamos
            if (codigo < 0) {
                throw new Exception("Debe indicar el codigo");
            }
            dao.eliminarProducto(codigo);
        } catch (Exception e) {
            throw e;
        }
    }

    public Producto buscarProductoPorCodigo(int codigo) throws Exception {

        try {

            //Validamos
            if (codigo < 0) {
                throw new Exception("Debe indicar el codigo");
            }
            Producto producto = dao.buscarProductoPorCod(codigo);
            //Verificamos
            if (producto == null) {
                throw new Exception("No se encontró producto para el codigo indicado");
            }

            return producto;
        } catch (Exception e) {
            throw e;
        }
    }

    public Collection<Producto> listarProductos() throws Exception {

        try {

            Collection<Producto> productos = dao.listarProductos();

            return productos;
        } catch (Exception e) {
            throw e;
        }
    }

    public void imprimirProductos() throws Exception {

        try {

            //Listamos los productos
            Collection<Producto> productos = listarProductos();

            //Imprimimos los productos
            if (productos.isEmpty()) {
                throw new Exception("No existen productos para imprimir");
            } else {
                for (Producto u : productos) {
                    System.out.println(u.toString());
                }
            }
        } catch (Exception e) {
            throw e;
        }

    }
}
