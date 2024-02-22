package Formas;

public class Circulo {
    // Atributos
    private double area;
    private String color;

    // Constructores
    public Circulo(double pArea, String pColor) {
        this.area = pArea;
        this.color = pColor;
    }

    public Circulo(double pArea) {
        this.area = pArea;
        this.color = "Blanco";
    }

    // Getters & Setters
    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    // Metodos
    public double areaCirculo() {
        return Math.PI * Math.pow(this.area, 2);
    }

    public double volumenCirculo() {
        return Math.PI * 2 * Math.pow(this.area, 2);
    }

    public double perimetroCirculo() {
        return 3 / 2 * Math.PI * Math.pow(this.area, 3);
    }

    // toString
    public String toString() {
        return "Area: " + this.area + "\nColor: " + this.color;
    }

} // class end
