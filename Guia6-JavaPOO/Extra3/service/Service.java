package Extra3.service;

import Extra3.raices.Raices;

public class Service {

    /**
     * devuelve el valor del discriminante (double). El
     * discriminante tiene la siguiente formula: (b^2)-4*a*c
     */
    public double getDiscriminante(Raices r){
        return ((Math.pow(r.getB(),2)) - (4 * r.getA() * r.getC()));
    }

    /**
     * devuelve un booleano indicando si tiene dos soluciones, para
     * que esto ocurra, el discriminante debe ser mayor o igual que 0.
     */
    public boolean tieneRaices(Raices r){
        return getDiscriminante(r) >= 0;
    }

    /**
     * devuelve un booleano indicando si tiene una única solución,
     * para que esto ocurra, el discriminante debe ser igual que 0.
     */
    public boolean tieneRaiz(Raices r){
        return getDiscriminante(r) == 0;
    }

    /**
     * llama a tieneRaíces() y si devolvió́ true, imprime las 2
     * posibles soluciones. -b±√((b^2)-(4*a*c)))/(2*a)
     */
    public void obtenerRaices(Raices r){
        if (tieneRaices(r)) {
            double raiz1 = ((-r.getB() + Math.sqrt(getDiscriminante(r))) / (2*r.getA()));
            double raiz2 = ((-r.getB() - Math.sqrt(getDiscriminante(r))) / (2*r.getA()));
            System.out.println("*Raiz 1: " + raiz1);
            System.out.println("*Raiz 2: " + raiz2);
        }
    }

    /**
     *llama a tieneRaiz() y si devolvió́ true imprime una única raíz.
     * Es en el caso en que se tenga una única solución posible. (-b/(2*a))
     */
    public void obtenerRaiz(Raices r){
        if (tieneRaiz(r)){
            int raiz = (-r.getB() / (2*r.getA()));
            System.out.println("*Raiz Unica: " + raiz);
        }
    }

    public void calcular(Raices r){
        if (tieneRaiz(r)){
            obtenerRaiz(r);
        } else if (tieneRaices(r)){
            obtenerRaices(r);
        } else System.out.println("No tiene solucion real");

    }
}
