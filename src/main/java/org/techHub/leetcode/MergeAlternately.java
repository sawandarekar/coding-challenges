package org.techHub.leetcode;

/**
 * https://leetcode.com/problems/merge-strings-alternately/description/
 */
public class MergeAlternately {
    public String mergeAlternately(String word1, String word2) {
        StringBuilder result = new StringBuilder();
        char[] word1Array = word1.toCharArray();
        char[] word2Array = word2.toCharArray();

        for (int i = 0; i < Math.max(word1Array.length, word2Array.length); i++) {
            if(i < word1Array.length){
                result.append(word1Array[i]);
            }
            if(i < word2Array.length){
                result.append(word2Array[i]);
            }
        }
        return result.toString();
    }

    public static void main(String[] args) {
        MergeAlternately mergeAlternately = new MergeAlternately();
        System.out.println(mergeAlternately.mergeAlternately("abc", "pqr"));
        System.out.println(mergeAlternately.mergeAlternately("ab", "pqrs"));
        System.out.println(mergeAlternately.mergeAlternately("abcd", "pq"));
    }
}
