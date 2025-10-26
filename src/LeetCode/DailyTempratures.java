package LeetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Stack;

public class DailyTempratures {
    public int[] dailyTemperatures(int[] temperatures) {
        Stack<Integer> days = new Stack<>();
        int[] result = new int[temperatures.length];
        for (int i = 0; i < temperatures.length; i++) {
            while (!days.isEmpty() && temperatures[i] > temperatures[days.peek()]) {
                int prevDay = days.pop();
                result[prevDay] = i - prevDay;
            }
            days.push(i);
        }
        return result;

    }
}
