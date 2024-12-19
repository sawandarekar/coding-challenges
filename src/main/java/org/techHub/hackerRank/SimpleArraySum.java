package org.techHub.hackerRank;

import java.util.Scanner;

public class SimpleArraySum {

	static int simpleArraySum(final int n, final int[] ar) {
        int sum = 0;
        for(int i=0;i<n;i++){
            sum += ar[i];
        }
        return sum;
    }

    public static void main(final String[] args) {
        final Scanner in = new Scanner(System.in);
        final int n = in.nextInt();
        final int[] ar = new int[n];
        for(int ar_i = 0; ar_i < n; ar_i++){
            ar[ar_i] = in.nextInt();
        }
        final int result = simpleArraySum(n, ar);
        System.out.println(result);
    }
}
