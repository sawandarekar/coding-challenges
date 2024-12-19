package org.techHub.leetcode.LockDown30DayChallenge;

import java.util.Arrays;
import java.util.function.IntPredicate;

/**
 * https://leetcode.com/explore/challenge/card/30-day-leetcoding-challenge/528/week-1/3289/
 */
public class Day7_CountingElements {

    public static void main(String[] args) {
        Day7_CountingElements d7 = new Day7_CountingElements();
        int[] input = {1,3,2,3,5,0};
        int output = d7.countElements(input);
        System.out.println("count:"+output);
    }

    private int countElements(int[] input) {
        IntPredicate intPredicate = i -> Arrays.stream(input).anyMatch(val -> val == i + 1);
        int count = (int)Arrays.stream(input).filter(intPredicate).count();
        return count;
    }
}
