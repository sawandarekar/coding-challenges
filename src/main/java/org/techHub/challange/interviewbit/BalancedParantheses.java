package org.techHub.challange.interviewbit;

import java.util.Stack;

/**
 * https://www.interviewbit.com/problems/balanced-parantheses/
 */
public class BalancedParantheses {

  public static void main(String[] args) {
    BalancedParantheses b = new BalancedParantheses();
    String str = "(()))";
    int balanced = b.solve(str);
    System.out.println(str+" balanced:"+balanced);
  }
  public int solve(String A) {
    Stack<String> s = new Stack<String>();
    char[] chars = A.toCharArray();
    for (int i = 0; i < chars.length; i++) {
      if('(' == chars[i]){
        s.push("(");
      }else if(')' == chars[i]){
        String r = s.empty() ? null : s.pop();
        if(r == null){
          return 0;
        }
      }
    }
    return s.empty() ? 1 : 0;
  }
}
