package LeetCode;

import java.util.*;

class Intersection {
    public int[] intersection(int[] nums1, int[] nums2) {

        Set<Integer> set1 = new HashSet<>();
        List<Integer> result = new ArrayList<>();

        for(int a : nums1){
            set1.add(a);
        }

        for (int a : nums2){
            if (set1.contains(a) && !result.contains(a)){
                result.add(a);
            }

        }

        int[] arr = new  int[result.size()];
        int i = 0;
        for (int num : result){
            arr[i++] = num;
        }
        return arr;





    }

}