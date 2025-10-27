package GenericClassPractice.ShapeAreaCalculator;

public class Rectangle extends Shape {

    int length;
    int width;

    public Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public double getArea() {
        double area = length*width;
        return area;
    }
}
