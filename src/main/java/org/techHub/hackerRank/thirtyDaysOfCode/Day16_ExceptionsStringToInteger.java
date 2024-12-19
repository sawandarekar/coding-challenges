package org.techHub.hackerRank.thirtyDaysOfCode;

import java.util.Scanner;

/**
 * https://www.hackerrank.com/challenges/30-exceptions-string-to-integer/
 */
public class Day16_ExceptionsStringToInteger {

    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        String l = scanner.nextLine();
        try{
            long i = Long.parseLong(l);
            System.out.println(i);
        }catch(NumberFormatException e){
            System.out.println("Bad String");
        }
        scanner.close();
    }
}
