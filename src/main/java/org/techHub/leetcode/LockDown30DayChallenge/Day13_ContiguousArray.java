package org.techHub.leetcode.LockDown30DayChallenge;

import java.util.ArrayList;
import java.util.List;

/**
 * https://leetcode.com/explore/challenge/card/30-day-leetcoding-challenge/529/week-2/3298/
 */
public class Day13_ContiguousArray {

    public static void main(String[] args) {
        //Max:6 timetaken:632100 millis
        long start = System.currentTimeMillis();
        Day13_ContiguousArray d13 = new Day13_ContiguousArray();
        int[] nums = {0,0,1,0,0,0,1,1};
        int max = d13.findMaxLength(nums);
        System.out.println(String.format("Max:%d timetaken:%d millis",max,(System.currentTimeMillis()-start)));
    }
    public int findMaxLength(int[] nums) {
        int max = 0;

        for (int i = 0; i < nums.length-1; i++) {
            int z = 0;
            int o = 0;
            int sub = 0;
            if(nums[i] == 0) z++;
            else o++;
            sub++;
            for (int j = i+1; j < nums.length; j++) {
                if(nums[j] == 0) z++;
                else o++;
                sub++;
                if(max < sub && z == o){
                    max = sub;
                }
            }
        }
        return max;
    }

    private boolean isContiguousArray(List<Integer> subArr) {
        System.out.println("subArr:"+subArr);
        long zeroes = subArr.stream().filter(z -> z ==0).count();
        long ones = subArr.stream().filter(o -> o == 1).count();
        return ones == zeroes;
    }
}
