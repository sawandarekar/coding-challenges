package org.techHub.leetcode.LockDown30DayChallenge;

/**
 * https://leetcode.com/explore/featured/card/30-day-leetcoding-challenge/528/week-1/3283/
 */
public class Day1_SingleNumber {

    public static void main(String[] args) {
        Day1_SingleNumber d1 = new Day1_SingleNumber();
        int[] input = {1,2,1,2,3};
        int single = d1.singleNumber(input);
        System.out.println("single number: "+ single);
    }
    public int singleNumber(int[] nums) {
        int singleNum = 0;
        for (int i = 0; i < nums.length; i++) {
            boolean isSingle = true;
            for (int j = 0; j < nums.length; j++) {
                if(i != j && nums[i] == nums[j]){
                    isSingle = false;
                }
            }
            if(isSingle){
                singleNum = nums[i];
                break;
            }
        }
        return singleNum;
    }
}
