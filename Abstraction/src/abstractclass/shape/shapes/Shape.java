package abstractclass.shape.shapes;

abstract class Shape {
    protected float firstDimension, secondDimension;
    Shape(){
        firstDimension = 0;
        secondDimension = 0;
    }

    Shape(float firstDimension, float secondDimension) {
        this.firstDimension = firstDimension;
        this.secondDimension = secondDimension;
    }

    abstract void area();
}
