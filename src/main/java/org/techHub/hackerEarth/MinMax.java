package org.techHub.hackerEarth;

import java.util.Scanner;

/**
 * https://www.hackerearth.com/practice/basic-programming/implementation/basics-of-implementation/practice-problems/algorithm/min-max-3/
 *
 * @author darekar
 */

public class MinMax {

    public static void main(String[] args) {
        final Scanner sc = new Scanner(System.in);
        final int number = sc.nextInt();
        int i = 0;
        final int[] array = new int[number];
        String result = "YES";
        int first = 0;
        int last = 0;
        while (i < number) {
            array[i] = sc.nextInt();
            if (i == 0) {
                first = array[0];
            } else if (i == number - 1) {
                last = array[number - 1];
            }
            i++;
        }
        for (int j = 1; j < array.length; j++) {
            if (first > array[j] && array[j] > last) {
                result = "NO";
                break;
            }
        }
        System.out.println(result);
    }

}
