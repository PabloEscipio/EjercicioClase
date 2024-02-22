package semana2;

import java.util.Scanner;

public class diamante {
    // mSecuencia
    public static String mSecuencia(byte longitud) {
        String rSecuencia = "";
        byte i = (byte) (longitud / 2);
        byte I = (byte) (longitud / 2);

        while (i > 0) {
            rSecuencia = rSecuencia + " " + (i + 1);
            i--;
        } // while end

        rSecuencia = rSecuencia + " " + 1;

        while (i != I) {
            i++;
            rSecuencia = rSecuencia + " " + (i + 1);
        } // while end


        return rSecuencia;
    } // secuencia end

    // main
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Variables
        byte uNum1;
        byte x = 1;

        // Programa
        System.out.println("Introduce un numero entero, con \"0\" el programa se cierra");
        uNum1 = sc.nextByte();

        while (uNum1 != 0) {
            if (uNum1 < 0) {
                System.out.println("Numero no valido");
            } else {

                for (byte i = 0; i < uNum1 / 2; i++) {
                    System.out.println(mSecuencia(x));
                    x += 2;
                }// for end

                System.out.println(mSecuencia(uNum1));

                for (; uNum1 / 2 > 1; uNum1--) {
                    x -= 2;
                    System.out.println(mSecuencia(x));
                } // for end

            } // if end
            x = 1;
            System.out.println("Introduce un numero entero, con \"0\" el programa se cierra");
            uNum1 = sc.nextByte();
        }


        System.out.println("Cerrando del programa...");
        sc.close();
    } // main end
} // class end
