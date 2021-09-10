package Ejercicio3.service;

import Ejercicio3.carta.Carta;
import Ejercicio3.enumeraciones.Palo;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Service {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    ArrayList<Carta> montonCartas = new ArrayList<>();

    public ArrayList<Carta> crearMazo(){
        ArrayList<Carta> mazo = new ArrayList<>();
        for(Palo p : Palo.values()){
            for(int i=0; i<12; i++){
                if(i==7 || i==8){
                    continue;
                }
                Carta nuevaCarta = new Carta(i+1, p);
                mazo.add(nuevaCarta);
            }
        }
        return mazo;
    }

    public void barajar(ArrayList<Carta> mazo){
        Collections.shuffle(mazo);
    }

/*    public void siguienteCarta (ArrayList<Carta> mazo){
        String value;
        int i=0;
        if (mazo.isEmpty()){
            System.out.println("Ya no hay mas cartas");
        }else{
            do{
                //Hay un error al llegar a 20
                for(int i= 40-mazo.size(); i<40;i++){

                }
                System.out.println(mazo.get(i));
                montonCartas.add(mazo.get(i));
                mazo.remove(i);
                i+=1;
                System.out.println(mazo.size());
                System.out.println("Mostrar siguiente carta? si/no\n");
                value = leer.next();
            }while (value.equalsIgnoreCase("si"));
        }
    }*/
public void siguienteCarta (ArrayList<Carta> mazo){
    String value;
    if (mazo.isEmpty()){
        System.out.println("El mazo está vacio");
    }else{
        //Hay un error al llegar a 20
        for(int i= 40-mazo.size(); i<40;i++){
            System.out.println("Mostrar siguiente carta? si/no\n");
            value = leer.next();
            if (value.equalsIgnoreCase("si")){
                montonCartas.add(mazo.get(i));
                mazo.remove(i);
                System.out.println(mazo.size());
            }else{
                break;
            }
        }
    }
}

    public void cartasDisponibles(ArrayList<Carta> mazo){
        System.out.println("Cantidad de cartas disponibles: " + mazo.size());
    }

    public void darCartas(ArrayList<Carta> mazo){
        ArrayList<Carta> cartasDadas = new ArrayList<>();
        System.out.println("Cantidad de cartas a dar: ");
        int n = leer.nextInt();
        if(mazo.size() < n){
            System.out.println("No hay cartas suficientes");
        }else{
            for(int i=0; i<n;i++){
                cartasDadas.add(mazo.get(i));
                mazo.remove(i);
            }
        }
        System.out.println(cartasDadas);
    }

    public void cartasMonton(){
        System.out.println("CARTAS DEL MONTON:\n"+montonCartas);
    }

    public void mostrarBaraja(ArrayList<Carta> mazo){
        System.out.println("BARAJA:\n"+mazo);
    }
}
