package pruebasIniciales;

import java.util.Scanner;

public class Test7DoWhile {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        byte uCOD;
        byte vCOD = 0;
        int numIntentos = 0;

        System.out.println("Introduce la contraseña");
        uCOD = sc.nextByte();

        do {
            vCOD++;
            numIntentos++;
        } while (uCOD != vCOD);

        System.out.println("La contraseña es: " + vCOD + " fueron necesarios " + numIntentos + " intentos");

        sc.close();
    } // main end
} // class end


//REalizar un programa que acierte la combinacion secreta
//de una caja fuerte
//La caja fuerte tiene una combinacion que es un numero entre cero y diez
//contar los intentos que hemos realizado hasta acertarla. Y mostrar cual era