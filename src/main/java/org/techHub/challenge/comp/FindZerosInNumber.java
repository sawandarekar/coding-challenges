package org.techHub.challenge.comp;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FindZerosInNumber {

    public static void main(String[] args) {
        zerosCount();
    }

    private static void zerosCount() {
        final String regex = "0";
        final CharSequence input = "120230533000";
        final Pattern p = Pattern.compile(regex);
        final Matcher m = p.matcher(input);
        int count = 0;
        while (m.find()) {
            count++;
        }
        System.out.println("Zero Count:" + count);
    }

}
