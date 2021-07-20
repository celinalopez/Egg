import java.util.Scanner;

/*
Realizar una clase llamada Cuenta (bancaria) que debe tener como mínimo los
atributos: numeroCuenta (entero), el DNI del cliente (entero largo), el saldo actual. Las
operaciones asociadas a dicha clase son:
• Constructor por defecto y constructor con DNI, saldo, número de cuenta e interés.
• Agregar los métodos getters y setters correspondientes
• Metodo para crear un objeto Cuenta, pidiéndole los datos al usuario.
• Método ingresar(double ingreso): el método recibe una cantidad de dinero a
ingresar y se la sumara a saldo actual.
• Método retirar(double retiro): el método recibe una cantidad de dinero a retirar y
se la restará al saldo actual. Si la cuenta no tiene la cantidad de dinero a retirar, se
pondrá el saldo actual en 0.
• Método extraccionRapida(): le permitirá sacar solo un 20% de su saldo. Validar
que el usuario no saque más del 20%.
• Método consultarSaldo(): permitirá consultar el saldo disponible en la cuenta.
• Método consultarDatos(): permitirá mostrar todos los datos de la cuenta
 */
public class Cuenta {
    private Scanner leer = new Scanner(System.in).useDelimiter("\n");
    private int numeroCuenta;
    private int dni;
    private double saldoActual;
    private double interes;

    public Cuenta() {
    }

    public Cuenta(int numeroCuenta, int dni, double saldoActual, double interes) {
        this.numeroCuenta = numeroCuenta;
        this.dni = dni;
        this.saldoActual = saldoActual;
        this.interes = interes;

    }


    public void setNumeroCuenta(int numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public void setSaldoActual(double saldoActual) {
        this.saldoActual = saldoActual;
    }

    public void setInteres(double interes) {
        this.interes = interes;
    }


    public int getNumeroCuenta() {
        return numeroCuenta;
    }

    public int getDni() {
        return dni;
    }

    public double getSaldoActual() {
        return saldoActual;
    }

    public double getInteres() {
        return interes;
    }

    public void crearCuenta(){
        System.out.println("Ingrese el numero de cuenta: ");
        numeroCuenta = leer.nextInt();
        System.out.println("Ingrese su DNI: ");
        dni = leer.nextInt();

    }
    public void ingresar(){
        System.out.println("Cantidad que desea ingresar: ");
        saldoActual += leer.nextDouble();
    }
    public void retirar(){
        System.out.println("Cantidad que desea retirar: ");
        double n = leer.nextDouble();
        if (saldoActual < n){
            saldoActual=0;
        } else saldoActual -= n;
    }
    public void extraccionRapida(){
        System.out.println("Cantidad maxima que puede retirar: "+(saldoActual*0.2));
        double n = leer.nextDouble();
        if ((saldoActual*0.2) >= n){
            saldoActual -= n;
        }else{
            System.out.println("Error. Quiere retirar más del 20% del saldo actual");
        }
    }
    public void consultarSaldo(){
        System.out.println(saldoActual +" pesos");
    }


    public void consultarDatos(){
        System.out.println("Numero de Cuenta: " + numeroCuenta +
                "\nDNI: " + dni + "\nSaldo Actual: " + saldoActual + " pesos");
    }

    public static void main(String[] args) {
        Cuenta cuenta = new Cuenta();

        cuenta.crearCuenta();
        cuenta.consultarDatos();
        cuenta.ingresar();
        cuenta.retirar();
        cuenta.consultarSaldo();
        cuenta.extraccionRapida();
        cuenta.consultarDatos();

    }
}
