package org.techHub.hackerRank.thirtyDaysOfCode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * https://www.hackerrank.com/challenges/30-regex-patterns/
 */
public class Day28_RegexPatterns {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int N = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        String gmailPattern = "^.*(@gmail.com){1}$";
        Pattern pattern = Pattern.compile(gmailPattern);
        List<String> gmailUsers = new ArrayList<>();
        for (int NItr = 0; NItr < N; NItr++) {
            String[] firstNameEmailID = scanner.nextLine().split(" ");
            String firstName = firstNameEmailID[0];
            String emailID = firstNameEmailID[1];
            Matcher m = pattern.matcher(emailID);
            if (m.matches()) {
                //System.out.println("email matched:"+m.group());
                gmailUsers.add(firstName);
            }
        }
        Collections.sort(gmailUsers);
        gmailUsers.stream().forEach(System.out::println);

        scanner.close();
    }
}
