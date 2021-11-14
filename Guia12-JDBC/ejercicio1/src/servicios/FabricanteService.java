package servicios;
import entidades.Fabricante;
import persistencia.FabricanteDAO;

import java.util.Scanner;


public class FabricanteService {
    Scanner scan = new Scanner(System.in);
    FabricanteDAO fab = new FabricanteDAO();

    public void insertarFabricante() {
        System.out.println("Ingrese el nombre del fabricante");
        String nombre = scan.nextLine();
        Fabricante fabricante = new Fabricante();
        fabricante.setNombre(nombre);
        try {
            fab.insertarFabricante(fabricante);
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println(e.getMessage());
        }
    }

}