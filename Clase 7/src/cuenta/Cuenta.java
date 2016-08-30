package cuenta;

public class Cuenta {

    private int numero;

    private double salario;
    private int clave;
    private Propietario Proper;

    public Cuenta(int numero, Propietario Proper, double salario, int clave) {
        this.numero = numero;
        this.salario = salario;
        this.clave = clave;
        this.Proper = Proper;
    }

    
    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public int getClave() {
        return clave;
    }

    public void setClave(int clave) {
        this.clave = clave;
    }

    public Propietario getProper() {
        return Proper;
    }

    public void setProper(Propietario Proper) {
        this.Proper = Proper;
    }

    public void consignar(double valor) {
        this.salario += valor;
    }

    public void retirar(double valor) {
        this.salario -= valor;
    }

    public double consultarSalario() {
        return this.salario;
    }

    public void cambiarClave(int nuevaClave) {
        this.clave = nuevaClave;
    }

}
