package org.techHub.challenge.google;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * answer(21)->9,1,1,1
 *
 * @author darekar
 */
public class SolarDoomsdayChallenge {

    public static void main(String[] args) {
        final int[] a = answer(999999999);
        System.out.println("Result:" + Arrays.toString(a));
    }

    public static int[] answer(int area) {
        final List<Integer> ls = new ArrayList<>();
        int remaimingArea = area;
        do {
            final double d = Math.sqrt(area);
            if (d % 1 == 0) {
                final int dd = (int)Math.pow(d, 2);
                remaimingArea = remaimingArea - dd;
                ls.add(dd);
                area = remaimingArea;
            } else {
                area--;
            }
        } while (remaimingArea != 0);
        Collections.sort(ls, Collections.reverseOrder());
        final int[] arr = new int[ls.size()];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = ls.get(i);
        }
        return arr;
    }
}
