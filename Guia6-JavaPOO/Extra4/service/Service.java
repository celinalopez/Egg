package Extra4.service;
import Extra4.nif.ClaseNIF;
import java.util.Scanner;

public class Service {
    Scanner leer = new Scanner(System.in);
    private final String[] vector = {"T", "R","W","A","G","M","Y","F","P","D","X","B","N","J","Z","S","Q","V","H","L","C" ,"K","L"};
    /**
     * le pide al usuario el DNI y con ese DNI calcula la letra que le
     * corresponderá. Una vez calculado, le asigna la letra que le corresponde según el
     * resultado del calculo.
     */
    public ClaseNIF crearNif(){
        System.out.println("Ingrese DNI: ");
        int dni = leer.nextInt();
        int resto = dni%23;
        return new ClaseNIF(dni,vector[resto]);
    }

    /**
     *  nos permita mostrar el NIF (ocho dígitos, un guion y la letra
     * en mayúscula
     */
    public void mostrarNif(ClaseNIF cn){
        System.out.println("NIF: "+ cn.getDni() +"-"+cn.getLetra());
    }
}
