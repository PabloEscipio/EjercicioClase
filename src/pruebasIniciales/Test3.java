package pruebasIniciales;

import java.util.Scanner;

public class Test3 {
    public static void main(String[] args) {
        // Variables
        Scanner sc = new Scanner(System.in);

        short uEdad;

        short vMenores = 0;
        short vMayores = 0;
        float vEdadMedia = 0;

        //Programa
        for (int bControl = 0; bControl < 5; bControl++) {
            System.out.println("Inserte la edad de un alumno");
            uEdad = sc.nextShort();

            vEdadMedia += uEdad;

            if (uEdad < 18) {
                vMenores++;
            } else {
                vMayores++;
            }

        } // for end

        System.out.println("Hay " + vMenores + " alumnos menores de edad, y " + vMayores + " mayores de edad. Que en total tienen una media de " + vEdadMedia / 5);

        sc.close();
    } // main end
} // class end

/*
Realizar un programa que pida la edad de 5 alumnos y cuente el numero de alumnos mayores de edd, el numero de alumnos menores de edad y la edad media de los alumnos
 */
