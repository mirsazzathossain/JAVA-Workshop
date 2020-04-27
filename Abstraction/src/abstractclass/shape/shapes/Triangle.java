package abstractclass.shape.shapes;

public class Triangle extends Shape{
    public Triangle(float firstDimension, float secondDimension) {
        super(firstDimension, secondDimension);
    }

    @Override
    public void area() {
        double area = 0.5 * firstDimension * secondDimension;
        System.out.println("Triangle area is: "+area);
    }
}
