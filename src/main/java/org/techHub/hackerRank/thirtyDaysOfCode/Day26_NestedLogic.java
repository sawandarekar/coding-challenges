package org.techHub.hackerRank.thirtyDaysOfCode;

import java.util.Date;
import java.util.Scanner;

/**
 *https://www.hackerrank.com/challenges/30-nested-logic/problem
 */
public class Day26_NestedLogic {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String a = scanner.nextLine().trim();
        String e = scanner.nextLine().trim();
        String[] actual = a.split(" ");
        String[] expected = e.split(" ");
        int a_d = Integer.parseInt(actual[0]);
        int a_m = Integer.parseInt(actual[1]);
        int a_y = Integer.parseInt(actual[2]);
        int e_d = Integer.parseInt(expected[0]);
        int e_m = Integer.parseInt(expected[1]);
        int e_y = Integer.parseInt(expected[2]);
        int fine = 0;

        if (a_y > e_y) {
            fine = 10000;
        } else if (a_y >= e_y && a_m > e_m) {
            int diff = a_m - e_m;
            fine = diff * 500;
        } else if (a_y >= e_y && a_m >= e_m && a_d > e_d) {
            int diff = a_d - e_d;
            fine = diff * 15;
        }
        System.out.println(fine);
    }
}
