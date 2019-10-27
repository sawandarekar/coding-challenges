package org.techHub.hackerEarth;

import java.io.IOException;
import java.util.Scanner;

/**
 * https://www.hackerrank.com/challenges/cut-the-tree/problem
 */

public class CutTheTree {
    static int solve(int[] data, int[][] edges) {
	int minDiff = 0;
	for (int element : data) {
	    int first = getCutTree(element, data, edges);
	    int second = getCutTree(element, data, edges);
	    if (minDiff > 0) {
		
	    }
	}
	return minDiff;
    }

    private static int getCutTree(int element, int[] data, int[][] edges) {

	return 0;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
	// BufferedWriter bufferedWriter = new BufferedWriter(new
	// FileWriter(System.getenv("OUTPUT_PATH")));

	int n = scanner.nextInt();
	scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

	int[] data = new int[n];

	String[] dataItems = scanner.nextLine().split(" ");
	scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

	for (int i = 0; i < n; i++) {
	    int dataItem = Integer.parseInt(dataItems[i]);
	    data[i] = dataItem;
	}

	int[][] edges = new int[n - 1][2];

	for (int i = 0; i < n - 1; i++) {
	    String[] edgesRowItems = scanner.nextLine().split(" ");
	    scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

	    for (int j = 0; j < 2; j++) {
		int edgesItem = Integer.parseInt(edgesRowItems[j]);
		edges[i][j] = edgesItem;
	    }
	}

	int result = solve(data, edges);

	System.out.println("Minimal Diffrence : " + result);

	// bufferedWriter.write(String.valueOf(result));
	// bufferedWriter.newLine();
	//
	// bufferedWriter.close();

	scanner.close();
    }
}
