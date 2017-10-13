package org.techHub.hackerEarth;

import java.util.Scanner;

public class FindProduct {

    public static void main(String[] args) {
        final Scanner sc = new Scanner(System.in);
        final int sizeOfArray = sc.nextInt();
        double answer = sc.nextInt();
        for (int i = 1; i < sizeOfArray; i++) {
            answer = (sc.nextInt() * answer) % ((Math.pow(10, 9)) + 7);
        }
        System.out.println(answer);
        sc.close();
    }

}