package banco;

public class Titular {
    // Atributos
    private String nombre;
    private String apellidos;
    private short edad;

    // Constructor
    public Titular(String pNombre, String pApellidos, short pEdad) {
        this.nombre = pNombre;
        this.apellidos = pApellidos;
        this.edad = pEdad;
    }

    // Getters & Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public short getEdad() {
        return edad;
    }

    public void setEdad(short edad) {
        this.edad = edad;
    }

    // toString
    public String toString() {
        return "Nombre: " + this.nombre + " " + this.apellidos + "\nEdad: " + this.edad;
    }

    // Metodos
} // class end
