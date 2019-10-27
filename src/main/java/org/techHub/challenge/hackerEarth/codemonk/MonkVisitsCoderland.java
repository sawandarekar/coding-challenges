package org.techHub.challenge.hackerEarth.codemonk;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;

/**
 * https://www.hackerearth.com/practice/algorithms/searching/ternary-search/practice-problems/algorithm/monk-visits-coderland-4/description/
 */
public class MonkVisitsCoderland {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testCases = sc.nextInt();
        int[] results = new int[testCases];
        do{
            int checkPointsNumb = sc.nextInt();
            int[] price = new int[checkPointsNumb];
            int[] nextPoint = new int[checkPointsNumb];
            IntStream.range(0, checkPointsNumb).forEach(i->price[i] = sc.nextInt());
            IntStream.range(0, checkPointsNumb).forEach(i->nextPoint[i] = sc.nextInt());
            System.out.println(Arrays.toString(price));
            System.out.println(Arrays.toString(nextPoint));
            testCases--;
        }while (testCases != 0);
    }
}
