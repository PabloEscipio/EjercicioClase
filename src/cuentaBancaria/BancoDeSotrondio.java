package cuentaBancaria;

public class BancoDeSotrondio {
    public static void main(String[] args) {
        Cuenta c1;
        c1 = new Cuenta("Diego Ruiz");
        System.out.println(c1.toString());
        System.out.println("Ingreso 1000€ y ahora tengo: " + c1.ingresar(1000));
        System.out.println("Tengo un cargo de 375 y ahora tengo: " + c1.retirar(375));
        System.out.println(c1.toString());
    } // main end
} // class end
