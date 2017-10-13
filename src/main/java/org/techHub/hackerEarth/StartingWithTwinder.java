package org.techHub.hackerEarth;

import java.util.Scanner;

public class StartingWithTwinder {

    public static void main(String[] args) throws Exception {
        final Scanner s = new Scanner(System.in);
        final int max = Integer.parseInt(s.nextLine());
        validate(max);
        final int numberOfPhotoes = Integer.parseInt(s.nextLine());
        validateNumberOfPhotoes(numberOfPhotoes);
        for (int i = 0; i < numberOfPhotoes; i++) {
            final String line = s.nextLine();
            validatePhotoSize(line, max);
        }
        s.close();
    }

    private static void validatePhotoSize(String nextLine, int max) {
        final String[] size = nextLine.split(" ");
        final int h = Integer.parseInt(size[0]);
        final int l = Integer.parseInt(size[1]);
        if (h < max || l < max) {
            System.out.println("UPLOAD ANOTHER");
        } else if (h >= max || l >= max) {
            if (h == l) {
                System.out.println("ACCEPTED");
            } else {
                System.out.println("CROP IT");
            }
        }
    }

    private static void validateNumberOfPhotoes(int numberOfPhotoes) throws Exception {
        if (!(1 <= numberOfPhotoes && numberOfPhotoes <= 1000)) {
            throw new Exception();
        }

    }

    private static void validate(int mhl) throws Exception {
        if (!(1 <= mhl && mhl <= 10000)) {
            throw new Exception();
        }
    }

}
