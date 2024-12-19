package org.techHub.challenge.google;

import java.util.Comparator;
import java.util.Iterator;
import java.util.SortedSet;
import java.util.TreeSet;
import java.util.function.Predicate;

class MaxToLowComparator implements Comparator<Integer> {

    @Override
    public int compare(Integer s1, Integer s2) {
        return s2.compareTo(s1);
    }
}

public class PassTheCodedMessageChallenge {

    public static void main(String[] args) {
        final long startTime = System.currentTimeMillis();
        // final int arr[] = {9, 8, 7, 6, 5, 4, 3, 2, 1}; //Max numb divisible by 3 : 987654321- Took 30497 mili sec
        final int arr[] = {9, 9, 9, 9, 5, 4, 3, 2};
        final int k = answer(arr);
        System.out.print("Max numb divisible by 3 : " + k);
        final long endTime = System.currentTimeMillis();
        System.out.println(" Took " + (endTime - startTime) + " mili sec");
    }

    public static int answer(int[] arr) {
        int maxNumb = 0;
        final SortedSet<Integer> sortedSet = new TreeSet<>(new MaxToLowComparator());
        final String str = convertToString(arr);
        for (int i = str.length(); i > 0; i--) {
            permutation(sortedSet, "", str, i);
            final Iterator<Integer> iterator = sortedSet.iterator();
            while (iterator.hasNext()) {
                final int n = iterator.next();
                if (isDivisibleBy(n, 3)) {
                    maxNumb = n;
                    break;
                }
            }
            System.out.println(str + "-" + i + " at a time :" + sortedSet);
            sortedSet.clear();
            if (maxNumb != 0) {
                break;
            }
        }
        return maxNumb;
    }

    public static void permutation(SortedSet<Integer> sortedSet, String permutation, String str, int length) {
        if (permutation.length() == length) {
            sortedSet.add(new Integer(permutation));
        } else {
            for (int i = 0; i < str.length(); i++) {
                final String s = str.substring(0, i) + str.substring(i + 1, str.length());
                permutation(sortedSet, permutation + str.charAt(i), s, length);
            }
        }
    }

    private static String convertToString(int[] arr) {
        final StringBuilder sb = new StringBuilder();
        for (final int element : arr) {
            sb.append(element);
        }
        return sb.toString();
    }

    private static boolean isDivisibleBy(int numb, int divisivbleBy) {
        return (numb % divisivbleBy == 0) ? true : false;
    }
}
