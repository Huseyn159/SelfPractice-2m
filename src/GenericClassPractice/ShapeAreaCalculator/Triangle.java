package GenericClassPractice.ShapeAreaCalculator;

public class Triangle extends Shape{
    int base;
    int height;

    public Triangle(int base, int height) {
        this.base = base;
        this.height = height;
    }

    @Override
    public double getArea() {
       double area = 0.5 * base * height;
       return area;
    }
}
