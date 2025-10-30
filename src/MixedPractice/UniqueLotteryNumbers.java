package MixedPractice;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class UniqueLotteryNumbers {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();
        Random rnd = new Random(49);

      while(set.size() < 6) {
            set.add(rnd.nextInt(49)+1);
        }

        System.out.println("🎰 Your lottery numbers:");
        for (Integer a : set) {
            System.out.print(a + " ");
        }
    }
}
