package org.techHub.challenge.comp;

import java.util.ArrayList;
import java.util.List;

public class FormattedString {

    public static void main(String[] args) {
        printFormatted(5);
    }

    public static void printFormatted(int n) {
        final List<String> list = new ArrayList<String>();
        int count = 1;
        for (int i = 0; i < n; i++) {
            String line = "";
            for (int j = 0; j < n; j++) {
                line += count++;
                if (j != n - 1) {
                    line += "*";
                }
            }
            System.out.println(line);
            list.add(line);
        }
        System.out.println("-----------------output------------");

        for (int l = 1; l <= list.size(); l++) {
            if (l % 2 != 0) {
                System.out.println(list.get(l - 1));
            }
        }
        for (int k = list.size() - 1; k >= 1; k--) {
            if (k % 2 == 0) {
                System.out.println(list.get(k - 1));
            }
        }
    }

}
