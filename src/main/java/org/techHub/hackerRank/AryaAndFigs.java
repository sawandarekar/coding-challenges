package org.techHub.hackerRank;

import java.util.Scanner;

/**
 * l n k -- input
 * l first day, n days, k fruits per day
 * 1 3 2
 * 9
 * <p>
 * first day 1 -> second day 3 -> third day 5 -> 1+3+5=9
 */
public class AryaAndFigs {

    private static int getAryaFigs(int prev, int n, int k) {
        if (n == 1) {
            return prev;
        }
        return prev + getAryaFigs(prev + k, --n, k);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] lnk = sc.nextLine().split(" ");
        int l = Integer.parseInt(lnk[0]);
        int n = Integer.parseInt(lnk[1]);
        int k = Integer.parseInt(lnk[2]);

        System.out.println("Recursive:" + getAryaFigs(l, n, k));

        int prev = l;
        int total = 0;
        int i = 0;
        do {
            total += prev;
            prev += k;
            i++;
        } while (i < n);
        System.out.println("while total:" + total);

        total = 0;
        prev = l;
        for (int ij = 1; ij <= n; ij++) {
            total += prev;
            prev += k;
        }
        System.out.println("for total:" + total);
    }
}
