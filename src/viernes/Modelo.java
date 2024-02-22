package viernes;

public class Modelo {
    // Atributos
    private String marca;
    private String modelo;

    // Constructor
    public Modelo(String pMarca, String pModelo) {
        this.marca = pMarca;
        this.modelo = pModelo;
    }

    public Modelo(String pMarca) {
        this.marca = pMarca;
        this.modelo = "Default";
    }

    // Getters & Setters
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    // toString
    public String toString() {
        return "Marca: " + this.marca + "\nModelo: " + this.modelo;
    }
    // Metodos
} // class end
