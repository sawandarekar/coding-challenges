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
        int profit = 0;
        for (int i = 0; i < prices.length; i++) {
            int maxP = Integer.MIN_VALUE;
            for (int j = 0; j < prices.length; j++) {
                if(prices[j] > prices[i]){

                }
            }
        }
        return profit;
    }
}
