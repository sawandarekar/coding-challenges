package org.techHub.hackerEarth;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @author darekar
 */
public class HackerEarthInput {

    public static void main(String[] args) throws Exception {
        final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        final String lines = br.readLine();
        final int totalLines = Integer.parseInt(lines);
        final List<String> allLines = new ArrayList<>();
        for (int i = 0; i < totalLines; i++) {
            allLines.add(br.readLine());
        }
        System.out.println("total lines:" + totalLines + "\n");
        for (final String s : allLines) {
            System.out.println(s);
        }

        System.out.println("------------How scanner reads------------");
        readFromScanner();
    }

    private static void readFromScanner() {

        final Scanner s = new Scanner(System.in);
        System.out.println("Read String");
        System.out.println(s.next());
        System.out.println("Read Long");
        System.out.println(s.nextLong());
        s.close();
    }

}
