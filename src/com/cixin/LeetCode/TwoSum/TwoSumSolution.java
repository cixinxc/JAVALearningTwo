package com.cixin.LeetCode.TwoSum;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by cixinxc on 2017/1/1.
 */
public class TwoSumSolution {
    public int[] twoSum(int[] numbers, int target) {
        int[] result = new int[2];
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int i = 0; i < numbers.length; i++) {
            if (map.containsKey(target - numbers[i])) {
                result[1] = i;
                result[0] = map.get(target - numbers[i]);
                return result;
            }
            map.put(numbers[i], i);
        }
        return result;
    }
    public int add(int num1, int num2) {
        return num1+num2;
    }
}
