package org.techHub.hackerEarth;

import java.util.Scanner;

public class LifeUniverseEverything {

    public static void main(String[] args) {
        final Scanner s = new Scanner(System.in);
        int N = 0;
        while (true) {
            N = s.nextInt();
            if (N == 42) {
                break;
            }
            System.out.println(N);
        }
        s.close();
    }

}
