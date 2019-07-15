package org.techHub.challenge.all;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 * transpose 3*3 matrix
 */
public class MatrixTranspose {

    public static void main(String[] args) {
        int[][] matrix = new int[3][3];
        Scanner scanner = new Scanner(System.in);
        int line = 0;
        do {
            String l = scanner.nextLine();
            String[] val = l.split(" ");
            for (int col = 0; col < val.length; col++) {
                matrix[line][col] = Integer.parseInt(val[col]);
            }
            line++;
        } while (line != 3);
        transposeNewArray(matrix);
        transposeWithSwap(matrix);
    }

    private static void transposeNewArray(int[][] matrix) {
        System.out.println("Transpose New Array");

        int[][] transpose = new int[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                transpose[i][j] = matrix[j][i];
                System.out.print(transpose[i][j]+" ");
            }
            System.out.print("\n");
        }
    }

    private static void transposeWithSwap(int[][] matrix) {
        System.out.println("Transpose With Swap");
        for (int i = 0; i < 3; i++) {
            for (int j = i+1; j < 3; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matrix[i][j]+" ");
            }
            System.out.print("\n");
        }
    }
}
