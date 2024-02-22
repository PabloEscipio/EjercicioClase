package funciones;

public class NumerosEnteros {
    public static boolean esPar(int pNum) {
        return (pNum % 2 == 0);
    }

    public static boolean esPositivo(int pNum) {
        return (pNum > 0);
    }

    public static boolean esNegativo(int pNum) {
        return (pNum < 0);
    }

    public static boolean esNulo(int pNum) {
        return (pNum == 0);
    }

    public static int sumaNumerosPara(int pNum1, int pNum2) {
        int fResultado = 0;

        for (; pNum1 != pNum2 + 1; pNum1++) {
            fResultado = fResultado + pNum1;
        }
        return fResultado;
    }

    public static int sumaNumerosMientras(int pNum1, int pNum2) {
        int fResultado = 0;
        while (pNum1 != pNum2 + 1) {
            fResultado = fResultado + pNum1;

            pNum1++;
        }
        return fResultado;
    }

    public static int sumaNumerosRepetir(int pNum1, int pNum2) {
        int fResultado = 0;
        do {
            fResultado = fResultado + pNum1;

            pNum1++;
        } while (pNum1 != pNum2 + 1);
        return fResultado;
    }

} //class end
