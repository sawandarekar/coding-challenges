package org.techHub.hackerEarth;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class PallindromeString {

    public static void main(String[] args) throws Exception {
        final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        final String line = br.readLine();
        if (palindrome(line.toCharArray())) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }

    /*
     * score : 25
     */
    private static boolean palindrome(char[] line) {
        int s = 0;
        int e = line.length - 1;
        while (s < e) {
            if (line[s++] != line[e--]) {
                return false;
            }
        }
        return true;

    }

    /*
     * score : 25
     */
    private static boolean palindrome(String line) {
        int start = 0;
        int end = line.length() - 1;
        while (start < end) {
            if (line.charAt(start++) != line.charAt(end--)) {
                return false;
            }
        }
        return true;
    }

}
