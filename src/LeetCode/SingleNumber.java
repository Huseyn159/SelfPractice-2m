package LeetCode;

import java.util.HashSet;
import java.util.Set;

public class SingleNumber {
    public int singleNumber(int[] nums) {
        Set<Integer> s = new HashSet<>();
        for (int num : nums){
;
            if (!s.add(num)) s.remove(num);
        }

     return s.iterator().next();
    }

}
