package org.techHub.hackerEarth;

import java.util.Scanner;

public class TheGreatKian {

    public static void main(String[] args) {
        final Scanner sc = new Scanner(System.in);
        final int numbCount = sc.nextInt();
        int three = 1;
        long first = 0;
        long second = 0;
        long third = 0;
        for (int i = 0; i < numbCount; i++) {
            final int val = sc.nextInt();
            switch (three) {
                case 1:
                    first += val;
                    three++;
                    break;
                case 2:
                    second += val;
                    three++;
                    break;
                case 3:
                    third += val;
                    three = 1;
                    break;
                default:
                    break;
            }
        }
        sc.close();
        System.out.println(first + " " + second + " " + third);
    }
}