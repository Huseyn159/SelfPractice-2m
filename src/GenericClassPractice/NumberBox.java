package GenericClassPractice;

import java.util.ArrayList;
import java.util.List;

public class NumberBox <T extends Number> {
   private  List<T> numbers = new ArrayList<>();

   public  void addNumbers(T element){
       numbers.add(element);
   }
   public double getSum(){
       double sum = 0;
       for (T e : numbers){
           sum+=e.doubleValue();
       }
       return sum;
   }

}
