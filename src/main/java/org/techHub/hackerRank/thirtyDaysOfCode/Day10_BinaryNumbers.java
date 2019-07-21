package org.techHub.hackerRank.thirtyDaysOfCode;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

import javax.security.sasl.SaslClient;

/**
 * https://www.hackerrank.com/challenges/30-binary-numbers
 */
public class Day10_BinaryNumbers {

    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int numb = scanner.nextInt();

        String ones[] = Integer.toBinaryString(numb).split("0+");

        Arrays.sort(ones);
        System.out.println(ones[ones.length-1].length());

        String binary = new String();
        while (numb > 0) {
            int remainder = numb % 2;
            numb = numb / 2;
            binary = remainder + binary;
        }
        System.out.println(binary);

        long consecutiveOnes = getMaxConsecutiveOnes(binary);

        System.out.println(consecutiveOnes);
        scanner.close();
    }

    private static long getMaxConsecutiveOnes(String binary) {
        long max = 0;
        String consecutiveString = new String();
        for (int i = 0; i < binary.length(); i++) {
            char b = binary.charAt(i);
            if (b == '1'){
                consecutiveString = consecutiveString + b;
            }else{
                if(max < consecutiveString.length()){
                    max = consecutiveString.length();
                }
                consecutiveString = "";
            }
        }
        return max;
    }

    private static int getConsecutiveOnes(String binary) {
        Set<String> consecutives = new HashSet<>();
        String consecutiveString = new String();
        boolean lastZero = false;
        for (int i = 0; i < binary.length(); i++) {
            char b = binary.charAt(i);
            if ((b == '0' && !lastZero) || (b == '1' && i == binary.length()-1)) {
                if(b == '1' && i == binary.length()-1){
                    consecutiveString = consecutiveString+b;
                }
                consecutives.add(consecutiveString);
                consecutiveString = "";
                lastZero = true;
            } else if (b == '1') {
                consecutiveString = consecutiveString + b;
                lastZero = false;
            }
        }
        return consecutives.size();
    }
}