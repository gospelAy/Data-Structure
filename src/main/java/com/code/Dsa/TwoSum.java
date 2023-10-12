package com.code.Dsa;

import java.util.Arrays;
import java.util.HashMap;

public class TwoSum {
    public static void main(String[] args) {
        int[] newArrays = {2, 7, 11, 15};
        System.out.println(Arrays.toString(twoSum(newArrays, 9)));
    }
    public static int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> numMap = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];

            if (numMap.containsKey(complement)) {
                return new int[]{
                        numMap.get(complement), i
                };
            }
            numMap.put(nums[i], i);
        }
        throw new IllegalArgumentException("No two sum solution");

    }
}
