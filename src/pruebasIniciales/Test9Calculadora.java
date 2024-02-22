package pruebasIniciales;

import java.util.Scanner;

public class Test9Calculadora {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        float uNum1;
        float uNum2;
        char uOperacion;

        double vResultado;

        do {
            System.out.println(
                    "----------\n" +
                            "Que operacion desea realizar\n" +
                            "+ = Suma\n" +
                            "- = Resta\n" +
                            "* = Multiplicación\n" +
                            "/ = División\n" +
                            "@ = Numero MAYOR\n" +
                            "$ = Numero MENOR\n" +
                            "0 = Fin del programa"
            );
            uOperacion = sc.next().charAt(0);

            if (uOperacion != '0') {
                System.out.println("Introduce el primer numero:");
                uNum1 = sc.nextFloat();
                System.out.println("Introduce el segundo numero:");
                uNum2 = sc.nextFloat();

                switch (uOperacion) {
                    case '+':
                        System.out.println(uNum1 + uNum2);
                        break;
                    case '-':
                        System.out.println(uNum1 - uNum2);
                        break;
                    case '*':
                        System.out.println(uNum1 * uNum2);
                        break;
                    case '/':
                        System.out.println(uNum1 / uNum2);
                        break;
                    case '@':
                        if (uNum1 > uNum2) {
                            System.out.println(uNum1);
                        } else if (uNum1 == uNum2) {
                            System.out.println("Iguales");
                        } else {
                            System.out.println(uNum2);
                        }
                        break;
                    case '$':
                        if (uNum1 < uNum2) {
                            System.out.println(uNum1);
                        } else if (uNum1 == uNum2) {
                            System.out.println("Iguales");
                        } else {
                            System.out.println(uNum2);
                        }
                        break;
                } // switch end
            }
        } while (uOperacion != '0');

        System.out.println("Cerrando...");
        sc.close();
    } // main end
} // class end

/*Realizar un programa que simule una calculadora. Pedirá dos numeros y una operacion:
+ mostrará la suma de los numeros
mostrará la resta de los numeros
* mostrará la multiplicacion de los numeros
/ mostrará la division de los numeros
@mostrará el mayor de los numeros
$ mostrará el menor de los numeros.
O FIN DE PROGRAMA
La calculadora se debe de ejecutar hasta que metamos la operacion 0. */
