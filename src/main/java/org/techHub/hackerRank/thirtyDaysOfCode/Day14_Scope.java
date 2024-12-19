package org.techHub.hackerRank.thirtyDaysOfCode;

import java.util.Arrays;
import java.util.Scanner;

/**
 * https://www.hackerrank.com/challenges/30-scope/problem
 */
public class Day14_Scope {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        sc.close();

        Difference difference = new Difference(a);

        difference.computeDifference();

        System.out.print(difference.maximumDifference);
    }
}
class Difference {
    private int[] elements;
    public int maximumDifference;

    Difference(int[] e){
        this.elements = e;
    }

    public void computeDifference(){
        Arrays.sort(elements);
        maximumDifference = elements[elements.length-1]-elements[0];
    }

}
