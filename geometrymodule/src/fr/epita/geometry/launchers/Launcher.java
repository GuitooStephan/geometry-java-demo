package fr.epita.geometry.launchers;

import fr.epita.geometry.datamodel.Circle;
import fr.epita.geometry.datamodel.Square;

import java.util.Scanner;

public class Launcher {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter the radius of the circle");
        String radius = in.nextLine();
        Circle circle = new Circle(Double.parseDouble(radius));
        System.out.println("The area is " + circle.getArea());


        System.out.println("Enter the height of your square");
        String height = in.nextLine();
        Square square = new Square(Double.parseDouble(height), Double.parseDouble(height));
        System.out.println("The area is " + square.getArea());
    }
}
