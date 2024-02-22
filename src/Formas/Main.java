package Formas;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Utils
        Scanner sc = new Scanner(System.in);
        // Variables
        double uArea;
        char uIndice;
        String uColor;

        Circulo[] circulos;
        circulos = new Circulo[3];

        // Programa
        System.out.println("Inserte el radio del circulo rojo");
        uArea = sc.nextDouble();
        circulos[0] = new Circulo(uArea, "Rojo");

        System.out.println("Inserte el radio del circulo blanco");
        uArea = sc.nextDouble();
        circulos[1] = new Circulo(uArea);

        System.out.println("Inserte el radio del circulo amarillo");
        uArea = sc.nextDouble();
        circulos[2] = new Circulo(uArea, "Amarillo");

        do {
            System.out.println("Introduce un indice");
            uIndice = sc.next().toLowerCase().charAt(0);
            switch (uIndice) {
                case '$':
                    break;
                case '1':
                    for (Circulo valor : circulos) {
                        System.out.println(valor.toString());
                    }
                    break;
                case '2':
                    for (Circulo valor : circulos) {
                        System.out.println(valor.getArea());
                    }
                    break;
                case '3':
                    System.out.println("Introduce un color");
                    uColor = sc.next();
                    for (Circulo valor : circulos) {
                        if (valor.getColor().equalsIgnoreCase(uColor)) {
                            System.out.println(valor.getArea());
                        }
                    }
                    break;
                case '4':
                    break;
                default:
                    System.out.println("Indice introducido incorrecto");
            }
        } while (uIndice != '$');


    } // main end
} // class end
