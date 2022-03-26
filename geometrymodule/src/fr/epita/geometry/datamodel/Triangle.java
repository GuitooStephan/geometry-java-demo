package fr.epita.geometry.datamodel;

public class Triangle {
    private Double base;
    private Double height;
    private Double sideA;
    private Double sideB;

    public Triangle(double base, double height, double sideA, double sideB) {
        this.base = base;
        this.height = height;
        this.sideA = sideA;
        this.sideB = sideB;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getSideA() {
        return sideA;
    }

    public void setSideA(double sideA) {
        this.sideA = sideA;
    }

    public double getSideB() {
        return sideB;
    }

    public void setSideB(double sideB) {
        this.sideB = sideB;
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "base=" + base +
                ", height=" + height +
                ", sideA=" + sideA +
                ", sideB=" + sideB +
                '}';
    }

    public double getArea() {
        return ( this.height * this.base ) / 2;
    }

    public double getPerimeter(){
        return this.sideA + this.sideB + this.base;
    }
}
