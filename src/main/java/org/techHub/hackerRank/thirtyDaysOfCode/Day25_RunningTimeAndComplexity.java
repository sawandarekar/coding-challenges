package org.techHub.hackerRank.thirtyDaysOfCode;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;

/**
 *https://www.hackerrank.com/challenges/30-running-time-and-complexity/
 */
public class Day25_RunningTimeAndComplexity {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numbers = sc.nextInt();
        int[] n = new int[numbers];
        for (int i = 0; i < numbers; i++) {
            n[i] = sc.nextInt();
        }
        long startTime = System.currentTimeMillis();
        //Arrays.stream(n).forEach(System.out::println);
        for (int i = 0; i < n.length; i++) {
            int numb = n[i];
            boolean isPrime = true;
            for (int j = 2; j < numb; j++) {
                if(numb % j == 0){
                    isPrime = false;
                    System.out.println("Not prime");
                    break;
                }
            }
            if(isPrime){
                System.out.println("Prime");
            }
        }
        System.out.println("ForEach TimeTaken:"+(System.currentTimeMillis() - startTime)+" milli");
        System.out.println("----------------------");
        startTime = System.currentTimeMillis();
        for (int i = 0; i < n.length; i++) {
            int val = n[i];
            for(int j=2; j<=val/j; j++){
                if(val%j==0){
                    val=1;
                    break;
                }
            }
            System.out.println(val==1?"Not prime":"Prime");
        }
        System.out.println("ForHalf TimeTaken:"+(System.currentTimeMillis() - startTime)+" milli");
    }
}
