package pruebasIniciales;

import java.util.Random;
import java.util.Scanner;

public class Test8Juego {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        int uRespuesta;

        int vNum1;
        int vNum2;

        int vContador = 0;
        boolean vEnd = false;

        do {
            vNum1 = random.nextInt(100);
            vNum2 = random.nextInt(100);
            System.out.println(vNum1 + "+" + vNum2);
            uRespuesta = sc.nextInt();

            if (uRespuesta != vNum1 + vNum2) {
                vEnd = true;
            } else {
                System.out.println("Correcto!\n----------");
                vContador++;
            }

        } while (vEnd == false);

        System.out.println("¡Error!, has acertado un total de: " + vContador);

        sc.close();
    } // main end
} // class end


/*
Desarrollar un programa que ayude a desarrollar el calculo mental de suma numeros.
El jugador tendrá que introducir la suma de dos numeros entre cero y 100 generados aleatoriamente. Mientras la solucions sea correcta el jugador continuara.
En caso contrario, el juego terminara y mostrará el numero de operaciones realizadas
correctamente
*/
