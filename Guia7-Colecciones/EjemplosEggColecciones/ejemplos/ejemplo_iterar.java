package EjemplosEggColecciones.ejemplos;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ejemplo_iterar {
    public static void main(String[] args) {
        List<String> nombres = new ArrayList();
        nombres.add("Lola");
        nombres.add("Hodman");
        nombres.add("Chiquito");

//       MOSTRAR
        //#1
        for (String aux : nombres){
            System.out.println(aux);
        }
        //#2
        for (int i = 0; i < nombres.size(); i++) {
            System.out.println(nombres.get(i));
        }
        //#3
        nombres.forEach((e)-> System.out.println(e));

//        ELIMINAR
//      No se puede eliminar con el foreach original ya que recorre a 3 y ya no hay 3
//        for (String aux : nombres){
//            if (aux.equals("Lola")){
//                nombres.remove(aux);
//            }
//        }
        //#1
        for (int i = 0; i < nombres.size(); i++) {
            String m = nombres.get(i);
            if (m.equals("Lola")){
                nombres.remove(m);
            }
        }
        //#2
        nombres.removeIf(aux -> aux.equals("Lola"));

//        MOSTRAR CON ITERATOR
        Iterator<String> it = nombres.iterator();

        while (it.hasNext()){  //Si tiene el siguiente entra al bucle
            String aux = it.next();
            System.out.println(aux);
        }
//        ELIMINAR CON ITERATOR

        while (it.hasNext()){
            String aux = it.next();
            if (aux.equals("Lola")){
                it.remove();
            }
        }

    }
}
