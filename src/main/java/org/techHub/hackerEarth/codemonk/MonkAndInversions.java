package org.techHub.hackerEarth.codemonk;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 * https://www.hackerearth.com/practice/codemonk/
 */
public class MonkAndInversions {

  public static void main(String[] args) throws IOException {
    //BufferedReader
    //BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    //String name = br.readLine();                // Reading input from STDIN
    //System.out.println("Hi, " + name + ".");    // Writing output to STDOUT

    //Scanner
    Scanner s = new Scanner(System.in);
    int t = s.nextInt();
    do{
      int m = s.nextInt();
      int[][] val = new int[m][m];
      for (int i = 0; i < m; i++) {
        for (int j = 0; j < m; j++) {
          val[i][j] = s.nextInt();
        }
      }
      monkInversions(val);
      t--;
    }while(t!=0);
  }

  private static int monkInversions(int[][] val) {
    int inversions = 0;
    for (int i = 0; i < val.length; i++) {
      for (int j = i+1; j < val.length; j++) {
        System.out.print(val[i][j]+" ");
      }
      System.out.println("");
    }
    return inversions;
  }
}
