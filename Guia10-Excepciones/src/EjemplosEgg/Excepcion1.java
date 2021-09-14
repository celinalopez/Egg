package EjemplosEgg;

public class Excepcion1 {
    public static void main(String[] args) {

//        int valor1 = Integer.valueOf("A");

        /*int valor2= 5;
        System.out.println("El entero se inicializo en "+5);

        try {
            valor2 = Integer.valueOf("a");
            System.out.println("El numero indicado es "+ valor2);

        }catch (NumberFormatException e){
            System.out.println("El valor indicado no es un entero");
        }*/

        //Captura todas las excepciones

//        try{
//            int valor3 = Integer.valueOf("q");
//            System.out.println("El numero indicado es "+valor3);
//
//        }catch (Exception e){
//            System.out.println("El valor indicado no es un numero");
//        }

        try{
            int valor4 = Integer.valueOf("a");
            System.out.println("El numero indicado es " +valor4);

        }catch (NumberFormatException e){
            System.out.println("El valor indicado no es un numero");

        }catch (Exception e){
            System.out.println("El valor indicado no es un numeri");

        }finally {
            int valor5 = 7;
            System.out.println("El valor indicado es "+valor5);
        }
    }
}
