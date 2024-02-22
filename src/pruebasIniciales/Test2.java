package pruebasIniciales;

import java.util.Scanner;

public class Test2 {
    public static void main(String[] args) {

        //Variables
        Scanner sc = new Scanner(System.in);
        float uNotaTeorico;
        float uNotaPractico;
        short uNumAlumnos;

        float vMedia;

        //Programa
        System.out.println("Introduce el numero de alumnos a calcular");
        uNumAlumnos = sc.nextShort();

        for (int bControl = 0; bControl < uNumAlumnos; bControl++) {
            System.out.println("Introduce la nota del examen TEÓRICO de un alumno");
            uNotaTeorico = sc.nextFloat();
            System.out.println("Introduce la nota del examen PRACTICO de un alumno");
            uNotaPractico = sc.nextFloat();

            String fResultado = ((uNotaPractico + uNotaTeorico) / 2 < 6.5) ? "Suspenso" : "Aprovado";

            System.out.println("La media es: " + ((uNotaPractico + uNotaTeorico) / 2) + " por lo tanto esta " + fResultado + "\n -------------------");

        } //for end

    } //main end
} //class end


/*
En un aula hay 4 alumnos que realizan un examen practico y un examen teórico.
Mostrar la media de cada alumno y si han aprobado o suspedido media mayor de 6,5)
*/