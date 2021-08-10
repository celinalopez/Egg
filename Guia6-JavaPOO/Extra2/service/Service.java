package Extra2.service;
import Extra2.puntos.Puntos;
import java.util.Scanner;

public class Service {
    Scanner leer = new Scanner(System.in);

    public Puntos crearPuntos(){
        System.out.println("Ingrese coordenadas del primer punto (x1,y1): ");
        int x1 = leer.nextInt();
        int y1 = leer.nextInt();
        System.out.println("Ingrese coordenadas del segundo punto (x2,y2): ");
        int x2 = leer.nextInt();
        int y2 = leer.nextInt();

        return new Puntos(x1,y1,x2,y2);
    }
    public double calcularDistancia(Puntos p){
        return (Math.sqrt(Math.pow((p.getX2()-p.getX1()),2) + Math.pow((p.getY2()-p.getY1()), 2)));
    }
}
