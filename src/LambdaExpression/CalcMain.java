package LambdaExpression;

public class CalcMain {
    public static void main(String[] args) {


        Calculator add = Integer::sum;
        Calculator minus = (a,b) -> a-b;
        Calculator dup = (a,b) -> a*b;
        Calculator div = (a,b) ->{
            if (b==0) return 0;

            return a/b;
        } ;

        System.out.println(add.calculate(5, 2));
        System.out.println(minus.calculate(9, 5));
        System.out.println(dup.calculate(5, 6));
        System.out.println(div.calculate(5, 0));
        System.out.println(div.calculate(4, 2));

    }






}
