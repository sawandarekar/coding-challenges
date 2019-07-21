package org.techHub.hackerRank.thirtyDaysOfCode;

import java.util.Scanner;
import java.util.stream.IntStream;

public class Day19_Interfaces {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        scan.close();

        AdvancedArithmetic myCalculator = new CalculatorNew();
        int sum = myCalculator.divisorSum(n);
        System.out.println("I implemented: " + myCalculator.getClass().getInterfaces()[0].getName() );
        System.out.println(sum);
    }
}

interface AdvancedArithmetic{
    int divisorSum(int n);
}
class CalculatorNew implements  AdvancedArithmetic{
    @Override
    public int divisorSum(int n){
        return IntStream.range(1, n+1).filter(i -> n % i == 0).sum();
    }
}