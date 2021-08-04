package service;
import objetos.Cadena;

public class Service {

    public int mostrarVocales(Cadena c){
        String frase = c.getFrase();
        int cont=0;
        for (int i=0; i<frase.length(); i++){
            if ((frase.charAt(i)=='a') || (frase.charAt(i)=='e') || (frase.charAt(i)=='i') ||
                    (frase.charAt(i)=='o') || (frase.charAt(i)=='u')){
                cont += 1;
            }
        }
        return cont;
    }
    public String invertirFrase(Cadena c){
        String frase = c.getFrase();
        String cadenaInv = "";
        for (int  i =frase.length()-1; i>=0; i--){
            cadenaInv += frase.charAt(i);
        }
        return cadenaInv;
    }
    public void vecesRepetido(String letra, Cadena c){
        String frase = c.getFrase();
        int cont = 0;
        for(int i=0; i<frase.length(); i++){
            if (frase.substring(i,i+1).equals(letra)){
                cont += 1;
            }
        }
        System.out.println("El caracter "+letra+" se repite "+ cont+" veces.");
    }
    public void compararLongitud(String frase, Cadena c){
        int frase1 = c.getLongitud();
        if (frase1 == frase.length()){
            System.out.println("Tienen la misma longitud");
        } else System.out.println("No tienen la misma longitud");
    }
    public String unirFrases(String frase, Cadena c){
        String frase1 = c.getFrase();
        return frase1.concat(frase);
    }
    public String reemplazar(String letra, Cadena c){
        String frase = c.getFrase();
        return frase.replaceAll("a",letra);
    }
    public boolean contiene(String letra, Cadena c){
        String frase = c.getFrase();
        return frase.contains(letra);
    }
}
