package org.techHub.challenge.hackerEarth.codemonk;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class BasicInputOutput {

    public static void main(String[] args) {
        /*
        //BufferedReader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String name = br.readLine();                // Reading input from STDIN
        System.out.println("Hi, " + name + ".");    // Writing output to STDOUT

        //Scanner
        Scanner s = new Scanner(System.in);
        String name = s.nextLine();                 // Reading input from STDIN
        System.out.println("Hi, " + name + ".");    // Writing output to STDOUT

        */

        // Write your code here

        Scanner sc = new Scanner(System.in);
        int first = sc.nextInt();
        String second = sc.next();
        System.out.println(first*2);
        System.out.println(second);
    }
}
