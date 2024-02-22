package banco;

public class CuentaCorriente {
    // Atributos
    private Titular dueño;
    private String nCuenta;
    private double saldo;

    // Constructor
    public CuentaCorriente(Titular pTitular, String pNCuenta, double pSaldo) {
        this.dueño = pTitular;
        this.nCuenta = pNCuenta;
        this.saldo = pSaldo;
    }

    public CuentaCorriente(Titular pTitular, String pNCuenta) {
        this.dueño = pTitular;
        this.nCuenta = pNCuenta;
        this.saldo = 0;
    }

    public CuentaCorriente(String pNombre, String pApellidos, short pEdad, String pNCuenta, double pSaldo) {
        this.dueño = new Titular(pNombre, pApellidos, pEdad);
        this.nCuenta = pNCuenta;
        this.saldo = pSaldo;
    }

    // Getters & Setters
    public Titular getDueño() {
        return dueño;
    }

    public void setDueño(Titular dueño) {
        this.dueño = dueño;
    }

    public String getnCuenta() {
        return nCuenta;
    }

    public void setnCuenta(String nCuenta) {
        this.nCuenta = nCuenta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    // toString
    public String toString() {
        return dueño.toString() + "\nnCuenta: " + this.nCuenta + "\nSaldo: " + this.saldo;
    }

    // Metodos
    public void ingresar(int cantidad) {
        this.saldo += cantidad;
    }

    public void retirar(int cantidad) {
        this.saldo -= cantidad;
    }

} // class end
