package org.techHub.leetcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class BaseballGameTest {

  BaseballGame baseballGame= new BaseballGame();

  @Test
  void testBaseballGame_1(){
    String[] ops = {};
    Assertions.assertEquals(0, baseballGame.calPoints(ops));
  }

  @Test
  void testBaseballGame_2(){
    String[] ops = {"4"};
    Assertions.assertEquals(4, baseballGame.calPoints(ops));
    String[] ops1 = {"4", "5"};
    Assertions.assertEquals(9, baseballGame.calPoints(ops1));
  }

  @Test
  void testBaseballGame_3(){
    String[] ops = {"D"};
    Assertions.assertEquals(0, baseballGame.calPoints(ops));
  }

  @Test
  void testBaseballGame_4(){
    String[] ops = {"D", "3"};
    Assertions.assertEquals(3, baseballGame.calPoints(ops));
  }

  @Test
  void testBaseballGame_5(){
    String[] ops = {"5", "D", "3"};
    Assertions.assertEquals(18, baseballGame.calPoints(ops));
  }

  @Test
  void testBaseballGame_6(){
    String[] ops = {"C"};
    Assertions.assertEquals(0, baseballGame.calPoints(ops));
  }

  @Test
  void testBaseballGame_7(){
    String[] ops = {"C", "4"};
    Assertions.assertEquals(4, baseballGame.calPoints(ops));
  }

  @Test
  void testBaseballGame_8(){
    String[] ops = {"5", "C", "4"};
    Assertions.assertEquals(4, baseballGame.calPoints(ops));
  }

  @Test
  void testBaseballGame_9(){
    String[] ops = {"5", "C", "4"};
    Assertions.assertEquals(4, baseballGame.calPoints(ops));
  }

  @Test
  void testBaseballGame_10(){
    String[] ops = {"+"};
    Assertions.assertEquals(0, baseballGame.calPoints(ops));
  }

  @Test
  void testBaseballGame_11(){
    String[] ops = {"+", "7"};
    Assertions.assertEquals(7, baseballGame.calPoints(ops));
  }

  @Test
  void testBaseballGame_12(){
    String[] ops = {"6","+", "7"};
    Assertions.assertEquals(19, baseballGame.calPoints(ops));
  }

  @Test
  void testBaseballGame_13(){
    String[] ops = {"4","6","+", "7"};
    Assertions.assertEquals(27, baseballGame.calPoints(ops));
  }

  @Test
  void testBaseballGame_14(){
    String[] ops = new String[]{"5","2","C","D","+"};
    Assertions.assertEquals(30, baseballGame.calPoints(ops));
  }

  @Test
  void testBaseballGame_15(){
    String[] ops = new String[]{"5","-2","4","C","D","9","+","+"};
    Assertions.assertEquals(27, baseballGame.calPoints(ops));
  }

  @Test
  void testBaseballGame_16(){
    String[] ops = new String[]{"1"};
    Assertions.assertEquals(1, baseballGame.calPoints(ops));
  }
}









