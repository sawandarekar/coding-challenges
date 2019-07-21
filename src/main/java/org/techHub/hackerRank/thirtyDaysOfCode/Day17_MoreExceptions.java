package org.techHub.hackerRank.thirtyDaysOfCode;

import java.util.Scanner;

public class Day17_MoreExceptions {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while (t-- > 0) {

            int n = in.nextInt();
            int p = in.nextInt();
            Calculator myCalculator = new Calculator();
            try {
                int ans = myCalculator.power(n, p);
                System.out.println(ans);
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        in.close();
    }
}

class Calculator {

    public int power(int n, int p) throws NegativeException {
        if (n < 0 || p < 0) {
            throw new NegativeException("n and p should be non-negative");
        } else {
            return (int)Math.pow(n, p);
        }
    }
}

class NegativeException extends Exception {

    NegativeException(String msg) {
        super(msg);
    }
}