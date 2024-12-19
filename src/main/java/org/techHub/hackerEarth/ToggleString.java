package org.techHub.hackerEarth;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ToggleString {

    public static void main(String[] args) throws Exception {
        final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        final String s = br.readLine();
        final char[] ssd = s.toCharArray();
        final StringBuilder sb = new StringBuilder(s.length());
        for (final char h : ssd) {
            if (Character.isUpperCase(h)) {
                sb.append(Character.toLowerCase(h));
            } else if (Character.isLowerCase(h)) {
                sb.append(Character.toUpperCase(h));
            }
        }
        System.out.println(sb);
    }

}
