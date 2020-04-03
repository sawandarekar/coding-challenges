package org.techHub.leetcode.LockDown30DayChallenge;

/**
 * https://leetcode.com/explore/featured/card/30-day-leetcoding-challenge/528/week-1/3284/
 */
public class Day2_HappyNumber {

    public static void main(String[] args) {
        Day2_HappyNumber d2 = new Day2_HappyNumber();
        boolean h = d2.isHappy(19);
        System.out.println("happy:"+h);
    }
    public boolean isHappy(int n) {
        int[] numbersArr = getNumbers(n);
        Math.pow(1,2);
        return true;
    }
    public int[] getNumbers(int numb){
        while (numb > 0) {
            int remainder = numb % 2;
            numb = numb / 2;
        }
        int[] r = {1,2};
        return r;
    }
}
