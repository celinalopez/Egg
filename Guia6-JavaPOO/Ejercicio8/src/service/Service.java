package service;
import objetos.Cadena;

public class Service {

    public int mostrarVocales(Cadena c){
        String frase = c.getFrase();
        int cont=0;
        for (int i=0; i<frase.length(); i++){
            if (frase.substring(i).equals("a") || frase.substring(i).equals("e") || frase.substring(i).equals("i") ||
                    frase.substring(i).equals("o") || frase.substring(i).equals("u")){
                cont += 1;
            }
        }
        return cont;
    }
}
