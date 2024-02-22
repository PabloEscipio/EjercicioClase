package repasoViernes;

import java.util.Scanner;

public class OperacionesMatematicas {

    // Multiplicación
    public static int mProducto(int pNum1, int pNum2) {
        int mResultado = 0;

        for (; pNum2 > 0; pNum2--) {
            mResultado += pNum1;
        } // for end

        return mResultado;
    } // producto end

    // Division
    public static int mDivision(int pNum1, int pNum2) {
        int mResultado = 0;

        for (; pNum1 >= pNum2; mResultado++) {
            pNum1 -= pNum2;
        } // for end

        return mResultado;
    } // Division end

    // Potencia
    public static int mPotencia(int pNum1, int pNum2) {
        int mResultado = 1;

        while (pNum2 > 0) {
            mResultado *= pNum1;
            pNum2--;
        }

        return mResultado;
    } // potencia end


    // Main

    public static void main(String[] args) {
        // Variables
        Scanner sc = new Scanner(System.in);

        String uIndice;
        int uNum1;
        int uNum2;

        // Programa
        do {
            System.out.println(
                    "INDICE" +
                            "\n----------" +
                            "\nA- Multiplica dos numeros introducidos." +
                            "\nB- Divide dos numeros introducidos." +
                            "\nC- Calcula la potencia introducida." +
                            "\n$- Cierra el programa."
            );
            uIndice = sc.next();

            switch (uIndice.toUpperCase()) {
                case "$":
                    break;
                case "A":
                    System.out.println("Introduce el multiplicando");
                    uNum1 = sc.nextInt();
                    System.out.println("Introduce el multiplicador");
                    uNum2 = sc.nextInt();
                    if (uNum1 >= 0 && uNum2 >= 0) {
                        System.out.println(
                                "----------" +
                                        "\nMultiplicando: " + uNum1 +
                                        "\nMultiplicador: " + uNum2 +
                                        "\n-----" +
                                        "\nResultado: " + mProducto(uNum1, uNum2) +
                                        "\n---------"
                        );
                    } else {
                        System.out.println("El programa no acepta numeros negativos.");
                    }
                    break;
                case "B":
                    System.out.println("Introduce el dividendo");
                    uNum1 = sc.nextInt();
                    System.out.println("Introduce el divisor");
                    uNum2 = sc.nextInt();
                    if (uNum1 >= 0 && uNum2 > 0 && uNum1 >= uNum2) {
                        System.out.println(
                                "----------" +
                                        "\nDividendo: " + uNum1 +
                                        "\nDivisor:  " + uNum2 +
                                        "\n-----" +
                                        "\nResultado: " + mDivision(uNum1, uNum2) +
                                        "\n----------"
                        );
                    } else {
                        System.out.println("Error en la división");
                    }
                    break;
                case "C":
                    System.out.println("Introduce la base");
                    uNum1 = sc.nextInt();
                    System.out.println("Introduce el exponente");
                    uNum2 = sc.nextInt();
                    if (uNum1 < 0 || uNum2 < 0) {
                        System.out.println("Error");
                    } else {
                        System.out.println(
                                "----------" +
                                        "\nBase: " + uNum1 +
                                        "\nExponente: " + uNum2 +
                                        "\n-----" +
                                        "\nResultado: " + mPotencia(uNum1, uNum2)
                        );
                    }
                    break;
                default:
                    System.out.println("ERROR: Introduce in indice apropiado");
            }

        } while (!uIndice.equalsIgnoreCase("$"));

        System.out.println("Cerrando el programa...");
        sc.close();
    } // main end
} // class end