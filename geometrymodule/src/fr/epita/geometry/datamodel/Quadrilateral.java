package fr.epita.geometry.datamodel;

public class Quadrilateral {
    private Double height;
    private Double width;

    public Quadrilateral(Double height, Double width) {
        this.height = height;
        this.width = width;
    }

    public Double getHeight() {
        return height;
    }

    public void setHeight(Double height) {
        this.height = height;
    }

    public Double getWidth() {
        return width;
    }

    public void setWidth(Double width) {
        this.width = width;
    }

    @Override
    public String toString() {
        return "Quadrilateral{" +
                "height=" + height +
                ", width=" + width +
                '}';
    }

    public double getArea() {
        return this.width * this.height;
    }

    public double getPerimeter(){
        return 2 * (this.height + this.width);
    }
}
