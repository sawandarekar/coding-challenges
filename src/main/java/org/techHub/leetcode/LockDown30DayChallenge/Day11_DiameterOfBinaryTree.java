package org.techHub.leetcode.LockDown30DayChallenge;

/**
 * https://leetcode.com/explore/challenge/card/30-day-leetcoding-challenge/529/week-2/3293/
 */
public class Day11_DiameterOfBinaryTree {

    public static void main(String[] args) {
        Day11_DiameterOfBinaryTree d11 = new Day11_DiameterOfBinaryTree();
        TreeNode root = null;
        int[] n = {4,1,2,3,5};
        for (int v: n){
            root = d11.insert(root, v);
        }
        int len = d11.diameterOfBinaryTree(root);
        System.out.println("diameter:"+len);
    }
    public int diameterOfBinaryTree(TreeNode root) {
        if(root == null) {
            return -1;
        }
        int left = 1 + diameterOfBinaryTree(root.left);
        int right = 1 + diameterOfBinaryTree(root.right);

        return Math.addExact(left, right);
    }
    public TreeNode insert(TreeNode node, int data){
        if(node == null){
            return new TreeNode(data);
        }else{
            if(data <= node.val){
                node.left = insert(node.left, data);
            }else{
                node.right = insert(node.right, data);
            }
            return  node;
        }
    }
}

class TreeNode {

    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x) {
        val = x;
    }
}
