package viernes;

public class Motor {
    // Atributos
    private int lAceite;
    private int cv;

    // Constructor
    public Motor(int pCV) {
        this.cv = pCV;
        this.lAceite = 0;
    }

    // Getters & Setters
    public int getlAceite() {
        return lAceite;
    }

    public int getCv() {
        return cv;
    }

    public void setlAceite(int lAceite) {
        this.lAceite = lAceite;
    }

    // toString
    public String toString() {
        return "Aceite: " + this.lAceite + "\nCaballos: " + this.cv;
    }

    // metodos
    public double potencia() {
        double rNum1;
        if (this.lAceite != 0) {
            rNum1 = this.cv / this.lAceite;
        } else {
            rNum1 = 0;
        }
        return rNum1;
    }

    public boolean isDeportivo() {
        return this.cv > 200;
    }
} // class end
