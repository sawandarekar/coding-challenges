package org.techHub.leetcode;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;

/*
https://leetcode.com/explore/challenge/card/march-leetcoding-challenge-2021/591/week-4-march-22nd-march-28th/3681/
*/

public class VowelSpellChecker {

  public String[] spellchecker(String[] wordlist, String[] queries) {
    List<String> checked = new ArrayList<>();

    String[] removedVowels =
        Arrays.stream(wordlist).map(s -> s.replaceAll("(a|e|i|o|u|A|E|I|O|U)", "_")).toArray(String[]::new);
    for (int i = 0; i < queries.length; i++) {
      String check = "";
      String q = queries[i];

      int l = exactMatch(q, wordlist, false);
      if (l != -1) {
        check = wordlist[l];
      } else {
        int j = exactMatch(q, wordlist, true);
        if (j != -1) {
          check = wordlist[j];
        } else {
          int k = exactMatch(q.replaceAll("(a|e|i|o|u|A|E|I|O|U)", "_"), removedVowels, true);
          if (k != -1) {
            check = wordlist[k];
          }
        }
      }
      checked.add(check);
    }
    System.out.println("wordlist:" + Arrays.toString(wordlist));
    System.out.println("queries:" + Arrays.toString(queries));
    System.out.println("checked:" + checked);

    return checked.stream().toArray(String[]::new);
  }

  private int exactMatch(String q, String[] wordlist, boolean ignoreCase) {
    int j = -1;
    for (int i = 0; i < wordlist.length; i++) {
      if (ignoreCase && q.equalsIgnoreCase(wordlist[i])) {
        j = i;
        break;
      } else if (q.equals(wordlist[i])) {
        j = i;
        break;
      }
    }
    return j;
  }

  @Test
  public void test_big() {
    String[] wordlist = {"KiTe", "kite", "hare", "Hare"};
    String[] queries = {"kite", "Kite", "KiTe", "Hare", "HARE", "Hear", "hear", "keti", "keet", "keto"};
    VowelSpellChecker vws = new VowelSpellChecker();
    String[] expected = {"kite", "KiTe", "KiTe", "Hare", "hare", "", "", "KiTe", "", "KiTe"};
    String[] actual = this.spellchecker(wordlist, queries);
    assertArrayEquals(expected, actual);
  }

  @Test
  public void test_small() {
    String[] wordlist_small = {"yellow"};
    String[] queries_small = {"YellOw", "yellow", "yllw"};
    String[] actual_small = this.spellchecker(wordlist_small, queries_small);
    String[] excepted_small = {"yellow", "yellow", ""};
    assertArrayEquals(excepted_small, actual_small);
  }

  @Test
  public void test_vowel() {
    String[] wordlist_small = {"YellOw"};
    String[] queries_small = {"yollow", "yeellow", "yllw"};
    String[] actual_small = this.spellchecker(wordlist_small, queries_small);
    String[] excepted_small = {"YellOw", "", ""};
    assertArrayEquals(excepted_small, actual_small);
  }
}
