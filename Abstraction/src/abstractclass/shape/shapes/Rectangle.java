package abstractclass.shape.shapes;

public class Rectangle extends Shape{
    public Rectangle(float firstDimension, float secondDimension) {
        super(firstDimension, secondDimension);
    }

    @Override
    public void area() {
        float area = firstDimension * secondDimension;
        System.out.println("Rectangle area is: "+area);
    }
}
