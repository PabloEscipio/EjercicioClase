package repasoViernes;

import java.util.Scanner;

public class notasAlumnos10 {
    public static void main(String[] args) {
        // Variables
        Scanner sc = new Scanner(System.in);

        int uNota;

        int vNotaAlta = 0;


        // Programa
        for (int i = 0; i < 10; i++) {
            do {
                System.out.println("Introduce la " + (i + 1) + "ª nota");
                uNota = sc.nextInt();
            } while (uNota < 0 | uNota > 10);
            vNotaAlta = (vNotaAlta < uNota) ? uNota : vNotaAlta;
        }
        System.out.println("La nota mas alta es: " + vNotaAlta);
    } // main end
}
