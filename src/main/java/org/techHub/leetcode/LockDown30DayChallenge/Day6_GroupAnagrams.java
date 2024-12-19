package org.techHub.leetcode.LockDown30DayChallenge;

import java.util.List;
import java.util.Map;

/**
 * https://leetcode.com/explore/challenge/card/30-day-leetcoding-challenge/528/week-1/3288/
 */
public class Day6_GroupAnagrams {

    public static void main(String[] args) {
        Day6_GroupAnagrams d6 = new Day6_GroupAnagrams();
        String[] input = {"eat", "tea", "tan", "ate", "nat", "bat"};
        List<List<String>> output = d6.groupAnagrams(input);
        System.out.println(output);
    }

    public List<List<String>> groupAnagrams(String[] input) {
        Map<Integer, List<String>> lengthMap = getLengthMap(input);
        lengthMap.forEach((k,v) ->{

        });
        return null;
    }

    private Map<Integer, List<String>> getLengthMap(String[] input) {
        return null;
    }
}
