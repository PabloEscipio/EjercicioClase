package lunes;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Variables
        char uIndice;

        String uNombre;
        String uDNI;
        String uProvincia;

        int vNum1 = 0;

        // Array
        Candidato[] can = new Candidato[4];
        can[0] = new Candidato("Paco", "00000a", "Galicia");
        can[1] = new Candidato("Juan", "11111b", "Asturias");
        can[2] = new Candidato("Fernando", "22222c", "Cantabria");
        can[3] = new Candidato("Mario", "33333d", "Pais Vasco");

        // Programa
        do {
            vNum1 = 0;
            System.out.println("*****");
            System.out.println("Introduce un indice");
            uIndice = sc.next().toLowerCase().charAt(0);
            System.out.println("*****");
            switch (uIndice) {
                case '1':
                    System.out.println("Nombre del candidato a votar:");
                    uNombre = sc.next();
                    for (Candidato valor : can) {
                        if (valor.getDp().getNombre().equalsIgnoreCase(uNombre)) {
                            valor.voto();
                        }
                    }
                    break;
                case '2':
                    for (Candidato valor : can) {
                        System.out.println(valor.toString());
                        System.out.println("-----");
                    }
                    break;
                case '3':
                    System.out.println("Introduce DNI a cambiar provincia");
                    uDNI = sc.next();

                    for (Candidato valor : can) {
                        if (uDNI.equalsIgnoreCase(valor.getDp().getDNI())) {
                            System.out.println(valor.toString());
                            System.out.println("------");
                            System.out.println("Introduce la nueva provincia");
                            uProvincia = sc.next();
                            valor.setDpProvincia(uProvincia);
                            System.out.println("-----");
                            System.out.println(valor.toString());
                        }
                    }
                    break;
                case '4':
                    System.out.println("Introduce la provincia a sumar");
                    uProvincia = sc.next();
                    for (Candidato valor : can) {
                        if (uProvincia.equalsIgnoreCase(valor.getDp().getProvincia())) {
                            vNum1 += valor.getNumVotos();
                        }
                    }
                    System.out.println(vNum1);
                    break;
                case '@':
                    System.out.println(can[0].getNomMaxVotado() + "\n" + can[0].getNumMaxVotos());
                    break;
                default:
                    System.out.println("Indice erroneo");
            } // Switch end
        } while (uIndice != '$');
    } // main end
} // class end
