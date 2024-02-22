package jueves;

public class Asignatura {
    // Atributos
    private String nombre;
    private double notaTrimestre1;
    private double notaTrimestre2;

    // Constructor
    public Asignatura(String pNombre, double pNotaTrimestre1, double pNotaTrimestre2) {
        this.nombre = pNombre;
        this.notaTrimestre1 = pNotaTrimestre1;
        this.notaTrimestre2 = pNotaTrimestre2;
    }

    public Asignatura(String pNombre) {
        this.nombre = pNombre;
        this.notaTrimestre1 = 0;
        this.notaTrimestre2 = 0;
    }

    // Getters & Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getNotaTrimestre1() {
        return notaTrimestre1;
    }

    public void setNotaTrimestre1(double notaTrimestre1) {
        this.notaTrimestre1 = notaTrimestre1;
    }

    public double getNotaTrimestre2() {
        return notaTrimestre2;
    }

    public void setNotaTrimestre2(double getNotaTrimestre2) {
        this.notaTrimestre2 = getNotaTrimestre2;
    }

    // toString
    public String toString() {
        return "Asignatura: " + this.nombre + "\nNota primer trimestre: " + this.notaTrimestre1 + "\nNota segundo trimestre: " + this.notaTrimestre2;
    }

    // Metodos
    public double notaMedia() {
        return (this.notaTrimestre1 + this.notaTrimestre2) / 2;
    }

    public boolean isAprovado() {
        return notaMedia() >= 5;
    }
} // class end
