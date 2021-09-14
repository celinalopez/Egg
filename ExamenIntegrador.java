class ExamenIntegrador {

    /*public static Boolean parCieloPiso(int numEnt, double numReal, long numLargo) {
        int aux = (int) numReal;
        return (numEnt % 2 == 0) && (numReal - aux) < 0.5 && (numLargo >= 0);
    }

    public static void main(String[] args) {
        System.out.println(parCieloPiso(2, 2.9, 6));

    }*/
    /*public static String geringoso(String palabra) {

    return palabra.replaceAll("a", "apa").replaceAll("e","epe").replaceAll("i","ipi").replaceAll("o","opo").replaceAll("u","upu");

    }
    public static void main(String[] args) {
        System.out.println(geringoso("ane"));
    }*/
    public static String inversa(String palabra) {
        String aux= "";
        for(int i=palabra.length()-1; i>=0;i--){
            aux += palabra.charAt(i);
        }
        return aux;
    }

    public static void main(String[] args) {
        System.out.println(inversa("hola"));
    }

}