package semana2;

import java.util.Scanner;

public class Test2Arrays {

    //nota
    public static String mNotaLista(int[] aNota) {

        String mLista = "";

        for (int i = 0; i < aNota.length; i++) {
            mLista += ("El alumno: " + i + " ha sacado un: " + aNota[i] + "\n");
        }
        return mLista;
    } // nota end


    //maxNota
    public static int mMaxNota(int[] aNota) {

        int mMaxNota = 0;

        for (int i = 0; i < aNota.length; i++) {
            mMaxNota = (mMaxNota < aNota[i]) ? aNota[i] : mMaxNota;
        }
        return mMaxNota;
    } // maxNota end

    // Media
    public static float mMediaNota(int[] aNota) {
        float mResultado = 0;

        for (int i = 0; i < aNota.length; i++) {
            mResultado += aNota[i];
        }

        return mResultado / aNota.length;
    } // media End

    // MediaAlumnos
    public static String mMediaAlumnos(int[] aNotaT, int[] aNotaP) {
        String rMediaAlumnos = "";

        for (int i = 0; i < aNotaT.length | i < aNotaP.length; i++) {
            rMediaAlumnos = (rMediaAlumnos + "El alumno " + i + " tiene de media: " + ((float) (aNotaP[i] + (float) aNotaT[i]) / 2) + "\n");
        }

        return rMediaAlumnos;
    } // MediaAlumnos end

    // Main
    public static void main(String[] args) {
        // Variables
        Scanner sc = new Scanner(System.in);
        char uIndice;

        // Array

        int[] aNotaTeórico = {2, 4, 6, 7, 10};

        int[] aNotaPractico = {1, 3, 5, 8, 9};

        // Programa

        do {
            System.out.println(
                    "----------" +
                            "\nIntroduce una opción." +
                            "\n-----" +
                            "\nA: Nota teórica." +
                            "\nB: Mostrar nota práctica." +
                            "\nC: Nota maxima teórica" +
                            "\nD: Nota maxima practica" +
                            "\nE: Media de todas las notas" +
                            "\nF: Media de un Alumno" +
                            "\nG: Media de todos los alumnos" +
                            "\n$: Cerrar el programa." +
                            "\n----------"
            );
            uIndice = sc.next().toLowerCase().charAt(0);

            switch (uIndice) {
                case 'a':
                    System.out.println(mNotaLista(aNotaTeórico));
                    break;
                case 'b':
                    System.out.println(mNotaLista(aNotaPractico));
                    break;
                case 'c':
                    System.out.println("La nota mas alta es: " + mMaxNota(aNotaTeórico));
                    break;
                case 'd':
                    System.out.println("La nota mas alta es: " + mMaxNota(aNotaPractico));
                    break;
                case 'e':
                    System.out.println("La media de las notas es: " + (mMediaNota(aNotaTeórico) + mMediaNota(aNotaPractico)) / 2);
                    break;
                case 'f':
                    int uNum1;
                    System.out.println("Introduzca el codigo de un alumno");
                    uNum1 = sc.nextInt();
                    System.out.println("La media del alumno " + uNum1 + "es: " + (float) (aNotaPractico[uNum1] + aNotaTeórico[uNum1]) / 2);
                    break;
                case 'g':
                    System.out.println(mMediaAlumnos(aNotaPractico, aNotaTeórico));
                    break;
                default:
                    System.out.println("Indice incorrecto");
            }
        } while (uIndice != '$');

        System.out.println("Cerrando el programa...");
        sc.close();
    } // main end
} // class end

/*
Tenemos en dos arrays las notas de 5 alumnos en su examen teórico y práctico
La opcion se meterá con tipo dato char.
a-Mostrar nota teórica.
b-Mostrar nota práctica
c-nota Maxima teorica
d-nota Maxima práctica
*/