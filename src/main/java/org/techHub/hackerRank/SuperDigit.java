package org.techHub.hackerRank;

import java.util.Scanner;

/*
 * super_digit(9875) = super_digit(9+8+7+5)
                  = super_digit(29)
                  = super_digit(2+9)
                  = super_digit(11)
                  = super_digit(1+1)
                  = super_digit(2)
                  = 2.
    super_digit(P) = super_digit(148148148)
               = super_digit(1+4+8+1+4+8+1+4+8)
               = super_digit(39)
               = super_digit(3+9)
               = super_digit(12)
               = super_digit(1+2)
               = super_digit(3)
               = 3.
 */
public class SuperDigit {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int repetation = sc.nextInt();
        String s = ""+number;
        for (int i = 0; i < repetation-1; i++) {
            s+=number;
        }
        System.out.println(getSuperDigit(Long.parseLong(s)));
    }

    public static long getSuperDigit(long numb) {
        long sum=0L;
        if(numb < 10) {
            return numb;
        }
        while(numb > 0) {
            sum+=(numb%10);
            numb = numb/10;
        }
        return getSuperDigit(sum);
    }

}
