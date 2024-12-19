package org.techHub.hackerEarth;

import java.math.BigInteger;
import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) throws Exception {
        final Scanner s = new Scanner(System.in);
        final int number = s.nextInt();
        if (number < 1 || number > 100) {
            throw new Exception();
        }
        s.close();
        System.out.println(facatorial(Integer.valueOf(number)));
    }

    public static BigInteger facatorial(Integer number) {
        if (number == 1) {
            return BigInteger.ONE;
        }
        return facatorial(number - 1).multiply(BigInteger.valueOf(number));
    }

}
