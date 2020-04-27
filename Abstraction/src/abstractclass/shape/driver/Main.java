package abstractclass.shape.driver;

import abstractclass.shape.shapes.Circle;
import abstractclass.shape.shapes.Rectangle;
import abstractclass.shape.shapes.Triangle;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter circle radius: ");
        float radius = scanner.nextFloat();
        Circle circle = new Circle(radius);
        circle.area();

        System.out.print("Enter triangle base: ");
        float base = scanner.nextFloat();
        System.out.print("Enter triangle height: ");
        float height = scanner.nextFloat();
        Triangle triangle = new Triangle(base, height);
        triangle.area();

        System.out.print("Enter rectangle length: ");
        float length = scanner.nextFloat();
        System.out.print("Enter rectangle breadth: ");
        float breadth = scanner.nextFloat();
        Rectangle rectangle = new Rectangle(length, breadth);
        rectangle.area();
    }
}
