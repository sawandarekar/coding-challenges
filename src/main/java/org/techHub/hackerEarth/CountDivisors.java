package org.techHub.hackerEarth;

import java.util.Scanner;

public class CountDivisors {

    // Input #1 0.100635 64 25
    // Input #2 0.101088 64 25
    // Input #3 0.100546 64 25
    // Input #4 0.100547 64 25

    // public static void main(String[] args) throws Exception {
    // final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    // final String[] s = br.readLine().split(" ");
    // final List<Integer> lrk = new ArrayList<>();
    // for (final String st : s) {
    // lrk.add(new Integer(st));
    // }
    // int count = 0;
    // for (int i = lrk.get(0); i <= lrk.get(1); i++) {
    // if (i % lrk.get(2) == 0) {
    // count++;
    // }
    // }
    // System.out.println(count);
    //
    // }

    public static void main(final String[] args) throws Exception {
        final Scanner sc = new Scanner(System.in);
        final int l = sc.nextInt();
        final int r = sc.nextInt();
        final int k = sc.nextInt();
        int count = 0;
        for (int i = l; i <= r; i++) {
            if (i % k == 0) {
                count++;
            }
        }
        System.out.println(count);
        sc.close();
    }

}
