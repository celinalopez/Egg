package EjemplosEgg.ClasesAbstractas.edificio;

import EjemplosEgg.ClasesAbstractas.entidades.CasaCampo;
import EjemplosEgg.ClasesAbstractas.entidades.Edificio;

public class Main {
    public static void main(String[] args) {

        CasaCampo e1 = new CasaCampo(true, 1000d);
        e1.CalcularSuperficie(10, 30);
        System.out.println(e1.getSuperficieCubierta());

        Edificio e2 = new Edificio(4, 300d);
        e2.CalcularSuperficie(10, 30);
        System.out.println(e2.getSuperficieCubierta());
    }
}
