package org.example;

import java.lang.*;
class TreeNode
{
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode() {}
    TreeNode(int val) { this.val = val; }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}
class MaxDepth
{
    public static int maxDepth(TreeNode root)
    {
        if(root==null) return 0;
        return 1+Math.max(maxDepth(root.left),maxDepth(root.right));
    }

    public static void main(String args[])
    {
        TreeNode root= new TreeNode(4);
        root.left= new TreeNode(3);
        root.right= new TreeNode(4);
        root.right.left= new TreeNode(5);
        root.right.right= new TreeNode(6);
        root.left.right = new TreeNode(7);
        root.left.left = new TreeNode(8);
        root.left.left.left = new TreeNode(9);

        System.out.println(maxDepth(root));

    }
}