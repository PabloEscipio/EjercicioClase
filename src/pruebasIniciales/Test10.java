package pruebasIniciales;

import java.util.Scanner;

public class Test10 {
    public static void main(String[] args) {
        // Variables
        Scanner sc = new Scanner(System.in);

        float uRadio;
        String uInidice;

        double vResultado = 0.0;


        // Programa
        do {
            System.out.println("Introduzca el area del circulo:");
            uRadio = sc.nextFloat();
            System.out.println(
                    "A - Calcula el area del circulo\n" +
                            "L - Perimetro del circulo\n" +
                            "V - Volumen del circulo\n" +
                            "F - Fin del programa"
            );
            uInidice = sc.next();

            if (!uInidice.equalsIgnoreCase("F")) {
                switch (uInidice) {
                    case "A":
                        vResultado = Math.PI * Math.pow(uRadio, 2);
                        break;
                    case "L":
                        vResultado = 2 * Math.PI * uRadio;
                        break;
                    case "V":
                        vResultado = (4 / 3) * Math.PI * Math.pow(uRadio, 3);
                        break;
                    default:
                        System.out.println("ERROR: Introduzca una operacion correcta");
                } // switch end
                System.out.println(vResultado);
            } // if end
        } while (!uInidice.equalsIgnoreCase("f"));

        System.out.println("Cerrando...");

        sc.close();
    } // main end
} // class end

/*
Hacer un programa que pida el radio de un circulo y una opcion de tipo String
A- calculará el area del circulo como pi por r al cuadrado
L- longitud del circulo como 2 por pi por radio
V- VOLUMNEN como 4/3 por pi por radio al cubo
F- fin
*/