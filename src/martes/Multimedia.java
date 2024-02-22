package martes;

public class Multimedia {
    // Atributos
    private String titulo;
    private String autor;
    private String formato;
    private String duracion;

    // Constructor
    public Multimedia(String pTitulo, String pAutor, String pFormato, String pDuracion) {
        this.titulo = pTitulo;
        this.autor = pAutor;
        this.formato = pFormato;
        this.duracion = pDuracion;
    }

    // Getters & Setters

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getFormato() {
        return formato;
    }

    public void setFormato(String formato) {
        this.formato = formato;
    }

    public String getDuracion() {
        return duracion;
    }

    public void setDuracion(String duracion) {
        this.duracion = duracion;
    }

    // toString
    public String toString() {
        return "Titulo: " + this.titulo +
                "\nAutor: " + this.autor +
                "\nFormato: " + this.formato +
                "\nDuración" + this.duracion;
    }

    // Metodos

} // class end
