package funciones;

import java.util.Scanner;

import static funciones.NumerosEnteros.*;

public class Programa1 {
    public static void main(String[] args) {
        // Variables
        Scanner sc = new Scanner(System.in);

        String uIndice;
        int uNum1;
        int uNum2;

        String sRespuesta;

        //Programa

        do {
            System.out.println(
                    "Indice\n" +
                            "----------\n" +
                            "a - Es par?\n" +
                            "b - Es positivo?\n" +
                            "c - Es negativo?\n" +
                            "d - Es nulo?\n" +
                            "$ - Cerrar el programa"
            );
            uIndice = sc.next();

            if (!uIndice.equalsIgnoreCase("$")) {


                switch (uIndice) {
                    case "a":
                        System.out.println("Introduce un numero");
                        uNum1 = sc.nextInt();
                        sRespuesta = (esPar(uNum1)) ? "Es par" : "Es impar";
                        System.out.println(sRespuesta);
                        break;
                    case "b":
                        System.out.println("Introduce un numero");
                        uNum1 = sc.nextInt();
                        sRespuesta = (esPositivo(uNum1)) ? "Es positivio" : "Es negativo";
                        System.out.println(sRespuesta);
                        break;
                    case "c":
                        System.out.println("Introduce un numero");
                        uNum1 = sc.nextInt();
                        sRespuesta = (esNegativo(uNum1)) ? "Es negativo" : "Es positivo";
                        System.out.println(sRespuesta);
                        break;
                    case "d":
                        System.out.println("Introduce un numero");
                        uNum1 = sc.nextInt();
                        sRespuesta = (esNulo(uNum1)) ? "Es nulo" : "No es nulo";
                        System.out.println(sRespuesta);
                        break;
                    case "1":
                        System.out.println("Introduce el primer numero");
                        uNum1 = sc.nextInt();
                        System.out.println("Introduce el segundo numero");
                        uNum2 = sc.nextInt();
                        System.out.println("-----\n" + "Resultado: " + sumaNumerosPara(uNum1, uNum2));
                        break;
                    case "2":
                        System.out.println("Introduce el primer numero");
                        uNum1 = sc.nextInt();
                        System.out.println("Introduce el segundo numero");
                        uNum2 = sc.nextInt();
                        System.out.println("-----\n" + "Resultado: " + sumaNumerosMientras(uNum1, uNum2));
                        break;
                    case "3":
                        System.out.println("Introduce el primer numero");
                        uNum1 = sc.nextInt();
                        System.out.println("Introduce el segundo numero");
                        uNum2 = sc.nextInt();
                        System.out.println("-----\n" + "Resultado: " + sumaNumerosRepetir(uNum1, uNum2));
                        break;
                    default:
                        System.out.println("Introduzca un indice correcto");
                } // switch end
            } // if end

        } while (!uIndice.equalsIgnoreCase("$"));

        System.out.println("Cerrando el programa...");

        sc.close();
    }
}
