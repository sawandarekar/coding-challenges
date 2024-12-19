package org.techHub.hackerRank;

import java.util.Scanner;
import static java.lang.Math.max;

public class TooChaoticChallenge {

	static void minimumBribes(int[] q) {
        int ans = 0;
        for (int i = q.length - 1; i >= 0; i--)
        {
            if (q[i] - (i + 1) > 2) {
                System.out.println("Too chaotic");
                return;
            }
            for (int j = max(0, q[i] - 2); j < i; j++)
                if (q[j] > q[i]) ans++;
        }
        System.out.println( ans);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++){
            int n = in.nextInt();
            int[] q = new int[n];
            for(int q_i = 0; q_i < n; q_i++){
                q[q_i] = in.nextInt();
            }
            minimumBribes(q);
        }
        in.close();
    }
}
