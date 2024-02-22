package cuentaBancaria;

public class Cuenta {
    // Atributos
    private String titular;
    private double saldo;

    // Constructor
    public Cuenta(String titular, double saldo) {
        this.titular = titular;
        this.saldo = saldo;
    }

    public Cuenta(String titular) {
        this.titular = titular;
        this.saldo = 0;
    }

    // Getters & Setters
    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    // metodos
    public double ingresar(double cantidad) {
        this.saldo += cantidad;
        return this.saldo;
    }

    public double retirar(double cantidad) {
        this.saldo -= cantidad;
        return this.saldo;
    }

    public String toString() {
        return "Titular: " + this.titular + "\nSaldo: " + this.saldo;
    }
} // class end
