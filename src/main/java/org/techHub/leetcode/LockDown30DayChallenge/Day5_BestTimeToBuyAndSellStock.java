package org.techHub.leetcode.LockDown30DayChallenge;

/**
 * https://leetcode.com/explore/featured/card/30-day-leetcoding-challenge/528/week-1/3287/
 */
public class Day5_BestTimeToBuyAndSellStock {

    public static void main(String[] args) {
        Day5_BestTimeToBuyAndSellStock d5 = new Day5_BestTimeToBuyAndSellStock();
        int[] input = {7, 1, 5, 3, 6, 4};
        int maxProfit = d5.maxProfit(input);
        System.out.println("max profit:" + maxProfit);
    }
    public int maxProfit(int[] prices) {
        return helper(0, prices.length, prices, 0);
    }

    public int helper(int start, int end, int[] prices, int profit) {
        if(start == end) return profit;

        // Find the max element of sub array
        int maxIdx = start;
        for(int i=start+1; i<end; i++) {
            if(prices[i] > prices[maxIdx]) maxIdx = i;
        }

        // If the start idx is max idx we can not buy it now, so proceed to next day
        if(maxIdx == start) {
            return helper(start+1, end, prices, profit);
        }

        // Add all the profit from start day to prev day of max idx
        for(int i=start; i<maxIdx; i++) {
            profit += prices[maxIdx] - prices[i];
        }

        // Proceed to next day
        return helper(maxIdx+1, end, prices, profit);
    }


    public int maxProfit_old(int[] prices) {
        int profit = 0;
        int max = 0;

        for (int i = prices.length - 1; i >=0; i--) {
            max = Math.max(max, prices[i]);
            profit += max - prices[i];
        }

        return profit;
        /*
        int profit = 0;
        for (int i = 0; i < prices.length; i++) {
            int maxP = Integer.MIN_VALUE;
            for (int j = 0; j < prices.length; j++) {
                if(prices[j] > prices[i]){

                }
            }
        }
        return profit;
         */
    }
}
