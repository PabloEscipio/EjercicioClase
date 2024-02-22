package jueves;

public class Tests {
    public static void main(String[] args) {
        Asignatura lolete = new Asignatura("League of Legends");

        lolete.setNotaTrimestre1(7.65);
        lolete.setNotaTrimestre2(8.39);

        Alumno Paco = new Alumno("Paco", "Arte", "Danza", "Cambio de orugas de m22");

        System.out.println(Paco.toString());

        System.out.println(lolete.toString());
        ;
    } // main end
} // class end
