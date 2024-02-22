package semana2;

import java.util.Arrays;

public class test1 {
    public static void main(String[] args) {
        int[] edadAlumnos = {10, 12, 23, 41, 21};
        int mayoresEdad = 0;

        for (int i = 0; i < 5; i++) {
            System.out.println((i + 1) + " " + edadAlumnos[i]);

            if (edadAlumnos[i] > 18) {
                mayoresEdad++;
                System.out.println(edadAlumnos[i]);
            }
        }

        System.out.println(Arrays.stream(edadAlumnos).average());
        System.out.println(mayoresEdad);

    } // main end
} // class end


/*
Crear un array con las edades de 5 alumnos. Se pedirán desde consola. El programa debe de:
-mostrar las edades de los alumnos
-mostrar la edad media de los alumnos
*/