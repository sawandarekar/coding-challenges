package org.techHub.challenge.google.kickStart2020;

import java.util.Scanner;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Round_A_2020 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numbOfTestCases = sc.nextInt();
        System.out.printf("numbOfTestCases:%d",numbOfTestCases);
        IntStream.range(0,numbOfTestCases).forEach(System.out::println);
        for(int i=0; i< numbOfTestCases; i++){
            int houses = sc.nextInt();
            int budget = sc.nextInt();

        }
    }
}
