package org.techHub.hackerRank.thirtyDaysOfCode;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/**
 * https://www.hackerrank.com/challenges/30-binary-trees/
 */
public class Day23_BSTLeveOrderTraversal {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        BinaryTreeNode root = null;
        while (t-- > 0) {
            int data = scanner.nextInt();
            root = insert(root, data);
        }
        levelOrder(root);
    }

    private static void levelOrder(BinaryTreeNode root) {
        Queue<BinaryTreeNode> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()) {
            BinaryTreeNode curr = queue.remove();
            System.out.print(curr.data + " ");
            if (curr.left != null) {
                queue.add(curr.left);
            }
            if (curr.right != null) {
                queue.add(curr.right);
            }
        }
    }

    private static BinaryTreeNode insert(BinaryTreeNode root, int data) {
        if (root == null) {
            return new BinaryTreeNode(data);
        } else {
            BinaryTreeNode curr;
            if (data < root.data) {
                curr = insert(root.left, data);
                root.left = curr;
            } else {
                curr = insert(root.right, data);
                root.right = curr;
            }
            return root;
        }

    }
}
