package com.algorithms.tree;


public class MaximumDepthOfBinaryTree {


    public static int bottomUp(BinaryNode root) {
        if(root == null) {
            return 0;
        }
        return Math.max(bottomUp(root.left), bottomUp(root.right)) + 1;
    }

    public static int topDown(BinaryNode root) {
        if(root == null) {
            return 0;
        }
        int depth_left = topDown(root.left) + 1;
        int depth_right = topDown(root.right) + 1;
        return Math.max(depth_left, depth_right);
    }

//    public static void main(String[] args) {
//
//        MaximumDepthOfBinaryTree d = new MaximumDepthOfBinaryTree();
//
//        BinaryNode node = new BinaryNode(1);
//        node.left = new BinaryNode(1);
//        node.left.right = new BinaryNode(1);
//
//        int bottom_up = d.bottomUp(node);
//        int top_down = d.topDown(node);
//
//        System.out.println(bottom_up);
//        System.out.println(top_down);
//
//    }

}
