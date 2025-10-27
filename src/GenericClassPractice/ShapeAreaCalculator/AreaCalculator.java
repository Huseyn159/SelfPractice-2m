package GenericClassPractice.ShapeAreaCalculator;

import java.util.List;

public class AreaCalculator<T>{
    public static  double calculateTotalArea(List<?  extends Shape> areas){
      double total = 0;
      for (Shape e : areas){
          total+=e.getArea();
      }
      return total;


    }

}
