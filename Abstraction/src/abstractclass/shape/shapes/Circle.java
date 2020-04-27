package abstractclass.shape.shapes;

public class Circle extends Shape{
    public Circle(float firstDimension) {
        super(firstDimension, 0.0f);
    }

    @Override
    public void area() {
        double area = Math.PI * firstDimension * firstDimension;
        System.out.println("Circle area is: "+area);
    }
}
