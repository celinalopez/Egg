package EjemplosEgg.EjemploHotel.hoteles;

import EjemplosEgg.EjemploHotel.entidades.*;

import java.util.ArrayList;
import java.util.List;

public class Hoteles {
    public static void main(String[] args) {

        List<Hotel> hoteles = new ArrayList<>();

        Hotel1 h1 = new Hotel1(10, 1500d, 9d);
        Hotel2 h2 = new Hotel2(15, 2500d, 12d);
        Hotel3 h3 = new Hotel3(20, 3500d, 15d);
        Hotel4 h4 = new Hotel4(30, 5000d, 20d);
        Hotel5 h5 = new Hotel5(50, 10000d, 30d);

        hoteles.add(h1);
        hoteles.add(h2);
        hoteles.add(h3);
        hoteles.add(h4);
        hoteles.add(h5);

        for(Hotel aux : hoteles){
            if(aux instanceof Hotel5){
                Hotel5 object = (Hotel5) aux;
                System.out.println("Soy un hotel 5 estrellas");
                continue;
            }

            if (aux instanceof Hotel4){
                Hotel4 object = (Hotel4) aux;
                System.out.println("Soy un hotel 4 estrellas");
                continue;
            }

            if (aux instanceof Hotel3){
                Hotel3 object = (Hotel3) aux;
                System.out.println("Soy un hotel 3 estrellas");
                continue;
            }

            if (aux instanceof Hotel2){
                Hotel2 object = (Hotel2) aux;
                System.out.println("Soy un hotel 2 estrellas");
                continue;
            }

            if (aux instanceof Hotel1){
                Hotel1 object = (Hotel1) aux;
                System.out.println("Soy un hotel 1 estrellas");
            }
        }

    }

}
