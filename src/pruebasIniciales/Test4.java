package pruebasIniciales;

import java.util.Scanner;

public class Test4 {
    public static void main(String[] args) {
        //Variables
        Scanner sc = new Scanner(System.in);

        long uNum;

        short vNumPerfectos = 0, vNumImperfectos = 0;

        //Programa
        for (int i = 0; i < 10; i++) {
            System.out.println("Introduzca un numero");
            uNum = sc.nextLong();

            if (uNum % 2 == 0 && uNum > 100) {
                vNumPerfectos++;
                System.out.println(uNum + " es un numero PERFECTO \n ---------------------");
            } else {
                vNumImperfectos++;
                System.out.println(uNum + " es un numero IMPERFECTO \n ---------------------");
            } // if end
        } // for end

        System.out.println("De los 10 anteriores numeros, " + vNumPerfectos + " fueron perfectos, y " + vNumImperfectos + " fueron imperfectos.");
        sc.close();
    } // main end
} // class end


/*
Realizar un programa que diga si un numero es perfecto o no es perfecto Un numero es perfecto si es par y ademas mayor de 100.
El programa pedirá 10 números y dirá cuantos son perfectos y cuantos no son perfectos
*/

