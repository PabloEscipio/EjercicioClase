package arraylist;

import java.util.ArrayList;
import java.util.Scanner;

public class Test1 {

    //mCaracterFinal
    public static ArrayList<Integer> mCaracterFinal(char pLetra, ArrayList<String> pPaises) {
        ArrayList<Integer> rPaises = new ArrayList<>();
        for (String Nombre : pPaises) {
            if (Nombre.charAt(Nombre.length() - 1) == pLetra) {
                rPaises.add(pPaises.indexOf(Nombre));
            } // if end
        } // for end
        return rPaises;
    } // mCaracterFinal end

    // mCaracterCont
    public static short mCaracterCont(char pLetra, ArrayList<String> pPaises) {
        short rResultado = 0;
        for (String datos : pPaises) {
            if (datos.charAt(0) == pLetra) {
                rResultado++;
            } // if end
        } // for end
        return rResultado;
    } // mCaracterCont end


    // main
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Variables
        char uIndice;

        String uPais1;
        String uPais2;
        char uLetra;

        // ArrayList
        ArrayList<String> paises = new ArrayList<>();

        paises.add("España");
        paises.add("Portugal");
        paises.add("Francia");

        // Programa
        do {
            System.out.println("----------" +
                    "\nIntroduzca una opción:" +
                    "\n-----" +
                    "\n1 - Nuevo pais" +
                    "\n2 - Lista de paises" +
                    "\n3 - Eliminar un pais" +
                    "\n4 - Eliminar todos loa paises" +
                    "\n5 - Remplazar un pais" +
                    "\n6 - Anterior y posterior" +
                    "\n7 - Letra inicial" +
                    "\n8 - Borrar por letra final" +
                    "\n$ - Cerrar el programa" +
                    "\n----------");
            uIndice = sc.next().toLowerCase().charAt(0);

            switch (uIndice) {
                case '1':
                    System.out.println("Creando un nuevo pais\n-----\nInserte el nombre:");
                    uPais1 = sc.next();
                    if (paises.contains(uPais1)) {
                        System.out.println(uPais1 + " ya existe");
                    } else {
                        paises.add(uPais1);
                        System.out.println(uPais1 + " añadido");
                    }
                    break;
                case '2':
                    System.out.println("Lista de paises\n-----");
                    for (String list : paises) {
                        System.out.println(list);
                    }
                    break;
                case '3':
                    System.out.println("Elminiando un pais\n-----\nInserte el nombre a eliminar:");
                    uPais1 = sc.next();
                    if (paises.contains(uPais1)) {
                        paises.remove(uPais1);
                        System.out.println(uPais1 + " ha sido eliminado");
                    } else {
                        System.out.println("El pais introducido no existe");
                    }
                    break;
                case '4':
                    paises.clear();
                    System.out.println("Todos los paises han sidos borrados");
                    break;
                case '5':
                    System.out.println("Remplazando un pais\n------\nIntroduce el nombre del pais a cambiar:");
                    uPais1 = sc.next();
                    if (paises.contains(uPais1)) {
                        System.out.println("Introduce el nuevo pais:");
                        uPais2 = sc.next();
                        paises.set(paises.indexOf(uPais1), uPais2);
                        System.out.println(uPais1 + " ha sido remplazado por " + uPais2);
                    } else {
                        System.out.println("El pais introducido no existe");
                    }
                    break;
                case '6':
                    System.out.println("Introduce un pais:");
                    uPais1 = sc.next();
                    if (paises.contains(uPais1)) {
                        if (paises.indexOf(uPais1) == 0) {
                            System.out.println(uPais1 + " es el primero de la lista, " + "el siguiente es " + paises.get(paises.indexOf(uPais1) + 1));
                        } else if (paises.indexOf(uPais1) == paises.size() - 1) {
                            System.out.println(uPais1 + ": el anterior es " + paises.get(paises.indexOf(uPais1) - 1) + " no hay siguiente pues es el ultimo");
                        } else {
                            System.out.println(uPais1 + ": el anterior es " + paises.get(paises.indexOf(uPais1) - 1) + " el siguiente es " + paises.get(paises.indexOf(uPais1) + 1));
                        }
                    } else {
                        System.out.println("El pais introducido no existe");
                    }
                    break;
                case '7':
                    System.out.println("Introduce una inicial");
                    uLetra = sc.next().toUpperCase().charAt(0);
                    System.out.println("Hay un total de " + mCaracterCont(uLetra, paises) + " paises que empiezen por " + uLetra);
                    break;
                case '8':
                    System.out.println("Introduce la letra final");
                    uLetra = sc.next().charAt(0);
                    paises.remove(mCaracterFinal(uLetra, paises));
                    break;
                case '$':
                    break;
                default:
                    System.out.println("Introduce un indice valido");
            }

        } while (uIndice != '$');
    } // main end
} // class end



/*
Hace un programa para trabajar con paises con el siguiente menu:
1-añadir un nombre al array
2-Mostrar todos los nombres
3-Eliminar un nombre si existe
Trabajar con la consola
0-salir
do-wh
*/