package org.techHub.hackerRank.thirtyDaysOfCode;

import java.util.Scanner;

/**
 * https://www.hackerrank.com/challenges/30-review-loop
 */
public class Day6_LetsReview {

    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int testCasesCount = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        String[] lines = new String[testCasesCount];
        int i = 0;
        do {
            String line = scanner.nextLine();
            lines[i] = line;
            testCasesCount--;
            i++;
        } while (testCasesCount != 0);
        for (i = 0; i < lines.length; i++) {
            splitLineEvenOdd(lines[i]);
        }
        scanner.close();
    }

    private static void splitLineEvenOdd(String line) {
        StringBuilder evenIndexed = new StringBuilder();
        StringBuilder oddIndexed = new StringBuilder();
        for (int i = 0; i < line.length(); i++) {
            if (i % 2 == 0) {
                evenIndexed.append(line.charAt(i));
            } else {
                oddIndexed.append(line.charAt(i));
            }
        }
        System.out.println(evenIndexed + " " + oddIndexed);
    }
}
