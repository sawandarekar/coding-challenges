package org.techHub.hackerRank.thirtyDaysOfCode;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 */
public class Day25_RunningTimeAndComplexity {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numbers = sc.nextInt();
        int[] n = new int[numbers];
        for (int i = 0; i < numbers; i++) {
            n[i] = sc.nextInt();
        }
        Arrays.stream(n).forEach(System.out::println);
    }
}
