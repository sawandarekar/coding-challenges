/**
 *
 */
package org.techHub.hackerRank;

import java.util.Scanner;

/**
 * The purpose of this challenge is to familiarize you with reading input from stdin (the standard input stream) and
 * writing output to stdout (the standard output stream) using our environment
 *
 * @author darekar
 *
 */
public class SolveMeFirst {

	private static int solveMeFirst(final int a, final int b) {
		return a+b;
	}

	/**
	 * @param args
	 */
	public static void main(final String[] args) {
		final Scanner sc = new Scanner(System.in);
		final int a = sc.nextInt();
		final int b= sc.nextInt();
		System.out.println("Addition : "+solveMeFirst(a, b));
		sc.close();

	}

}
