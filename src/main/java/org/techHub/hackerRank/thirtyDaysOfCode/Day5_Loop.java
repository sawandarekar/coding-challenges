package org.techHub.hackerRank.thirtyDaysOfCode;

import java.util.Scanner;

/**
 * https://www.hackerrank.com/challenges/30-loops/
 */
public class Day5_Loop {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        for (int i = 1; i <= 10; i++) {
            System.out.println(n + " x " + i + " = " + n * i);
        }
        scanner.close();
    }
}
