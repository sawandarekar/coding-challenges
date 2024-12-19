package org.techHub.leetcode.LockDown30DayChallenge;

import java.util.Stack;

/**
 * https://leetcode.com/explore/challenge/card/30-day-leetcoding-challenge/529/week-2/3291/
 */
public class Day9_BackspaceStringCompare {

    public static void main(String[] args) {
        Day9_BackspaceStringCompare d9 = new Day9_BackspaceStringCompare();
        boolean r = d9.backspaceCompare("ab#c","ad#c");
        System.out.println("Equal:" + r);
        boolean r1 = d9.backspaceCompare("ab####","c#d#");
        System.out.println("Equal:" + r1);
        boolean r2 = d9.backspaceCompare("a##c","#a#c");
        System.out.println("Equal:" + r2);
        boolean r3 = d9.backspaceCompare("a#c","b");
        System.out.println("Equal:" + r3);
    }

    public boolean backspaceCompare(String S, String T) {
        return removeBackspaceRemovedStr(S).equals(removeBackspaceRemovedStr(T));
    }

    private String removeBackspaceRemovedStr(String str) {
        char[] s = str.toCharArray();
        String removed = "";
        for (int i = 0; i < s.length; i++) {
            if (s[i] == '#') {
                removed = i > 1 ? removed.substring(0, i-1) : "";
                String nextStr = removed + str.substring(i+1, s.length);
                removed =  removeBackspaceRemovedStr(nextStr);
                break;
            }
            removed += s[i];
        }
        return removed;
    }
    public String backspaceCompareUtil(String s){
        Stack<Character> st=new Stack<>();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='#'){
                if(!st.isEmpty()){
                    st.pop();
                }
            }else{
                st.push(s.charAt(i));
            }
        }
        String ans="";
        while(!st.isEmpty()){
            ans+=Character.toString(st.pop());
        }

        return ans;
    }
}
