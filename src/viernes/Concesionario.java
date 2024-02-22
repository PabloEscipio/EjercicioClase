package viernes;

import java.util.ArrayList;
import java.util.Scanner;

public class Concesionario {
    public static void main(String[] args) {
        // Utils
        Scanner sc = new Scanner(System.in);
        // Variables
        char uIndice;
        int uNum1;
        String uMarca;
        String uModelo;

        boolean vBolean1 = false;

        // Arrays
        ArrayList<Modelo> listModelos = new ArrayList<>();
        listModelos.add(new Modelo("AUDI", "A8"));
        listModelos.add(new Modelo("SEAT", "PANDA"));
        listModelos.add(new Modelo("RENAULT"));
        listModelos.add(new Modelo("FORD", "FOCUS"));

        ArrayList<Coche> taller = new ArrayList<>();
        taller.add(new Coche(220, listModelos.get(0)));
        taller.add(new Coche(100, listModelos.get(3)));
        taller.get(1).setPrecio(1000);
        taller.get(1).getEngine().setlAceite(10);
        // Programa
        do {
            System.out.println("*****" + "\nIntroduce un indice" + "\n*****");
            uIndice = sc.next().toLowerCase().charAt(0);
            switch (uIndice) {
                case '1':
                    for (Coche valor : taller) {
                        System.out.println(valor.toString());
                        System.out.println("-----");

                    }
                    break;
                case '2':
                    for (Modelo valor : listModelos) {
                        System.out.println(valor.toString());
                        System.out.println("-----");
                    }
                    break;
                case '3':
                    for (Modelo valor : listModelos) {
                        System.out.println("Indice: " + listModelos.indexOf(valor) + "\n" + valor.toString());
                        System.out.println("-----");
                    }
                    System.out.println("Introduce el indice del modelo que quieras");
                    uNum1 = sc.nextInt();

                    taller.add(new Coche(100, listModelos.get(uNum1)));
                    taller.get(uNum1).getEngine().setlAceite(15);
                    break;
                case '4':
                    System.out.println("Introduce la marca:");
                    uMarca = sc.next();
                    System.out.println("Introduce el modelo");
                    uModelo = sc.next();

                    if (!listModelos.contains(new Modelo(uMarca, uModelo))) {
                        listModelos.add(new Modelo(uMarca, uModelo));
                    } else {
                        System.out.println("Ya existe");
                    }
                    break;
                case '5':
                    break;
                case '6':
                    break;
                case '7':
                    break;
                case '8':
                    break;
                case '9':
                    break;
                default:
                    System.out.println("INDICE INCORRECTO");
            } // switch end
        } while (uIndice != '$');
    }
}
