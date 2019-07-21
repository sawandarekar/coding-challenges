package org.techHub.hackerRank.thirtyDaysOfCode;

import java.util.Scanner;

/**
 * https://www.hackerrank.com/challenges/30-class-vs-instance/
 */
public class Day4_ClassVsInstance_Person {

    private int age;

    public Day4_ClassVsInstance_Person(int initialAge) {
        if (initialAge < 0) {
            initialAge = 0;
            System.out.println("Age is not valid, setting age to 0.");
        }
        this.age = initialAge;
    }

    public void amIOld() {
        String oldMessage = "You are old.";
        if (age < 13) {
            oldMessage = "You are young.";
        }
        if (age >= 13 && age < 18) {
            oldMessage = "You are a teenager.";
        }
        System.out.println(oldMessage);
    }

    public void yearPasses() {
        this.age++;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 0; i < T; i++) {
            int age = sc.nextInt();
            Day4_ClassVsInstance_Person p = new Day4_ClassVsInstance_Person(age);
            p.amIOld();
            for (int j = 0; j < 3; j++) {
                p.yearPasses();
            }
            p.amIOld();
            System.out.println();
        }
        sc.close();
    }
}
