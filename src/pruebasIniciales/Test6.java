package pruebasIniciales;

import java.util.Scanner;

public class Test6 {
    public static void main(String[] args) {
        //Variables
        Scanner sc = new Scanner(System.in);

        short uEdad;
        int uAltura;

        short vMayorEdad = 0;
        short vAltos = 0;
        short vMediaEdad = 0;

        for (short i = 0; i < 3; i++) {
            System.out.println("----------\nIntroduce la EDAD del alumno.");
            uEdad = sc.nextShort();
            System.out.println("Introduce la ALTURA del alumno en cm.");
            uAltura = sc.nextInt();

            if (uEdad > 18) {
                vMayorEdad++;
            } // if end
            if (uAltura > 175) {
                vAltos++;
            } // if end

            vMediaEdad += uEdad;
        } // for end

        System.out.println("La media de edad es: " + vMediaEdad / 3 + ".\nHay " + vAltos + " alumnos que miden mas de 175cm.\nHay " + vMayorEdad + " de alumnos que tienen mas de 18 años.");

        sc.close();
    } // main end
} // class end


/*Leidas las edades y alturas de 3 alumnos, mostrar la edad y la estatura media.
 La cantidad de alumnos mayores de 18 años, y la cantidad de alumnos que miden más de 1.75*/
