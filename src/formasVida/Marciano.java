package formasVida;

// Atributos
public class Marciano {
    private boolean vivo;
    private String nombre;
    private static int numMarcianos = 0;

    //Constructor
    public Marciano(String pNombre) {
        this.vivo = true;
        this.nombre = pNombre;
        this.numMarcianos++;
        System.out.println(nace());
    }

    // Getters & Setters
    public boolean isVivo() {
        return vivo;
    }

    public void setVivo(boolean vivo) {
        this.vivo = vivo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNumMarcianos() {
        return numMarcianos;
    }

    public void setNumMarcianos(int numMarcianos) {
        this.numMarcianos = numMarcianos;
    }

    // toString
    public String toString() {
        return "Nombre: " + this.nombre + "\nSignos vitales: " + this.vivo;
    }

    // Metodos
    public String nace() {
        return ("Hola, he nacido y soy el marciano " + this.nombre);
    }

    public void muere() {
        if (this.vivo == true) {
            this.vivo = false;
            System.out.println("El marciano " + this.nombre + " ha muerto.");
            this.numMarcianos--;
        } else {
            System.out.println("El marciano ya esta muerto");
        } // if end
    }

    public boolean estaVivo() {
        return this.vivo;
    }

    public int cuentaMarcianos() {
        return this.numMarcianos;
    }

} // class end
