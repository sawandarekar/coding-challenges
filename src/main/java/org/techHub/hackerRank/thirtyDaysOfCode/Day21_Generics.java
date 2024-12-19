package org.techHub.hackerRank.thirtyDaysOfCode;

import java.util.Arrays;
import java.util.Scanner;

/**
 *https://www.hackerrank.com/challenges/30-generics/
 */
public class Day21_Generics {

    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        Integer[] intArray = new Integer[n];
        for (int i = 0; i < n; i++) {
            intArray[i] = scanner.nextInt();
        }

        n = scanner.nextInt();
        String[] stringArray = new String[n];
        for (int i = 0; i < n; i++) {
            stringArray[i] = scanner.next();
        }

        Printer<Integer> intPrinter = new Printer<Integer>();
        Printer<String> stringPrinter = new Printer<String>();
        intPrinter.printArray( intArray  );
        stringPrinter.printArray( stringArray );
        if(Printer.class.getDeclaredMethods().length > 1){
            System.out.println("The Printer class should only have 1 method named printArray.");
        }
    }
}
class Printer<T>{
    public <T extends  Object> void printArray(T[] arr){
        Arrays.stream(arr).forEach(System.out::println);
    }
}
