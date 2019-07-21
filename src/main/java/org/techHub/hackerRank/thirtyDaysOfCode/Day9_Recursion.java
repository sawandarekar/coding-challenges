package org.techHub.hackerRank.thirtyDaysOfCode;

import java.util.Scanner;

public class Day9_Recursion {

    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int numb = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        long result = factorial(numb);
        System.out.println(result);
        scanner.close();
    }

    private static long factorial(int numb) {
        if(numb == 0)
            return 1;
        return numb * factorial(numb-1);
    }
}
