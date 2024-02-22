package formasVida;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        // Utils
        Scanner sc = new Scanner(System.in);

        // Variables
        String uNombre;

        Marciano et1;
        Marciano et2;
        Marciano et3;

        // Programa
        System.out.println("Introduce un nombre para el nuevo marciano");
        uNombre = sc.next();
        et1 = new Marciano(uNombre);

        System.out.println("Introduce un nombre para el nuevo marciano");
        uNombre = sc.next();
        et2 = new Marciano(uNombre);

        System.out.println("Introduce un nombre para el nuevo marciano");
        uNombre = sc.next();
        et3 = new Marciano(uNombre);

        et2.muere();

        System.out.println(et1.getNumMarcianos());

        Marciano et4 = new Marciano("DUH");
    } // main end
} // class end
