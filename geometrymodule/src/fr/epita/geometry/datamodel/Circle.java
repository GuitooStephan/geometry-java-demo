package fr.epita.geometry.datamodel;

import fr.epita.geometry.constants.Constant;

public class Circle {
    Constant constant;

    private Double radius;

    public Circle( double r ){
        this.radius = r;
    }

    public Double getRadius() {
        return radius;
    }

    public void setRadius(Double radius) {
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                '}';
    }

    public double getArea() {
        return constant.getPI() * Math.sqrt(this.radius);
    }

    public double getPerimeter(){
        return 2 * constant.getPI() * radius;
    }
}
