package cuenta;
import java.util.Scanner;
public class EJECUCION {

    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
        Propietario Magdalena = new Propietario("Magdalena", "Sanchez", "Bogota", "3212135454");
        Propietario Joselito = new Propietario("joselito", "Perez", "BOgota", "5675486");
        Cuenta magdalena = new Cuenta(1012, Magdalena, 0, 1234);
        Cuenta joselito = new Cuenta(1013, Joselito, 500000, 9876);

        magdalena.consignar(100000);
        int c;
        System.out.println("su nuevo salario es");
        joselito.consultarSalario();

        System.out.println("ingrese la nueva clave");
        c = input.nextInt();
        joselito.cambiarClave(c);
    }
}
