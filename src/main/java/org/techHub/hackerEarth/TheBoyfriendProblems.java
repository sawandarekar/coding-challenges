package org.techHub.hackerEarth;

import static java.lang.Integer.parseInt;
import static java.lang.Long.parseLong;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * INPUT First line contains T the no. of test cases Each test case contains N , no of towers Then , N spaced integers follow
 * containing the height of the towers
 *
 * @author darekar
 */
public class TheBoyfriendProblems {

    public static void main(String[] args) throws IOException {
        final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        final int numberOfTestCases = Integer.parseInt(br.readLine());
        final List<String> result = new ArrayList<>();
        for (int i = 0; i < numberOfTestCases; i++) {
            final int L = parseInt(br.readLine());
            final String l = br.readLine();
            final String[] towers = l.split(" ");
            final Long[] k = new Long[towers.length];
            int a = 0;
            for (final String m : towers) {
                k[a++] = parseLong(m);
            }
            Arrays.sort(k, Collections.reverseOrder());
            String re = "";
            for (final long correct : k) {
                re += correct + " ";
            }
            result.add(re);
        }
        for (final String string : result) {
            System.out.println(string);
        }
    }

}
