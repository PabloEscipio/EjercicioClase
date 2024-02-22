package jueves;

public class Alumno {
    // Atributos
    private String nombreAlumno;
    private Asignatura Asig1;
    private Asignatura Asig2;
    private Asignatura Asig3;

    // Constructor
    public Alumno(String pNombreAlumno, String pAsig1, String pAsig2, String pAsig3) {
        this.nombreAlumno = pNombreAlumno;
        this.Asig1 = new Asignatura(pAsig1);
        this.Asig2 = new Asignatura(pAsig2);
        this.Asig3 = new Asignatura(pAsig3);
    }

    public Alumno(String pNombreAlumno, Asignatura pAsig1, Asignatura pAsig2, Asignatura pAsig3) {
        this.nombreAlumno = pNombreAlumno;
        this.Asig1 = new Asignatura(pAsig1.getNombre());
        this.Asig2 = new Asignatura(pAsig2.getNombre());
        this.Asig3 = new Asignatura(pAsig3.getNombre());
    }

    // Getters & Setters
    public String getNombreAlumno() {
        return nombreAlumno;
    }

    public void setNombreAlumno(String nombreAlumno) {
        this.nombreAlumno = nombreAlumno;
    }

    public Asignatura getAsig1() {
        return Asig1;
    }

    public void setAsig1(Asignatura asig1) {
        Asig1 = asig1;
    }

    public Asignatura getAsig2() {
        return Asig2;
    }

    public void setAsig2(Asignatura asig2) {
        Asig2 = asig2;
    }

    public Asignatura getAsig3() {
        return Asig3;
    }

    public void setAsig3(Asignatura asig3) {
        Asig3 = asig3;
    }

    // toString
    public String toString() {
        return "Alumno: " + this.nombreAlumno +
                "\n" + getAsig1().getNombre() + ": " + getAsig1().notaMedia() +
                "\n" + getAsig2().getNombre() + ": " + getAsig2().notaMedia() +
                "\n" + getAsig3().getNombre() + ": " + getAsig3().notaMedia();

    }

    // Metodos
    public boolean isAprovadoCurso() {
        return Asig1.isAprovado() && Asig2.isAprovado() && Asig3.isAprovado();
    }
} // class end