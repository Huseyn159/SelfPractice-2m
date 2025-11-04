package LeetCode;

import java.util.HashSet;
import java.util.Set;

public class HappyNumber {
    public boolean isHappy(int n) {
        Set<Integer> happy = new HashSet<>();

        while(n!= 1 && happy.contains(n)){
            happy.add(n);
            n = sumOfSquares(n);
        }
       return n==1;


    }
    private int sumOfSquares(int n) {
        int sum = 0;
        while (n > 0) {
            int digit = n % 10;
            sum += digit * digit;
            n /= 10;
        }
        return sum;
    }
}
