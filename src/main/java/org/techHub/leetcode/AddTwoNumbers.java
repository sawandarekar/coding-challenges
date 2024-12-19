package org.techHub.leetcode;

import java.util.List;

import org.techHub.hackerRank.thirtyDaysOfCode.Node;

/**
 * https://leetcode.com/problems/add-two-numbers/
 */
public class AddTwoNumbers {

    public static void main(String[] args) {

        ListNode l11 = new ListNode(2);
        ListNode l12 = new ListNode(4);
        l11.next = l12;
        ListNode l13 = new ListNode(3);
        l12.next = l13;

        ListNode l21 = new ListNode(5);
        ListNode l22 = new ListNode(6);
        l21.next = l22;
        ListNode l23 = new ListNode(4);
        l22.next = l23;

        ListNode l1 = new ListNode(1);
        ListNode l1_2 = new ListNode(8);
        l1.next = l1_2;
        ListNode l2 = new ListNode(0);

        AddTwoNumbers atn = new AddTwoNumbers();
        ListNode twosum = atn.addTwoNumbers(l11, l21);
        System.out.println("twoSum:" + atn.convertToNum(twosum));
        twosum = atn.addTwoNumbers(l1, l2);
        System.out.println("twoSum zero:" + atn.convertToNum(twosum));
    }

    int getReverseNum(int n) {
        int rev = 0;
        while (n != 0) {
            int rem = n % 10;
            n = n / 10;
            rev = (rev * 10) + rem;
            System.out.println("rem:" + rem);
        }
        return rev;
    }

    public ListNode addTwoNumbers_leetcode(ListNode l1, ListNode l2) {
        ListNode dummyHead = new ListNode(0);
        ListNode p = l1, q = l2, curr = dummyHead;
        int carry = 0;
        while (p != null || q != null) {
            int x = (p != null) ? p.val : 0;
            int y = (q != null) ? q.val : 0;
            int sum = carry + x + y;
            carry = sum / 10;
            curr.next = new ListNode(sum % 10);
            curr = curr.next;
            if (p != null) p = p.next;
            if (q != null) q = q.next;
        }
        if (carry > 0) {
            curr.next = new ListNode(carry);
        }
        return dummyHead.next;
    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int l1Num = convertToNum(l1);
        //System.out.println("l1 num:"+l1Num+" rev:"+getReverseNum(l1Num));

        int l2Num = convertToNum(l2);
        //System.out.println("l2 num:"+l2Num+" rev:"+getReverseNum(l2Num));

        int twoSum = l1Num + l2Num;
        // int revTwoSum = getReverseNum(twoSum);
        //System.out.println("twoSum:"+twoSum+" revTwoSum:"+revTwoSum);

        ListNode headNode = null;
        if(twoSum == 0){
            headNode = new ListNode(0);
        }else {
            while (twoSum != 0) {
                int rem = twoSum % 10;
                twoSum = twoSum / 10;
                headNode = insertIntoListNode(headNode, rem);
            }
        }
        return headNode;
    }

    private ListNode insertIntoListNode(ListNode head, int data) {
        if (head == null) {
            head = new ListNode(data);
            return head;
        } else if (head.next != null) {
            insertIntoListNode(head.next, data);
        } else {
            head.next = new ListNode(data);
        }
        return head;
    }

    private int convertToNum(ListNode l1) {
        int n = l1.val;
        ListNode next = l1.next;
        while (next != null) {
            n = n * 10 + next.val;
            next = next.next;
        }
        return n;
    }

    static class ListNode {

        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }
}
