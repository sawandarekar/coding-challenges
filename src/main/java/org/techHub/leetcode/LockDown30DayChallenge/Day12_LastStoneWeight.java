package org.techHub.leetcode.LockDown30DayChallenge;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * https://leetcode.com/explore/challenge/card/30-day-leetcoding-challenge/529/week-2/3297/
 */
public class Day12_LastStoneWeight {

    public static void main(String[] args) {
        Day12_LastStoneWeight d12 = new Day12_LastStoneWeight();
        int[] stoneWeights = {2,7,4,1,8,1};
        int lstStoneWeight = d12.lastStoneWeight(stoneWeights);
        System.out.println("last Stone weight:"+lstStoneWeight);

    }
    public int lastStoneWeight(int[] stones) {
        if(stones.length == 0){
            return 0;
        }
        else if(stones.length == 1){
            return stones[0];
        }else{
            int last = Integer.MIN_VALUE;
            int lastIndex = -1;
            int secondLast = Integer.MIN_VALUE;
            int secondLastIndex = -1;
            for (int i = 0; i < stones.length; i++) {
                if(stones[i] > last){
                    last = stones[i];
                    lastIndex = i;
                }
            }
            for (int i = 0; i < stones.length; i++) {
                if(stones[i] > secondLast && lastIndex != i){
                    secondLast = stones[i];
                    secondLastIndex = i;
                }
            }
            int smashWeight = last - secondLast;
            int[] l= new int[smashWeight==0? stones.length-2:stones.length-1];
            int j=0;
            for (int i = 0; i < stones.length; i++) {
                if(i != lastIndex && i != secondLastIndex){
                    l[j] = stones[i];
                    j++;
                }
            }
            if(smashWeight != 0){
                l[j] = smashWeight;
            }
            return lastStoneWeight(l);
        }
    }
}
