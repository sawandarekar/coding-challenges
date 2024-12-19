package org.techHub.leetcode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * https://leetcode.com/problems/two-sum/
 *
 */
public class TwoSum {

    public static void main(String[] args) {
        int[] numbs = {2, 7, 11, 15};
        int target = 9;
        int[] r = twoSum(numbs, target);
        System.out.println("r:" + Arrays.toString(r));
    }

    /**
     *  Runtime: 22 ms, faster than 24.20% of Java online submissions for Two Sum.
     *  Memory Usage: 36.6 MB, less than 99.48% of Java online submissions for Two Sum.
     */
    public static int[] twoSum(int[] nums, int target) {

        for (int i = 0; i < nums.length-1; i++) {
            for (int j = i+1; j < nums.length; j++) {
                if(nums[i]+nums[j] == target){
                    int[] sumIndices = {i,j};
                    return sumIndices;
                }
            }
        }
        throw new IllegalArgumentException("No two sum solution");
    }

    /**
     * Runtime: 2 ms, faster than 98.97% of Java online submissions for Two Sum.
     * Memory Usage: 38.3 MB, less than 87.53% of Java online submissions for Two Sum.
     */
    public static int[] twoSumSecondApproch(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if(map.containsKey(complement)){
                return new int[]{map.get(complement), i};
            }
            map.put(nums[i],i);
        }
        throw new IllegalArgumentException("No two sum solution");
    }
}
