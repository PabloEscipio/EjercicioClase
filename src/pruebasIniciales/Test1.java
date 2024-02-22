package pruebasIniciales;

import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {
        /*
        Pedir la nota de un alumno (integer) y decir si ha sacado
        9,10 sobresaliente
        7,8 notable
        6 bien
        5 aprobado
        1,2,3,4, pediremos la nota del trabajo. Si la nota y el trabajo superan el 5 aprobarán y sino suspenderan
        */

        //Variables
        Scanner sc = new Scanner(System.in);
        int uNotaExamen;
        int uNotaTrabajo;

        //Programa
        System.out.println("Introduzca la nota del examen");
        uNotaExamen = sc.nextInt();

        switch (uNotaExamen) {
            case 1, 2, 3, 4:
                // Pedimos al usuario la nota del trabajo
                System.out.println("Introduzca la nota del trabajo");
                uNotaTrabajo = sc.nextInt();
                // Sumamos esta a la nota total
                uNotaExamen += uNotaTrabajo;

                if (uNotaExamen > 5) {
                    System.out.println("Aprovado");
                } else {
                    System.out.println("Suspenso");
                }
                break;
            case 5:
                System.out.println("Aprovado");
                break;
            case 6:
                System.out.println("Bien");
                break;
            case 7, 8:
                System.out.println("Notable");
                break;
            case 9, 10:
                System.out.println("Sobresaliente");
                break;
            default:
                System.out.println("Nota introducida incorrecta");
        } //switch end

        sc.close();
    } //main end
} //class end
