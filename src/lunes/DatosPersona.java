package lunes;

// Atributos
public class DatosPersona {
    private String Nombre;
    private String DNI;
    private String Provincia;

    // Constructor
    public DatosPersona(String pNombre, String pDNI, String pProvincia) {
        this.Nombre = pNombre;
        this.DNI = pDNI;
        this.Provincia = pProvincia;
    }

    // getters and setters

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public String getProvincia() {
        return Provincia;
    }

    public void setProvincia(String provincia) {
        Provincia = provincia;
    }

    // toString
    public String toString() {
        return "Nombre: " + Nombre + "\nDNI: " + DNI + "\nProvincia: " + Provincia;
    }
} // class end
