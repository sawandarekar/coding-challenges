package org.techHub.nobugsproject.challenge;

import java.util.Scanner;
import java.util.regex.Pattern;

public class TokenizerChallenge {

    public static void main(String[] args) {
        // try with resource
        try (Scanner sc = new Scanner("sawan,darekar,chandak,wai,satara+data")) {
            final Pattern p = Pattern.compile("[^\\w*]");
            sc.useDelimiter(p);
            while (sc.hasNext()) {
                System.out.println(sc.next());
            }
        }
        // catch(Exception e) {
        //
        // }
    }

}
