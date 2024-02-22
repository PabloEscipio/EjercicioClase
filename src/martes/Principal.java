package martes;

import java.util.ArrayList;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        // Utils
        Scanner sc = new Scanner(System.in);
        // Variables
        char uIndice;

        String uTitulo;
        String uAutor;
        String uFormato;
        String uDuracion;

        int vNum1 = 0;
        int vNum2 = 0;

        // Arrays
        ArrayList<Multimedia> listMultimedia = new ArrayList<>();
        listMultimedia.add(new Multimedia("Asturias", "Melendi", "Disco", "3:30"));
        listMultimedia.add(new Multimedia("Final Solution", "Sabaton", "Disco", "5:30"));

        // Programa
        do {
            System.out.println("*****" + "\nIntroduce un indice" + "\n*****");
            uIndice = sc.next().toLowerCase().charAt(0);
            switch (uIndice) {
                case '$':
                    break;
                case '1':
                    for (Multimedia valor : listMultimedia) {
                        System.out.println("-----");
                        System.out.println(valor.toString());
                        System.out.println("-----");
                    }
                    break;
                case '2':
                    System.out.println("-----" + "\nAñadiendo nuevo elemento");
                    System.out.println("Titulo:");
                    uTitulo = sc.next();
                    System.out.println("Autor:");
                    uAutor = sc.next();
                    System.out.println("Formato:");
                    uFormato = sc.next();
                    System.out.println("Duración: ");
                    uDuracion = sc.next();

                    listMultimedia.add(new Multimedia(uTitulo, uAutor, uFormato, uDuracion));
                    break;
                case '3':
                    System.out.println("-----" + "\nBorrando por autor");
                    System.out.println("Autor:");
                    uAutor = sc.next();

                    for (Multimedia valor : listMultimedia) {
                        if (valor.getAutor().equalsIgnoreCase(uAutor)) {
                            listMultimedia.remove(valor);
                        }
                    }
                    break;
                case '4':
                    System.out.println("-----" + "\nBorrando por formato");
                    System.out.println("Formato:");
                    uFormato = sc.next();

                    if (listMultimedia.contains(uFormato)) {
                        listMultimedia.remove(uFormato);
                    }
                    break;
                case '5':
                    for (Multimedia valor : listMultimedia) {

                    }
                    break;
                case '6':
                    break;
                default:
                    System.out.println("*INDICE INCORRECTO*");
            } // switch end
        } while (uIndice != '$');
    } // main end
} // class end
