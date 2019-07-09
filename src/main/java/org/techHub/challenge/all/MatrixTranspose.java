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
        do{
            String l = scanner.nextLine();
            String[] val = l.split(" ");
            for(int col=0; col < val.length; col++){
                matrix[line][col] = Integer.parseInt(val[col]);
            }
            line++;
        }while(line != 3);
        int[][] transpose = new int[3][3];
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                transpose[i][j] = matrix[j][i];
                System.out.print("["+i+","+j+"]:"+transpose[i][j]+" ");
            }
            System.out.print("\n");
        }
    }
}
