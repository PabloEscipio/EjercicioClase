package viernes;

public class Coche {
    // Atributos
    private double precio;
    private Modelo tipo;
    private Motor engine;

    // Constructor
    public Coche(double Pprecio, String pMarca, int pCV) {
        this.precio = Pprecio;
        tipo = new Modelo(pMarca);
        engine = new Motor(pCV);
    }

    public Coche(String pMarca, int pCV) {
        this.precio = -1;
        tipo = new Modelo(pMarca);
        engine = new Motor(pCV);
    }

    public Coche(int pCV) {
        this.precio = -1;
        tipo = new Modelo("AUDI");
        engine = new Motor(pCV);
    }

    /* pots */
    public Coche(int pCV, Modelo pModelo) {
        this.precio = -1;
        this.engine = new Motor(pCV);
        this.tipo = pModelo;
    }

    // Getters & Setters

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public double getPrecio() {
        return precio;
    }

    public Modelo getTipo() {
        return tipo;
    }

    public Motor getEngine() {
        return engine;
    }

    //toString
    public String toString() {
        return tipo.toString() + "\n" + engine.toString() + "\nPrecio: " + this.precio;
    }

    // Metodos
    public void acumularAveria(double pCosteAveria) {
        this.precio += pCosteAveria;
    }
} // class end
