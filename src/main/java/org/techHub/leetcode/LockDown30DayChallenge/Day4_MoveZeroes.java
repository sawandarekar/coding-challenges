package org.techHub.leetcode.LockDown30DayChallenge;

import java.util.Arrays;

/**
 * https://leetcode.com/explore/challenge/card/30-day-leetcoding-challenge/528/week-1/3286/
 */
public class Day4_MoveZeroes {

    public static void main(String[] args) {
        Day4_MoveZeroes d1 = new Day4_MoveZeroes();
        //        int[] input = {0, 0, 1};
        int[] input = {0, 1, 0, 1, 0, 0, 3, 12};
        d1.moveZeroes(input);
    }

    public void moveZeroes(int[] nums) {
        for (int i = 0, nonZeroIndex = 0;  i < nums.length; i++) {
            if(nums[i] != 0){
                if(nonZeroIndex != i){
                    nums[nonZeroIndex] = nums[i];
                    nums[i] = 0;
                }
                nonZeroIndex++;
            }
        }
        /*
        int swap;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                for (int k = i, j = i + 1; j < nums.length; ) {
                    swap = nums[j];
                    if (swap == 0) {
                        j++;
                    } else {
                        nums[j] = nums[k];
                        nums[k] = swap;
                        j++;
                        k++;
                    }
                }
            }
        }
         */
        /*
        int lastNonZero = 0;
        for(int n: nums){
            if(n != 0){
                nums[lastNonZero] = n;
                lastNonZero ++;
            }
        }
        while (lastNonZero < nums.length){
            nums[lastNonZero] = 0;
            lastNonZero ++;
        }
         */
        /*
        int i = 0;
        while (i < nums.length) {
            if (nums[i] == 0) {
                for (int k = i, j = i + 1; j < nums.length; j++, k++) {
                    int swap = nums[j];
                    nums[j] = nums[k];
                    nums[k] = swap;
                }
            }
            i++;
        }
        */
        System.out.println(Arrays.toString(nums));
    }
}
