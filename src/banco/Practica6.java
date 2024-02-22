package banco;

public class Practica6 {
    public static void main(String[] args) {
        Titular titular1;
        titular1 = new Titular("Pablo", "Pena Miguel", (short) (22));
        CuentaCorriente ctaTitular1;
        ctaTitular1 = new CuentaCorriente(titular1, "123");
        ctaTitular1.ingresar(500);
        ctaTitular1.retirar(100);
        System.out.println(ctaTitular1.toString());
    } // main end
} // class end
