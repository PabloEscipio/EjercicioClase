package banco;

import java.util.Scanner;

public class Practica7 {
    public static void main(String[] args) {
        // Utils
        Scanner sc = new Scanner(System.in);
        // Variables
        char uIndice;
        String uString;
        int uNum1;

        int vNum1;
        int vNum2;

        Titular Dueño;

        CuentaCorriente[] listCuentas = new CuentaCorriente[3];
        listCuentas[0] = new CuentaCorriente("Jose", "Alvarez", (short) (22), "123", 200);
        listCuentas[1] = new CuentaCorriente("Paco", "Fernandez", (short) (57), "567", 2500);
        listCuentas[2] = new CuentaCorriente("Miguel", "España", (short) (84), "932", 12000);


        // Programa
        do {
            vNum1 = 0;
            vNum2 = 0;
            System.out.println("Introduce un indice");
            uIndice = sc.next().toLowerCase().charAt(0);

            switch (uIndice) {
                case '$':
                    break;
                case '1':
                    for (CuentaCorriente valor : listCuentas) {
                        System.out.println("----------");
                        System.out.println(valor.toString());
                    }
                    break;
                case '2':
                    System.out.println("Introduce un numero de cuenta");
                    uString = sc.next();
                    for (CuentaCorriente valor : listCuentas) {
                        if (valor.getnCuenta().equalsIgnoreCase(uString)) {
                            System.out.println("----------");
                            System.out.println(valor.toString());
                        }
                    }
                    break;
                case '3':
                    for (CuentaCorriente valor : listCuentas) {
                        vNum1 += valor.getSaldo();
                    }
                    System.out.println(vNum1);
                    break;
                case '4':
                    System.out.println("Introduce un numero de cuenta");
                    uString = sc.next();
                    for (CuentaCorriente valor : listCuentas) {
                        if (uString.equalsIgnoreCase(valor.getnCuenta())) {
                            Dueño = new Titular("Pablo", "Pena", (short) (22));
                            valor.setDueño(Dueño);
                        }
                    }
                    break;
                case '5':
                    System.out.println("Cantidad a ingresar?");
                    uNum1 = sc.nextInt();
                    System.out.println("Nombre de la persona?");
                    uString = sc.next();
                    for (CuentaCorriente valor : listCuentas) {
                        if (valor.getDueño().getNombre().equalsIgnoreCase(uString)) {
                            System.out.println(valor.toString());
                            valor.ingresar(uNum1);
                            System.out.println(valor.toString());
                        }
                    }
                    break;
                case '6':
                    System.out.println("Cantidad a retirar?");
                    uNum1 = sc.nextInt();
                    System.out.println("Numero de cuenta?");
                    uString = sc.next();
                    for (CuentaCorriente valor : listCuentas) {
                        if (valor.getnCuenta().equalsIgnoreCase(uString)) {
                            System.out.println(valor.toString());
                            valor.retirar(uNum1);
                            System.out.println(valor.toString());
                        }
                    }
                    break;
                case '7':
                    for (CuentaCorriente valor : listCuentas) {
                        vNum2++;
                        vNum1 += valor.getDueño().getEdad();
                    }
                    System.out.println("La media de edad es: " + (vNum1 / vNum2));
                    break;
                case '8':
                    double vDouble1 = 0;
                    String vString = "";

                    for (CuentaCorriente valor : listCuentas) {
                        if (valor.getSaldo() > vDouble1) {
                            vDouble1 = valor.getSaldo();
                            vString = valor.getDueño().getNombre() + " " + valor.getDueño().getApellidos();
                        }
                    }
                    System.out.println(vString);
                    break;
                case '9':
                    for (CuentaCorriente valor : listCuentas) {
                        if (valor.getSaldo() < 0) {
                            System.out.println(valor.toString());
                        }
                    }
                    break;
                default:
                    System.out.println("Indice introducido erroneo");
            }
        } while (uIndice != '$');
    } // main end
} // class end
