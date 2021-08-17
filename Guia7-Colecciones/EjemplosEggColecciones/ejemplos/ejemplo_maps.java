package EjemplosEggColecciones.ejemplos;

import java.util.HashMap;
import java.util.Map;

public class ejemplo_maps {
    public static void main(String[] args) {

        HashMap<Integer, String> nombres = new HashMap<>();

        nombres.put(1, "Chiquito");
        nombres.put(2, "Lola");
        nombres.put(3, "Pepe");

        for (Map.Entry<Integer,String> aux : nombres.entrySet()){
            Integer key = aux.getKey();
            String value = aux.getValue();

            System.out.println("key: " + key + " value: " + value);
        }
    }
}
