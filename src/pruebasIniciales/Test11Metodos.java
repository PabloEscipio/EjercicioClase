package pruebasIniciales;

import java.util.Scanner;

public class Test11Metodos {

    public static float mArea(float pBase, float pAltura) {
        float mAreaRES;
        mAreaRES = pBase * pAltura;
        return mAreaRES;
    }

    public static float mLongitud(float pBase, float pAltura) {
        float mLongitudRES;
        mLongitudRES = 2 * pBase + 2 * pAltura;
        return mLongitudRES;
    }

    public static float mVolumen(float pBase, float pAltura) {
        float mVolumenRES;
        mVolumenRES = (float) (Math.PI * pBase * Math.pow(pAltura, 2));
        return mVolumenRES;
    }

    public static float mContenido(float pBase, float pAltura) {
        float mContenidoRES;
        mContenidoRES = (mArea(pBase, pAltura) + mVolumen(pBase, pAltura)) * mLongitud(pBase, pAltura);
        return mContenidoRES;
    }

    public static void main(String[] args) {
        // Variables
        Scanner sc = new Scanner(System.in);

        char uIndice;
        float uBase;
        float uAltura;


        //Programa
        do {
            System.out.println(
                    "Introduce un indice\n" +
                            "-----------\n" +
                            "a - Area\n" +
                            "1 - Longitud\n" +
                            "v - Volumen\n" +
                            "c - Contenido\n" +
                            "$ - Salir del programa\n"
            );
            uIndice = sc.next().charAt(0);

            if (uIndice != '$') {
                System.out.println("Introduce la base en cm");
                uBase = sc.nextFloat();
                System.out.println("Introduce la altura en cm");
                uAltura = sc.nextFloat();

                switch (uIndice) {
                    case 'a':
                        System.out.println("El area es: " + mArea(uBase, uAltura));
                        break;
                    case '1':
                        System.out.println("La longitud es: " + mLongitud(uBase, uAltura));
                        break;
                    case 'v':
                        System.out.println("El volumen es: " + mVolumen(uBase, uAltura));
                        break;
                    case 'c':
                        System.out.println("El contenido es: " + mContenido(uBase, uAltura));
                        break;
                    default:
                        System.out.println("ERROR: Introduce un indice correcto");
                } // switch end
            }

        } while (uIndice != '$');

        System.out.println("Cerrando...");

        sc.close();
    } // main end
} // class end


//vamos a hacer un programa que pida la operacion de tipo char:
// a-AREA->b*H
//1-LONGITUD->2*b+2*h
//v-VOLUMEN ->pi*b*h2
//c- CONTENIDO->se calcul como el area + volumen por la longitud
