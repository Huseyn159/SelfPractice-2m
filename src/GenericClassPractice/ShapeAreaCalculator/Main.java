package GenericClassPractice.ShapeAreaCalculator;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(10);

        Rectangle rec = new Rectangle(4,9);

        Triangle triangle = new Triangle(3,12);

        List<Shape> areas = new ArrayList<>();

        areas.add(circle);
        areas.add(rec);
        areas.add(triangle);

        System.out.println(AreaCalculator.calculateTotalArea(areas));





    }
}
