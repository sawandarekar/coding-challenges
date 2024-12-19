package org.techHub.hackerRank.thirtyDaysOfCode;

import java.util.Scanner;

/**
 * https://www.hackerrank.com/challenges/30-linked-list-deletion
 */
public class Day24_LinkedListDeletion {


    public static Node removeDuplicates(Node head) {
        Node newHead = null;
        while (head != null) {
            if (newHead == null) {
                newHead = new Node(head.data);
            } else if (!existInNewNode(newHead, head)) {
                insert(newHead, head.data);
            }
            head = head.next;
        }
        return newHead;
    }

    private static boolean existInNewNode(Node newHead, Node originalNode) {
        Node curr = newHead;
        while (curr != null) {
            if (curr.data == originalNode.data) {
                return true;
            }
            curr = curr.next;
        }
        return false;
    }

    public static Node insert(Node head, int data) {
        Node p = new Node(data);
        if (head == null) {
            head = p;
        } else if (head.next == null) {
            head.next = p;
        } else {
            Node start = head;
            while (start.next != null) {
                start = start.next;
            }
            start.next = p;

        }
        return head;
    }

    public static void display(Node head) {
        Node start = head;
        while (start != null) {
            System.out.print(start.data + " ");
            start = start.next;
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        Node head = null;
        int T = sc.nextInt();
        while (T-- > 0) {
            int ele = sc.nextInt();
            head = insert(head, ele);
        }
        head = removeDuplicates(head);
        display(head);

    }
/// did not work, if numbers are not consecutive
    public static Node removeDuplicates_1(Node head) {
        Node current = head ;
        while ( head != null && current.next != null  )
            if ( current.next.data == current.data )
                // duplicate: remove and stay on this node
                current.next = current.next.next;
            else
                // not duplciate: move to next node
                current = current.next;
        return head;
    }
}
