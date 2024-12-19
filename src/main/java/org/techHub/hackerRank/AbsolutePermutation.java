package org.techHub.hackerRank;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 * https://www.hackerrank.com/challenges/absolute-permutation/problem
 * 
 * @author darekar
 *
 */
public class AbsolutePermutation {

    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) throws IOException {
	BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("output.txt"));

	int t = scanner.nextInt();
	scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

	for (int tItr = 0; tItr < t; tItr++) {
	    String[] nk = scanner.nextLine().split(" ");

	    int n = Integer.parseInt(nk[0]);

	    int k = Integer.parseInt(nk[1]);

	    int[] result = absolutePermutation(n, k);

	    System.out.println("n:" + n + " k:" + k + " Result :" + result);
	    
	    for (int i = 0; i < result.length; i++) {
		bufferedWriter.write(String.valueOf(result[i]));

		if (i != result.length - 1) {
		    bufferedWriter.write(" ");
		}
	    }

	    bufferedWriter.newLine();
	}

	bufferedWriter.close();

	scanner.close();
    }

    static int[] absolutePermutation(int n, int k) {
	int[] input = new int[n];
	for (int i = 0; i < n; i++) {
	    input[i] = i + 1;
	}
	if (k == 0) {
	    return input;
	}

	return input;

    }
}
