package runtime.shape.driver;

import runtime.shape.shapes.Circle;
import runtime.shape.shapes.Shape;
import runtime.shape.shapes.Triangle;

public class Main {
    public static void main(String[] args) {
        Shape shape = new Shape();
        shape.display();

        Shape circle = new Circle();
        circle.display();

        Shape triangle = new Triangle();
        triangle.display();
    }
}
