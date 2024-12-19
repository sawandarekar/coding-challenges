package org.techHub.leetcode.LockDown30DayChallenge;


public class Day8_LinkedListMiddleElement {

    public static void main(String[] args) {
        ListNode head = null;
        for (int i = 1; i <= 4; i++) {
            head = insert(head, i);
        }
        display(head);
        Day8_LinkedListMiddleElement d8 = new Day8_LinkedListMiddleElement();
        ListNode middle = d8.middleNode(head);
        display(middle);
    }
    public ListNode middleNode(ListNode head) {
        double size = getSize(head);
        int middle = (int)(size % 2 == 0 ? (size / 2) + 1 : Math.ceil(size / 2));
        //System.out.println("size:"+size+" middle:"+middle);
        ListNode curr= head;
        int count = 0;
        while(curr!=null){
            count++;
            if(count == middle){
                break;
            }
            curr = curr.next;
        }
        return curr;
    }

    private int getSize(ListNode head) {
        int size = 0;
        ListNode curr = head;
        while(curr != null){
            size++;
            curr = curr.next;
        }
        return size;
    }

    public static ListNode insert(ListNode head, int data) {
        ListNode p = new ListNode(data);
        if (head == null) {
            head = p;
        } else if (head.next == null) {
            head.next = p;
        } else {
            ListNode start = head;
            while (start.next != null) {
                start = start.next;
            }
            start.next = p;

        }
        return head;
    }
    public static void display(ListNode head) {
        ListNode start = head;
        while (start != null) {
            System.out.print(start.val + " ");
            start = start.next;
        }
    }

}

class ListNode {

    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
    }
}
