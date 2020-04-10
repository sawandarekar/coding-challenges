package org.techHub.leetcode.LockDown30DayChallenge;

import java.util.Stack;

public class Day10_MinStack {

    Stack<Integer> stack;

    public Day10_MinStack() {
        stack = new Stack<>();
    }

    public static void main(String[] args) {
        Day10_MinStack obj = new Day10_MinStack();
        obj.push(-2);
        obj.push(0);
        obj.push(-3);
        int min = obj.getMin();
        System.out.println("min:" + min);
        obj.pop();
        int top = obj.top();
        System.out.println("top:" + top);
        min = obj.getMin();
        System.out.println("min:" + min);
    }

    public void push(int x) {
        this.stack.push(x);
    }

    public void pop() {
        this.stack.pop();
    }

    public int top() {
        return this.stack.peek();
    }

    public int getMin() {
        return this.stack.stream().min(Integer::compare).get();
    }
}
