package pruebasIniciales;

import java.util.Scanner;

public class Test5TablaMultiplicar {
    public static void main(String[] args) {
        // Variable
        Scanner sc = new Scanner(System.in);

        int uNum;

        // Programa
        System.out.println("Inserte el numero objetivo:");
        uNum = sc.nextInt();
        System.out.println("----------");

        for (int i = 1; i <= 10; i++) {
            System.out.println(uNum * i);
        } // for end
        System.out.println("----------");
        sc.close();
    } // main end
} // class end

/*realizar un programa que muestre la tabla de multiplicar de un numero de la siguiene forma: */
