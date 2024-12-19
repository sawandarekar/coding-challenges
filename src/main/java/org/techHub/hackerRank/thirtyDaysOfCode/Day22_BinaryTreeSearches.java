package org.techHub.hackerRank.thirtyDaysOfCode;

import java.util.Scanner;

/**
 * https://www.hackerrank.com/challenges/30-binary-search-trees
 */
public class Day22_BinaryTreeSearches {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();
        BinaryTreeNode root=null;
        while(T-->0){
            int data=sc.nextInt();
            root=insert(root,data);
        }
        int height=getHeight(root);
        System.out.println(height);
    }
    public static BinaryTreeNode insert(BinaryTreeNode node, int data){
        if(node==null){
            return new BinaryTreeNode(data);
        }
        else{
            BinaryTreeNode cur;
            if(data<=node.data){
                cur=insert(node.left,data);
                node.left=cur;
            }
            else{
                cur=insert(node.right,data);
                node.right=cur;
            }
            return node;
        }
    }
    public static int getHeight(BinaryTreeNode root){
//        if(root == null){
//            return  -1;
//        }
//        int leftDepth = getHeight(root.left);
//        int rightDepth = getHeight(root.right);
//        return (leftDepth > rightDepth ? leftDepth : rightDepth) + 1;
//
        if(root == null) {
            return -1;
        }
        int left = 1 + getHeight(root.left);
        int right = 1 + getHeight(root.right);

        return Math.max(left, right);
    }
}
