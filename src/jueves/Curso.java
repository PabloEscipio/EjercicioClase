package jueves;

import java.util.ArrayList;
import java.util.Scanner;

public class Curso {
    public static void main(String[] args) {
        // Utils
        Scanner sc = new Scanner(System.in);
        // Variables
        char uIndice;
        String uNombreAlumno;
        String uAsignatura;
        double uNum1;
        double uNum2;

        double vNum1 = 0;

        //Arrays
        ArrayList<Double> listNota = new ArrayList<Double>();

        // Asignaturas
        Asignatura basesDatos = new Asignatura("Bases de Datos");
        Asignatura programacion = new Asignatura("Programación");
        Asignatura entornos = new Asignatura("Entornos");

        // Alumnos
        ArrayList<Alumno> listAlumnos = new ArrayList<>();

        listAlumnos.add(new Alumno("Felipe", basesDatos, programacion, entornos));
        for (Alumno valor : listAlumnos) {
            if (valor.getNombreAlumno() == "Felipe") {
                valor.getAsig1().setNotaTrimestre1(5);
                valor.getAsig1().setNotaTrimestre2(6);
                valor.getAsig2().setNotaTrimestre1(8);
                valor.getAsig2().setNotaTrimestre2(9);
                valor.getAsig3().setNotaTrimestre1(7);
                valor.getAsig3().setNotaTrimestre2(7);

            }
        }
        listAlumnos.add(new Alumno("Sonia", "Bases de Datos", "Programación", "Entornos"));

        // Programa
        do {
            System.out.println("*****" + "\nIntroduce indice" + "\n*****");
            uIndice = sc.next().toLowerCase().charAt(0);
            switch (uIndice) {
                case '1':
                    for (Alumno valor : listAlumnos) {
                        System.out.println(valor.toString());
                        System.out.println("-----");
                    }
                    break;
                case '2':
                    System.out.println("Añadiendo nuevo alumno" + "\n----------");
                    System.out.println("Nombre:");
                    uNombreAlumno = sc.next();
                    listAlumnos.add(new Alumno(uNombreAlumno, basesDatos, programacion, entornos));
                    break;
                case '3':
                    for (Alumno valor : listAlumnos) {
                        if (valor.isAprovadoCurso()) {
                            System.out.println(valor.getNombreAlumno());
                        }
                    }
                    break;
                case '4':
                    for (Alumno valor : listAlumnos) {
                        if (valor.getAsig2().isAprovado()) {
                            System.out.println(valor.getAsig2().notaMedia());
                        }
                    }
                    break;
                case '5':
                    System.out.println("Borrando alumno" + "\n----------");
                    System.out.println("Nombre:");
                    uNombreAlumno = sc.next();
                    for (int i = listAlumnos.size() - 1; i >= 0; i--) {
                        if (listAlumnos.get(i).getNombreAlumno().equalsIgnoreCase(uNombreAlumno)) {
                            listAlumnos.remove(i);
                        }
                    }
                    break;
                case '6':
                    System.out.println("Cambiando nota" + "\n----------");
                    System.out.println("Nombre:");
                    uNombreAlumno = sc.next();
                    System.out.println("Asignatura:");
                    uAsignatura = sc.next();

                    for (Alumno valor : listAlumnos) {
                        if (valor.getNombreAlumno().equalsIgnoreCase(uNombreAlumno))
                            if (valor.getAsig1().getNombre().equalsIgnoreCase(uAsignatura)) {
                                System.out.println("Trimestre:");
                                uNum1 = sc.nextDouble();
                                System.out.println("Nota: ");
                                uNum2 = sc.nextDouble();
                                if (uNum1 == 1) {
                                    valor.getAsig1().setNotaTrimestre1(uNum2);
                                } else if (uNum1 == 2) {
                                    valor.getAsig1().setNotaTrimestre2(uNum2);
                                } else {
                                    System.out.println("Error");
                                }
                            } else if (valor.getAsig2().getNombre().equalsIgnoreCase(uAsignatura)) {
                                System.out.println("Trimestre:");
                                uNum1 = sc.nextDouble();
                                System.out.println("Nota: ");
                                uNum2 = sc.nextDouble();
                                if (uNum1 == 1) {
                                    valor.getAsig2().setNotaTrimestre1(uNum2);
                                } else if (uNum1 == 2) {
                                    valor.getAsig2().setNotaTrimestre2(uNum2);
                                } else {
                                    System.out.println("Error");
                                }
                            } else if (valor.getAsig3().getNombre().equalsIgnoreCase(uAsignatura)) {
                                System.out.println("Trimestre:");
                                uNum1 = sc.nextDouble();
                                System.out.println("Nota: ");
                                uNum2 = sc.nextDouble();
                                if (uNum1 == 1) {
                                    valor.getAsig3().setNotaTrimestre1(uNum2);
                                } else if (uNum1 == 2) {
                                    valor.getAsig3().setNotaTrimestre2(uNum2);
                                } else {
                                    System.out.println("Error");
                                }
                            }
                    }

                    break;
                case '7':
                    for (Alumno valor : listAlumnos) {
                        listNota.add(valor.getAsig1().getNotaTrimestre1());
                        listNota.add(valor.getAsig1().getNotaTrimestre2());
                        listNota.add(valor.getAsig2().getNotaTrimestre1());
                        listNota.add(valor.getAsig2().getNotaTrimestre2());
                        listNota.add(valor.getAsig3().getNotaTrimestre1());
                        listNota.add(valor.getAsig3().getNotaTrimestre2());
                    }
                    for (Double valor : listNota) {
                        vNum1 = (valor > vNum1) ? valor : vNum1;
                    }
                    System.out.println(vNum1);
                    break;
                case '8':
                    for (Alumno valor : listAlumnos) {
                        if (!valor.isAprovadoCurso()) {
                            System.out.println(valor.getNombreAlumno());
                            vNum1++;
                        }
                        System.out.println("Total de suspensos: " + vNum1);
                    }
                    break;
                default:
                    System.out.println("INDICE INTRODUCIDO INCORRECTO");
            }
        } while (uIndice != '$');

    } // main end
} // class end
