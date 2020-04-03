package org.techHub.leetcode.LockDown30DayChallenge;

/**
 * https://leetcode.com/explore/featured/card/30-day-leetcoding-challenge/528/week-1/3285/
 */
public class Day3_MaximumSubarray {

    public static void main(String[] args) {
        Day3_MaximumSubarray d1 = new Day3_MaximumSubarray();
        int[] input = {-2,1,-3,4,-1,2,1,-5,4};
//        int[] input = {-5, 4};
        int maxSubArray = d1.maxSubArray(input);
        System.out.println("MaxSubArray:"+maxSubArray);
    }
    public int maxSubArray(int[] nums) {
        int largestSum = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            int subArraySum = nums[i];
            if(largestSum < subArraySum){
                largestSum = subArraySum;
            }
            for (int j = i+1; j < nums.length; j++) {
                subArraySum += nums[j];
                if(largestSum < subArraySum){
                    largestSum = subArraySum;
                }
            }
        }
        return largestSum;
    }
}
