package org.techHub.hackerEarth;

import java.util.Arrays;
import java.util.Scanner;

public class RotateBy13Places {

    final static char[] charArrayfirst = new char[13];
    final static char[] charArraysecond = new char[13];
    final static int[] charOccurences = new int[26];

    public static void main(final String[] args) {
        final Scanner sc = new Scanner(System.in);
        final int testCases = sc.nextInt();
        for (int i = 0; i < testCases; i++) {
            final String s = sc.next();
            int index = 0;
            for (char c = 'a'; c <= 'z'; c++) {
                if (index++ < 13) {
                    charArrayfirst[index] = c;
                } else {
                    charArraysecond[index] = c;
                }
            }
            final char[] str = s.toCharArray();
            final StringBuilder sb = new StringBuilder();
            int position, positionFirst, positionSecond;
            for (final char element : str) {
                positionFirst = Arrays.binarySearch(charArrayfirst, element);
                positionSecond = Arrays.binarySearch(charArraysecond, element);
                if (positionFirst >= 0) {
                    position = positionFirst;
                    getPosition(position);
                    sb.append(getROT13(charArraysecond));
                } else if (positionSecond >= 0) {
                    position = positionSecond;
                    getPosition(position + 13);
                    sb.append(getROT13(charArrayfirst));
                }

            }
            System.out.println(sb);
        }
        sc.close();
    }

    private static String getROT13(final char[] chararrayfirst2) {
        return null;
    }

    private static void getPosition(int position) {
        int repeat = charOccurences[position];
        position = position + 13;
        if (repeat > 1) {
            position += repeat;
            if (position > 26) {
                position = position - 26;
            }
        }
        charOccurences[position] = repeat++;

    }

}
