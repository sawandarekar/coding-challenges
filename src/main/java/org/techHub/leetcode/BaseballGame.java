package org.techHub.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * https://leetcode.com/problems/baseball-game/
 */
public class BaseballGame {

  public int calPoints(String[] ops) {
    String doubleMe="D";
    String sum="+";
    String invalidate="C";
    List<Integer> records = new ArrayList<>();
    for (int i = 0; i < ops.length; i++) {
      if(doubleMe.equals(ops[i])){
        int index = records.size()-1;
        int val = i != 0 ? records.get(index) * 2 : 0;
        records.add(val);
      }else if(sum.equals(ops[i])){
        int v1 = i-2 >= 0 ? records.get(records.size()-2) : 0;
        int v2 = i-1 >= 0 ? records.get(records.size()-1) : 0;
        records.add(v1+v2);
      }else if(invalidate.equals(ops[i])){
        if(i != 0)
          records.remove(records.size()-1);
      }else{
        records.add(Integer.parseInt(ops[i]));
      }
    }
    System.out.println(Arrays.toString(ops)+"-> records:"+records);
    return calculateSum(records);
  }

  private int calculateSum(List<Integer> calPoints) {
    int sum = 0;
    for (Integer calPoint : calPoints) {
      sum += calPoint;
    }
    return sum;
  }
}
