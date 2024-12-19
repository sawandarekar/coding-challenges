package org.techHub.hackerRank.InterviewPreparationKit;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/*
 *HackerRank Challange
 *
 *https://www.hackerrank.com/challenges/pairs/problem
 *
 */
public class PairChallenge {

    public static void main(String[] args) {
        //firstAttempt();
        secondAttempt();
    }
    private static void secondAttempt() {
        Scanner sc = new Scanner(System.in);
        long n =  sc.nextLong();
        long diff = sc.nextLong();
        List<Long> allNumb = new ArrayList<>(100);
        for(long i = 0; i<n;i++) {
            allNumb.add(sc.nextLong());
        }
        Collections.sort(allNumb);
        int count =0;
        for(int i=0,j=1;i<n&&j<n;) {
            if(allNumb.get(j)-allNumb.get(i) == diff) {
                count++;
                i++;
                j++;
            }else if(allNumb.get(j)-allNumb.get(i) < diff) {
                j++;
            }else {
                i++;
            }
        }
        System.out.println(count);
        sc.close();
    }
    public static void firstAttempt() {
        Scanner sc = new Scanner(System.in);
        long n =  sc.nextLong();
        long diff = sc.nextLong();
        List<Long> allNumb = new ArrayList<>(100);
        for(long i = 0; i<n;i++) {
            allNumb.add(sc.nextLong());
        }
        int pairCount=0;
        for (Long l : allNumb) {
            for (Long ln : allNumb) {
                if(l-ln == diff) {
                    pairCount++;
                }
            }
        }
        System.out.println(pairCount);
        sc.close();
    }
}
